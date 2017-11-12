package pe.egcc.mateapp.service;

public class MateService {
  
  public int calcMcd(int n1, int n2){
    int mcd;
    // Inicio de proceso
    while( n1 != n2 ){
      if(n1 > n2){
        n1 -= n2;
      } else {
        n2 -= n1;
      }
    }
    mcd = n1;
    // Fin de proceso
    return mcd;
  }
  
  
  
}
