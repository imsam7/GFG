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
		    int p=(2*n)+2;
		    int k=50001;
		    int[] arr=new int[p];
		    int[] freq=new int[k];
		    for(int i=0;i<p;i++)
		    {
		        arr[i]=scn.nextInt();
		    }
		    Arrays.sort(arr);
		    for(int i=0;i<p;i++)
		    {
		        freq[arr[i]]++;
		    }
		    for(int i=0;i<k;i++)
		    {
		        if((freq[i]!=0)&&(freq[i]!=2)&&(freq[i]!=4))
		        {
		            System.out.print(i+" ");
		        }
		    }
		    t--;
		    System.out.println();
		}
		System.out.println();
	}
}
