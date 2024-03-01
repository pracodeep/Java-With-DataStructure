public class BubbleSort {

   static void BubbleSort(int [] a){

       int n=a.length;
       //n-1 iteration

       for(int i=0;i<n-1;i++){

           boolean flag=false;//has any swaping
           for(int j=0;j<n-i-1;j++){
               //last i element are already at correct sorted position-so no need to check them
               if(a[j]>a[j+1]){

                   //swap a[j],a[j+1]
                   flag=true;
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;

               }

           }
        if(flag==false){//have  any swap
            return;
        }
       }


   }
    public static void main(String[] args) {

       int []a={7,6,5,4,3,6,};
       BubbleSort(a);
       for(int i: a){
           System.out.println(i);
       }
    }
}
