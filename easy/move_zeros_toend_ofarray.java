import java.io.*;
import java.util.*;
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
    	    int[] arr=new int[n];
    	    int count=0;
    	    for(int i=0;i<n;i++)
    	    {
    	        arr[i]=scn.nextInt();
    	        if(arr[i]==0)
    	        {
    	            count++;
    	        }
    	        else
    	        {
    	            System.out.print(arr[i]+" ");
    	        }
    	    }
    	    for(int i=0;i<count;i++)
    	    {
    	        System.out.print(0+" ");
    	    }
    	    t--;
    	    System.out.println();
    	 }
	 }
}
