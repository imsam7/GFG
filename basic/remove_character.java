import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner (System.in);
		int t =sc.nextInt();
		while(t>0)
		{
	        String s1 =sc.next();
	        String s2=sc.next();
	        char [] c1 = s1.toCharArray();
	        char [] c2 = s2.toCharArray();
	        ArrayList<Character> c = new ArrayList<Character>();
	        for(int i=0;i<c1.length;i++)
	        {
	           int flag=0;
	           for(int j=0;j<c2.length;j++)
	           {
	               if(c1[i]==c2[j])
	               {
	                   flag=1;
	               }
	           }
	           if(flag==0)
	           c.add(c1[i]);
            }
	          Iterator <Character> itr =c.iterator();
	          while(itr.hasNext())
	          System.out.print(itr.next());
	          System.out.println();
	        t--;
		}
		
	}
}
