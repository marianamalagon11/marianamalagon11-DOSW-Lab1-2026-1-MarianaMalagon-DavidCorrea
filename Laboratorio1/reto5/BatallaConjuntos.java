public class BatallaConjuntos
{
    public static HashSet<Integer> almacenar(List<Integer> lista) {
        HashSet<Integer> orden = lista.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
        return orden;
    }
}