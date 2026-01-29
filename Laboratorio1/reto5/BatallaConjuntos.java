import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class BatallaConjuntos {
    public static TreeSet<Integer> generarTreeSet(TreeSet<Integer> listaTree) {
        TreeSet<Integer> treeSetFinal = new TreeSet<>();
        treeSetFinal = listaTree.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(() -> new TreeSet<>()));
        return treeSetFinal;
    }

    public static HashSet<Integer> almacenar(List<Integer> listaSet) {
        HashSet<Integer> orden = listaSet.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
        return orden;
    }

    public static TreeSet<Integer> combinarConjuntos(HashSet<Integer> conjunto1, TreeSet<Integer> conjunto2) {
        TreeSet<Integer> combinado = new TreeSet<>(conjunto1);
        combinado.addAll(conjunto2);
        return combinado;
    }

    public static void imprimirConjuntoFinal(TreeSet<Integer> conjunto) {
        conjunto.forEach(n -> System.out.println("Numero en arena: " + n));
    }

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(List.of(4, 9, 15, 7, 18, 21, 10, 5));
        TreeSet<Integer> treeSet = new TreeSet<>(Set.of(12, 3, 25, 10, 7, 30, 18, 4));

        HashSet<Integer> conjuntoAlmacenado = almacenar(hashSet.stream().collect(Collectors.toList()));
        TreeSet<Integer> conjuntoGenerado = generarTreeSet(treeSet);
        TreeSet<Integer> conjuntoFinal = combinarConjuntos(conjuntoAlmacenado, conjuntoGenerado);
        imprimirConjuntoFinal(conjuntoFinal);
    }
}