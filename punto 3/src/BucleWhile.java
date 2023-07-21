/*Para el bucle Do While, deberás crear la misma estructura
que en el While, pero solo se debe ejecutar una vez.*/



public class BucleWhile{


    public static void main(String[] args) {
        int numeroDoWhile = 0;

        do {
            numeroDoWhile++; // Incrementa el valor de la variable en uno cada vez que se ejecuta
            System.out.println("Valor actual de numeroDoWhile: " + numeroDoWhile); // Muestra el valor por pantalla
        } while (numeroDoWhile < 1);
    }
}
