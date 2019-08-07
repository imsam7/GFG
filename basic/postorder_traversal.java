//User function Template for Java
/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Tree
{
    void postOrder(Node root)
    {
       // Your code goes here
       if(root==null)
       return;
       else
       {
           postOrder(root.left);
           postOrder(root.right);
           System.out.print(root.data+" ");
       }
    }
}
