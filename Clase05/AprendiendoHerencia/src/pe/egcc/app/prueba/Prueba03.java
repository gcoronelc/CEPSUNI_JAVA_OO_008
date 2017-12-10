package pe.egcc.app.prueba;

import pe.egcc.app.service.Mate2;
import pe.egcc.app.service.MateAbstract;

public class Prueba03 {

  public static void main(String[] args) {
    // Datos
    int n1 = 13;
    int n2 = 10;
    // Proceso
    int suma = calcSuma(n1,n2,Mate2.class);
    // Reporte
    System.out.println("Número 1: " + n1);
    System.out.println("Número 2: " + n2);
    System.out.println("Suma: " + suma);
  }

  private static int calcSuma(int n1, int n2, Class<?> aClass) {
    int suma = 0;
    try { 
      MateAbstract mate;
      mate = (MateAbstract) Class.forName(aClass.getName()).newInstance();
      suma = mate.sumar(n1, n2);
    } catch (Exception ex) {
    } 
    return suma;
  }
  
}
