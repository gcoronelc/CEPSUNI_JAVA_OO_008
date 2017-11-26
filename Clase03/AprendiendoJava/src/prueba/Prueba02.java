package prueba;

import service.MateService;

public class Prueba02 {
  
  public static void main(String[] args) {
    
    MateService mateService = new MateService();
    
    System.out.println("6 + 5 = " + mateService.sumar(6, 5));
    System.out.println("6.0 + 5 = " + mateService.sumar(6.0, 5));
  }
}
