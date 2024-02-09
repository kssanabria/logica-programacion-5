import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Crear un programa donde le solicite un número al usuario y
        que me permita comprobar si el # es par o impar*/

        // Esta línea nos permite inicializar las peticiones por consola
        Scanner scan = new Scanner(System.in);
        //  Solicitar el dato de entrada
        System.out.println("Ingrese un número para validar si es par o impar: ");
        // Necesitamos que el dato sea entero
        int numero = scan.nextInt();

        // Comrpobar si el dato ingresado es par o impar
        if(numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número no es par");
        }
        /*Verificar si una persona es mayor de edad y menor o igual a 60*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digita tu edad");
        int edadHumano = scanner.nextInt();
        // Inicializar el dato
        //int edadHumano = 14;
        // Utilizar un operador para evaluar las dos condiciones
        boolean esMayorDeEdad = edadHumano >= 18 && edadHumano <= 60;
        // Comprobar si el condicional es verdadero o no
        if (esMayorDeEdad) {
            System.out.println("La persona es mayor de edad y menor de 60");
        } else {
            System.out.println("La persona es menor de edad");
        }
    }
}