import java.util.*;
/**
 * Clase que contiene el metodo recibo que se utiliza en la clase Lista
 * 
 * @author (Raquel) 
 * @version (24.01.2020 1.0v)
 */
public class Pedido
{
    private Scanner sc;
    HashMap<String, Integer> hash;
    public Pedido()
    {
        sc = new Scanner(System.in); 
        hash = new HashMap();
    }

    /**
     * Este método imprime un tiquet con los datos introducidos
     */
    public void recibo()
    {
        boolean bool=false; 
        while(!bool)
        {
            System.out.println("Introduzca su nombre");
            String nombre=sc.nextLine();
            System.out.println("vale, " +nombre+ " introduzca su dirección");
            String direccion=sc.nextLine();
            System.out.println("¿son estos datos correctos?");
            System.out.println("nombre: " +nombre);
            System.out.println("dirección: " +direccion);
            String respuesta=sc.nextLine();
            if(respuesta.equalsIgnoreCase("si"))
            {
                System.out.println("Gracias por su compra");
                System.out.println("-----------TICKET-----------");
                System.out.println("Nombre: " +nombre);
                System.out.println("Dirección: " +direccion);
                System.out.println(".............................");
                bool=true;
            }
        } 
    }
}
