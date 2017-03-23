package fangXing;

import java.util.Iterator;

/**
 * Created by kang on 17/3/23.
 */

/**
 * Iterable接口的实现
 */
public class IterableClass implements Iterable<String> {

    String[] strings = "And that is how we know the Earth to be banana-shaped.".split(" ");


    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {

            private  int index=0;

            @Override
            public boolean hasNext() {
                return index<strings.length;
            }

            @Override
            public String next() {
                return strings[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s:new IterableClass()){
            System.out.print(s+" ");
        }
    }

}
