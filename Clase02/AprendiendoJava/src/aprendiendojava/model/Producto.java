package aprendiendojava.model;

public class Producto {

  private String nombre;
  private double precio;
  private int stock;
  private boolean activo;

  public Producto() {
    this.nombre = "Frugos";
    this.precio = 2.0;
    this.stock = 40;
    this.activo = true;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto");
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

}
