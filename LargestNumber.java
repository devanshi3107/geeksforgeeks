/******************************************
Given a list of non negative integers, arrange them in such a manner that they form the largest number possible.The result is going to be very large, hence return the result in the form of a string.
Input:
The first line of input consists number of the test cases. The description of T test cases is as follows:
The first line of each test case contains the size of the array, and the second line has the elements of the array.
Output:
In each separate line print the largest number formed by arranging the elements of the array in the form of a string.
Example:
Input:
2
5
3 30 34 5 9
4
54 546 548 60
Output:
9534330
6054854654
***************************************************************************/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		int x;
		int temp;
		while(t>0)
		{
		    int n=S.nextInt();
		    int A[]=new int[n];
		    for(x=0;x<n;x++)
		    A[x]=S.nextInt();
		    for(int i=0;i<n;i++)
		    {
		        for(int j=i+1;j<n;j++)
		        {
		            int r=compare(A[i],A[j]);
		            if(r==1)
		          {  temp=A[i];
		            A[i]=A[j];
		            A[j]=temp;
		          } 
		        }
		    }
		    for(x=0;x<n;x++)
		    System.out.print(A[x]);
		    System.out.println();
		    t--;
		}
		
	}
	static int compare(int n1,int n2)
	{
	    String s1="";
	    String s2="";
	    s1=String.valueOf(n1)+String.valueOf(n2);
	    s2=String.valueOf(n2)+String.valueOf(n1);
	    if(s1.compareTo(s2)>0)
	    return 0;
	    else return 1;
	}
}
