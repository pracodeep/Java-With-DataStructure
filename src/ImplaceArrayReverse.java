public class ImplaceArrayReverse {


    static void PrintArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static void swapInArray(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


    }
    static void reverseArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;

        }
    }



    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverseArray(arr);
        PrintArray(arr);
    }
}
