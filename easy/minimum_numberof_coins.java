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
    	    int[] arr={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
    	    int len=arr.length;
    	    int div=0;
    	    for(int i=len-1;i>=0;i--)
    	    {
    	        if(n>=arr[i])
    	        {
    	            while(n>=0)
    	            {
    	                div=n/arr[i];
    	                n=n-arr[i]*div;
    	                for(int j=0;j<div;j++)
    	                {
    	                    System.out.print(arr[i]+" ");
    	                }
    	                break;
    	            }
    	        }
    	    }
    	    t--;
    	    System.out.println();
    	 }
	 }
}
