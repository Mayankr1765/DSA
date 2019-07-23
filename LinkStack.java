import java.util.*;
class Stack_Op
{
    LinkedList<Integer> l=new LinkedList<Node>();
    void push(int d)
    {
      l.addFirst(10);
      l.addFirst(20);
      l.addFirst(20);
      
    }
    void pop()
    {
        int x=(Integer)l.removeFirst();
        System.out.println("popped element is"+x);
    }

    
}
class LinkStack
{
    public static void main(String args[])
    {
        Stack_Op s=new Stack();
        s.push(10);
        s.push(20);
        s.pop();
    }
}