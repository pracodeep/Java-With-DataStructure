import java.util.ArrayList;


public class Arraylist {
    public static void main(String [] args){
        //wrapper class
       // /Integer i=Integer.valueOf(2);
        //System.out.println(i);
        //syntax
        ArrayList<Integer> l1=new ArrayList<>();
        //ArrayList<Boolean> l2=new ArrayList<>();
        //ArrayList<Float> l3=new ArrayList<>();

        //Add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        //get element at index i

        System.out.println(l1.get(1));//output 6

        //print with loop
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));//output 5 6 7 8
        }

        //printing the arraylist directly
        System.out.println(l1);  //output 5 6 7 8


        ////adding element at some index i //[5 100 6 7 8]

        l1.add(1, 100);
        System.out.println(l1); //5 100 6 7 8
             //modifing element at index i

        l1.set(1,10);
        System.out.println(l1); // 5,10 6 7 8

        //remove element at index i
        l1.remove( 1); //output 5 6 7 8
        //removing an element  e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1); //out put 5 6 8

        //checking if element is exist or not
        boolean ans=l1.contains(Integer.valueOf(6)); //true
        System.out.println(ans);

        //if you don't specify class,you can put anything inside l
        ArrayList l=new ArrayList();
        l.add("pradeep");
        l.add(true);
        l.add(1.1);
        System.out.println(l); // pradeep true 1.1


    }






}
