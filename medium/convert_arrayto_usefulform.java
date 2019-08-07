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
    	     int[] a1=new int[n];
    	     for(int i=0;i<n;i++)
    	     {
    	         a1[i]=scn.nextInt();
    	     }
    	     int[] a2=a1.clone();
    	     Arrays.sort(a2);
    	     for(int i=0;i<n;i++)
    	     {
    	         for(int j=0;j<n;j++)
    	         {
    	             if(a1[i]==a2[j])
    	             {
    	                 a1[i]=j;
    	             }
    	         }
    	     }
    	     for(int i=0;i<n;i++)
    	     {
    	         System.out.print(a1[i]+" ");
    	     }
    	    t--;
    	    System.out.println();
    	 }
	 }
}
