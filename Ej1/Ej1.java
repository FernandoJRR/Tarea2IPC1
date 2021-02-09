/*
  Ejercicio 1: 
  Solicitar un numero entero entre 1 y 10 y 
  desplegar su equivalente en numeros romanos 
*/

import java.util.Scanner;

public class Ej1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numeroDecimal;
        boolean ciclo = true;

        while(ciclo){
            System.out.println("Ingrese el numero a convertir a romano:");
            
            if(input.hasNextInt()){                             //Se comprueba si el numero ingresado es un entero y en caso de serlo se almacena
                numeroDecimal = input.nextInt();
                if(1<=numeroDecimal && numeroDecimal<=10){      //Se comprueba si el numero este en el rango de 1 a 10 
                    ciclo = false;
                    switch(numeroDecimal){
                        case 1:
                            System.out.println("I");
                            break;
                        case 2:
                            System.out.println("II");
                            break;
                        case 3:
                            System.out.println("III");
                            break;
                        case 4:
                            System.out.println("IV");
                            break;
                        case 5:
                            System.out.println("V");
                            break;
                        case 6:
                            System.out.println("VI");
                            break;
                        case 7:
                            System.out.println("VII");
                            break;
                        case 8:
                            System.out.println("VIII");
                            break;
                        case 9:
                            System.out.println("IX");
                            break;
                        case 10:
                            System.out.println("X");
                            break;
                    }
                }else{
                    mensajeError();
                }
            }else{
                mensajeError();
                input.next();       //Reiniciamos hasNextInt para evitar un loop infinito limpiando el stream
            }
        }
    }
    
    //Creamos un mensaje de error en caso de que el usuario introduzca un dato invalido
    static void mensajeError(){
        System.out.println("Solo se permite ingresar numeros enteros de 1 a 10, intenta de nuevo");
    }
}


