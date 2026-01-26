public class Maquina {

    public static String ejecutarComando(String comando) {
        switch (comando) {
            case "SALUDAR":
                return "La máquina dice : ¡Saludos, viajero del Tiempo y del código!"";

            case "DESPEDIR":
                return "La máquina dice: Que los bits te acompañen, hasta la próxima misión.";

            case "CANTAR":
                return "La máquina canta :01010101";

            case "DANZAR":
                return "La máquina gira y emite chispas: Girando en modo fiesta.";

            default:
                return "Comando desconocido.";
        }
    }
}
