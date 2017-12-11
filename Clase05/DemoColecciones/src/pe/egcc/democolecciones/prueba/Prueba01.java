package pe.egcc.democolecciones.prueba;

import pe.egcc.democolecciones.model.Alumno;
import pe.egcc.democolecciones.service.AlumnoService;

public class Prueba01 {
  
  public static void main(String[] args) {
    
    // Cargar alumnos
    AlumnoService service = new AlumnoService();
    service.agregar(new Alumno("Pedro", 15));
    service.agregar(new Alumno("Mariela", 12));
    service.agregar(new Alumno("Juan", 18));
    service.agregar(new Alumno("Karla", 20));
    service.agregar(new Alumno("Cesar", 11));
    service.agregar(new Alumno("Angelica", 17));
    service.agregar(new Alumno("Gustavo", 16));
    
    // Listado
    for (Alumno a : service.leerLista()) {
      System.out.println(a.getNombre() + "\t" + a.getNota());
    }
    
  }
  
  
}
