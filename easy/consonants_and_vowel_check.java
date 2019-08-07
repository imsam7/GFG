//User function Template for Java
class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        
        //Your code here
        int n=s.length();
        String str="aeiou";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                v++;
            }
            else if(s.charAt(i)==' ')
            {
                continue;
            }
            Else
            {
                c++;
            }
        }
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
        System.out.print("Same");
        
        System.out.println();
    }
}
//Position this line where user code will be pasted.
