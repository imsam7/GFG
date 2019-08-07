import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
    	 //code
    	 Scanner scn=new Scanner(System.in);
    	 int t=scn.nextInt();
    	 scn.nextLine();
    	 while(t-->0)
    	 {
    	     String s=scn.nextLine();
    	     int res=0;
    	     String[] str=s.split("[a-z]");
    	     int n=str.length;
    	     int[] a=new int[n];
    	     for(int i=0;i<n;i++)
    	     {
    	         if(!str[i].isEmpty())
    	         a[i]=Integer.parseInt(str[i]);
    	         res=res+a[i];
    	     }
    	     System.out.println(res);
    	 }
	 }
}
