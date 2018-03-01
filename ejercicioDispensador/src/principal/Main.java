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
        int opc = 5, pP1,pP2,cP1=0,cP2=0,cP=30,cG=10,cC=10,cCh=20;
        String pro1, pro2;
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Ingresa el primer producto");
            pro1 = leer.nextLine();
            System.out.println("Ingrese el precio de "+pro1);
            pP1 = leer.nextInt();
            while(pP1<=0){
                System.out.println("precio invalido");
                pP1 = leer.nextInt();
            }
            System.out.println("Ingrese la cantidad de "+pro1);
            cP1 = leer.nextInt();
            while(cP1<=0){
                System.out.println("precio invalido");
                cP1 = leer.nextInt();
            }
            //segundo producto que ingresa el usuario
            System.out.println("Ingresa el segundo producto");
            pro2 = leer2.nextLine();
            System.out.println("Ingrese el precio de "+pro2);
            pP2 = leer2.nextInt();
            while(pP2<=0){
                System.out.println("precio invalido");
                pP2 = leer.nextInt();
            }
            System.out.println("Ingrese la cantidad de "+pro2);
            cP2 = leer2.nextInt();
            while(cP2<=0){
                System.out.println("precio invalido");
                pP1 = leer.nextInt();
            } 
        while(opc!=0){
            //iniciacion de los constructores
            Productos papas = new Productos("Papas Margarita", 2000, cP);
            Productos galletas = new Productos("Galletas", 1000, cG);
            Productos chitos = new Productos("Chitos", 2000, cC);
            Productos chocorramo= new Productos("Chocorramo", 1500, cCh);
            Productos p1 = new Productos(pro1, pP1, cP1);
            Productos p2 = new Productos(pro2, pP2, cP2);
            
            System.out.println("Bienvenido al dispensador, que deseas comprar");
            System.out.println("1)Comprar "+papas.nombre+" con precio de: "+papas.precio+" y una cantidad de: "+papas.cantidad);
            System.out.println("2)Comprar "+galletas.nombre+" con precio de: "+galletas.precio+ " y una cantidad de: "+galletas.cantidad);
            System.out.println("3)comprar "+chitos.nombre+" con el precio de: "+chitos.precio+" y una cantidad de: "+chitos.cantidad);
            System.out.println("4)Comprar "+chocorramo.nombre+" con el precio de: "+chocorramo.precio+" y una cantidad de: "+chocorramo.cantidad);
            System.out.println("5)Comprar "+p1.nombre+" con el precio de: "+p1.precio+" y una cantidad de: "+p1.cantidad);
            System.out.println("6)Comprar "+p2.nombre+" con el precio de: "+p2.precio+" y una cantidad de: "+p2.cantidad);
            System.out.println("7)Saber la cantidad de ventas");
            System.out.println("8)Saber las ganancias");
            System.out.println("0)Salir");
            opc = leer.nextInt();//se reciben los datos
            while(opc<0 || opc>8){//validacion de que sea la opcion que se desea no mayor ni menor
                System.out.println("Opcion no valida");
                opc = leer.nextInt();
            }
            switch(opc){
                case 0:
                    System.out.println("Ha salido del programa");
                    break;
                case 1:
                    //margaritas
                    while(papas.cantidad>0){
                        cP--;
                        System.out.println("Has comprado "+papas.nombre+" con un precio de: "+papas.precio);
                        break;
                    }
                    while(papas.cantidad==0){
                        System.out.println("Se han agotado las papas, por favor elija otro producto");
                        break;
                    }
                    break;
                case 2:
                    //galletas
                    while(galletas.cantidad>0){
                        cG--;
                        System.out.println("Has comprado "+galletas.nombre+" con un precio de: "+galletas.precio);
                        break;
                    }
                    while(galletas.cantidad==0){
                        System.out.println("Se han agotado las galletas, por favor elija otro producto");
                        break;
                    }
                    break;
                    
                case 3:
                    //chitos
                    while(chitos.cantidad>0){
                        cC--;
                        System.out.println("Has comprado "+chitos.nombre+" con un precio de: "+chitos.precio);
                        break;
                    }
                    while(chitos.cantidad==0){
                        System.out.println("Se han agotado los chitos, por favor elija otro producto");
                        break;
                    }
                    break;
                case 4:
                    //chocorramo
                    while(chocorramo.cantidad>0){
                        cCh--;
                        System.out.println("Has comprado "+chocorramo.nombre+" con un precio de: "+chocorramo.precio);
                        break;
                    }
                    while(galletas.cantidad==0){
                        System.out.println("Se han agotado los chocorramos, por favor elija otro producto");
                        break;
                    }
                    break;
                case 5:
                    //producto 1 del usuario
                    break;
                case 6:
                    //producto 2 del usuario
                    break;
                case 7:
                    //calcular las ventas
                    break;
                case 8:
                    //calcular las ganancias
                    break;
            }
        }
    }
}           

