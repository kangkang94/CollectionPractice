package Strings;

/**
 * Created by kang on 17/3/26.
 */
public class MethodOfString {


    public static String string = "   We must work hard and thinking so that we can get what we want!";



    public static void main(String[] args) {
        //String中字符的个数
        print(string.length());
        //String中index为5的字符
        System.out.println(string.charAt(5));
      //  print(string.toCharArray());
        //将String转换为字符数组Char[]
        System.out.println(string.toCharArray()[5]);
        //比较俩个字符串是不是相同
        System.out.println(string.equals("We must work hard and thinking so that we can get what we want!"));
        //IgnoreCase无视字符大小写
        System.out.println(string.equalsIgnoreCase("we must work hard and thinking so that we can get what we want!"));
        //安装字典顺序比较String的内容
        System.out.println(string.compareTo("We must aork hard and thinking so that we can get what we want!"));
        //判断String对象是否包含参数
        System.out.println(string.contains("We must"));

        System.out.println(string.contentEquals("We must aork hard and thinking so that we can get what we want!"));

        //判断String是否以此参数开始
        System.out.println(string.startsWith("We"));
        //判断String是否以此参数结束
        System.out.println(string.endsWith("!"));
        //找出String中字符的位置
        System.out.println(string.indexOf('W'));
        //截出子字符串
        System.out.println(string.substring(0,10));
        //原始的字符串拼接上参数里的字符串
        System.out.println(string.concat("Fighting!"));
        //取代
        System.out.println(string.replace("We","we"));
        //通过正则表达式匹配第一个字符串
        System.out.println(string.replaceFirst("W\\w+","HELLO"));
        //将字符串转换为小写和大写
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        //将字符串俩端的空白字符删除
        System.out.println(string.trim());



    }

    private static void print(Character[] s) {

        System.out.println(s);
    }
    private static void print(Character s) {

        System.out.println(s);
    }

    private static void print(String s) {

        System.out.println(s);
    }

    private static void print(int  s) {

        System.out.println(s);
    }

}
