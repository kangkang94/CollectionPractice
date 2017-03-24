package Set;

/**
 * Created by kang on 17/3/23.
 */

/**
 * 基类，必须实现equals(Object o)方法维护元素的唯一性
 */
public class SetType {

    int i;
    public SetType(int i){
        this.i=i;
    }
    //i相同表示类重复
    public boolean equals(Object o){

        return (o instanceof SetType) && (i==((SetType) o).i);
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
