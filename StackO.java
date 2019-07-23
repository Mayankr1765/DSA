/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class StackO {
	public static void main (String[] args) {
		Scanner k=new Scanner(System.in);
		int i,t;
		t=k.nextInt();
		for (i=0;i<t;i++)
		{
		    String st=k.nextLine();
		    Stack<Character> s=new Stack<>();
		    int x,y;
		    char res;
		    for (i=0;i<st.length();i++)
		    {
		        if (st.charAt(i)=='+')
		        {
		            x=s.pop();
		            y=s.pop();
		            res=(char)(int)(x+y);
		            s.push(res);
		        }
		        if (st.charAt(i)=='-')
		        {
		            x=s.pop();
		            y=s.pop();
		            res=(char)(int)(x-y);
		            s.push(res);
		        }
		        if (st.charAt(i)=='*')
		        {
		            x=s.pop();
		            y=s.pop();
		            res=(char)(int)(x*y);
		            s.push(res);
		        }
		        if (st.charAt(i)=='/')
		        {
		            x=s.pop();
		            y=s.pop();
		            res=(char)(int)(x/y);
		            s.push(res);
		        }
		        if (st.charAt(i)=='^')
		        {
		            x=s.pop();
		            y=s.pop();
		            res=(char)(int)(x^y);
		            s.push(res);
		        }
		        else
		        {
		            
		            s.push(st.charAt(i));
		        }
		    }
		    System.out.println(s.peek());
		}
	}
}