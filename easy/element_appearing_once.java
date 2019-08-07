import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
    	 //code
    	 Scanner scn=new Scanner(System.in);
    	 int t=scn.nextInt();
    	 while(t>0)
    	 {
    	    int n=scn.nextInt();
    	    int[] a=new int[n];
    	    int p=1000000;
    	    int[] freq=new int[p];
    	    for(int i=0;i<n;i++)
    	    {
    	        a[i]=scn.nextInt();
    	        freq[a[i]]++;
    	    }
    	    for(int i=0;i<p;i++)
    	    {
    	        if(freq[i]==1)
    	        {
    	            System.out.print(i);
    	        }
    	    }
    	    t--;
    	    System.out.println();
    	 }
	 }
}
