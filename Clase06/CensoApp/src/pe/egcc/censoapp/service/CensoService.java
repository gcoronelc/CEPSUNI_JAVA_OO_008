package pe.egcc.censoapp.service;

import java.util.List;
import pe.egcc.censoapp.model.Censo;
import pe.egcc.censoapp.model.Item;

public class CensoService {

  public void grabarCenso(Censo bean){
    Data.lista.add(bean);
  }
  
  public List<Censo> leerCensos(){
    return Data.lista;
  }
  
  public String[] leerSexos(){
    String[] sexos = {Data.SEXO_MASCULINO, Data.SEXO_FEMENINO};
    return sexos;
  }
  
  public String[] leerGrados(){
    String[] grados = {Data.INST_PRIMARIA, Data.INST_SECUNDARIA, Data.INST_SUPERIOR};
    return grados;
  }
  
  
  /**
   * Hombres y Mujeres
   * @return 
   */
  public Item[] obtenerEstadistico1(){
    // Proceso
    int contHombres = 0, contMujeres = 0;
    for(Censo bean: Data.lista){
      switch(bean.getSexo()){
        case Data.SEXO_MASCULINO:
          contHombres++;
          break;
        case Data.SEXO_FEMENINO:
          contMujeres++;
          break;
      }
    }
    // Reporte
    Item[] repo = {
      new Item("Hombres", contHombres),
      new Item("Mujeres", contMujeres)
    };
    return repo;
  }

  /**
   * Mayores de edad - todos
   * @return 
   */
  public Item[] obtenerEstadistico2(){
    // Proceso
    int contMayores = 0, contMenores = 0;
    for(Censo bean: Data.lista){
      if(bean.getEdad() >= 18){
        contMayores++;
      } else {
        contMenores++;
      }
    }
    // Reporte
    Item[] repo = {
      new Item("Mayores de edad", contMayores),
      new Item("Menores de edad", contMenores)
    };
    return repo;
  }
  
  
}
