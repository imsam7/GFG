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
    	     String[] str=s.split("");
    	     int n=s.length();
    	     LinkedList<String> list=new LinkedList<String>();
    	     int count=0;
    	     for(int i=0;i<n-1;i++)
    	     {
    	         if(!list.contains(str[i]))
    	         {
        	         for(int j=i+1;j<n;j++)
        	         {
        	             if(str[i].equals(str[j]))
        	             {
        	                 list.add(str[i]);
        	                 count++;
        	             }
        	         }
    	         }
    	     }
    	     System.out.println(count);
    	 }
	 }
}
