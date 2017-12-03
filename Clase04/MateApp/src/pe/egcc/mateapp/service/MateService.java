package pe.egcc.mateapp.service;

public class MateService {
  
  public static long calcFactorial( int n ){
    long factorial = 1;
    while(n > 1){
      factorial *= n--;
    }
    return factorial;
  }
          
  
}
