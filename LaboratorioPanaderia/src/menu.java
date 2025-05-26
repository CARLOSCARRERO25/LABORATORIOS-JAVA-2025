/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author LAB_L236
 */
public abstract class menu {
    
    
    public void menuPrincipal(){};
    public static void menuProductos(Producto producto[]){     
            System.out.println("------MENU PRODUCTOS------");
            for(int x=0;producto.length>x;x++){
                System.out.println("("+x +")Nombre: "+ producto[x].getNombre() +"---> CANTIDAD RESTANTE: "+ producto[x].getStock());
            }
    };
    
}