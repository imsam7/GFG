/*Complete the finction below
Node is as follows
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}*/
class GfG
{
	public static int maxLevelSum(Node root)
         {
         //add code here.
            Queue<Node> q=new LinkedList<Node>();
            q.add(root);
            int sum=0;
            int min=0;
            int max=0;
            while(!q.isEmpty())
            {
                int count=q.size();
                sum=0;
                while(count-->0)
                {
                    Node temp=q.poll();
                    sum=sum+temp.data;
                    max=Math.max(sum,max);
                    if(temp.left!=null)
                    q.add(temp.left);
                    if(temp.right!=null)
                    q.add(temp.right);
                }
            }
            return max;
         }

}
