package MapAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by kang on 17/3/21.
 */
public class QueueDemo {

    public static void printQ(Queue queue){
        while(queue.peek()!=null){
            System.out.print(queue.poll()+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random(47);
        for (int i=0;i<10;i++){
            queue.offer(random.nextInt(10));
        }
        printQ(queue);

        Queue<Character> queue1 = new LinkedList<>();
        for (Character c :"Brontosaurus".toCharArray()){

            queue1.offer(c);
        }

        printQ(queue1);

    }
}
