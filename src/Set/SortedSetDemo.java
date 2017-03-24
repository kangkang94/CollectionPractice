package Set;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by kang on 17/3/23.
 */
public class SortedSetDemo {

    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet,"one two three four five six seven".split(" "));

        System.out.println(sortedSet);

        String low =sortedSet.first();
        String high = sortedSet.last();

        System.out.println(low);
        System.out.println(high);

        Iterator<String> iterator = sortedSet.iterator();

        for (int i=0;i<sortedSet.size();i++){
            if (i==3){
               low=iterator.next();
            }else if (i ==5){

                high = iterator.next();
            }else {
                iterator.next();
            }
        }
        SortedSet sub = sortedSet.subSet(low,high);
        System.out.println(sub);



    }
}
