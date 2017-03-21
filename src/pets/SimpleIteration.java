package pets;

import java.util.Iterator;
import java.util.List;

/**
 * Created by kang on 17/3/21.
 */
public class SimpleIteration {

    public static void main(String[] args) {

        PetCreator petCreator = new PetCreator();
        List<Pet> pets = petCreator.arrayList(12);
        Iterator<Pet> iterator = pets.iterator();
        while(iterator.hasNext()){
            Pet pet = iterator.next();
            System.out.println(pet);
        }
        System.out.println("***************************");

        for(Pet pet : pets) {
            System.out.println(pet);
        }
        System.out.println("***************************");




    }


}
