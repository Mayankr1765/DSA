import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
        
    }
}
class Op
{
    Node root=null;
    
    void insert(int d)
    {
        
        Node newnode=new Node(d);
        
      if (root==null)
      {
          newnode=root;
      }
          Node cur=root;
          Node p=root;
          while (cur!=null)
          {
        p=cur;
          if (newnode.data>cur.data)
          cur=cur.right;
          else
          cur=cur.left;
          }
          if (newnode.data>p.data)
          {
              p.right=newnode;
          }
          else{
              p.left=newnode;
          }


    }
    void in(Node root)
    {
        if (root!=null)
        {
        in(root.left);
        System.out.print(root.data+" ");
        in(root.right);
        }
        
    }
}
class BST{
    public static void main(String args[])
    {
        Op o=new Op();
        o.insert(1);
        o.insert(2);
        o.insert(3);
        o.in(o.root);
    }
}