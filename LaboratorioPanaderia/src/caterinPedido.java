import java.util.Scanner;

public class caterinPedido extends Pedido {

    private int numComensales;
    private String tipoCaterin;

    public caterinPedido() {

    }

    public int getNumComensales() {
        return numComensales;
    }

    public void setNumComensales(int numComensales) {
        this.numComensales = numComensales;
    }

    public String getTipoCaterin() {
        return tipoCaterin;
    }

    public void setTipoCaterin(String tipoCaterin) {
        this.tipoCaterin = tipoCaterin;
    }

    @Override
    public void leerDatos(Producto[] productos) {
        Scanner datos = new Scanner(System.in);
        super.leerDatos(productos);
        System.out.println("Ingrese el numero de comensales");
        this.setNumComensales(datos.nextInt());
        System.out.println("Ingrese el tipo de caterin");
        datos.nextLine();
        this.setTipoCaterin(datos.next());

    }

    @Override
    public double calcularTotal() {
        System.out.println("IVA ESPECIAL PARA CATERIN DEL 8% DEL TOTAL");

        double total=super.calcularTotal();
        double iva=total*.08;
        total = total + iva;

        return total;

    }

    @Override
    public void actualizarEstado() {
        super.actualizarEstado();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion del pedido: \n");
        System.out.println("Codigo: "+this.getCodigoPedido());
        System.out.println("Nombre cliente: "+ this.getNombreCliente());
        System.out.println("Producto: "+this.getProducto());
        System.out.println("Cantidad: "+this.getCantidad());
        System.out.println("Precio: "+this.getPrecioVenta());
        System.out.println("Fecha: "+this.getFechaPedido());
        System.out.println("Hora: "+this.getHoraPedido());
        System.out.println("Tiempo de preparacion: "+this.getTiempoPreparacion());
        System.out.println("NUMERO DE COMENSALES");
        System.out.println("TIPO CATERIN");
        System.out.println("Estado: ");

        switch (this.getEstado()){
            case 0 -> System.out.println("Cancelado");
            case 1 -> System.out.println("Pendiente");
            case 2 -> System.out.println("En preparacion");
            case 3 -> System.out.println("Entregado");
        }
    }
}
