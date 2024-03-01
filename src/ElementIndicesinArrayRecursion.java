public class ElementIndicesinArrayRecursion {


    static void ArrayIndicesFind(int arr[],int n,int target,int idx){
        //base case
        if(idx>=n){
            return;
        }
        //self work
        if(arr[idx]==target){
            System.out.println(idx);
        }
        //recursive work

        ArrayIndicesFind(arr,n,target,idx+1);


    }

    public static void main(String[] args) {

        int arr[]={1,2,23,2,2,4};
        int target=2;
        int n=arr.length;
        ArrayIndicesFind(arr,n,target,0);

    }

}
