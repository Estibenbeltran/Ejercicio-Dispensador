/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author daiyd
 */

public class Productos {
    class Margarita{
    }
    class Galletas{
    }
class Chitos{
}
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
}
