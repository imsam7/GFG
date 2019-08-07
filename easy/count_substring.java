import java.lang.*;
import java.io.*;
class GFG
 {
	public static int subStr(String str)
     {
         int c=0;
         for(int i=0;i<str.length();++i)
         {
             if(str.charAt(i)=='1')
             ++c;
         }
         return (c*(c-1))/2;
     }
     public static void main (String[] args)
      {
     Scanner ab=new Scanner(System.in);
     int t=ab.nextInt();
     while(t-->0)
     {
         System.out.println(subStr(ab.next()));
     }
  }
}
