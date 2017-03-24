package hashCodePractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kang on 17/3/23.
 */
public class SpringDetector {


    public static <T extends Groundhog2> void  detectSpring(Class<T> type) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Constructor<T> ghog = type.getConstructor(int.class);

        Map<Groundhog2,Prediction> map = new HashMap<>();

        for (int i=0;i<10;i++){
            map.put(ghog.newInstance(i),new Prediction());
        }
        System.out.println("map= "+map);


        Groundhog groundhog = ghog.newInstance(3);
        System.out.println("looking up prediction for" +groundhog);

        if (map.containsKey(groundhog)){
            System.out.println(map.get(groundhog));
        }else {
            System.out.println("key not found!" +groundhog);
        }

    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
            detectSpring(Groundhog2.class);
    }
}
