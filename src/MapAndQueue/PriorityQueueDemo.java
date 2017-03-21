package MapAndQueue;

import java.util.*;

/**
 * Created by kang on 17/3/21.
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random=new Random(47);

        for (int i=0;i<10;i++){
            priorityQueue.offer(random.nextInt(i+10));
        }

        QueueDemo.printQ(priorityQueue);

        List<Integer> list = Arrays.asList(25,28,29,10,90,17,18,19,27,28);

        priorityQueue =new PriorityQueue<>(list);
        QueueDemo.printQ(priorityQueue);
        priorityQueue = new PriorityQueue<>(list.size(), Collections.reverseOrder());
        priorityQueue.addAll(list);
        QueueDemo.printQ(priorityQueue);


        String fact = "Hello World hi";

        List<String> facts = Arrays.asList(fact.split(""));
      //  System.out.println(facts);
        PriorityQueue<String> pq = new PriorityQueue<>(facts);

        QueueDemo.printQ(pq);
        pq = new PriorityQueue<>(facts.size(),Collections.reverseOrder());
        pq.addAll(facts);
        QueueDemo.printQ(pq);



    }

}
