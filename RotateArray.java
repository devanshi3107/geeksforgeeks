/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int A[]={1,2,3,4,5};
		int x,n=5,d=2;
		int temp[]=new int[d];
		for(x=0;x<d;x++)
		{
		    temp[x]=A[x];         // 1 2 
		  //  System.out.print(temp[x]);
		}
		for(x=d;x<n;x++)
	{	A[x-d]=A[x];
	//	System.out.print(A[x]);
	}
	int i=0;
	for(x=n-d;x<n;x++)
	{A[x]=temp[i++];
//	System.out.print(A[x]);
	}
	for(x=0;x<n;x++)
	System.out.print(A[x]+" ");
		
	}
}
