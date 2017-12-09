package pe.egcc.mateapp.service;

public class MateService {
  
  public static long calcFactorial( int n ){
    long factorial = 1;
    // Inicio del proceso
    while(n > 1){
      factorial *= n--;
    }
    // Fin del proceso
    return factorial;
  }
  
  public static int calcMcd(int n1, int n2){
    int mcd = 0;
    // Inicio del proceso
    
    // Fin del proceso
    return mcd;
  }
    
  public static int calcMcm(int n1, int n2){
    int mcm = 0;
    // Inicio del proceso
    
    // Fin del proceso
    return mcm;
  }  
  
  public static int[] generaFibonacci( int tamanio ){
    int serie[] = null;
    // Inicio del proceso
    switch(tamanio){
      case 1:
        serie = new int[]{0};
        break;
      case 2:
        serie = new int[]{0,1};
        break;
      default:
        serie = new int[tamanio];
        serie[0] = 0;
        serie[1] = 1;
        for(int i = 2; i < tamanio; i++){
          serie[i] = serie[i-1] + serie[i-2];
        }
        break;
    }
    // Fin del proceso
    return serie;
  }
  
  
  public boolean esPrimo( int n ) {
    boolean primo = true;
    // Inicio del proceso
    
    
    
    // Fin del proceso  
    return primo;
  }
  
  
}
