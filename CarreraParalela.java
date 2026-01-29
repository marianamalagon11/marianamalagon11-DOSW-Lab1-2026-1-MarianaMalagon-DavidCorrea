public class CarreraParalela{

    public int numeroMasGrande(List<Integer> lista) {
        return lista.stream()
                .max((a, b) -> a.compareTo(b))
                .get();
    }

    public static void numPeqCant(List<Integer> lista) {
        int minimo = lista.stream()
                .min((a, b) -> a.compareTo(b))
                .get();
        int cantidad = lista.size();
    }

    public static List<Integer> resultadosCombinados(List<Integer> lista) {
        List<Integer> nuevaLista = new ArrayList<>();
        int maximo = numeroMasGrande(lista);
        numPeqCant(lista);
        nuevaLista.add(maximo);
        nuevaLista.add(minimo);
        nuevaLista.add(cantidad);
        return nuevaLista;
    }
}