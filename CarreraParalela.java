import java.util.List;
import java.util.ArrayList;

public class CarreraParalela{
    private int minimo;
    private int cantidad;
    private int maximo;


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

    public static boolean divDeDos(int num) {
        return (num % 2 == 0) ? true : false;
    }

    public static boolean datosImpares(int cantidad) {
        return (cantidad % 2 != 0) ? true : false;
    }

    public static boolean verificadorMultiploDeDos(List<Integer> lista){
        int numero = numeroMasGrande(lista);
        return numero % 2 == 0 ? true : false;
    }

    public static boolean verificadorCantDatosPar(List<Integer> lista){
        return lista.size() % 2 == 0 ? true : false;
    }

    public List<Object> funcionFusionada(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> listaUnida = new ArrayList<>();
        listaUnida.addAll(lista1);
        listaUnida.addAll(lista2);

        numeroMasGrande(listaUnida);
        numeroPeqCant(listaUnida);

        boolean maxEsMultiplo = divDeDos(max);
        boolean cantEsPar = !datosImpares(cant);

        List<Object> resultados = new ArrayList<>();
        resultados.add(maximo);
        resultados.add(minimo);
        resultados.add(cantidad);
        resultados.add(maxEsMultiplo);
        resultados.add(cantEsPar);

        return resultados;
    }
}