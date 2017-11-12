package pe.egcc.mateapp.prueba;

import pe.egcc.mateapp.service.MateService;

public class Prueba01 {
  
  public static void main(String[] args) {
    
    // Datos
    int n1 = 15;
    int n2 = 20;
    
    // Proceso
    MateService mateService = new MateService();
    int mcd = mateService.calcMcd(n1, n2);
    
    // Reporte
    System.out.println("N1: " + n1);
    System.out.println("N2: " + n2);
    System.out.println("MCD: " + mcd);
    
  }
  
  
}
