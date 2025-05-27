import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Pandelicioso {
  public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();

        Producto producto1 = new Producto("PAN DE AVENA",20,50);
        Producto producto2 = new Producto("PAN DE CANILLA",10,50);
        Producto producto3 = new Producto("CACHITO",30,4);

        Producto[] producto = {producto1, producto2, producto3};
        
        Scanner escaner = new Scanner(System.in);
        Boolean buleano=true;
        int opc;
        String opcLetra;
        
           do{
             //  menu.limpiarConsola();
               
               System.out.println("MENU");
               System.out.println("1. AGREGAR PEDIDO");
               System.out.println("2. MODIFICAR ESTADO PEDIDOS");
               System.out.println("3. CALCULAR TOTAL PEDIDO");
               System.out.println("4. CONSULAR ESTADO DE PEDIDOS");
               System.out.println("5. APLICAR PROMOCIONES");
               System.out.println("0. SALIR");
               System.out.println(">>");

               do{
                   opcLetra = escaner.nextLine();
                   //opc = escaner.nextInt();
                   if(!Validaciones.EsNumero(opcLetra) || (Integer.parseInt(opcLetra) < 0) || (Integer.parseInt(opcLetra)>5)){
                       System.out.println("Opcion Invalida");
                   }
               }while(!Validaciones.EsNumero(opcLetra) || (Integer.parseInt(opcLetra) < 0) || (Integer.parseInt(opcLetra)>5));


               switch(opc=Integer.parseInt(opcLetra)){
                   case 1 -> {
                       do{
                        System.out.println("( 1 ) Continuar a agregar pedido");
                        System.out.println("( 0 ) SALIR");
                        opcLetra = escaner.nextLine();
                        if(Validaciones.EsNumero(opcLetra))
                            if(Integer.parseInt(opcLetra)==0)
                                break;
                            else
                                pedidos.add(Pandelicioso.agregarPedido(producto));
                       }while(!Validaciones.EsNumero(opcLetra) || (Integer.parseInt(opcLetra) < 0) || (Integer.parseInt(opcLetra)>1));    
                }
                   case 2 -> {
                       
                    
                    if(Validaciones.listaVaciaPedidos(pedidos))
                        {System.out.println("lista vacia");}
                    else    
                        {
                            System.out.println("Seleccione el pedido al cual desea modificar su estado: ");
                                             
                            Pandelicioso.imprimirPedidos(pedidos);

                        
                        Scanner opcion = new Scanner(System.in);
                        pedidos.get(opcion.nextInt()).actualizarEstado();}
                    
                }
                   case 3 -> {
                       
                       if(Validaciones.listaVaciaPedidos(pedidos))
                        {System.out.println("lista vacia");}
                    else    
                        {
                       System.out.println("Seleccione el pedido al cual desea calcular su precio total: ");
                    Scanner opcion = new Scanner(System.in);
                    
                    Pandelicioso.imprimirPedidos(pedidos);
                    pedidos.get(opcion.nextInt()).calcularTotal();
                }}
                   case 4 -> {
                       if(Validaciones.listaVaciaPedidos(pedidos))
                        {System.out.println("lista vacia");}
                    else    
                        {
                            
                    Pandelicioso.imprimirPedidos(pedidos);
                    
                        }   }
                   case 0 -> System.out.println("HASTA LUEGO...");
               }
               
           }while(opc!=0);

    }
    
   public static Pedido agregarPedido(Producto[] productos){
        Pedido Pedidito = new Pedido();
        Scanner Opcion = new Scanner(System.in);
<<<<<<< HEAD
        
        System.out.println("Seleccione el tipo de pedido que desea realizar:");
        System.out.println("( 1 ) Pedido de Pasteleria");
        System.out.println("( 2 ) Pedido de Catering");
        if(Opcion.nextInt()==1){
=======
        String OpcionValida;
        do{
            
            System.out.println("Seleccione el tipo de pedido que desea realizar:");
            System.out.println("( 1 ) Pedido de Pasteleria");
            System.out.println("( 2 ) Pedido de Catering");
            OpcionValida = Opcion.nextLine();
            
            if(!Validaciones.EsNumero(OpcionValida) || (Integer.parseInt(OpcionValida) < 1) || (Integer.parseInt(OpcionValida)>2))
                System.out.println("Opcion invalida");
        }while(!Validaciones.EsNumero(OpcionValida) || (Integer.parseInt(OpcionValida) < 1) || (Integer.parseInt(OpcionValida)>2));
        
        if(Integer.parseInt(OpcionValida)==1){
>>>>>>> 22f41ffd93f95171638351c986092768e0e6ea9d
            Pedidito = new pasteleriaPedido();
            Pedidito.leerDatos(productos);
        }
        else {
            Pedidito = new caterinPedido();
            Pedidito.leerDatos(productos);
        }
        return Pedidito;
   }
   
   
   public static void imprimirPedidos( List <Pedido> listaPedidos ){
       
       int i=0;
       
       for(Pedido aux: listaPedidos){
                       System.out.println("( "+i+" ) "+aux.getCodigoPedido() + aux.getNombreCliente());
                    }
       
   }
   
   
   

}
