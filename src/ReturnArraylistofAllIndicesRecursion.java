import java.util.ArrayList;

public class ReturnArraylistofAllIndicesRecursion {

//Arr 1,4,3,4
    //target  4
    //ans(arraylist)=1,3
    static ArrayList<Integer> allIndices(int arr[],int n,int target,int idx){

        //base case

        if(idx>=n){
            return new ArrayList<Integer>();  //return empty array list
        }
        ArrayList<Integer> ans=new ArrayList<>();  //Making Array list
        //self work
        if(arr[idx]==target){
            ans.add(idx);

        }

        //recursive work
        ArrayList<Integer> SmallAns=allIndices(arr,n,target,idx+1);
        ans.addAll(SmallAns);

        return ans;



    }


    public static void main(String[] args) {
        int [] arr={1,2,3,4,4};
        int target=4;
        int n=arr.length;

        ArrayList<Integer> ans=allIndices(arr,n,target,0);//ans->all indices
        for(Integer i:ans){
            System.out.println(i);
        }
    }
}
