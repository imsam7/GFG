//User function Template for Java
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class GfG
{
    int countLeaves(Node node) 
    {
         // Your code 
         if(node==null)
         return 0;
         if(node.left==null&&node.right==null)
         return 1;
         return countLeaves(node.left)+countLeaves(node.right);
    }
}
