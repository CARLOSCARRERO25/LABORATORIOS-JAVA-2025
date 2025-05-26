import java.util.Scanner;

public class pasteleriaPedido extends Pedido{

    private String decoracion;
    private String mensajeEspecial;

    public pasteleriaPedido() {
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }

    public String getMensajeEspecial() {
        return mensajeEspecial;
    }

    public void setMensajeEspecial(String mensajeEspecial) {
        this.mensajeEspecial = mensajeEspecial;
    }

    @Override
    public void leerDatos(Producto[] productos) {
        Scanner datos = new Scanner(System.in);
        super.leerDatos(productos);
        System.out.println("Ingrese el tipo de decoracion ");
        this.setDecoracion(datos.nextLine());
        System.out.println("Ingrese el mensaje especial");
        this.setMensajeEspecial(datos.nextLine());
    }

    @Override
    public double calcularTotal() {
        System.out.println("IVA ESPECIAL PANADERIA DEL 3% DEL TOTAL");

        double total=this.getProducto().getCosto()* this.getCantidad();
        double iva=total*.03;
        total = total + iva;

        return total;

    }

    @Override
    public void actualizarEstado() {
        super.actualizarEstado();
    }

    @Override
    public boolean mostrarInformacion() {
        System.out.println("Informacion del pedido: \n");
        System.out.println("Codigo: "+this.getCodigoPedido());
        System.out.println("Nombre cliente: "+ this.getNombreCliente());
        System.out.println("Producto: "+this.getProducto());
        System.out.println("Cantidad: "+this.getCantidad());
        System.out.println("Precio: "+this.getPrecioVenta());
        System.out.println("Fecha: "+this.getFechaPedido());
        System.out.println("Hora: "+this.getHoraPedido());
        System.out.println("Tiempo de preparacion: "+this.getTiempoPreparacion());
        System.out.println("DECORACION: "+this.getDecoracion());
        System.out.println("MENSAJE ESPECIAL: "+ this.getMensajeEspecial());
        System.out.print("Estado: ");

        switch (this.getEstado()){
            case 0:
                System.out.println("Cancelado");
                break;
            case 1:
                System.out.println("Pendiente");
                break;
            case 2:
                System.out.println("En preparacion");
                break;
            case 3:
                System.out.println("Entregado");
                break;
        }
        return false;
    }
}