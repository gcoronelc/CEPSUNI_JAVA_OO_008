package pe.egcc.mateapp.prueba;

import pe.egcc.mateapp.service.MateService;

public class Prueba01 {

  public static void main(String[] args) {
    
    for (int i = 0; i < 10; i++) {
      long factorial = MateService.calcFactorial(i);
      System.out.println("Factorial de " + i + " es " + factorial);
    }
    
  }
  
}
