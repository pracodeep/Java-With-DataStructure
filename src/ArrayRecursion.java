public class ArrayRecursion {

static void printArray(int[] arr,int idx){  //5,6,7,8,9

    //base case

    if(idx==arr.length){
        return;

    }
    //self work
    System.out.println(arr[idx]);  //5

    //recursion
    printArray(arr,idx+1); //6,7,8,9




}
    public static void main(String[] args) {
        int [] arr={5,6,7,8,9};

        printArray(arr,0  );

    }
}
