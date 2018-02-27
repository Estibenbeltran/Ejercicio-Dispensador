/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.util.Scanner;
/**
 * Ejercicio en clase 1 Programacion 2 20/2/2018
 * @version 1.0
 * @author Camilo Andres D'isidoro Flechas y Dairo Estiben Beltran Martinez
 */
/**
 * Ejercicio 1: Software por consola que ingrese el nombre el alumno
 * y n cantidad de notas y al final me indique el promedio o nota final del alumno
 */
class Margarita{
}
/**
*Ejercicio 2: Desarrolle un programa que me permita hacer n cantidad de consultas
*sobre la estacion de año de cada mes ingresado (1-3 Invierno / 4-6 verano / 7-9 otoño / 10-12 primavera)
*/
class Galletas{
}
/**
 * Desarrollar un programa que identifique en que categoría
 * debo registrarme según estos datos. 
 * 0-6: preinfantil
 * 7-17: infantil
 * 18-25: juvenil
 * 26-45: mayores
 * 60+: veteranos
 */
class Chitos{
}
/**
 * Desarrolle un programa que dado un número total de
 * segundos, devuelve el número de minutos, horas, semanas y
 * días.
 */
class Chocorramo{
    int horas;
    int dias;
    int semanas;
    int min;
    //setSemanas permitirá guardar el dato de las semanas totales según los cálculos en la función principal
    void setSemanas (int a){
        semanas = a;
    }
    //setDias permitirá, al igual que setSemanas, guardar el dato correspondiente según los cálculos correspondientes
    void setDias(int a){
        dias = a;
    }
    //setHoras guardará las horas residuales después de haber realizado los demás cálculos
    void setHoras(int a){
        horas = a;
    }
        void setMin(int a){
        min = a;
    }
}
public class Main {
    public static void main(String[] args) {
        int opc = 5;
        Scanner leer = new Scanner(System.in);
        while(opc!=0){
            //segun la opcion se ejecuta el ejercicio que desee el usuario
            System.out.println("Que ejercicio desea ejecutar?");
            System.out.println("1)Notas de alumnos");
            System.out.println("2)Estaciones");
            System.out.println("3)Registro por edad");
            System.out.println("4)Conversion de tiempo");
            System.out.println("0)Salir");
            opc = leer.nextInt();//se reciben los datos
            while(opc<0 || opc>4){//validacion de que sea la opcion que se desea no mayor ni menor
                System.out.println("Opcion no valida");
                opc = leer.nextInt();//se vuelven a pedir los datos
            }
            switch(opc){
                case 0:
                    System.out.println("Ha salido del programa");
                    break;
                case 1:
                    int acN = 0,tA,tN;
                    Alumnos estudiante = new Alumnos();
                    System.out.println("Cuantos alumnos desea evaluar?");//alumnos a evaluar
                    tA = leer.nextInt();//se reciben los datos
                    while(tA<0){//validacion de no negativos
                        System.out.println("Numero no valido");
                        tA = leer.nextInt();
                    }
                    System.out.println("Cuantas notas se han sacado?");
                    tN = leer.nextInt();
                    while(tN<0){
                        System.out.println("Numero no valido");
                        tN = leer.nextInt();
                    }
                    for(int a=0;a<tA;a++){//peticion de datos
                        System.out.println("Digite el nombre del alumno "+(a+1));
                        estudiante.alumno = leer.next();
                        for(int n=0;n<tN;n++){
                            System.out.println("Digite la nota "+(n+1)+" Que logro el estudiante (1-5)");
                            estudiante.notas = leer.nextInt();
                            while(estudiante.notas<1 || estudiante.notas>5){
                                System.out.println("Nota no valida");
                                estudiante.notas = leer.nextInt();
                            }
                            acN+=+estudiante.notas;//operacion
                        }
                        estudiante.promedio=acN/tN;
                        System.out.println("El promedio del estudiante "+estudiante.alumno+" es de: "+estudiante.promedio);
                    }
                    System.out.println("EL EJERCICIO 1 HA FINALIZADO");
                    break;
                case 2:
                    Estaciones est = new Estaciones ();
                    est.estacion = 13;
                    while(est.estacion!=0){
                        System.out.println("Digite el numero del mes, si quiere finalizar digite cero");//peticion de datos
                        est.estacion = leer.nextInt();
                        while(est.estacion<0 || est.estacion>12){//se valida cada estacion
                            System.out.println("Mes no valido");
                            est.estacion = leer.nextInt();
                        }
                        if(est.estacion>=1 && est.estacion<=3){//se valida cada estacion
                            System.out.println("Es Invierno");
                        }
                        if(est.estacion>=4 && est.estacion<=6){//se valida cada estacion
                            System.out.println("Es Verano");
                        }
                        if(est.estacion>=7 && est.estacion<=9){//se valida cada estacion
                            System.out.println("Es Otoño");
                        }
                        if(est.estacion>=10 && est.estacion<=12){//se valida cada estacion
                            System.out.println("Es Primavera");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese su edad");//peticion de datos
                    Edad ed = new Edad();
                    ed.anios = leer.nextInt();
                    while(ed.anios<0){//validacion para que la edad no sea negativa
                        System.out.println("Edad invalida");
                        ed.anios = leer.nextInt();
                    }
                    if(ed.anios>=0 && ed.anios<=6){//se valida cada categoria
                            System.out.println("Debe registrarse en pre-infantil");
                        }
                    if(ed.anios>=7 && ed.anios<=17){//se valida cada categoria
                            System.out.println("Debe registrarse en infantil");
                        }
                    if(ed.anios>=18 && ed.anios<=25){//se valida cada categoria
                            System.out.println("Debe registrarse en juvenil");
                        }
                    if(ed.anios>=26 && ed.anios<=45){//se valida cada categoria
                            System.out.println("Debe registrarse en mayores");
                        }
                    if(ed.anios>=60){//se valida cada categoria
                            System.out.println("Debe registrarse en veteranos");
                    }
                    break;
                case 4:
                    //iniciacion de variables
		    int a,d = 0;
                    int s = 0;
                    Tiempo tem = new Tiempo();
                    System.out.println("Digite el total de segundos");//peticion del dato principal
                    a= leer.nextInt();
                    while(a<=0){//validacion de que no sean segundos negativos ni 0
                        System.out.println("Segundos invalidos");
                        a= leer.nextInt();
                    }   
                    while(a>=604800){//se valida la semana
                        a=a-604800;
                        tem.semanas++;
                    }
                    while(a>=86400){//se valian los dias
                        a=a-86400;
                        tem.dias++;
                    }
                     while(a>=3600){//se validan las horas
                        a=a-3600;
                        tem.horas++;
                    }
                    while(a>=60){//se validan los minutos
                        a=a-60;
                        tem.min++;
                    }
                    //se muestran los datos 
                    System.out.println("Los segundos digitados son: "+tem.semanas+" Semana(s) "+tem.dias+" dia(s) "+tem.horas+" hora(s) "+tem.min+" minuto(s) "+a+" segundo(s)");

                    break;
            }
        }
    }
}

