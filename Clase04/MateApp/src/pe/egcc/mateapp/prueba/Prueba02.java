package pe.egcc.mateapp.prueba;

import pe.egcc.mateapp.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    
    for(int tamanio = 1; tamanio <= 10; tamanio++){
      int serie[] = MateService.generaFibonacci(tamanio);
      System.out.print("SERIE: ");
      for (int elemento : serie) {
        System.out.print(elemento+ "    ");
      }
      System.out.println("");
    }
    
    
  }

}
