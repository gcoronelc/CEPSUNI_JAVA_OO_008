package pe.egcc.app.service;

public class Mate2 extends MateAbstract{

  @Override
  public int sumar(int n1, int n2) {
    return ( (n1 + n2) * (n1 - n2) );
  }
  
}
