import java.lang.*;
import java.io.*;

class GFG {
public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-->0)
    {
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int mul =1;
        String[] s = br.readLine().trim().split(" ");
        for(int i = 0 ; i < n ; i++ )
        {
            a[i] =Integer.parseInt(s[i]);
            mul *= a[i];
        }
        StringBuffer sb= new StringBuffer();
        for(int i = 0 ; i < n ; i++ )
        {
            sb.append(mul/a[i]+" ");
        }
        System.out.println(sb);
        }
    }
}
