import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.*;
public class Tesoro{

    public static HashMap<String, Integer> crearHashMap (List<Map.Entry<String, Integer>> lista) {
        HashMap<String, Integer> mapa = new HashMap<>();

        Runnable accion = () -> lista.stream()
                .filter(p -> !mapa.containsKey(p.getKey()))
                .forEach(p -> mapa.put(p.getKey(), p.getValue()));
        accion.run();
        return mapa;
    }

    public static Hashtable<String, Integer> combinarHash(HashMap<String, Integer> mapa1, Hashtable<String, Integer> mapa2) {
        Hashtable<String, Integer> combinado = new Hashtable<>();
        mapa1.forEach((k, v) -> combinado.put(k, v));
        mapa2.forEach((k, v) -> combinado.put(k, v));

            return combinado;
        }


    public static Hashtable<String, Integer> prepararImpresion(Hashtable<String, Integer> mapa){
       Hashtable<String, Integer> resultado = new Hashtable<>();
       mapa.forEach((k, v) -> resultado.put(k.toUpperCase(), v));
      return resultado;}}