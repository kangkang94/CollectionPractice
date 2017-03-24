package Set;

/**
 * Created by kang on 17/3/23.
 */

/**
 * 必须实现hashCode()方法
 */
public class HashType extends SetType {



    public HashType(int i) {
        super(i);

    }

    public int hashCode(){
        return i;
    }

}
