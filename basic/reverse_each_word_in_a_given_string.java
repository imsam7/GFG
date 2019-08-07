import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		Scanner scn=new Scanner(System.in);
		int t=Integer.parseInt(br.readLine()); 
		while(t>0)
		{
		    String str=br.readLine();
            String[] arr=str.split("\\.");
		    int n=arr.length;
		    String rev="";
    	    for(int i=0;i<n;i++)
    		{
    		    String str1=arr[i];
    		    for(int j=str1.length()-1;j>=0;j--)
    		    {
    		        rev=rev+str1.charAt(j);
    		    }
    		    if(i==n-1)
    		    {
    		        rev=rev;
    		    }
    		    else
    		    {
    		        rev=rev+".";
    		    }
    		}
		     System.out.println(rev);
		     t--;
		}
		System.out.println();
	}
}
