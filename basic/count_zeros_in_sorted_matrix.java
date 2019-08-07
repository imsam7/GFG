/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
    /*you are required to complete this method*/
    int countZeros(int A[][], int n)
    {
        int p=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(A[i][j]==0)
                {
                    p=p+1;
                }
            }
        }
        return p;
    }
}
