/*
para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
 Dependiendo del valor de la variable estacion se deberá mandar un mensaje por
  consola informando de la estación en la que está. También habrá que poner un default
  para cuando el valor de la variable no sea una estación.
 */

public class Estacion{
    public static void main(String[] args) {

        int estacion = 2;


        switch (estacion) {
            case 1:
                System.out.println("Es primavera");
                break;
            case 2:
                System.out.println("Es verano");
                break;
            case 3:
                System.out.println("Es otoño");
                break;
            case 4:
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}



