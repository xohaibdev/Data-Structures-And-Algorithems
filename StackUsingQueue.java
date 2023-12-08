import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue{

    public static Queue<Integer> queue1 = new LinkedList<Integer>();
    public static Queue<Integer> queue2 = new LinkedList<Integer>();

    public static void main(String[] args)
    {
        push(1);
        push(2);
        push(3);
 
        System.out.println("current size: " + size());
        System.out.println(top());
        pop();
        System.out.println(top());
        pop();
        System.out.println(top());
 
        System.out.println("current size: " + size());
    }

    public static void push(int x)
    {
        queue2.add(x);
        while(!queue1.isEmpty())
        {
            queue2.add(queue1.remove());
        }
        Queue<Integer> tempQueue = queue1;
        queue1 = queue2;
        queue2 = tempQueue;
    }

    public static int pop()
    {
        if (queue1.isEmpty())
                return -1;
        return queue1.remove();
       
    }

    public static boolean isEmpty()
    {
        return queue1.isEmpty() && queue2.isEmpty();
    }

    public static int top(){
        if(queue1.isEmpty())
        {
            return -1;
        }
        return queue1.peek();
    }

    public static int size() { 
        return queue1.size(); 
    }

}