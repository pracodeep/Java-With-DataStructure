public class BubblessortExample {

    public static void main(String[] args) {
        int arr[]={0,1,10,5,0,4};

        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    //swap arr[j],arr[j+1}
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }

        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
