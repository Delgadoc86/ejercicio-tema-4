/*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numeroIf = scanner.nextInt();

        if (numeroIf > 0) {
            System.out.println("El número ingresado es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número ingresado es negativo");
        } else {
            System.out.println("El número ingresado es 0");
        }
    }
}





