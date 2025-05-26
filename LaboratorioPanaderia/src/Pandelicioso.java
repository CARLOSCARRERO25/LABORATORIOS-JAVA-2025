import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LAB_L236
 */
public class Pandelicioso {
  public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();

        Producto producto1 = new Producto("PAN DE AVENA",20,50);
        Producto producto2 = new Producto("PAN DE CANILLA",10,50);
        Producto producto3 = new Producto("CACHITO",30,4);

        Producto[] producto = {producto1, producto2, producto3};
        
        Scanner escaner = new Scanner(System.in);
        Boolean buleano=true;
        int opc=0;
        
        
           do{
               System.out.println("MENU");
               System.out.println("1.AGREGAR PEDIDO");
               System.out.println("2.MODIFICAR ESTADO PEDIDOS");
               System.out.println("3.CALCULAR TOTAL PEDIDO");
               System.out.println("4.CONSULAR ESTADO DE PEDIDOS");
               System.out.println("4.APLICAR PROMOCIONES");

               do{

                   opc = escaner.nextInt();
                   if(opc>0 || opc<=4){
                       buleano= false;}
                   else{
                       System.out.println("VALOR INVALIDO");}

               }while(buleano);


               switch(opc){


                   case 1 -> {
                       pedidos.add(Pandelicioso.agregarPedido(producto));
                       System.out.println(pedidos.getFirst().mostrarInformacion());
                }


                   case 2 -> {
                       System.out.println("Seleccione el pedido al cual desea modificar su estado: ");
                    int i = 0;
                    Scanner opcion = new Scanner(System.in);
                    for(Pedido aux: pedidos){
                        System.out.println("( "+i+" ) "+aux.getCodigoPedido() + aux.getNombreCliente());
                    }
                    pedidos.get(opcion.nextInt()).actualizarEstado();
                }
                   case 3 -> {
                       System.out.println("Seleccione el pedido al cual desea calcular su precio total: ");
                    int i = 0;
                    Scanner opcion = new Scanner(System.in);
                    for(Pedido aux: pedidos){
                        System.out.println("( "+i+" ) "+aux.getCodigoPedido() + aux.getNombreCliente());
                    }
                    pedidos.get(opcion.nextInt()).calcularTotal();
                }
                   case 4 -> {
                       ;
                    int i = 0;
                    for(Pedido aux: pedidos){
                        System.out.println("( "+i+" ) "+aux.getCodigoPedido() +" - "+ aux.getNombreCliente()+" - "+aux.getEstado());
                    }
                }
                   case 0 -> System.out.println("HASTA LUEGO...");
               }
           }while(opc!=0);

    }
    
   public static Pedido agregarPedido(Producto[] productos){
        Pedido Pedidito = new Pedido();
        Scanner Opcion = new Scanner(System.in);
        System.out.println("Seleccione el tipo de pedido que desea realizar:");
        System.out.println("( 1 ) Pedido de Pasteleria");
        System.out.println("( 2 ) Pedido de Catering");
        if(Opcion.nextInt()==1){
            Pedidito = new pasteleriaPedido();
            Pedidito.leerDatos(productos);
        }
        else {
            Pedidito = new caterinPedido();
            Pedidito.leerDatos(productos);
        }
        return Pedidito;
   }

}
