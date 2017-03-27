package hashCodePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kang on 17/3/27.
 */
public class CountedString {

    private static List<String> created = new ArrayList<String>();

    private String s;
    private  int i;

    public CountedString(String string){

        s=string;
        created.add(s);

        for (String s1:created){
            if (s.equals(s1)){
                i++;
            }
        }

    }

    @Override
    public String toString() {
        return "String: "+s+"id: "+i+"hashCode: "+hashCode();
    }

    @Override
    public int hashCode() {
        int result =17;
        result = result*37 +i;
        result = result*37+s.hashCode();


        return  result;
    }

    @Override
    public boolean equals(Object obj) {

        return (obj instanceof CountedString )&&(((CountedString) obj).s.equals(this.s)&&((CountedString) obj).i==this.i);
    }

    public static void main(String[] args) {

        Map<CountedString,Integer> map = new HashMap<>();
        CountedString[] countedStrings = new CountedString[5];
        for (int i=0;i<countedStrings.length;i++){
            countedStrings[i] = new CountedString("hi");
            map.put(countedStrings[i],i);
        }

        System.out.println(map);


    }




}
