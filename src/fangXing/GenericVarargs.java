package fangXing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kang on 17/3/21.
 */
public class GenericVarargs {

    public static <T> List<T> makeList(T... args){


        //Arrays.asList() 方法一样，输入可变参数列表，输出一个list<T>
        List<T> list = new ArrayList<T>();
        for (T t:args){
            list.add(t);
        }

        return list;
    }

    public static void main(String[] args) {

        List<String> list=makeList("A");
        System.out.println(list);

        list =makeList("A","B","C");
        System.out.println(list);

        list=makeList("ABCDEF".split(""));
        System.out.println(list);
    }



}
