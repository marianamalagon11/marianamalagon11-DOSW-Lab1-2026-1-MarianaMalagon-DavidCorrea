import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3 {
    private String frase;

    public Reto3(String frase) {
        this.frase = frase;
    }

    private String repetir() {
        return IntStream.range(0, 3)
                .mapToObj(i -> frase)
                .collect(Collectors.joining(" "));
    }

    public String invertirConBuffer(String mensaje) {
        StringBuffer fraseConBuffer = new StringBuffer(mensaje);
        return fraseConBuffer.reverse().toString();
    }

    public String repiteEInvierte(){
        String repetido = repetir();
        return invertirConBuffer(repetido);
    }

    public static void main(String[] args) {
        Reto3 eco = new Reto3("Probando el reto");
        Runnable ejecutarEco = () -> System.out.println(eco.repiteEInvierte());
        ejecutarEco.run();
    }
}