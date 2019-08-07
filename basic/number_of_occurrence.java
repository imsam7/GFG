import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=scn.nextInt();
            int f=scn.nextInt();
            int arr[]=new int[n];
            for(int k=0;k<n;k++)
            {
                arr[k]=scn.nextInt();
            }
            int sum=0;
            int q=0;
            for(int j=0;j<n;j++)
            {
                if(f==arr[j])
                {
                    sum++;
                    q=sum;
                }
            }
            if(q==0)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(sum);
            }
        }
	}
}
