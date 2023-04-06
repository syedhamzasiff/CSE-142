import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pair<String> ps = new Pair<String>("hamza", "asif");
        Pair<Double> pd = new Pair<Double>(5.1, 2.2);

        List<Pair> pairs = new ArrayList<>();
        pairs.add(ps);
        pairs.add(pd);

        DisparatePair<Double, Integer> p = new DisparatePair<>(1.3, 3);

        System.out.println(p.getFirst());
        System.out.println(p.getSecond());


    }
}