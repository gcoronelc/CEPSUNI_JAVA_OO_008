package pe.egcc.censoapp.model;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Item {
  
  private String criterio;
  private int valor;

  public Item() {
  }

  public Item(String criterio, int valor) {
    this.criterio = criterio;
    this.valor = valor;
  }

  public String getCriterio() {
    return criterio;
  }

  public void setCriterio(String criterio) {
    this.criterio = criterio;
  }

  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }
  
  

}
