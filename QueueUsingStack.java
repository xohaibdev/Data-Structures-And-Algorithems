import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class QueueUsingStack{

    public static Stack<Integer> stack1 = new Stack<Integer>();
    public static Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args)
    {
        enQueue(1); 
        enQueue(2); 
        enQueue(3); 
    
        System.out.println(deQueue()); 
        System.out.println(deQueue());
        System.out.println(deQueue());
    }

    public static void enQueue(int x)
    {
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
    }

    public static int deQueue()
    {
        if (stack1.isEmpty())
                return -1;
        return stack1.pop();
       
    }

    public static boolean isEmpty()
    {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static int peek(){
        if(stack1.isEmpty())
        {
            return -1;
        }
        return stack1.peek();
    }

    public static int size() { 
        return stack1.size(); 
    }

}