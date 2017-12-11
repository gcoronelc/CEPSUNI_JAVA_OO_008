package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase3;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    int n1 = 17;
    int n2 = 15;
    // Proceso
    Clase3 clase3 = new Clase3();
    int suma = clase3.sumar(n1, n2);
    int resta = clase3.restar(n1, n2);
    // Reporte
    System.out.println("Número 1: " + n1);
    System.out.println("Número 2: " + n2);
    System.out.println("Suma: " + suma);
    System.out.println("Resta: " + resta);
  }

  
}
