/*
  Ejercicio 4:
  Solicitar al usuario su edad y determinal
  si es infante (0-15 años), adolecente 16-20 años),
  adulto (21-55 años), adulto mayor (mas de 50 años)
*/

import java.util.Scanner; 

public class Ej4{
    public static void main(String[] args){
        mostrarResultado(ingresarEdad());
    }

    //Funcion para ingresar la variable edad realizando las comprobaciones necesarias
    static int ingresarEdad(){
        Scanner input = new Scanner(System.in);
        boolean ciclo = true;
        int edad=0;
        while(ciclo){
            System.out.println("Ingrese su edad: ");

            //Se comprueba que el dato sea un entero positivo
            if(input.hasNextInt()){         
                edad = input.nextInt();
                if(edad>=0){
                    ciclo = false;
                }else{
                    mensajeError();
                }
            }else{
                mensajeError();
                input.next();       //Se resetea el scanner limpiando el stream para evitar un loop infinito
            }
        }
        return edad;
    }

    static void mostrarResultado(int edad){
        if(0<=edad && edad<=15){
            System.out.println("Es un infante");
        }else if(16<=edad && edad<=20){
            System.out.println("Es un adolecente");
        }else if(21<=edad && edad<=55){
            System.out.println("Es un adulto");
        }else{
            System.out.println("Es un adulto mayor");
        }
    }

    //Mensaje de error en caso de que el dato ingresado no sea valido
    static void mensajeError(){
        System.out.println("La edad debe de ser un numero entero positivo");
    }
}

