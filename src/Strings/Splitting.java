package Strings;

import java.util.Arrays;

/**
 * Created by kang on 17/3/26.
 */
public class Splitting {

    public static String string ="Then, when you have found the shrubbery, you must cut down the mightiest tree " +
            "in the forest... with ... a herring";


    public static String splict(String regex){

        return Arrays.toString(string.split(regex));

    }

    public static void main(String[] args) {

        //分割为多个子字符串
        System.out.println(splict(" "));
        System.out.println(splict(",\\W+"));
        System.out.println(splict("n\\W+"));

        //替换   只替换正则表达式第一个匹配的子字符串，或是替换所有匹配的地方
        System.out.println(string.replaceFirst("f\\w+","lacated"));
        System.out.println(string.replaceAll("shrubbery|migthiest|forest","fighting"));



    }



}
