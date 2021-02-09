/*
  Ejercicio 8:
  Ingresar dos numeros e indicar cual es el numero mayor y menor
*/

import java.util.Scanner;

public class Ej8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float numero1;
        float numero2;

        numero1 = ingresarNumero("primer");
        numero2 = ingresarNumero("segundo");
        mostrarResultado(numero1, numero2);

    }

    //Mostrar las comparaciones
    static void mostrarResultado(float numero1, float numero2){
        if(numero1>numero2){
            System.out.println(numero1+" es mayor a "+numero2);
        }else if(numero2>numero1){
            System.out.println(numero2+" es mayor a "+numero1);
        }else{
            System.out.println(numero1+" es igual a "+numero2);
        }
    }
    //Variable que solicita y asigna valores a las variables 
    static float ingresarNumero(String mensaje){
        Scanner input = new Scanner(System.in);
        boolean ciclo = true;
        float numero=0;
        while(ciclo){
            System.out.println("Ingrese el "+mensaje+" numero:");
            if(input.hasNextFloat()){
                numero = input.nextFloat();
                ciclo = false;
            }else{
                mensajeError();
                input.next();
            }
        }
        return numero;
    }
    //Mensaje en caso de error del usuario
    static void mensajeError(){
        System.out.println("El dato introducido no es valido, intente de nuevo");
    }
}
