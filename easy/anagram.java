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
    	     String s1=scn.next();
    	     String s2=scn.next();
    	     char[] str1=s1.toCharArray();
    	     char[] str2=s2.toCharArray();
    	     Arrays.sort(str1);
    	     Arrays.sort(str2);
    	     //System.out.println(Arrays.toString(str1));
    	     //System.out.println(Arrays.toString(str2));
             if(Arrays.equals(str1,str2))
             {
                 System.out.println("YES");
             }
             else
             {
                 System.out.println("NO");
             }
    	    t--;
    	 }
	 }
}

