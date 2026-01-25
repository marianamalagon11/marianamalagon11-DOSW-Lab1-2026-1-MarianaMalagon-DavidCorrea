import java.util.*;
import java.util.stream.Collectors;

public class Reto1 {
    public static void main(String[] args) {

        List<Estudiante> pareja = List.of(
                new Estudiante("David Correa", 6, 21, "david.correa-g@mail.escuelaing.edu.co"),
                new Estudiante("Mariana Tochoy", 6, 21, "mariana.malagon-t@mail.escuelaing.edu.co")
        );

        String personas = pareja.stream()
                .map(e -> e.getNombre() + ", estudiante de la escuela de " +
                        e.getSemestre() + ".° semestre de " + e.getEdad() + " años")
                .collect(Collectors.joining(" y "));

        String correos = pareja.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.joining(" y "));

        StringBuilder mensaje = new StringBuilder();

        mensaje.append("¡Hola, bienvenidos! Nosotros somos la pareja conformada por "
                + personas
                + ". Nuestros correos institucionales son "
                + correos
                + ".");

        System.out.println(mensaje.toString());
    }
}
