public class EcoMisterioso {
    private String frase;

    public EcoMisterioso(String frase) {
        this.frase = frase;
    }


    public String invertirConBuffer() {
        StringBuffer fraseConBuffer = new StringBuffer(frase);
        return fraseConBuffer.reverse().toString();
    }

    public static void main(String[] args) {
        EcoMisterioso eco = new EcoMisterioso("Probando el reto");
        Runnable ejecutarEco = () -> System.out.println(eco.invertirConBuffer());
        ejecutarEco.run();
    }
}