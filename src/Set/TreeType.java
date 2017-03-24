package Set;

/**
 * Created by kang on 17/3/23.
 */
public class TreeType extends SetType implements Comparable<TreeType>{



    public TreeType(int i) {
        super(i);
    }

    //为TreeMap中元素的存储序列
    @Override
    public int compareTo(TreeType o) {
        return o.i>i?1:(o.i==i?0:-1);
    }
}
