/*node of the binary tree
class Node
{
    char data;
    Node left, right;
    Node(char key)
    {
        data = key;
        left = right = null;
    }
}*/
class GfG
{
   
    public static Node convertExp(String str, int i)
    {
        
        if(i > str.length())
         return null;
         
       Node root = new Node(str.charAt(i));
        i++;
        if(i < str.length() && str.charAt(i) == '?')
         root.left = convertExp(str, i+1);
        if(i < str.length() && str.charAt(i) == ':')
         root.right = convertExp(str, i+1);
      
      return root;  
    }
}
