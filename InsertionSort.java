public class InsertionSort {
static void InsertionSort(int arr[]){
    int n=arr.length;
    for(int i=1;i<n;i++){
        int j=i;
        while(j > 0 && arr[j] < arr[j-1]){
            //swap
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }




    }

}
    public static void main(String[] args) {
        int arr[]={2,5,6,4,1};
        InsertionSort(arr);
             for(int val:arr) {
                 System.out.println(val);
             }
        }

    }

