import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.*;

public class Tesoro{

    public static Hashtable<String, Integer> crearHashTable(List<Map.Entry<String, Integer>> lista) {
        Hashtable<String, Integer> tabla = new Hashtable<>();
        lista.stream()
                .filter(p -> !tabla.containsKey(p.getKey()))
                .forEach(p -> tabla.put(p.getKey(), p.getValue()));
        return tabla;
    }

    public static Hashtable<String, Integer> combinarHash(HashMap<String, Integer> mapa1, Hashtable<String, Integer> mapa2) {
        Hashtable<String, Integer> combinado = new Hashtable<>();
        mapa1.forEach((k, v) -> combinado.put(k, v));
        mapa2.forEach((k, v) -> combinado.put(k, v));

        return combinado;
    }

    public static void ordenoImprimo(Hashtable<String, Integer> mapa) {
        mapa.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue()));
    }
}