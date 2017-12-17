package pe.egcc.censoapp.controller;

import java.util.List;
import pe.egcc.censoapp.model.Censo;
import pe.egcc.censoapp.model.Item;
import pe.egcc.censoapp.service.CensoService;

public class CensoController {

  private CensoService censoService;

  public CensoController() {
    censoService = new CensoService();
  }

  public void grabarCenso(Censo bean){
    censoService.grabarCenso(bean);
  }
  
  public List<Censo> leerCensos(){
    return censoService.leerCensos();
  }
  
  public String[] leerSexos(){
    return censoService.leerSexos();
  }
  
  public String[] leerGrados(){
    return censoService.leerGrados();
  }
  
  public Item[] obtenerEstadistico1(){
    return censoService.obtenerEstadistico1();
  }
  
  public Item[] obtenerEstadistico2(){
    return censoService.obtenerEstadistico2();
  }
}
