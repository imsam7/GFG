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
    	     String[] str=s.split("\\D");
    	     int max=0;
    	     for(int i=0;i<str.length;i++)
    	     {
    	         if(!str[i].isEmpty())
    	         max=Math.max(max,Integer.parseInt(str[i]));
    	     }
    	     System.out.println(max);
    	 }
	 }
}
