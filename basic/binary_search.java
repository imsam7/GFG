class GfG
{
	int bin_search(int A[], int left, int right,  int k)
	{
	    int p=0;
		for(int i=left;i<=right;i++)
		{
		    if(A[i]==k)
		    {
		        p=i;
		    }
		}
		if(p==0)
		{
		    return -1;
		}
		else
		{
		    return p;
		}
	}
}
