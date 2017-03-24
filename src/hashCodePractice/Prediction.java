package hashCodePractice;

import java.util.Random;

/**
 * Created by kang on 17/3/23.
 */
public class Prediction {

    private static Random random = new Random(47);
    private boolean shadow =random.nextDouble()>0.5;

    @Override
    public String toString() {

        String result ;
        if (shadow){
            return "Six more weeks of Winter!";
        }else {
            return "Early Spring!" ;
        }
    }
}
