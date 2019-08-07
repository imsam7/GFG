/*Complete the function below
Node is as follows:
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
class GfG
{
	boolean isFullTree(Node node)
    {
        //add code here.
        if(node == null)
        return true;
        if((node.left == null && node.right != null) ||
        (node.left != null && node.right == null)){
        return false;
        }
        return isFullTree(node.left) && isFullTree(node.right);
    }
}
