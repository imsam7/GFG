/* A binary search tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
}
*/
// your task is to complete the below function
class BST
{
    int minValue(Node node)
    {
        while(node.left!=null)
        {
            node=node.left;
        }
        return node.data;
        
    }
}

