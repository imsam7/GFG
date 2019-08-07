/* The main function that implements QuickSort() (present in a class 
   different from QuickSort)
   arr[] --> Array to be sorted,   low  --> Starting index,  high  --> Ending index 
static void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        
        int pi = new QuickSort().partition(arr, low, high);
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    } }*/
class QuickSort
{
    /* This function takes last element as pivot, places  the pivot element 
    at its correct position in sorted  array, and places all smaller (smaller
    than pivot) to left of pivot and all greater elements to right  of pivot */
    static int partition(int arr[], int low, int high)
    {
        int pivot=high;
        int i=low-1;
        int temp,temp1=0;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<=arr[pivot])
            {
                i++;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        temp1=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp1;
        return i+1;
    } 
}
