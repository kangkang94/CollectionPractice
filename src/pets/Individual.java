package pets;

/**
 * Created by kang on 17/3/21.
 */
public class Individual {

    public String name;
    public Individual(String name){
        this.name = name;
    }

    public Individual(){

    }

    @Override
    public String toString() {

        return name;
    }
}
