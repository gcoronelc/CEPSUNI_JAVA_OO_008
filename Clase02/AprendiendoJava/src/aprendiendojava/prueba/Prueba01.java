package aprendiendojava.prueba;

import aprendiendojava.model.Producto;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Crear el objeto
    Producto producto = new Producto();
    
    // Datos
    producto.setNombre("Free Tea");
    producto.setPrecio(2.20);
    producto.setStock(100);
    producto.setActivo(true);
    
    // Reporte
    System.out.println("Nombre: " + producto.getNombre());
    System.out.println("Precio: " + producto.getPrecio());
    System.out.println("Stock: " + producto.getStock());
    System.out.println("Activo: " + producto.isActivo());
    
  }
  
}
