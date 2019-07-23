import java.util.*;
class Node
{
    int data;
    Node next,prev;
    Node(int d)
    {
        data=d;
        next=prev=null;
    }
}
class Double
{
    Node head=null;
    void iaf(int d)
    {
        Node newnode=new Node(d);
        if (head==null)
        {
          newnode.prev=null;
          head=newnode;
        }
        else
        {
            head.prev=newnode;
            newnode.next=head;
            head=newnode;
        }
    }
    void iab(Node pre,int d)
    {
        if (pre==null)
        System.out.println(" Not possiiblee ");
        Node newnode=new Node(d);
        newnode.prev=pre;
        newnode.next=pre.next;
        pre.next=newnode;

    }
    void ial(int d)
    {
        Node newnode=new Node(d);
        Node n=head;
        while (n.next!=null)
        {
            n=n.next;
        
        }
        newnode.prev=n;
        newnode.next=null;
        n.next=newnode;
    }
    void trav()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.println(n.data+" ");
            n=n.next;
        }
    }
    void daf()
    {
        head.next.prev=null;
        head=head.next;
    }
    void dab(Node del)
    {
     del.prev.next=del.next;

    }
    

}
class DoublyLinkedList
{
    public static void main(String args[])
    {
        Double d=new Double();
        d.iaf(10);
        d.iab(d.head,20);
        d.ial(30);
        d.trav();
        d.daf();
        d.trav();

    }
}