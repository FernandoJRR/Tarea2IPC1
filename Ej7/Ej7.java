/*
  Ejercicio 7:
  Programa que calcule el area y perimetro de un cuadrado
*/

import java.util.Scanner;

public class Ej7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float primerLado;
        float segundoLado;
        float area;
        float perimetro;
        
        primerLado = ingresarLado("primer");
        segundoLado = ingresarLado("segundo");

        mostrarResultados(primerLado, segundoLado);

    }

    static float ingresarLado(String mensaje){
        Scanner input = new Scanner(System.in);
        boolean ciclo = true;
        float lado=0;
        while(ciclo){
            System.out.println("Ingrese la medida del "+mensaje+" del rectangulo:");
            if(input.hasNextFloat()){
                lado = input.nextFloat();
                if(lado>0){
                    ciclo = false;
                }else{
                    mensajeError();
                }
            }else{
                mensajeError();
                input.next();
            }
        }
        return lado;
    }

    //Funcion que muestra los resultados de las operaciones
    static void mostrarResultados(float primerLado, float segundoLado){
        float area = primerLado * segundoLado;
        float perimetro = 2*primerLado + 2*segundoLado;
        System.out.println("El area del rectangulo es: "+area);
        System.out.println("El perimetro del rectangulo es: "+perimetro);
    }

    //Mensaje de error en caso de un erro del usuario
    static void mensajeError(){
        System.out.println("El dato ingresado no es valido");
    }
}
