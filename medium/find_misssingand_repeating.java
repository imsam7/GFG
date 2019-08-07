import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
	    Scanner scn=new Scanner(System.in);
	    int t=scn.nextInt();
	    for(int k=0;k<t;k++)
	    {
	        int len=scn.nextInt();
	        int[] a=new int[len];
	        for(int i=0;i<len;i++)
	        {
	            a[i]=scn.nextInt();
	        }
	        int[] freq=new int[len+1];
	        for(int j=0;j<len;j++)
	        {
	            freq[a[j]]++;
	        }
	        for(int p=0;p<len+1;p++)
	        {
	            if(freq[p]==2)
	            {
	                System.out.print(p);
	                System.out.print(" ");
	                break;
	            }
	        }
	        for(int l=1;l<len+1;l++)	        
	        {
	            if(freq[l]==0)
	            {
	                System.out.print(l);
	                System.out.println();
	                break;
	            }
	        }
	   }
	}
}
