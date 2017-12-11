package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase3;
import pe.egcc.app.service.Clase4;

public class Prueba04 {

  public static void main(String[] args) {
    
    Clase2 clase2 = new Clase2();
    
    System.out.println("COMPATIBLE CON:");
    System.out.println("Object: " + ((clase2 instanceof Object)?"SI":"NO"));
    System.out.println("Clase1: " + ((clase2 instanceof Clase1)?"SI":"NO"));
    System.out.println("Clase2: " + ((clase2 instanceof Clase2)?"SI":"NO"));
    System.out.println("Clase3: " + ((clase2 instanceof Clase3)?"SI":"NO"));
    System.out.println("Clase4: " + ((clase2 instanceof Clase4)?"SI":"NO"));

    
  }
  
}
