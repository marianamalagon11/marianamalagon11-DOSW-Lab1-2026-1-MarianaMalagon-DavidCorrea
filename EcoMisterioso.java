import java.util.*;


public class EcoMisterioso{
    private String frase;
    public EcoMisterioso(String frase){
        this.frase = frase;
    }

    private String repetir(){
        StringBuilder palabra = new StringBuilder();
        palabra.append(frase + " " + frase + " " + frase);
        return palabra.toString();
    }

    public String repetirYInvertir() {
        String repetido = repetir();
        StringBuilder sb = new StringBuilder(repetido);
        return sb.reverse().toString();
    }

}