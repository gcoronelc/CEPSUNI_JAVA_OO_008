package pe.egcc.democolecciones.service;

import java.util.List;
import pe.egcc.democolecciones.model.Alumno;

public class AlumnoService {


  public void agregar(Alumno alumno){
    Database.alumnos.add(alumno);
  }
  
  public List<Alumno> leerLista(){
    return Database.alumnos;
  }
  
}
