package pets;

import java.util.*;

/**
 * Created by kang on 17/3/21.
 */
public  class PetCreator {
    private static Random random = new Random(47);
    //The list of the different types of Pet to create
    public static List<? extends Pet> types = new ArrayList<>(Arrays.asList(new Cat("Cat"),new Cymric("Cymric"),
            new Dog("Dog"),new Hamster("Hamster"),new Manx("Manx"),new Mouse("Mouse"))) ;
    public static Pet randomPet() throws IllegalAccessException, InstantiationException {//Create one random Pet
        int n=random.nextInt(types.size());

        return types.get(n);

    }
    //随机创建数组对象
    public static Pet[] createArray(int size){
        Pet[] result = new Pet[size];
        for (int i=0;i<size;i++){
            try {
                result[i] = randomPet();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }


        return result;
    }

    //通过数组创建ArrayList
    public static ArrayList<Pet> arrayList(int size){

        ArrayList<Pet> arrayList=new ArrayList<>();

        Collections.addAll(arrayList,createArray(size));
        return arrayList;

    }


}
