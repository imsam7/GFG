/*Complete The Function Below*/
class GfG{
	public static int size(TreeNode root){
//add Code here.
if(root==null)
return 0;
return 1+size(root.left)+size(root.right);
}
}
