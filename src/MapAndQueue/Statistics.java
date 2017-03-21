package MapAndQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by kang on 17/3/21.
 */
public class Statistics {

    public static void main(String[] args) {
        Random random=new Random(47);
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<1000;i++){
            int r = random.nextInt(20);

            Integer flag =map.get(r);

            map.put(r,flag==null?1:++flag);
        }

        System.out.println(map);

    }

}
