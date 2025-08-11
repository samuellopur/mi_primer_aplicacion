package tallerJavaVariablesTiposDeDatos;

import java.util.Scanner;

public class ActividadUno {

    public static void promedioNotas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nota 1: ");
        int nota = scanner.nextInt();

        System.out.println("Ingrese nota 2: ");
        int nota2 = scanner.nextInt();

        System.out.println("Ingrese nota 3: ");
        int nota3 = scanner.nextInt();

        double promedio = (double) (nota + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio);
    }
}
