package pe.egcc.mateapp.view;

import javax.swing.JInternalFrame;

public class MainView extends javax.swing.JFrame {

  public MainView() {
    initComponents();
    this.setExtendedState(MAXIMIZED_BOTH);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    desktopPane = new javax.swing.JDesktopPane();
    menuBar = new javax.swing.JMenuBar();
    menuArchivo = new javax.swing.JMenu();
    menuArchivoSalir = new javax.swing.JMenuItem();
    menuMatematica = new javax.swing.JMenu();
    menuMatematicaFactorial = new javax.swing.JMenuItem();
    menuMatematicaMcdMcm = new javax.swing.JMenuItem();
    menuMatematicaFibonacci = new javax.swing.JMenuItem();
    menuMatematicaPrimo = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("MATEMATICAS PARA TODOS");

    menuArchivo.setText("Archivo");

    menuArchivoSalir.setText("Salir");
    menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuArchivoSalirActionPerformed(evt);
      }
    });
    menuArchivo.add(menuArchivoSalir);

    menuBar.add(menuArchivo);

    menuMatematica.setText("Matemática");

    menuMatematicaFactorial.setText("Factorial");
    menuMatematicaFactorial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuMatematicaFactorialActionPerformed(evt);
      }
    });
    menuMatematica.add(menuMatematicaFactorial);

    menuMatematicaMcdMcm.setText("MCD y MCM");
    menuMatematica.add(menuMatematicaMcdMcm);

    menuMatematicaFibonacci.setText("Fibonacci");
    menuMatematicaFibonacci.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuMatematicaFibonacciActionPerformed(evt);
      }
    });
    menuMatematica.add(menuMatematicaFibonacci);

    menuMatematicaPrimo.setText("Primo");
    menuMatematica.add(menuMatematicaPrimo);

    menuBar.add(menuMatematica);

    setJMenuBar(menuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
    System.exit(0);
  }//GEN-LAST:event_menuArchivoSalirActionPerformed

  private void menuMatematicaFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMatematicaFactorialActionPerformed
    cargarFormulario(FactorialView.class);
  }//GEN-LAST:event_menuMatematicaFactorialActionPerformed

  private void menuMatematicaFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMatematicaFibonacciActionPerformed
    cargarFormulario(FibonacciView.class);
  }//GEN-LAST:event_menuMatematicaFibonacciActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainView().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JDesktopPane desktopPane;
  private javax.swing.JMenu menuArchivo;
  private javax.swing.JMenuItem menuArchivoSalir;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenu menuMatematica;
  private javax.swing.JMenuItem menuMatematicaFactorial;
  private javax.swing.JMenuItem menuMatematicaFibonacci;
  private javax.swing.JMenuItem menuMatematicaMcdMcm;
  private javax.swing.JMenuItem menuMatematicaPrimo;
  // End of variables declaration//GEN-END:variables

  private void cargarFormulario(Class<?> aClass) {

    // Variable de control
    JInternalFrame view = null;

    try {

      // Buscar instancia
      for (JInternalFrame form : desktopPane.getAllFrames()) {
        if (aClass.isInstance(form)) {
          view = form;
          break;
        }
      }

      // Crear instancia
      if (view == null) {
        view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
        desktopPane.add(view);
        view.setVisible(true);
      }

      // Activar el formulario
      view.setSelected(true);

    } catch (Exception e) {

    }

  }
}
