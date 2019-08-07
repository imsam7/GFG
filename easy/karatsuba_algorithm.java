import java.lang.*;
import java.io.*;
class GFG
{
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while(t-->0)
        {
            String l=scn.nextLine();
            String[] ins = l.split(" ");
            Integer i1 = Integer.parseInt(ins[0], 2);
            Integer i2 = Integer.parseInt(ins[1], 2);
            System.out.println(i1*i2);
        }
    }
}
