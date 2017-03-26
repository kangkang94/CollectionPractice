package Strings;

import java.util.Random;

/**
 * Created by kang on 17/3/25.
 */
public class UsingStringBuilder {

    static Random random = new Random(47);

    @Override
    public String toString() {
        //直接传入字符串构造
        StringBuilder sb = new StringBuilder("[");

        for (int i=0;i<10;i++){
            sb.append(random.nextInt(50));
            sb.append(',');

        }

        sb.delete(sb.length()-1,sb.length());
        sb.append("]");


        return sb.toString();
    }

    public static void main(String[] args) {
            UsingStringBuilder usingStringBuilder = new UsingStringBuilder();
        System.out.println(usingStringBuilder);


    }

}
