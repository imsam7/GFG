import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner scn=new Scanner(System.in);
	    int t=scn.nextInt();
	    while(t>0)
	    {
	        
	        int n=scn.nextInt();
	        long[] arr=new long[n+2];
	        if(n==1)
	        {
	            System.out.print(1);
	        }
	        else
	        {
    	        arr[0]=1;
    	        arr[1]=1;
    	        for(int i=2;i<n;i++)
    	        {
        	        arr[i]=arr[i-1]+arr[i-2];
    	        }
    	        for(int i=0;i<n;i++)
    	        {
    	            
        	        System.out.print(arr[i]+" ");
    	        }
	        }
	        System.out.println();
	        t--;
	    }
	}
}
