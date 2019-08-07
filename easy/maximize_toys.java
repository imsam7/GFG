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
    	    int k=scn.nextInt();
    	    int[] arr=new int[n];
    	    for(int i=0;i<n;i++)
    	    {
    	        arr[i]=scn.nextInt();
    	        //System.out.println(arr[i]);
    	    }
    	    int sum=0;
    	    Arrays.sort(arr);
    	    for(int i=0;i<n;i++)
    	    {
    	        if(arr[i]<k)
    	        {
    	            while(k>0)
    	            {
    	                k=k-arr[i];
    	                //System.out.println(arr[i]);
    	                sum++;
    	                break;
    	            }
    	        }
    	    }
    	    System.out.println(sum);
    	    t--;
    	 }
	 }
}
