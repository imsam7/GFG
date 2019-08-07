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
    void inOrder(Node root)
    {
       // Your code goes 
       if(root==null)
       return;
       else
       {
           inOrder(root.left);
           StringBuffer sb=new StringBuffer();
           sb.append(root.data+" ");
           System.out.print(sb);
           inOrder(root.right);
       }
    }
}
