package fangXing;

/**
 * Created by kang on 17/3/21.
 */
public class GenericMethods {

    public <T> void f(T x){

        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f("");
        genericMethods.f(1);
        genericMethods.f(1.0);
        genericMethods.f('c');
        genericMethods.f(genericMethods);

    }


}
