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
    	    for(int i=0;i<n;i++)
    	    {
    	        a[i]=scn.nextInt();
    	    }
    	    int k=scn.nextInt();
    	    Arrays.sort(a);
    	    System.out.print(a[k-1]);
    	    t--;
    	    System.out.println();
    	 }
	 }
}
