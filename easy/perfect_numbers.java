import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t>0)
        {
            long n = Long.parseLong(br.readLine());
            
            long sum = 0;
            
            for(long i = 1;i<=n/i;i++){
            if(n%i==0){
            if(i==n/i)
            sum = sum+i;
            else
            sum = sum+i+n/i;
            }
            
            }
            if(sum/2==n)
            bw.write("1");
            else
            bw.write("0");
            
            bw.write("\n");
            t--;
        }
        bw.flush();
    }
}
