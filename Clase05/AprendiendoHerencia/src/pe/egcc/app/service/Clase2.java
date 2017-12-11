package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Clase2  extends Clase1{

  public Clase2() {
    super("Claudia");
  }

  public int restar( int n1, int n2){
    return (n1 - n2);
  }

  @Override
  public int sumar(int n1, int n2) {
    int suma;
    suma = super.sumar(n1, n2) * this.restar(n1, n2);
    return suma;
  }
  
  
}
