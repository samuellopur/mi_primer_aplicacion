package tallerJavaVariablesTiposDeDatos;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ActividadDos {

    public static void crearUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        System.out.println("Ingrese ocupacion: ");
        String ocupacion = scanner.nextLine();

        System.out.println("Ingrese salario mensual: ");
        double salarioMensual = scanner.nextDouble();

        System.out.println("Su nombre  es: " + nombre);
        System.out.println("Su nacionalidad es: " + nacionalidad);
        System.out.println("Su ocupacion es: " + ocupacion);
        System.out.println("Su salario mensual es: " + salarioMensual);
    }


    public static void calcularAnhoNacimiento() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese edad: ");
        int edad = scanner.nextInt();

        int anhoActual = java.time.Year.now().getValue();
        int anhoNacimiento = anhoActual - edad;

        System.out.println("Su año de nacimiento es: " + anhoNacimiento);

    }



}


