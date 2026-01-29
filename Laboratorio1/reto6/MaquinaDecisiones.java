import java.util.HashMap;
import java.util.Map;

public class MaquinaDecisiones {

    private static final Map<String, Runnable> comandos = new HashMap<>();

    static {

        comandos.put("BROMEAR", () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        comandos.put("GRITAR", () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        comandos.put("SUSURRAR", () -> System.out.println("La máquina susurra: Shhh... los bugs están dormidos."));
        comandos.put("ANALIZAR", () -> System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!"));
        comandos.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del Tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        comandos.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
        comandos.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
    }

    public static void ejecutarComando(String comando) {
        switch (comando) {
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
                comandos.get(comando).run();
                break;
            default:
                System.out.println("comando incorrecto");
                break;
        }
    }
}

class Main {
    public static void main(String[] args) {

        MaquinaDecisiones.ejecutarComando("SALUDAR");
        MaquinaDecisiones.ejecutarComando("BROMEAR");
        MaquinaDecisiones.ejecutarComando("ANALIZAR");
        MaquinaDecisiones.ejecutarComando("DANZAR");
    }
}
