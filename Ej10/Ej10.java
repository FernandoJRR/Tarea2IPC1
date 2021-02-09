/*
  Ejercicio 10:
  Mostrar la tabla de multiplicar de los 10 primeros numeros naturales
  El usuario debe elegir la tabla a mostrar
  Las tablas deben mostrar la tabla desde el 1 al 10
*/

import java.util.Scanner;

public class Ej10{
    public static void main(String[] args){
        mostrarTabla(numeroTabla());
    }

    //Funcion que ingresa el numero de tabla luego de las comprobaciones
    static int numeroTabla(){
        Scanner input = new Scanner(System.in);
        int numeroTabla=0;
        boolean ciclo=true;
        System.out.println("Ingrese el numero de tabla que desea ver\n"+
                           "NOTA: Solo puede ver tablas del 1 al 10");
        while(ciclo){
            if(input.hasNextInt()){
                numeroTabla =  input.nextInt();
                if(1<=numeroTabla && numeroTabla<=10){
                    ciclo = false;
                }else{
                    mensajeError();
                }
            }else{
                mensajeError();
                input.next();
            }
        }
        return numeroTabla;
    }
    //Funcion que realiza las tablas y las muestra
    static void mostrarTabla(int numeroTabla){
        System.out.println("====================");
        for(int i=1; i<=10; i++){
            System.out.println(numeroTabla*i);
        }
    }
    //Mensaje en caso de error del usuario
    static void mensajeError(){
        System.out.println("El dato introducido no es valido, intente de nuevo\n"+
                           "Ingrese otro numero:");
    }
}
