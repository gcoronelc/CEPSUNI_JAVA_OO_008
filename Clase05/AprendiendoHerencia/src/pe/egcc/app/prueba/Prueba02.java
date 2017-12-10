package pe.egcc.app.prueba;

import pe.egcc.app.service.Mate1;
import pe.egcc.app.service.MateAbstract;

public class Prueba02 {

  public static void main(String[] args) {
    // Datos
    int n1 = 13;
    int n2 = 10;
    // Proceso
    MateAbstract mate = new Mate1();
    int suma = mate.sumar(n1, n2);
    // Reporte
    System.out.println("Número 1: " + n1);
    System.out.println("Número 2: " + n2);
    System.out.println("Suma: " + suma);
  }
  
}
