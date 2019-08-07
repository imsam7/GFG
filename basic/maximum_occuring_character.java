using namespace std;
 
char getMaxOccuringChar(char* str)
{
    int hash[26]={0};
    int i;
    
    for( i=0;str[i]!='\0';i++){
        hash[str[i]-'a']+=1;
    }
 
    int max_index=0;
    for(i=1;i<26;i++){
       if(hash[i]>hash[max_index])
        max_index=i;
    }
 
    return max_index+'a';
}

int main()
{
   
    char str[100];
    int t;
    scanf("%d",&t);
    while(t--)
    {
    	scanf("%s",str);
    cout<< getMaxOccuringChar(str)<<endl;
}
}
