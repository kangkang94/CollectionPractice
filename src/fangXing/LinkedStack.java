package fangXing;

/**
 * Created by kang on 17/3/23.
 */

/**
 * 不用LinkedList，实现Stack
 * @param <T>
 */
public class LinkedStack<T> {

    private static class Node<U>{

        U item;
        Node<U> next;
        Node(){
            this.item=null;
            this.next = null;
        }

        Node(U item,Node<U> next){
            this.item=item;
            this.next=next;
        }

        Boolean end(){return item==null&&next==null;}

    }

    //end sentinel,末端哨兵
    private Node<T> top =new Node<T>();

    //push(Object o)
    public  void push(T item){
        top = new Node<T>(item,top);
    }

    //pop()
    public T pop(){
        T result = top.item;
        if (!top.end()){
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> ls = new LinkedStack<>();

        for (String s : "Hello world ni hao!".split(" ")){
            ls.push(s);
        }
        String c;
        while((c=ls.pop())!=null){

            System.out.println(c);
        }


     }




}
