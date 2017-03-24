package Set;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by kang on 17/3/23.
 */

/**
 * 应该是队列中的元素实现Comparable接口，重写compareTo方法
 */
public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {

    public static class ToDoItem implements Comparable<ToDoItem>{
        //主要优先级值
        private char primary;
        //次要优先级值
        private int secondry;
        private String item;

        public ToDoItem(char primary, int secondry, String item) {
            this.primary = primary;
            this.secondry = secondry;
            this.item = item;
        }

        //实现降序排序
        @Override
        public int compareTo(ToDoItem o) {

            if (primary>o.primary){
                return +1;
            }else if (primary==o.primary){
                if (secondry>o.secondry){
                    return +1;
                }else if (secondry==o.secondry){
                    return 0;
                }
            }else {
                return -1;
            }


            return -1;
        }


        @Override
        public String toString() {
            return Character.toString(primary)+secondry+":  "+item;
        }


    }
    public  void add(String td,char primary,int secondry){
        super.add(new ToDoItem(primary,secondry,td));
    }

    public static void main(String[] args) {

        ToDoList toDoList =new ToDoList();

        toDoList.add("Empty",'C',2);
        toDoList.add("Mow",'A',4);
        toDoList.add("Hello",'A',1);
        toDoList.add("ni",'C',1);

        while(!toDoList.isEmpty()){
            System.out.println(toDoList.poll());
        }


    }


}
