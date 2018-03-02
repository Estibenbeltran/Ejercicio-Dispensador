package principal;
import java.util.Scanner;
import principal.Productos;
/**
 * Desarrollar una máquina expendedora con 4 productos que se pueden comprar de forma unitaria y poner
 * stock, además de un menú que muestre la cantidad de ventas y basado en ello, la ganancia.
 * @version 1.0
 * @author Dairo Estiben Beltran Martinez y Camilo Andrés D'isidoro Flechas
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leerb = new Scanner(System.in);
        int opc = 10, add,opcc,porg = 0,porv = 0;
        int uP,uC;
        String uN;
        //SE PIDEN LOS PRODUCTOS PERSONALIZADOS AL USUARIO, TENIENDO EN CUENTA QUE INGRESA EL NOMBRE, EL PRECIO Y LA CANTIDAD DEL PRODUCTO
        System.out.println("Ingrese el nombre del producto personalizado No 1");
        uN = leer.nextLine();
        System.out.println("Ingrese la cantidad de inventario de "+uN);
        uC = leer.nextInt();
        //validacion de datos
        while(uC<0){
            System.out.println("Cantidad no valida");
            uC = leer.nextInt();
        }
        System.out.println("Ingrese el precio de "+uN);
        uP = leer.nextInt();
        //validacion de datos
        while(uP<0){
            System.out.println("Cantidad no valida");
        uP = leer.nextInt();
        }
        Productos uA = new Productos(uP , uC , uN);
        System.out.println("Ingrese el nombre del producto personalizado No 2");
        uN = leerb.nextLine();
        System.out.println("Ingrese la cantidad de inventario de "+uN);
        uC = leer.nextInt();
        //validacion de datos
        while(uC<0){
            System.out.println("Cantidad no valida");
            uC = leer.nextInt();
        }
        System.out.println("Ingrese el precio de "+uN);
        uP = leer.nextInt();
        //validacion de datos
        while(uP<0){
            System.out.println("Cantidad no valida");
        uP = leer.nextInt();
        }
        //INSTANCIADO DE OBJETOS
        Productos uB = new Productos(uP , uC , uN);
        Productos papas = new Productos( 2000 , 30 , "PAPAS MARGARITA");
        Productos galletas = new Productos(1000 , 10 , "GALLETAS FESTIVAL");
        Productos cheetos = new Productos(2000 , 10 , "CHEETOS");
        Productos ponque = new Productos(1500 , 20 , "CHOCORRAMO");
        while(opc!=0){
            //CREACION DE MENU
            System.out.println("               SELECCIONE UN PRODUCTO A COMPRAR: ");
            System.out.println("N)  NOMBRE                      PRECIO              CANTIDAD");
            System.out.println("1) "+papas.nombre+"               "+papas.precio+"                  "+papas.cantidad);
            System.out.println("2) "+galletas.nombre+"             "+galletas.precio+"                  "+galletas.cantidad);
            System.out.println("3) "+cheetos.nombre+"                       "+cheetos.precio+"                  "+cheetos.cantidad);
            System.out.println("4) "+ponque.nombre+"                    "+ponque.precio+"                  "+ponque.cantidad);
            System.out.println("5) "+uA.nombre+"                    "+uA.precio+"                  "+uA.cantidad);
            System.out.println("6) "+uB.nombre+"                    "+uB.precio+"                  "+uB.cantidad);
            System.out.println("7) OPCIONES AVANZADAS");
            System.out.println("0) SALIR");
            opc = leer.nextInt();
            while(opc<0 || opc>7){
                System.out.println("OPCION NO VALIDA");
                opc = leer.nextInt();
            }
            //REALIZA LA COMPRA SEGUN LA OPCION ELEGIDA
            switch(opc){
                case 1:
                    //validacion de las papas
                    if(papas.cantidad!=0){
                        papas.cantidad--;
                        papas.ventas++;
                        porv = porv+papas.ventas;
                        papas.ganancias = papas.ganancias + papas.precio;
                        porg = porg+papas.ganancias;
                        System.out.println("SE HA COMPRADO "+papas.nombre);
                    }else{
                        //validacion para ingresar una nueva cantidad de producto
                        System.out.println("EL PRODUCTO SE HA AGOTADO");
                        System.out.println("DIGITE LA CANTIDAD DE "+papas.nombre+" PARA REABASTECER");
                        papas.cantidad = leer.nextInt();
                        //validacion de datos
                        while(papas.cantidad<0){
                            System.out.println("NUMERO NO VALIDO");
                            papas.cantidad = leer.nextInt();
                        }
                    }
                    break;
                case 2:
                    //validacion de las galletas
                    if(galletas.cantidad!=0){
                        galletas.cantidad--;
                        galletas.ventas++;
                        porv = porv+galletas.ventas;
                        galletas.ganancias = galletas.ganancias + galletas.precio;
                        porg = porg+galletas.ganancias;
                        System.out.println("SE HA COMPRADO "+galletas.nombre);
                    }else{
                        //validacion para ingresar una nueva cantidad de producto
                        System.out.println("EL PRODUCTO SE HA AGOTADO");
                        System.out.println("DIGITE LA CANTIDAD DE "+galletas.nombre+" PARA REABASTECER");
                        galletas.cantidad = leer.nextInt();
                        while(galletas.cantidad<0){
                            System.out.println("NUMERO NO VALIDO");
                            galletas.cantidad = leer.nextInt();
                        }
                    }
                    break;
                case 3:
                    //validacion de los cheetos
                    if(cheetos.cantidad!=0){
                        cheetos.cantidad--;
                        cheetos.ventas++;
                        porv = porv+papas.ventas;
                        cheetos.ganancias = cheetos.ganancias + cheetos.precio;
                        porg = porg+papas.ganancias;
                        System.out.println("SE HA COMPRADO "+cheetos.nombre);
                    }else{
                        //validacion para recargar de nuevo la cantidad del producto
                        System.out.println("EL PRODUCTO SE HA AGOTADO");
                        System.out.println("DIGITE LA CANTIDAD DE "+cheetos.nombre+" PARA REABASTECER");
                        cheetos.cantidad = leer.nextInt();
                        while(cheetos.cantidad<0){
                            System.out.println("NUMERO NO VALIDO");
                            cheetos.cantidad = leer.nextInt();
                        }
                    }
                    break;
                case 4:
                    //validacion del chocorramo
                    if(ponque.cantidad!=0){
                        ponque.cantidad--;
                        ponque.ventas++;
                        porv = porv+ponque.ventas;
                        ponque.ganancias = ponque.ganancias + ponque.precio;
                        porg = porg+ponque.ganancias;
                        System.out.println("SE HA COMPRADO "+ponque.nombre);
                    }else{
                        //validacion para recargar el producto nuevamente
                        System.out.println("EL PRODUCTO SE HA AGOTADO");
                        System.out.println("DIGITE LA CANTIDAD DE "+ponque.nombre+" PARA REABASTECER");
                        ponque.cantidad = leer.nextInt();
                        while(ponque.cantidad<0){
                            System.out.println("NUMERO NO VALIDO");
                            ponque.cantidad = leer.nextInt();
                        }
                    }
                    break;
                case 5:
                    //validacion del producto personalizado numero 1
                    if(uA.cantidad!=0){
                       uA.cantidad--;
                        uA.ventas++;
                        porv = porv+uA.ventas;
                        uA.ganancias = uA.ganancias + uA.precio;
                        porg = porg+uA.ganancias;
                        System.out.println("SE HA COMPRADO "+uA.nombre);
                    }else{
                        //recargar de nuevo la cantidad del producto
                        System.out.println("EL PRODUCTO SE HA AGOTADO");
                        System.out.println("DIGITE LA CANTIDAD DE "+uA.nombre+" PARA REABASTECER");
                        uA.cantidad = leer.nextInt();
                        while(uA.cantidad<0){
                            System.out.println("NUMERO NO VALIDO");
                            uA.cantidad = leer.nextInt();
                        }
                    }
                    break;
                case 6:
                    //validacion del producto personalizado numero 2
                    if(uB.cantidad!=0){
                        uB.cantidad--;
                        uB.ventas++;
                        porv = porv+uB.ventas;
                        uB.ganancias = uB.ganancias + uB.precio;
                        porg = porg+uB.ganancias;
                        System.out.println("SE HA COMPRADO "+uB.nombre);
                    }else{
                        //validacion para recargar nuevamente la cantidad el producto
                        System.out.println("EL PRODUCTO SE HA AGOTADO");
                        System.out.println("DIGITE LA CANTIDAD DE "+uB.nombre+" PARA REABASTECER");
                        uB.cantidad = leer.nextInt();
                        while(uB.cantidad<0){
                            System.out.println("NUMERO NO VALIDO");
                            uB.cantidad = leer.nextInt();
                        }
                    }
                    break;
                case 7:
                    //CREA UN MENU PARA LAS OPCIONES AVANZADAS
                    int opcb;
                    System.out.println("SELECCIONE UNA OPCION");
                    System.out.println("1) AGREGAR INVENTARIO");
                    System.out.println("2) VER PORCENTAJE DE VENTAS");
                    System.out.println("3) VER VENTAS");
                    System.out.println("4) VER PORCENTAJE DE GANANCIAS");
                    System.out.println("5) VER GANANCIAS");
                    System.out.println("0) VOLVER AL MENU PRINCIPAL");
                    opcb = leer.nextInt();
                    //validacion de las opciones
                    while(opcb<0 || opcb>5){
                        System.out.println("OPCION NO VALIDA");
                        opcb = leer.nextInt();
                    }
                    switch(opcb){
                        case 1:
                            System.out.println("Digite cuanto producto desea agregar");
                            add = leer.nextInt();
                            while(add<0){
                                System.out.println("NUMERO NO VALIDO");
                                add = leer.nextInt();
                            }
                            System.out.println("               SELECCIONE UN PRODUCTO A REPONER: ");
                            System.out.println("N)  NOMBRE                      PRECIO              CANTIDAD");
                            System.out.println("1) "+papas.nombre+"               "+papas.precio+"                  "+papas.cantidad);
                            System.out.println("2) "+galletas.nombre+"             "+galletas.precio+"                  "+galletas.cantidad);
                            System.out.println("3) "+cheetos.nombre+"                       "+cheetos.precio+"                  "+cheetos.cantidad);
                            System.out.println("4) "+ponque.nombre+"                    "+ponque.precio+"                  "+ponque.cantidad);
                            System.out.println("5) "+uA.nombre+"                    "+uA.precio+"                  "+uA.cantidad);
                            System.out.println("6) "+uB.nombre+"                    "+uB.precio+"                  "+uB.cantidad);
                            opcc= leer.nextInt();
                            while(opcc<0){
                                System.out.println("OPCION NO VALIDA");
                                opcc = leer.nextInt();
                            }
                            //segun el producto, se agrega mas cantidad
                            switch(opcc){
                                case 1:
                                    papas.cantidad+=add;
                                    break;
                                case 2:
                                    galletas.cantidad+=add;
                                    break;
                                case 3:
                                    cheetos.cantidad+=add;
                                    break;
                                case 4:
                                    ponque.cantidad+=add;
                                    break;
                                case 5:
                                    uA.cantidad+=add;
                                    break;
                                case 6:
                                    uB.cantidad+=add;
                                    break;
                            }
                            break;
                        case 2:
                            //menu para evaluar los porcentajes de cada producto
                            int pv;
                            System.out.println("               SELECCIONE UN PRODUCTO A EVALUAR (PORCENTAJE VENTAS): ");
                            System.out.println("N)  NOMBRE                      PRECIO              CANTIDAD");
                            System.out.println("1) "+papas.nombre+"               "+papas.precio+"                  "+papas.cantidad);
                            System.out.println("2) "+galletas.nombre+"             "+galletas.precio+"                  "+galletas.cantidad);
                            System.out.println("3) "+cheetos.nombre+"                       "+cheetos.precio+"                  "+cheetos.cantidad);
                            System.out.println("4) "+ponque.nombre+"                    "+ponque.precio+"                  "+ponque.cantidad);
                            System.out.println("5) "+uA.nombre+"                    "+uA.precio+"                  "+uA.cantidad);
                            System.out.println("6) "+uB.nombre+"                    "+uB.precio+"                  "+uB.cantidad);
                            opcc = leer.nextInt();
                            while(opcc<0){
                                System.out.println("OPCION NO VALIDA");
                                opcc = leer.nextInt();
                            }
                            //segun la opcion, muestra el porcentaje de cada producto
                            switch(opcc){
                                case 1:
                                    pv = (int)((papas.ventas*100)/porv);
                                    System.out.println("EL "+pv+"% DE LAS VENTAS ES DE "+papas.nombre);
                                    break;
                                case 2:
                                    pv = (int)((galletas.ventas*100)/porv);
                                    System.out.println("EL "+pv+"% DE LAS VENTAS ES DE "+galletas.nombre);
                                    break;
                                case 3:
                                    pv = (int)((cheetos.ventas*100)/porv);
                                    System.out.println("EL "+pv+"% DE LAS VENTAS ES DE "+cheetos.nombre);
                                    break;
                                case 4:
                                    pv = (int)((ponque.ventas*100)/porv);
                                    System.out.println("EL "+pv+"% DE LAS VENTAS ES DE "+ponque.nombre);
                                    break;
                                case 5:
                                    pv = (int)((uA.ventas*100)/porv);
                                    System.out.println("EL "+pv+"% DE LAS VENTAS ES DE "+uA.nombre);
                                    break;
                                case 6:
                                    pv = (int)((uB.ventas*100)/porv);
                                    System.out.println("EL "+pv+"% DE LAS VENTAS ES DE "+uB.nombre);
                                    break;
                            }
                            break;
                        case 3:
                            //menu para mostrar las ventas
                            System.out.println("               SELECCIONE UN PRODUCTO A EVALUAR (VENTAS): ");
                            System.out.println("N)  NOMBRE                      PRECIO              CANTIDAD");
                            System.out.println("1) "+papas.nombre+"               "+papas.precio+"                  "+papas.cantidad);
                            System.out.println("2) "+galletas.nombre+"             "+galletas.precio+"                  "+galletas.cantidad);
                            System.out.println("3) "+cheetos.nombre+"                       "+cheetos.precio+"                  "+cheetos.cantidad);
                            System.out.println("4) "+ponque.nombre+"                    "+ponque.precio+"                  "+ponque.cantidad);
                            System.out.println("5) "+uA.nombre+"                    "+uA.precio+"                  "+uA.cantidad);
                            System.out.println("6) "+uB.nombre+"                    "+uB.precio+"                  "+uB.cantidad);
                            opcc = leer.nextInt();
                            while(opcc<0){
                                System.out.println("OPCION NO VALIDA");
                                opcc = leer.nextInt();
                            }
                            switch(opcc){
                                //segun la opcion, muestra la cantidad de ventas de cada producto
                                case 1:
                                    System.out.println("SE HAN VENDIDO "+papas.ventas+" "+papas.nombre);
                                    break;
                                case 2:
                                    System.out.println("SE HAN VENDIDO "+galletas.ventas+" "+galletas.nombre);
                                    break;
                                case 3:
                                    System.out.println("SE HAN VENDIDO "+cheetos.ventas+" "+cheetos.nombre);
                                    break;
                                case 4:
                                    System.out.println("SE HAN VENDIDO "+ponque.ventas+" "+ponque.nombre);
                                    break;
                                case 5:
                                    System.out.println("SE HAN VENDIDO "+uA.ventas+" "+uA.nombre);
                                    break;
                                case 6:
                                    System.out.println("SE HAN VENDIDO "+uB.ventas+" "+uB.nombre);
                                    break;
                            }
                            break;
                        case 4:
                            //menu para consultar el porcentaje de ganancias
                            int pg;
                            System.out.println("               SELECCIONE UN PRODUCTO A EVALUAR (PORCENTAJE GANANCIA): ");
                            System.out.println("N)  NOMBRE                      PRECIO              CANTIDAD");
                            System.out.println("1) "+papas.nombre+"               "+papas.precio+"                  "+papas.cantidad);
                            System.out.println("2) "+galletas.nombre+"             "+galletas.precio+"                  "+galletas.cantidad);
                            System.out.println("3) "+cheetos.nombre+"                       "+cheetos.precio+"                  "+cheetos.cantidad);
                            System.out.println("4) "+ponque.nombre+"                    "+ponque.precio+"                  "+ponque.cantidad);
                            System.out.println("5) "+uA.nombre+"                    "+uA.precio+"                  "+uA.cantidad);
                            System.out.println("6) "+uB.nombre+"                    "+uB.precio+"                  "+uB.cantidad);
                            opcc = leer.nextInt();
                            while(opcc<0){
                                System.out.println("OPCION NO VALIDA");
                                opcc = leer.nextInt();
                            }
                            switch(opcc){
                                //segun la opcion, muestra el porcentaje de ganancias de cada producto
                                case 1:
                                    pg = (int)((papas.ventas*100)/porv);
                                    System.out.println("EL "+pg+"% DE LAS GANANCIAS ES DE "+papas.nombre);
                                    break;
                                case 2:
                                    pg = (int)((galletas.ventas*100)/porv);
                                    System.out.println("EL "+pg+"% DE LAS GANANCIAS ES DE "+galletas.nombre);
                                    break;
                                case 3:
                                    pg = (int)((cheetos.ventas*100)/porv);
                                    System.out.println("EL "+pg+"% DE LAS GANANCIAS ES DE "+cheetos.nombre);
                                    break;
                                case 4:
                                    pg = (int)((ponque.ventas*100)/porv);
                                    System.out.println("EL "+pg+"% DE LAS GANANCIAS ES DE "+ponque.nombre);
                                    break;
                                case 5:
                                    pg = (int)((uA.ventas*100)/porv);
                                    System.out.println("EL "+pg+"% DE LAS GANANCIAS ES DE "+uA.nombre);
                                    break;
                                case 6:
                                    pg = (int)((uB.ventas*100)/porv);
                                    System.out.println("EL "+pg+"% DE LAS GANANCIAS ES DE "+uB.nombre);
                                    break;
                            }
                            break;
                        case 5:
                            //menu para saber las ganancias de cada producto
                            System.out.println("               SELECCIONE UN PRODUCTO A EVALUAR(GANANCIA): ");
                            System.out.println("N)  NOMBRE                      PRECIO              CANTIDAD");
                            System.out.println("1) "+papas.nombre+"               "+papas.precio+"                  "+papas.cantidad);
                            System.out.println("2) "+galletas.nombre+"             "+galletas.precio+"                  "+galletas.cantidad);
                            System.out.println("3) "+cheetos.nombre+"                       "+cheetos.precio+"                  "+cheetos.cantidad);
                            System.out.println("4) "+ponque.nombre+"                    "+ponque.precio+"                  "+ponque.cantidad);
                            System.out.println("5) "+uA.nombre+"                    "+uA.precio+"                  "+uA.cantidad);
                            System.out.println("6) "+uB.nombre+"                    "+uB.precio+"                  "+uB.cantidad);
                            opcc = leer.nextInt();
                            //validacion de la opcion
                            while(opcc<0){
                                System.out.println("OPCION NO VALIDA");
                                opcc = leer.nextInt();
                            }
                            //segun la opcion, muestra las ganancias de cada producto
                            switch(opcc){
                                case 1:
                                    System.out.println("SE HA GANADO $"+papas.ganancias+" EN "+papas.nombre);
                                    break;
                                case 2:
                                    System.out.println("SE HA GANADO $"+galletas.ganancias+" EN "+galletas.nombre);
                                    break;
                                case 3:
                                    System.out.println("SE HA GANADO $"+cheetos.ganancias+" EN "+cheetos.nombre);
                                    break;
                                case 4:
                                    System.out.println("SE HA GANADO $"+ponque.ganancias+" EN "+ponque.nombre);
                                    break;
                                case 5:
                                    System.out.println("SE HA GANADO $"+uA.ganancias+" EN "+uA.nombre);
                                    break;
                                case 6:
                                    System.out.println("SE HA GANADO $"+uB.ganancias+" EN "+uB.nombre);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
    }
}