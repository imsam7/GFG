import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
	    Scanner scn=new Scanner(System.in);
	    int t=scn.nextInt();
	    while(t>0)
	    {
            int m=scn.nextInt();
            int n=scn.nextInt();
            int[][] arr=new int[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=scn.nextInt();
                }
            }
            int[] a=new int[m];
            int sum=0;
            for(int i=0;i<m;i++)
            {
                a[i]=0;
                for(int j=0;j<n;j++)
                {
                    if(arr[i][j]==1)
                    {
                        a[i]++;
                    }
                }
            }
            int max=0;
            int min=0;
            for(int i=0;i<m;i++)
            {
                min=a[i];
                if(min>max)
                {
                    max=min;
                }
            }
            for(int i=0;i<m;i++)
            {
                if(a[i]==max)
                {
                    System.out.print(i);
                    break;
                }
            }
	        t--;
	        System.out.println();
	    }
	}
}
