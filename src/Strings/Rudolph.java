package Strings;

/**
 * Created by kang on 17/3/26.
 */
public class Rudolph {

    public static void main(String[] args) {

        for (String s : new String[]{"Rudolph","[rR]udol.*","[rR][aeiou]\\w+","R.*"}){
            System.out.println("Rudolph".matches(s));
        }

    }

}
