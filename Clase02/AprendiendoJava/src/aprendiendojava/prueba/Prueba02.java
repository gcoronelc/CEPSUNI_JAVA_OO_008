package aprendiendojava.prueba;

import aprendiendojava.model.Producto;

public class Prueba02 {

  public static void main(String[] args) {
    
    // Crear el objeto
    Producto producto = new Producto();
    
    // Reporte
    System.out.println("Nombre: " + producto.getNombre());
    System.out.println("Precio: " + producto.getPrecio());
    System.out.println("Stock: " + producto.getStock());
    System.out.println("Activo: " + producto.isActivo());
    
  }
  
}
