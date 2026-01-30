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

    public static List<Integer> resultadosCombinados(List<Integer> numeros){
        List<Integer> listaFinal = new ArrayList<>();
        int numMax = numeroMasGrande(numeros);
        numPeqCant(numeros);
        listaFinal.add(maximo);
        listaFinal.add(minimo);
        listaFinal.add(cantidad);
        return listaFinal;
    }

    public static boolean divDeDos(int num) {
        return (num % 2 == 0) ? true : false;
    }

    public static boolean datosImpares(int cantidad) {

        return (cantidad % 2 != 0) ? true : false;
    }

}