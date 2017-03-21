import java.util.*;

/**
 * Created by kang on 17/3/20.
 */
public class AddingGroups {

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection,moreInts);

        //由数组转化为动态数组，底层仍是数组，无法添加或删减元素
        List<Integer> list = Arrays.asList(moreInts);
        list.set(1,10);

    }

}
