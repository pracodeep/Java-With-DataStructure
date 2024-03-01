
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ProblemsInArrayList {

static void reverseList(ArrayList<Integer> list){
    int i=0;
    int j=list.size()-1;
    while(i<j){
        Integer temp=Integer.valueOf(list.get(i));
        list.set(i,list.get(j));
        list.set(j,temp);


        i++;
        j--;
    }

}


    public static void main(String[] args) {

    ArrayList<Integer> list=new ArrayList<>();
    list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("original list"+ list);
        Collections.reverse(list);
        System.out.println("reverse list"+ list);
        //reverseList(list);
        Collections.sort(list);
        System.out.println("sort  Assending order"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("descendin order list"+ list);

        ArrayList<String> l1=new ArrayList<>();
        l1.add("welcome to");
        l1.add("physics");
        l1.add("wallaha");
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println("sorted "+ l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("sorted "+ l1);   
    }



}
