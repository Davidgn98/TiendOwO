import java.util.*;
/**
 * Write a description of class Producto here.
 * 
 * @author (Raquel) 
 * @version (24.01.2020 1.0v)
 */
public class Producto
{
    private ArrayList<String> productos;
    /**
     * Constructor de producto.
     */
    public Producto()
    {
        productos= new ArrayList<String>();
        productos.add("Patata");
        productos.add("Platano");
        productos.add("Tomate");
        productos.add("Aguacate");
        productos.add("Lechuga");
    }

    /**
     * Este metodo sirve para poder ver los productos del ArrayList
     */
    public ArrayList<String> verLista()
    {
        return productos;
    }
}
