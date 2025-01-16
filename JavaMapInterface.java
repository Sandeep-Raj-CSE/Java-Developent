import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaMapInterface {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Map<String,String> mp = new HashMap<>();


        mp.put("us","United State");
        mp.put("in","India");
        mp.put("Uk","United Kingdom");


        System.out.println(mp);
        System.out.println(mp.containsKey("Uk"));
    }
}
