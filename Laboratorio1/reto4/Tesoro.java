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
}