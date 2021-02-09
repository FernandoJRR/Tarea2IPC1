/*
  Ejercicio 5:
  Programa capaz de agregar un producto a una canasta de compra.
  Solicitar un precio a agregar a la canasta.
  El usuario podra elegir si "Pagar ahora" o "Seguir agreagando Productos".
  Si el total es menor a 500 tendra un descuento del 10%, si es mayor sera del 15%
  El total sera desplegado al usuario en la opcion "Pagar ahora" y 
  esto terminara el algoritmo.
*/

import java.util.Scanner;

public class Ej5{
    public static void main(String[] args){
        mensajeBienvenida();
        menu();
    }

    static void menu(){
        Scanner input = new Scanner(System.in);
        boolean ciclo = true;
        float total=0;
        while(ciclo){
            System.out.println("Elija una opcion:\n"+
                               "1- Agregar producto\n"+
                               "2- Pagar ahora");
            if(input.hasNextInt()){
                int opcion = input.nextInt();
                switch(opcion){
                    case 1:
                        total+=ingresarPrecio();
                        break;
                    case 2:
                        if(total<=500){
                            total = total - total*0.1f;
                        }else{
                            total = total - total*0.15f;
                        }
                        System.out.println("El total a pagar es: "+"Q."+total);
                        ciclo = false;      //Se cambia la variable para salir del algoritmo
                        break;
                    default:
                        mensajeError();
                        break;
                }
                        
            }else{
                mensajeError();
                input.next();       //Se resetea el scanner limpiando el stream para evitar un loop infinito
            }
        }   
    }

    static float ingresarPrecio(){
        Scanner input = new Scanner(System.in);
        boolean ciclo = true;
        float precio=0;
        while(ciclo){
            System.out.println("Ingrese el precio del producto:");

            //Se comprueba que el precio ingresado sea un numero positivo
            if(input.hasNextFloat()){
                precio = input.nextFloat();
                if(precio<0){
                    mensajeError();
                }else{
                    ciclo = false;
                }
            }else{
                mensajeError();
                input.next();       //Resetea el scanner para evitar un bucle infinito
            }
        }
        return precio;
    }
        
    //Mensaje de bienvenida e informacion a los usuarios del programa
    static void mensajeBienvenida(){
        System.out.println("======================\n"+
                           "BIENVENIDO A LA TIENDA\n"+
                           "======================");
        System.out.println("Informacion:\n"+ 
                           "-'Pagar ahora' terminara su compra y obtendra el total\n"+
                           "-'Agregar producto' se le solicitara el precio del producto\n"+
                           "el cual se agregara a la canasta\n"+
                           "======================");
    }

    //Mensaje en caso de error del usuario
    static void mensajeError(){
        System.out.println("El dato ingresado no es valido, intente de nuevo");
    }
}
