package principal;
public class Productos{
    public int precio , cantidad , ventas , ganancias;
    public String nombre;
    /**
     * CONSTRUCTOR PARA EL PRECIO, LA CANTIDAD Y EL NOMBRE DEL PRODUCTO.
     * LAS VENTAS Y LAS GANANCIAS SE GENERAN APARTE YA QUE NO ES UN DATO PREDEFINIDO Y QUE SE MODIFICA CON EL TIEMPO
     * @param precio
     * @param cantidad
     * @param nombre 
     */
    public Productos(int precio , int cantidad , String nombre){
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }
}