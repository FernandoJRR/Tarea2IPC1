/*
  Ejercicio 9:
  Calcular la potencia X de un numero entero positivo
*/

import java.util.Scanner;

public class Ej9{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int base = ingresarDatos("la base");
        int exponente = ingresarDatos("el exponente");

        potencia(base, exponente);
    }

    //Funcion para realizar la potencia y mostrarla
    static void potencia(int base, int exponente){
        int auxiliar = base;
        if(exponente==1){
            System.out.println("El resultado es: "+base);
        }else if(exponente==0){
            System.out.println("El resultado es: 1");
        }else{
            for(int i=0; i<exponente-1; i++){
                base *= auxiliar;
            }
            System.out.println("El resultado es: "+base);
        }
    }

    //Funcion para ingresar tanto la base como el exponente luego de realizar las comprobaciones
    static int ingresarDatos(String parte){
        Scanner input = new Scanner(System.in);
        boolean ciclo = true;
        int partePotencia=0;
        while(ciclo){
            System.out.println("Ingrese "+parte+" de la potencia:");
            if(input.hasNextInt()){
                partePotencia = input.nextInt();
                if(0<=partePotencia){
                    ciclo = false;
                }else{
                    mensajeError();
                    input.next();
                }
            }else{
                mensajeError();
                input.next();
            }
        }
        return partePotencia;
    }

    static void mensajeError(){
        System.out.println("El dato debe de ser un numero positivo, ingrese otro dato");
    }
}
