import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0)
		{
		    int n=scn.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=scn.nextInt();
		    }
		    int sum=0;
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]==0)
		        {
		            sum++;
		        }
		    }
		    System.out.println(sum);
		    t--;
		}
		System.out.println();
	}
}
