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
    	     int n=scn.nextInt();
    	     String[] str=new String[n];
    	     for(int i=0;i<n;i++)
    	     {
    	         str[i]=scn.next();
    	     }
    	     Arrays.sort(str);
    	     System.out.println(str[0]+" "+str[n-1]);
    	 }
	 }
}
