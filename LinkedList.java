import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class Link
{
    Node head=null;
    void iaf(int d)
    {
        Node newnode=new Node(d);
        if (head==null)
        {
            head=newnode;
        }
        else
        {
        newnode.next=head;
        head=newnode;
        }
    }
    void iab(Node prev,int d)
    {
        Node newnode=new Node(d);
        newnode.next=prev.next;
        prev.next=newnode;
    }
    void ial(int d)
    {
        Node n=head;
        Node newnode=new Node(d);
        while (n.next!=null)
        {
            n=n.next;
        }
        newnode.next=n.next;
        n.next=newnode;

    }
    void traverse(Node head)
    {
        if (head==null)
        {
            System.out.println("empty list");
        }
        Node n=head;
        while (n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    void daf()
    {
        head=head.next;
    }
    void dab(Node prev)
    {
      prev.next=prev.next.next;
    }
    void dell()
    {
        head=null;
    }
    
}
class LinkedList
{
    public static void main(String args[])
    {
        Link l=new Link();
        l.iaf(5);
        l.iab(l.head,10);
        l.ial(15);
        l.traverse(l.head);
        l.dell();
        l.traverse(l.head);
    }
}