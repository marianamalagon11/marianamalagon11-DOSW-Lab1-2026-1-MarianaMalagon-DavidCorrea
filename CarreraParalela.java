public class CarreraParalela{

    public int numeroMasGrande(List<Integer> lista) {
        return lista.stream()
                .max((a, b) -> a.compareTo(b))
                .get();
    }
}