/*
  Ejercicio2:
  Solicitar un tiempo en segundos y distancia en metros
  y a partir de eso calcular la velocidad
*/

import java.util.Scanner;

public class Ej2{
    public static void main(String[] args){
        float tiempo;
        float distancia;
        float velocidad;

        System.out.println("Para obtener la velocidad ingrese el tiempo y distancia recorrida");
        tiempo = ingresarDatos(1);
        distancia = ingresarDatos(2);

        velocidad = distancia/tiempo;
        mostrarVelocidad(velocidad);
    }

    /*
      Funcion que retornara el valor de la variable de tiempo y distancia
      Toma como parametro un numero que indica si la variable deseada es el tiempo o la distancia
    */
    static float ingresarDatos(int tipoVariable){       //1 = tiempo | 2 = distancia
        Scanner input = new Scanner(System.in);
        float variable=0;
        boolean ciclo = true;
        while(ciclo){
            switch(tipoVariable){
                case 1:
                    System.out.println("Ingrese el tiempo de recorrido del objeto:");
                    break;
                case 2:
                    System.out.println("Ingrese la distancia del recorrido del objeto:");
                    break;
            }
            variable = input.nextFloat();
            /*
              Se comprueba si en caso de ingresar el tiempo este sea mayor a 0,
              y en caso de ingresar la distancia esta sea igual o mayor a 0
            */
            if(tipoVariable == 1 && 0<variable || tipoVariable == 2 && 0<=variable){ 
                ciclo = false;
            }else{
                switch(tipoVariable){
                    case 1:
                        System.out.println("El tiempo debe ser un dato mayor a 0, ingrese otro dato");
                        break;
                    case 2:
                        System.out.println("La distancia debe ser un dato positivo, ingrese otro dato");
                        break;
                }
            }
        }
        return variable;
    }

    //Funcion que muestra la velocidad
    static void mostrarVelocidad(float velocidad){
        Scanner input = new Scanner(System.in);
        boolean ciclo = true;
        while(ciclo){
            System.out.println("Desea mostrar la velocidad en formato Km/h?\n"+
                               "1- Si\n"+
                               "2- No");
            int opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    ciclo =  false;
                    System.out.println("La velocidad es: "+velocidad+"Km/h");
                    break;
                case 2:
                    ciclo =  false;
                    System.out.println("La velocidad es: "+velocidad);
                    break;
                default:
                    System.out.println("Esa no es una opcion valida intente de nuevo");
                    break;
            }
        }
    }


}
