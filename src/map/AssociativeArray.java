package map;

/**
 * Created by kang on 17/3/23.
 */

/**
 * 以底层为数组的结构构造map
 * @param <K>
 * @param <V>
 */
public class AssociativeArray<K,V> {

    private Object[][] pairs;
    private int index;
    //创建length个数组
    public AssociativeArray(int length){

        pairs = new Object[length][2];
    }

    public  void put(K k,V v){
        if (index>= pairs.length){
            throw  new ArrayIndexOutOfBoundsException();
        }
        pairs[index++]=new Object[]{k,v};

    }

    public V get(K k){
        for (int i=0;i<pairs.length;i++){
            if (k.equals(pairs[i][0])){
                return (V) pairs[i][1];
            }
        }

        return null;
    }




}
