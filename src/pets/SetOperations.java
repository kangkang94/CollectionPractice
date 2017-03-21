package pets;

import java.util.*;

/**
 * Created by kang on 17/3/21.
 */
public class SetOperations {

    public static void main(String[] args) {
        Random random = new Random(47);
        SortedSet<Integer> treeSet = new TreeSet<>();
        for (int i=0;i<3000;i++){
            treeSet.add(random.nextInt(30));
        }
        System.out.println(treeSet);


        //使用contains()测试Set的归属性
        Set<String> set1 = new HashSet<>();
        Collections.addAll(set1,"A B C D E F G".split(" "));
        set1.add("H");
        print("H: "+set1.contains("H"));
        Set<String> set2 = new HashSet<>();
        Collections.addAll(set1,"A B C D E F".split(" "));

        print(""+set1.containsAll(set2));
    }

    public static void print(String name){
        System.out.println(name);
    }


}
