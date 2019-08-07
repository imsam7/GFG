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
}
 */
class Tree
{
    int height(Node node) 
    {
         // Your code here
         int count=1;
         while(node.left!=null)
         {
             node=node.left;
             count++;
         }
         return count;
    }   
}
