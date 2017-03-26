package shuzu;

/**
 * Created by kang on 17/3/26.
 */
public class BerylliumSphere {

    private static long count;
    private  final long id = count++;

    @Override
    public String toString() {
        return "Sphere" +id+" ";
    }
}
