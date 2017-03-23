package fangXing;

import java.util.Iterator;

/**
 * Created by kang on 17/3/23.
 */
public class MultiIterableClass extends IterableClass {


    public Iterable<String> reverse(){

        return new Iterable<String>() {

            @Override
            public Iterator<String> iterator() {

                return new Iterator<String>() {

                    int current = strings.length-1;

                    @Override
                    public boolean hasNext() {
                        return current>-1;
                    }

                    @Override
                    public String next() {
                        return strings[current--];
                    }
                };
            }
        };


    }

    public static void main(String[] args) {

    }


}
