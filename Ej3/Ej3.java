/*
  Ejercicio 3:
  Solicitar 5 notas de un estudiante
  y calcular su promedio
*/

import java.util.Scanner;

public class Ej3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float nota=0;
        float promedio=0;
        boolean ciclo = true;

        System.out.println("Ingrese las 5 notas a promediar del estudiante");

        for(int i=0; i<5; i++){
            while(ciclo){
                System.out.println("Ingrese la nota #"+(i+1)+":");
                nota = input.nextFloat();
                if(0<=nota){
                    ciclo = false;
                }else{
                    System.out.println("La nota debe de ser un valor positivo, intente de nuevo");
                }
            }

            ciclo = true;

            promedio += nota;
        }

        promedio /= 5;

        System.out.println("El promedio de las notas es: "+promedio);
    }
}
