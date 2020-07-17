/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	  Scanner S = new Scanner(System.in);
	    int t=S.nextInt();
	    int l1x,l1y,r1x,r1y,l2x,l2y,r2x,r2y;
	    
	    while(t>0)
	    {
	     l1x=S.nextInt();
	     l1y=S.nextInt();
	     r1x=S.nextInt();
	     r1y=S.nextInt();
	     l2x=-S.nextInt();
	     l2y=-S.nextInt();
	     r2x=S.nextInt();
	     r2y=S.nextInt();
	     int f=1;
	     
	     if(l1x>r2x || l2x>r1x)
	     f=0;
	     if(r1y>l2y || r2y>l1y)
	     f=0;
	     
	     System.out.println(f);
	     t--;
	    }
	    
	}
	}
