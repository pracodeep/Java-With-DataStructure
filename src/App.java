public class App {
    static void change_Array(int[] arr){
        for(int i=0;i<arr.length;i++) {

            arr[i]=0;
        }

    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +"");
        }

    }

    public static void main(String[] args) {
        int [] arr=new int[3];
        arr[0]=5;
        arr[1]=5;
        arr[2]=5;

        change_Array(arr);
        printArray(arr);
    }
}
