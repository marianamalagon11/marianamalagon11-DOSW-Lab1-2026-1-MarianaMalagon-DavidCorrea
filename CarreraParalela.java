public class CarreraParalela{

    public int numeroMasGrande(List<Integer> lista) {
        return lista.stream().max(Integer::compare).get();
    }
}