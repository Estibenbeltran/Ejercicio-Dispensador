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
    public String nombre;
    public int precio;
    public int cantidad;
    
    int canVentas;
    int ganancias;
    
    
        Productos(){
            System.out.println("Productos");
        }
        Productos(String nombre, int precio, int cantidad){
            this.nombre=nombre;
            this.precio=precio;
            this.cantidad=cantidad;
        }
       
        protected int ventas(){
            canVentas=this.cantidad;
            return canVentas;
        }
}
