package prueba;

import model.Persona;

public class Prueba05 {
  
  public static void main(String[] args) {
    
    Persona pers1 = new Persona("Alondra", 25);
    
    System.out.println("Nombre: " + pers1.getNombre());
    System.out.println("Edad: " + pers1.getEdad());
    
  }
  
}
