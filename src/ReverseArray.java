public class ReverseArray {

    static int[] ReverseArr(int[] arr){
        int n=arr.length;
        int []ans=new int[n];
        int j=0;
        //travese origin array in reverse reaction
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
 
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ans[]=ReverseArr(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }


}
