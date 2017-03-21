package pets;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by kang on 17/3/21.
 */
public class LinkedListFeature {

    public static void print(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        PetCreator petCreator = new PetCreator();
        LinkedList<Pet> linkedList = new LinkedList<>(petCreator.arrayList(8));

        print(linkedList+"");
        //得到头元素
        print("list.getFirst(): "+linkedList.getFirst());
        print("list.element(): "+linkedList.element());

        //列表为空时返回null
        print("pets.peek(): "+linkedList.peek());
        //remove and return the first element
        print("pets.remove(): "+linkedList.remove());
        print("pets.removeFirst(): "+linkedList.removeFirst());
        //Only differs in empty-list behavior
        print("pets.poll(): "+linkedList.poll());
        print(linkedList+"");

        linkedList.addFirst(new Hamster("Hamster"));
        print(linkedList+"");
        linkedList.offer(new Mouse("Mouse"));
        print(linkedList+"");
        linkedList.add(new Pug("Pug"));
        print(linkedList+"");
        linkedList.addLast(new Rat("Rat"));
        print(linkedList+"");
        Stack<Pet> stack = new Stack<>();
    }

}
