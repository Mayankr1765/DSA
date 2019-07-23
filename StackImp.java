import java.util.*;
class Stack_op{

    int a[]=new int[5];
    int top=-1;
    void push(int d)
    {
        a[++top]=d;
    }
    void pop()
    {
        int x=a[top];
        System.out.println("Popped elemen is:"+x);
        top--;
    }
    void peek()
    {
        System.out.println(a[top]);
    }
    void isEmpty()
    {
        if (top==0)
        System.out.println("Empty Stack");
    }
    void isFull()
    {
        if (top==4)
        System.out.println("Full Stack");

    }
}
class Stack{
    public static void main(String args[])
    {
        Stack_op s=new Stack_op();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.peek();
        s.pop();
    }
}