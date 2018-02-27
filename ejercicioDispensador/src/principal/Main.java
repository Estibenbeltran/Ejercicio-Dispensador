/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.util.Scanner;
/**
 * Ejercicio en clase 7 this
 * @version 1.0
 * @author Dairo Estiben Beltran Martinez
 */
/**
 * Ejercicio : dispensador que permite saber 
 * comprar varios paquetes que informa el total
 * de ventas y el total de ganancias
 */

public class Main {
    public static void main(String[] args) {
        int opc = 5;
        Scanner leer = new Scanner(System.in);
        while(opc!=0){
            //segun la opcion se ejecuta el ejercicio que desee el usuario
            System.out.println("Bienvenido al dispensador, que deseas comprar");
            System.out.println("1)Comprar papas margarita");
            System.out.println("2)Comprar galletas");
            System.out.println("3)comprar chitos");
            System.out.println("4)Comprar chocorramos");
            System.out.println("5)Comprar Choclitos");
            System.out.println("6)Comprar bombombum");
            System.out.println("7)Saber la cantidad de ventas");
            System.out.println("8)Saber las ganancias");
            System.out.println("0)Salir");
            opc = leer.nextInt();//se reciben los datos
            while(opc<0 || opc>8){//validacion de que sea la opcion que se desea no mayor ni menor
                System.out.println("Opcion no valida");
                opc = leer.nextInt();//se vuelven a pedir los datos
            }
            switch(opc){
                case 0:
                    System.out.println("Ha salido del programa");
                    break;
                case 1:
                    //margaritas
                    break;
                case 2:
                    //galletas
                    break;
                    //chitos
                case 3:
                    //chocorramos
                    break;
                case 4:
                    //choclitos
                    break;
                case 5:
                    //bombombum
                    break;
                case 6:
                    //calcular la cantidad de ventas
                    break;
                case 7:
                    //calcular las ganancias
                    break;
                case 8:
                    break;
            }
        }
    }
}           

