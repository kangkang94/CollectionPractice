package hashCodePractice;

/**
 * Created by kang on 17/3/23.
 */
public class Groundhog {

    protected int number;
    public Groundhog(int n){
        number = n;
    }

    @Override
    public String toString() {
        return "Groundhog # "+number;
    }
}
