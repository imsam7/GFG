class GfG
{
    public int SumofLeafNodes(Node root)
    {
        // your code here
        if(root==null)
        return 0;
        if(root.left==null&&root.right==null)
        return root.data;
        return SumofLeafNodes(root.left)+SumofLeafNodes(root.right);
    }
}
//User function Template for Java
//Complete the function
//Take input for a and s 
class Geeks {
	static void getInput () {
		
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt(); //Taking the number of testcases
	    while(t-->0)
	    {
    		int a = sc.nextInt();
            String s = sc.nextLine();
            s = sc.nextLine();
    	    
    	    //Your code here
    
    		System.out.println(a);
    		System.out.println(s);
	    }
	
	}
}
