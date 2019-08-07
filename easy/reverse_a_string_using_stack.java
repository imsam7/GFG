class Solution {
    
    public void reverse(String str){
       //your code here
       char[] string=str.toCharArray();
       int n=string.length;
       Stack<Character> stack=new Stack<Character>();
       for(int i=0;i<n;i++)
       {
           stack.push(string[i]);
       }
       for(int i=0;i<n;i++)
       {
           System.out.print(stack.pop());
       }
       System.out.println();
    }
}
