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
    	     char[] str1=s.toCharArray();
    	     char[] str2=s.toCharArray();
    	     int n=str2.length;
    	     int m=str1.length;
    	     Arrays.sort(str2);
    	     //int[] a=new int[m];
    	     StringBuffer sb=new StringBuffer();
    	     for(int i=0;i<n;i++)
    	     {
    	         if(!Character.isDigit(str2[i]))
    	         sb.append(str2[i]);
    	     }
    	     int sum=0;
    	     for(int i=0;i<m;i++)
    	     {
    	         if(Character.isDigit(str1[i]))
    	         sum=sum+Character.getNumericValue(str1[i]);
    	     }
    	     sb.append(sum);
    	     System.out.println(sb);
    	 }
	 }
}
