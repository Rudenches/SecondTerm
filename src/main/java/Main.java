import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String[] args) {
        Map<Integer, Integer> a = new HashMap<>();
        a.put(1, 1);
        a.remove(1);
       System.out.println(a.remove(1));
    }
}
