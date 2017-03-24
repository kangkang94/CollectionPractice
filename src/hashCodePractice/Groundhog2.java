package hashCodePractice;

/**
 * Created by kang on 17/3/24.
 */
public class Groundhog2 extends Groundhog {


    public Groundhog2(int n) {
        super(n);
    }
    /**
     * 重写hashCode方法和equals方法
     */

    @Override
    public int hashCode() {

        return number;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Groundhog) &&(((Groundhog) obj).number==number);
    }



}
