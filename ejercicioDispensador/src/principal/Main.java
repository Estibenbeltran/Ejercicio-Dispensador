/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.util.Scanner;
import principal.Productos;
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
        int opc = 5, pP1,pP2,cP1,cP2,cP=30,cG=10,cC=10,cCh=20;
        int cPapas=0,cGalletas=0,cChitos=0,cChocorramo=0,cPro1=0,cPro2=0;
        int gPapas=0,gGalletas=0,gChitos=0,gChocorramo=0,gP1=0,gP2=0;
        float porGanT=0,porVenT=0;
        String pro1, pro2;
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Ingresa el nombre del primer producto");
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
                System.out.println("cantidad invalida");
                cP1 = leer.nextInt();
            }
            //segundo producto que ingresa el usuario
            System.out.println("Ingresa el nombre del segundo producto");
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
                System.out.println("cantidad invalida");
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
            //
            
            
            //se calculan las ganancias
            
            
            
            System.out.println("\nBienvenido al dispensador, que deseas comprar\n");
            System.out.println("1)Comprar "+papas.nombre+" con precio de: "+papas.precio+" y una cantidad de: "+papas.cantidad);
            System.out.println("2)Comprar "+galletas.nombre+" con precio de: "+galletas.precio+ " y una cantidad de: "+galletas.cantidad);
            System.out.println("3)comprar "+chitos.nombre+" con el precio de: "+chitos.precio+" y una cantidad de: "+chitos.cantidad);
            System.out.println("4)Comprar "+chocorramo.nombre+" con el precio de: "+chocorramo.precio+" y una cantidad de: "+chocorramo.cantidad);
            System.out.println("5)Comprar "+p1.nombre+" con el precio de: "+p1.precio+" y una cantidad de: "+p1.cantidad);
            System.out.println("6)Comprar "+p2.nombre+" con el precio de: "+p2.precio+" y una cantidad de: "+p2.cantidad);
            System.out.println("7)Saber la cantidad de ventas");
            System.out.println("8)Saber las ganancias");
            System.out.println("9)Saber el % de ventas");
            System.out.println("10)Saber el % de ganancias");
            System.out.println("0)Salir\n");
            opc = leer.nextInt();//se reciben los datos
            while(opc<0 || opc>10){//validacion de que sea la opcion que se desea no mayor ni menor
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
                        cPapas++;
                        System.out.println("\nHas comprado "+papas.nombre+" con un precio de: "+papas.precio+" y los productos restantes son : "+(papas.cantidad-1)+"\n");
                        gPapas = cPapas*papas.precio;
                        porGanT = + gPapas; 
                        papas.ganancias = (cPapas*100)/porGanT;
                        papas.ventas = (cPapas*100)/porVenT; 
                        break;
                    }
                    while(papas.cantidad==0){
                        System.out.println("\nSe han agotado las papas, deseas cargar una nueva cantidad de papas?\n");
                        System.out.println("1) si");
                        System.out.println("2) no");
                        opc = leer2.nextInt();
                        while(opc<1 || opc>2){
                            System.out.println("opcion invalida");
                            opc = leer2.nextInt();
                        }
                        switch(opc){
                            case 1:
                                System.out.println("Ingrese la cantidad de "+papas.nombre);
                                cP = leer.nextInt();
                                while(cP<=0){
                                    System.out.println("cantidad invalida");
                                    cP = leer.nextInt();
                                }
                            break;    
                            case 2:
                                opc=1;
                            break;
                        }
                        break;
                    }
                    break;
                case 2:
                    //galletas
                    while(galletas.cantidad>0){
                        cG--;
                        cGalletas++;
                        System.out.println("\nHas comprado "+galletas.nombre+" con un precio de: "+galletas.precio+" y los productos restantes son : "+(galletas.cantidad-1)+"\n");
                        gGalletas = cGalletas*galletas.precio;
                        porGanT = + gGalletas; 
                        galletas.ganancias = (cGalletas*100)/porGanT;
                        galletas.ventas = (cGalletas*100)/porVenT; 
                        
                        break;
                    }
                    while(galletas.cantidad==0){
                        System.out.println("\nSe han agotado las galletas, deseas cargar una nueva cantidad?\n");
                        System.out.println("1) si");
                        System.out.println("2) no");
                        opc = leer2.nextInt();
                        while(opc<1 || opc>2){
                            System.out.println("opcion invalida");
                            opc = leer2.nextInt();
                        }
                        switch(opc){
                            case 1:
                                System.out.println("Ingrese la cantidad de "+galletas.nombre);
                                cG = leer.nextInt();
                                while(cG<=0){
                                    System.out.println("cantidad invalida");
                                    cG = leer.nextInt();
                                }
                            break;    
                            case 2:
                                opc=1;
                            break;
                        } 
                        break;
                    }
                    break;
                    
                case 3:
                    //chitos
                    while(chitos.cantidad>0){
                        cC--;
                        cChitos++;
                        System.out.println("\nHas comprado "+chitos.nombre+" con un precio de: "+chitos.precio+" y los productos restantes son : "+(chitos.cantidad-1)+"\n");
                        gChitos = cChitos*chitos.precio;
                        porGanT = + gChitos; 
                        chitos.ganancias= (cChitos*100)/porGanT;
                        chitos.ventas = (cChitos*100)/porVenT; 
                        break;
                    }
                    while(chitos.cantidad==0){
                        System.out.println("\nSe han agotado los chitos, desea volver a cargar el producto?\n");
                        System.out.println("1) si");
                        System.out.println("2) no");
                        opc = leer2.nextInt();
                        while(opc<1 || opc>2){
                            System.out.println("opcion invalida");
                            opc = leer2.nextInt();
                        }
                        switch(opc){
                            case 1:
                                System.out.println("Ingrese la cantidad de "+chitos.nombre);
                                cC = leer.nextInt();
                                while(cC<=0){
                                    System.out.println("cantidad invalida");
                                    cC = leer.nextInt();
                                }
                            break;    
                            case 2:
                                opc=1;
                            break;
                        }
                        break;
                    }
                    break;
                case 4:
                    //chocorramo
                    while(chocorramo.cantidad>0){
                        cCh--;
                        cChocorramo++;
                        System.out.println("\nHas comprado "+chocorramo.nombre+" con un precio de: "+chocorramo.precio+" y los productos restantes son : "+(chocorramo.cantidad-1)+"\n");
                        gChocorramo = cChocorramo*chocorramo.precio;
                        porGanT = + gChocorramo; 
                        chocorramo.ganancias= (cChocorramo*100)/porGanT;
                        chocorramo.ventas = (cChocorramo*100)/porVenT; 
                        break;
                    }
                    while(galletas.cantidad==0){
                        System.out.println("\nSe ha agotado los chocorramos, deseas cargar una nueva cantidad del producto?\n");
                        System.out.println("1) si");
                        System.out.println("2) no");
                        opc = leer2.nextInt();
                        while(opc<1 || opc>2){
                            System.out.println("opcion invalida");
                            opc = leer2.nextInt();
                        }
                        switch(opc){
                            case 1:
                                System.out.println("Ingrese la cantidad de "+chocorramo.nombre);
                                cCh = leer.nextInt();
                                while(cCh<=0){
                                    System.out.println("cantidad invalida");
                                    cCh = leer.nextInt();
                                }
                            break;    
                            case 2:
                                opc=1;
                            break;
                        }
                        break;
                    }
                    break;
                case 5:
                    //producto 1 del usuario
                    while(p1.cantidad>0){
                        cP1--;
                        cPro1++;
                        System.out.println("\nHas comprado "+p1.nombre+" con un precio de: "+p1.precio+" y los productos restantes son : "+(p1.cantidad-1)+"\n");
                        gP1 = cPro1*p1.precio;
                        porGanT = + gP1; 
                        p1.ganancias= (cP1*100)/porGanT;
                        p1.ventas = (cP1*100)/porVenT; 
                        break;
                    }
                    while(p1.cantidad==0){
                        System.out.println("\nSe ha agotado "+p1.nombre+", desea ingresar una nueva cantidad?\n");
                        System.out.println("1) si");
                        System.out.println("2) no");
                        opc = leer2.nextInt();
                        while(opc<1 || opc>2){
                            System.out.println("opcion invalida");
                            opc = leer2.nextInt();
                        }
                        switch(opc){
                            case 1:
                                System.out.println("Ingrese la cantidad de "+pro1);
                                cP1 = leer.nextInt();
                                while(cP1<=0){
                                    System.out.println("cantidad invalida");
                                    cP1 = leer.nextInt();
                                }
                            break;    
                            case 2:
                                opc=1;
                            break;
                        }
                        break;
                    }
                    break;
                case 6:
                    //producto 2 del usuario
                    while(p2.cantidad>0){
                        cP2--;
                        cPro2++;
                        System.out.println("\nHas comprado "+p2.nombre+" con un precio de: "+p2.precio+" y los productos restantes son : "+(p2.cantidad-1)+"\n");
                        gP2 = cPro2*p2.precio;
                        porGanT = + gP2; 
                        p2.ganancias = (cP2*100)/porGanT;
                        p2.ventas = (cP2*100)/porVenT; 
                        break;
                    }
                    while(p2.cantidad == 0){
                        System.out.println("\nSe ha agotado "+p2.nombre+", desea ingresar una nueva cantidad?\n");
                        System.out.println("1) si");
                        System.out.println("2) no");
                        opc = leer2.nextInt();
                        while(opc<1 || opc>2){
                            System.out.println("opcion invalida");
                            opc = leer2.nextInt();
                        }
                        switch(opc){
                            case 1:
                                System.out.println("Ingrese la cantidad de "+pro2);
                                cP2 = leer.nextInt();
                                while(cP2<=0){
                                    System.out.println("cantidad invalida");
                                    cP2 = leer.nextInt();
                                }
                            break;    
                            case 2:
                                opc=1;
                            break;
                        }
                        break;
                    }
                    break;
                case 7:
                    //calcular las ventas
                    System.out.println("la cantidad de ventas de las papas margarita es de: "+cPapas);
                    System.out.println("la cantidad de ventas de las galletas es de: "+cGalletas);
                    System.out.println("la cantidad de ventas de los chitos es de: "+cChitos);
                    System.out.println("la cantidad de ventas de los chocorramos es de: "+cChocorramo);
                    System.out.println("la cantidad de ventas de "+pro1+" es de: "+cPro1);
                    System.out.println("la cantidad de ventas de "+pro2+" es de: "+cPro2);
                    break;
                case 8:
                    //calcular las ganancias
                    System.out.println("\nla cantidad de ganancias de las papas margarita es de: "+gPapas);
                    System.out.println("la cantidad de ganancias de las galletas es de: "+gGalletas);
                    System.out.println("la cantidad de ganancias de los chitos es de: "+gChitos);
                    System.out.println("la cantidad de ganancias de los chocorramos es de: "+gChocorramo);
                    System.out.println("la cantidad de ganancias de "+pro1+" es de: "+gP1);
                    System.out.println("la cantidad de ganancias de "+pro2+" es de: "+gP2);
                    System.out.println("");
                    break;
                case 9:
                    //calcular el % de las ventas
                    System.out.println("\nEl % de ventas de las papas margarita es de: "+papas.ganancias);
                    System.out.println("El % de ventas de las galletas es de: "+galletas.ganancias);
                    System.out.println("El % de ventas de los chitos es de: "+chitos.ganancias);
                    System.out.println("El % de ventas de los chocorramos es de: "+chocorramo.ganancias);
                    System.out.println("El % de ventas de "+pro1+" es de: "+p1.ganancias);
                    System.out.println("El % de ventas de "+pro2+" es de: "+p2.ganancias);
                    System.out.println("");
                    break;
                case 10:
                    //calcular el % de las ganancias
                    System.out.println("\nEl % de ganancias de las papas margarita es de: "+papas.ventas);
                    System.out.println("El % de ganancias de las galletas es de: "+galletas.ventas);
                    System.out.println("El % de ganancias de los chitos es de: "+chitos.ventas);
                    System.out.println("El % de ganancias de los chocorramos es de: "+chocorramo.ventas);
                    System.out.println("El % de ganancias de "+pro1+" es de: "+p1.ventas);
                    System.out.println("El % de ganancias de "+pro2+" es de: "+p2.ventas);
                    System.out.println("");
                    break;
            }
        }
    }
}           

