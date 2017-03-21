package pets;

import java.util.*;

/**
 * Created by kang on 17/3/21.
 */
public class CrossContainerIteration {

    public static void display(Iterator<Pet> it){

        while(it.hasNext()){
            Pet pet = it.next();
            System.out.print(pet+"  ");
        }

        System.out.println(" ");
    }


    public static void main(String[] args) {

        PetCreator petCreator = new PetCreator();
        ArrayList<Pet> pets =petCreator.arrayList(8);
        LinkedList<Pet> linkedList = new LinkedList<>(pets);
        HashSet<Pet> hashSet = new HashSet<>(pets);
      //  TreeSet<Pet> treeSet = new TreeSet<>(pets);

        display(pets.iterator());
        display(linkedList.iterator());
        display(hashSet.iterator());
    //    display(treeSet.iterator());




    }


}
