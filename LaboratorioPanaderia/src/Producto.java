public class Producto {
    private String nombre;
    private float costo;
    private int stock;
    private int tiempoPreparacion;

    public Producto(String nombre, float costo, int stock) {
        this.nombre = nombre;
        this.costo = costo;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCosto() {
        return costo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }
    
    
}