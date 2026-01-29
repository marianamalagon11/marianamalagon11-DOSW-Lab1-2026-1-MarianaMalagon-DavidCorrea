import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.*;

public class Tesoro {

    public static Hashtable<String, Integer> crearHashTable(List<Map.Entry<String, Integer>> lista) {
        Hashtable<String, Integer> tabla = new Hashtable<>();
        lista.stream()
                .filter(p -> !tabla.containsKey(p.getKey()))
                .forEach(p -> tabla.put(p.getKey(), p.getValue()));
        return tabla;
    }


    public static HashMap<String, Integer> crearHashMap (List < Map.Entry < String, Integer >> lista){
            HashMap<String, Integer> mapa = new HashMap<>();
            Runnable accion = () -> lista.stream()
                    .filter(p -> !mapa.containsKey(p.getKey()))
                    .forEach(p -> mapa.put(p.getKey(), p.getValue()));
            accion.run();
            return mapa;
    }
    public static Hashtable<String, Integer> combinarHash
            (HashMap < String, Integer > mapa1, Hashtable < String, Integer > mapa2){
                Hashtable<String, Integer> combinado = new Hashtable<>();
                mapa1.forEach((k, v) -> combinado.put(k, v));
                mapa2.forEach((k, v) -> combinado.put(k, v));
                return combinado;
    }

    public static void ordenoImprimo (Hashtable < String, Integer > mapa){
                mapa.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey())
                        .forEach(e -> System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue()));

    }


    public static Hashtable<String, Integer> prepararImpresion (Hashtable < String, Integer > mapa){
            Hashtable<String, Integer> resultado = new Hashtable<>();
            mapa.forEach((k, v) -> resultado.put(k.toUpperCase(), v));
            return resultado;
    }

    public static void main(String[] args){
        List<Map.Entry<String, Integer>> listaMap = List.of(
                Map.entry("oro", 5),
                Map.entry("plata", 3),
                Map.entry("oro", 7),
                Map.entry("diamante", 10)
        );
        HashMap<String, Integer> hashPiedras = crearHashMap(listaMap);

        List<Map.Entry<String, Integer>> listaTable = List.of(
                Map.entry("plata", 8),
                Map.entry("rubi", 4),
                Map.entry("oro", 12),
                Map.entry("esmeralda", 6)
        );
        Hashtable<String, Integer> mapaPiedras = crearHashTable(listaTable);

        Hashtable<String, Integer> combinado = combinarHash(hashPiedras, mapaPiedras);
        Hashtable<String, Integer> preparado = prepararImpresion(combinado);
        ordenoImprimo(preparado);
    }
}
