import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
    	 //code
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	 //Scanner scn=new Scanner(System.in);
    	 int t=Integer.parseInt(br.readLine());
    	 while(t>0)
    	 {
    	     String str1=br.readLine();
    	     String str2=br.readLine();
    	     int n=str1.length();
    	     int m=str2.length();
    	     LinkedList<Character> list=new LinkedList<Character>();
    	     for(int i=0;i<m;i++)
    	     {
    	         list.add(str2.charAt(i));
    	     }
    	     int flag=0;
    	     for(int i=0;i<n;i++)
    	     {
    	         if(list.contains(str1.charAt(i)))
    	         {
    	             System.out.print(str1.charAt(i));
    	             flag=1;
    	             break;
    	         }
    	     }
    	     if(flag==0)
    	     {
    	         System.out.print("$");
    	     }
    	    t--;
    	    System.out.println();
    	 }
	 }
}
