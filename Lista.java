import java.util.*;
/**
 * Esta clase realiza el proceso de venta y guarda el producto y la cantidad
 * 
 * @author (David) 
 * @version (24.01.2020 1.0v)
 */
public class Lista
{
    Scanner sc = new Scanner(System.in);
    Producto obj;
    ArrayList<String> array;
    HashMap<String, Integer> hash;
    Pedido obj2;
    
    /**
     * Constructor de la clase lista
     */
    public Lista()
    {
        obj = new Producto();
        array = new ArrayList();
        hash = new HashMap();
        obj2 = new Pedido();
        
    }
    
    /**
     * Método que contiene el menú de la compra
     */
    public void menu()
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
                obj2.recibo();
                listar(hash);
                bool = true;
                break;
                case("3"):
                bool = true;
                break;
                default:
                System.out.println("No es una opción válida");
                break;
            }
        }
    }
    
    /**
     * Método que recorre un HashMap e imprime su contenido
     * @param HashMap<String, Integer>
     */
    public void listar(HashMap<String, Integer> hash)
    {
        Iterator <String> it = hash.keySet().iterator();
        while(it.hasNext())
        {
            String pedido = it.next();
            System.out.println("Producto: "+pedido+"\tCantidad: "+hash.get(pedido));
        }
    }
}
