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
    	     int count=0;
    	     int max=0;
    	     int[] a=new int[n];
    	     for(int i=0;i<n;i++)
    	     {
    	         a[i]=scn.nextInt();
    	         if(a[i]>=max)
    	         {
    	             count++;
    	         }
    	         max=Math.max(a[i],max);
    	     }
    	     System.out.print(count);
    	     t--;
    	     System.out.println();
    	 }
	 }
}
