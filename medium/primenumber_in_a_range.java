import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
    	 //code
    	 Scanner scn=new Scanner(System.in);
    	 int t=scn.nextInt();
    	 while(t-->0)
    	 {
    	     int n=scn.nextInt();
    	     int p=scn.nextInt();
    	     for(int i=n;i<=p;i++)
    	     {
    	         if(i==1)
    	         {
    	             i++;
    	         }
    	         int b=0;
    	         for(int j=2;j<i;j++)
    	         {
    	             if(i%j==0)
    	             {
    	                 b=1;
    	             }
    	         }
    	         if(b==0)
    	         {
    	             System.out.print(i+" ");
    	         }
    	     }
    	     System.out.println();
    	 }
	 }
}
