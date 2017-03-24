package List;

import pets.Pet;
import pets.PetCreator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by kang on 17/3/23.
 */
public class ListIteration {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        List<Pet> pets = PetCreator.arrayList(8);

        ListIterator<Pet> it = pets.listIterator();

        //向前遍历
        while(it.hasNext()){
            System.out.print(it.next()+", "+it.nextIndex()+",  "+it.previousIndex()+" .");
        }
        System.out.println(" ");

        System.out.println(pets);
        //Backwards,向后遍历
        while(it.hasPrevious()){
            System.out.print(it.previous().getClass()+"       ");
        }

        System.out.println(" ");

        System.out.println(pets);
        it = pets.listIterator(3);
        //set()替换它访问过的最后一个元素
        while(it.hasNext()){
            it.next();
            it.set(PetCreator.randomPet());
        }

        System.out.println(pets);

    }


}
