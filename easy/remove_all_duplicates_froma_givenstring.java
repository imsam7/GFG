import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
    	 //code
    	 Scanner scn=new Scanner(System.in);
    	 int t=scn.nextInt();
    	 scn.nextLine();
    	 while(t>0)
    	 {
    	    String s=scn.nextLine();
    	    int len=s.length();
    	    LinkedList<Character> list=new LinkedList<Character>();
    	 int max=0;
    	    for(int i=0;i<len;i++)
    	    {
    	        if(list.contains(s.charAt(i)))
    	        {
    	            max++;
    	        }
    	        else
    	        {
    	            list.add(s.charAt(i));
    	        }
    	    }
    	    StringBuffer sb=new StringBuffer();
    	    for(int i=0;i<list.size();i++)
    	    {
    	        sb.append(list.get(i));
    	    }
    	    System.out.print(sb);
    	    t--;
    	    System.out.println();
    	 }
    	// System.out.println();
	 }
}
