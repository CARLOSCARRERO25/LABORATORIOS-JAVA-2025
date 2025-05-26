import java.util.Scanner;

public class Pedido {

    private float codigoPedido;
    private String nombreCliente;
    private Producto producto;
    private int cantidad;
    private double precioVenta;
    private String fechaPedido;
    private String horaPedido;
    private int tiempoPreparacion;
    private int estado;

    public Pedido() {

    }

    public float getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(float codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(String horaPedido) {
        this.horaPedido = horaPedido;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void leerDatos(Producto[] productos) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los datos solicitados a continuacion\n\n");


        System.out.println("Codigo de pedido: ");
        this.setCodigoPedido(leer.nextInt());

        System.out.println("Nombre del cliente: ");
        leer.nextLine();
        this.setNombreCliente(leer.nextLine());

        System.out.println("\nSeleccione el producto que desea agregar al pedido");
        menu.menuProductos(productos);

        this.setProducto(productos[leer.nextInt()]);

        System.out.println("\nCantidad: ");
        this.setCantidad(leer.nextInt());

        this.setPrecioVenta(this.calcularTotal());

        System.out.println("\nIngrese la fecha del pedido");
        leer.nextLine();
        this.setFechaPedido(leer.nextLine());

        System.out.println("\nIngrese la hora del pedido");
        this.setHoraPedido(leer.nextLine());

        System.out.println("\nIngrese la tiempo de preparacion");
        this.setTiempoPreparacion(leer.nextInt());

        this.setEstado(1);
    }

    public double calcularTotal(){
        double Costo, ganancia, total;
        Costo= this.producto.getCosto();
        ganancia =Costo +Costo*0.50;
        total= (Costo+ganancia)*this.cantidad;
        return total;
    }

    public void actualizarEstado(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Seleccione el nuevo estado el pedido\n");
        System.out.println("( 0 ) Cancelado\n");
        System.out.println("( 1 ) Pendiente\n");
        System.out.println("( 2 ) En preparacion\n");
        System.out.println("( 3 ) Entregado\n");

        this.setEstado(leer.nextInt());
    }

    public boolean mostrarInformacion(){
        System.out.println("Informacion del pedido: \n");
        System.out.println("Codigo: "+this.getCodigoPedido());
        System.out.println("Nombre cliente: "+ this.getNombreCliente());
        System.out.println("Producto: "+this.getProducto().getNombre());
        System.out.println("Cantidad: "+this.getCantidad());
        System.out.println("Precio: "+this.getPrecioVenta());
        System.out.println("Fecha: "+this.getFechaPedido());
        System.out.println("Hora: "+this.getHoraPedido());
        System.out.println("Tiempo de preparacion: "+this.getTiempoPreparacion());
        System.out.print("Estado: ");
        switch (this.estado){
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