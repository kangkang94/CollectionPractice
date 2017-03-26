package shuzu;

import java.util.Arrays;

/**
 * Created by kang on 17/3/26.
 */
public class ArrayOption {

    public static void main(String[] args) {

        BerylliumSphere[] a;
        BerylliumSphere[] b =new BerylliumSphere[5];

        print("1:"+ Arrays.toString(b));
        System.out.println(b);
        BerylliumSphere[] c=new BerylliumSphere[4];
        for (int i=0; i<c.length;i++){
            if (c[i]==null) {
                c[i] = new BerylliumSphere();
            }
        }
        BerylliumSphere[] d = {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()};

        a=new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()};
        print("2:"+a.length);
        print("3:"+b.length);
        print("4:"+c.length);
        print("5:"+d.length);

        a=d;
        print("6:"+a.length);


    }

    private static void print(String s) {


        System.out.println(s);
    }


}
