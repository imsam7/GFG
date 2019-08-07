/*Complete function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class GfG{
    public int sumBT(Node root){
      // add code here.
      if(root==null)
      {
          return 0;
      }
      if(root!=null)
      {
          return root.data+sumBT(root.left)+sumBT(root.right);
      }
      return 0;
   }
}
