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
    	     int[] a1=new int[2*n];
    	     for(int i=0;i<2*n;i++)
    	     {
    	         a1[i]=scn.nextInt();
    	     }
    	     Arrays.sort(a1);
    	     System.out.print(a1[n-1]+a1[n]);
     	    t--;
     	    System.out.println();
    	 }
	 }
}
