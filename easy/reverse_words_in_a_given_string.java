class Reverse {
    public static void reverseWords(String s) {
        // Your code here
        String[] str=s.split("\\.");
        int n=str.length;
        for(int i=n-1;i>0;i--)
        {
            System.out.print(str[i]+".");
        }
        System.out.print(str[0]);
    }
}
