package CollectionTest;

/**
 * Created by kang on 17/3/27.
 */
public abstract class Test<C> {

    String name;


    public Test(String name) {
        this.name = name;
    }

    abstract int test(C container,TestParam tp);

}
