public class ArrayMaxRecursion {



    static int maxinArray(int arr[],int idx){

        //base case
        if(idx== arr.length-1){
            return arr[idx];
        }

        // small problem idx+1,end of array->max

        int smallAns=maxinArray(arr,idx+1  );
        //self ework and final ans

         return Math.max(arr[idx],smallAns);

    }


    public static void main(String[] args) {
        int arr[]={3,10,3,2,5};
        System.out.println(maxinArray(arr,0));
    }
}
