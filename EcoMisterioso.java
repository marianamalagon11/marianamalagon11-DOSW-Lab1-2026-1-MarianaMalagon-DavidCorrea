import java.util.*;


public class EcoMisterioso{
    private String frase;
    public EcoMisterioso(String frase){
        this.frase = frase;
    }

    private String repetir() {
        return IntStream.range(0, 3)
                .mapToObj(i -> frase)
                .collect(Collectors.joining(" "));
    }


    public String repetirYInvertir() {
        String repetido = repetir();
        StringBuilder sb = new StringBuilder(repetido);
        return sb.reverse().toString();
    }

}