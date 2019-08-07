//This is a function problem
static boolean isIsogram(String data){
    //Your code here
    char[] str=data.toCharArray();
    int p=0;
    for(int i=0;i<str.length-1;i++)
    {
        for(int j=i+1;j<str.length;j++)
        {
            if(str[i]==str[j])
            p=1;
        }
    }
    if(p==0)
    return true;
    else
    return false;
}
