/*
  Ejercicio 6:
  Permitir el ingreso de un numero entero
  Indicar si es un numero par o impar
*/

import java.util.Scanner;

public class Ej6{
    public static void main(String[] args){
        System.out.println("Ingrese un numero\n"+
                           "NOTA: Debe de ser un numero entero");
        mostrarResultado(ingresarNumero());
    }

    static void mostrarResultado(int numero){
        if(numero%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }

    static int ingresarNumero(){
        Scanner input = new Scanner(System.in);
        boolean ciclo = true;
        int numero=0;
        while(ciclo){
            if(input.hasNextInt()){     //Se comprueba que el dato ingresado sea un numero entero
                numero = input.nextInt();
                ciclo = false;
            }else{
                mensajeError();
                input.next();       //Se limpia el stream para evitar un loop infinito
            }
        }
        return numero;
    }
    
    //Mensaje por error del usuario
    static void mensajeError(){
        System.out.println("El dato ingresado no es valido, debe ingresar un numero entero\n"+
                           "Ingrese otro numero:");
    }
}
