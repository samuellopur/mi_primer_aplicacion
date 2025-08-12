package tallerJavaVariablesTiposDeDatos;

import java.util.Scanner;

public class ActividadDos {

    public static void crearUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                *************************
                +++++ Crear Usuario +++++
                *************************
                """);

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        int anhoActual = java.time.Year.now().getValue();
        int anhoNacimiento = anhoActual - edad;

        System.out.print("Ingrese nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        System.out.print("Ingrese ocupacion: ");
        String ocupacion = scanner.nextLine();

        System.out.print("Ingrese salario mensual: ");
        double salarioMensual = scanner.nextDouble();

        System.out.print("""
                
                ******************************
                +++++ Usuario registrado +++++
                ******************************
                """);
        System.out.printf("Nombre: %s%n", nombre);
        System.out.printf("Edad: %d años%n", edad);
        System.out.printf("Nacionalidad: %s%n", nacionalidad);
        System.out.printf("Ocupación: %s%n", ocupacion);
        System.out.printf("Salario Mensual: $%.2f%n", salarioMensual);
        System.out.printf("Año de Nacimiento: %d%n", anhoNacimiento);

        scanner.close();
    }
}


