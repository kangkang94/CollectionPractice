package pets;

import java.util.*;

/**
 * Created by kang on 17/3/21.
 */

/**
 * 测试list的各种方法
 */
public class ListFeatures {



    public static void print(String s){
        System.out.println(s);
    }


    public static void main(String[] args) {
        Random random = new Random(47);
        PetCreator petCreator = new PetCreator();
        List<Pet> pets =petCreator.arrayList(7);
        print("1:  "+pets);

        Hamster h = new Hamster("Hamster");
        pets.add(h);//Automatically resizes
        print("2: "+pets);
        print("3: "+pets.contains(h));

        pets.remove(h);//Remove by object

        Pet p = pets.get(2);
        print("4: "+pets.indexOf(p));

        Pet cymric = new Pet("Cymric");
        print("5: "+pets.indexOf(cymric));
        print("6: "+pets.remove(cymric));

        //Must be  the exact object
        print("7: "+pets.remove(p));
        print("8: "+pets);

        //Insert at an index
        pets.add(3,new Hamster("Hamster"));
        print("9: "+pets);
        List<Pet> sub = pets.subList(1,4);
        print("10: "+sub);
        print("11: "+pets.containsAll(sub));

        //Collections.sort(sub);
       // Collections.shuffle(sub);
        //从构造器传入产生一个拷贝
        List<Pet> copy = new ArrayList<>(pets);
        sub= Arrays.asList(pets.get(1),pets.get(4));

        print("sub: "+sub);
        //保留了同时在sub和copy中的操作
        copy.retainAll(sub);
        print("13: "+copy);
        copy.removeAll(sub);

        print("14:"+copy);
        //list转换为数组
        Object[] o = pets.toArray();
        print("14: "+o[3]);


    }



}
