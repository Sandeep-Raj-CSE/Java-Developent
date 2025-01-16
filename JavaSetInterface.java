import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetInterface {

    public static void main(String[] args) {


        //Set<Integer> set = new HashSet<>(); 0(1)
      //  Set<Integer> set = new LinkedHashSet<>(); 0(N)

        Set<Integer> set = new TreeSet<>(); // 0(logn)


        set.add(10);
        set.add(40);
        set.add(40);
        set.add(20);
        set.add(30);
        set.remove(30);
       // set.add(30);

        System.out.println(set.contains(100));

        System.out.println();
    }
}
