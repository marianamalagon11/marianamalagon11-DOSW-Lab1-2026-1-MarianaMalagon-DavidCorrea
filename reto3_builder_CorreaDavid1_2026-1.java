import java.util.*;


public class j{
    private String frase;
    public Builder(String frase){
        this.frase = frase;
    }

    public String repetir(){
        StringBuilder palabra = new StringBuilder();
        palabra.append(frase + " " + frase + " " + frase);
        return palabra.toString();
    }
}