package fangXing;

/**
 * Created by kang on 17/3/21.
 */

/**
 * 元祖
 * @param <A>
 * @param <B>
 */
public class TwoTuple <A,B>{

    public final A a;
    public final B b;

    public TwoTuple(A a,B b){
        this.a=a;
        this.b=b;
    }

    @Override
    public String toString() {
        return "("+a+","+b+")";
    }
}
