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
    	 while(t-->0)
    	 {
    	     String str1=scn.nextLine();
    	     String[] s1=str1.split("");
    	     String str2=scn.nextLine();
    	     String[] s2=str2.split(""); 
    	     LinkedList<String> list1=new LinkedList<String>();
    	     LinkedList<String> list2=new LinkedList<String>();
    	     LinkedList<String> list3=new LinkedList<String>();
    	     for(int i=0;i<s1.length;i++)
    	     list1.add(s1[i]);
    	     for(int i=0;i<s2.length;i++)
    	     list2.add(s2[i]);
    	     Arrays.sort(s1);
    	     Arrays.sort(s2);
    	     StringBuffer sb=new StringBuffer();
    	     for(int i=0;i<s2.length;i++)
    	     {
                if((!list1.contains(s2[i]))&&(!list3.contains(s2[i])))
                {
                    list3.add(s2[i]);
                }
    	     }
    	     for(int i=0;i<s1.length;i++)
    	     {
                if((!list2.contains(s1[i]))&&(!list3.contains(s1[i])))
                {
                    list3.add(s1[i]);
                }
    	     }
    	     Collections.sort(list3);
    	     for(int i=0;i<list3.size();i++)
    	     {
    	         System.out.print(list3.get(i));
    	     }
    	     System.out.println();
    	 }
	 }
}
