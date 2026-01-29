import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class BatallaConjuntos {
    public static TreeSet<Integer> generarTreeSet() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random();

        while (treeSet.size() < 9) {
            treeSet.add(random.nextInt(35));
        }

        treeSet = treeSet.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(() -> new TreeSet<>()));
        return treeSet;
    }

}