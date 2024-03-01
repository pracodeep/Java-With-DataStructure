public class SubsetSumString {


    static void SubsetSum(int [] a,int n,int idx,int currSum){
    if(idx>=n){

        System.out.println(currSum);
        return;
    }
        //currI idx+currAns
        SubsetSum(a,n,idx+1,currSum+a[idx]);


        //curr ans-> not choice
        SubsetSum(a,n,idx+1,currSum);

    }

    public static void main(String[] args) {

        int [] a={2,4,5};
        SubsetSum(a, a.length,0,0);
    }

}
