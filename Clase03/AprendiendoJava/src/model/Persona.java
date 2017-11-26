package model;

public class Persona {

  private String nombre;
  private Integer edad;
  private static String pais;
  
  static {
    pais = "PERU";
  }

  public Persona() {
    //this.nombre = "Gustavo";
    //this.edad = 53;
    this("Gustavo", 53);
  }

  public Persona(String nombre) {
    //this.nombre = nombre;
    //this.edad = 20;
    this(nombre, 20);
  }

  public Persona(String nombre, Integer edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  public static void mostrar(){
    // System.out.println("Nombre: " + nombre);
    System.out.println("Pais: " + pais);
  }
  
}
