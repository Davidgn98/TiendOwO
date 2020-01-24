import java.util.*;
/**
 * Esta clase realiza el proceso de venta y guarda el producto y la cantidad
 * 
 * @author (David) 
 * @version (24/01/2020 1.0v)
 */
public class Lista
{
    Scanner sc;
    Producto obj;
    ArrayList<String> array;
    HashMap<String, Integer> hash;
    /**
     * Constructor de la clase lista
     */
    public Lista()
    {
        sc = new Scanner(System.in);
        obj = new Producto();
        array = new ArrayList();
        hash = new HashMap();
    }

    /**
     * Método que contiene un menú de la compra y devuelve un HahMap con los productos y cantidades comprados
     * 
     * 
     * @return     HashMap con los productos comprados y la cantidad 
     */
    public HashMap<String, Integer> menu()
    {
        boolean bool = false;
        boolean bool2 = false;
        while(!bool)
        {
            System.out.println("------MENU------");
            System.out.println("1. Ver Productos");
            System.out.println("2. Pedir Producto");
            System.out.println("3. Salir");
            String respuesta = sc.next();
            switch(respuesta)
            {
                case("1"):
                System.out.println(obj.verLista());
                break;
                case("2"):
                bool2 = false;
                while(!bool2)
                {
                    array = obj.verLista();
                    System.out.println("¿Qué producto quieres pedir?");
                    String respuesta2 = sc.next();
                    if(array.contains(respuesta2))
                    {
                        System.out.println("¿Qué cantidad quieres pedir?");
                        int cantidad = sc.nextInt();
                        hash.put(respuesta2, cantidad);
                    }
                    else
                    {
                        System.out.println("El producto introducido no existe");
                    }
                    System.out.println("¿Desea pedir otro producto?");
                    String respuesta3 = sc.next();
                    if(respuesta3.equalsIgnoreCase("no"))
                    {
                        bool2 = true;
                    }
                }
                break;
                case("3"):
                bool = true;
                break;
                default:
                System.out.println("No es una opción válida");
            }
        }
        return hash;
    }
}
