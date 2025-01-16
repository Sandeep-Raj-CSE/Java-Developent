import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ArrayListLearning
{

    public static void main(String[] args) {


       // int arr[] = {10,20,30};

        List<Integer> ls = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();

        ls.add(10);
        ls.add(20);
        ls.add(30);

//        System.out.println(ls);
//        System.out.println(ls.size());
//        System.out.println(ls.contains(20));
//        System.out.println(ls.remove(2));
//        System.out.println(ls);


        ls2.add(30);
        ls2.add(50);
        ls2.add(60);


//        ls.addAll(ls2);
//        System.out.println(ls);
//
//        ls.removeAll(ls2);
// retainAll


//        Object obj[] = ls.toArray();
//        for(Object e:obj){
//
//            System.out.println(e);
//
//        }
//        System.out.println(ls);

//
//        System.out.println(ls.get(0));
//        ls.set(1,2000);
//        System.out.println(ls);
//        ls.add(3,2222); // aage shift
//        System.out.println(ls);
//
//        System.out.println(ls.indexOf(1000));


        // ListIterator

        List<String> ls3 = new ArrayList<>();

        ls3.add("Kiwi");
        ls3.add("Kiwi1");
        ls3.add("Kiwi2");
        ls3.add("Kiwi3");


        for(int i=0; i<ls3.size();i++){
            System.out.println(ls3.get(i));
        }

        // way 2

        for(String i:ls3){
            System.out.println(i);
        }


        Iterator<String> fe = ls3.iterator();

        while (fe.hasNext()){
            System.out.println(fe.next());
        }


        List<String> sfe = ls3.subList(1,2);
        System.out.println(sfe);


        






    }
}
