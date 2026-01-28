import java.util.*;
public class EcoMisterioso {
    private String frase;

    public EcoMisterioso(String frase) {
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
        EcoMisterioso eco = new EcoMisterioso("Probando el reto");
        Runnable ejecutarEco = () -> System.out.println(eco.repiteEInvierte());
        ejecutarEco.run();

}