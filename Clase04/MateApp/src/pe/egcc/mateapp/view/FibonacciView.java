package pe.egcc.mateapp.view;

import pe.egcc.mateapp.controller.MateController;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class FibonacciView extends javax.swing.JInternalFrame {

    /** Creates new form FibonacciView */
    public FibonacciView() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtTamanio = new javax.swing.JTextField();
    btnGenerar = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    txtRepo = new javax.swing.JTextArea();

    setClosable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("SERIE DE FIBONACCI");

    jLabel1.setBackground(new java.awt.Color(0, 102, 102));
    jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("SERIE DE FIBONACCI");
    jLabel1.setOpaque(true);

    jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
    jLabel2.setText("Tamaño:");

    txtTamanio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

    btnGenerar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
    btnGenerar.setText("Generar");
    btnGenerar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnGenerarActionPerformed(evt);
      }
    });

    jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESULTADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N

    txtRepo.setColumns(20);
    txtRepo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
    txtRepo.setRows(5);
    jScrollPane1.setViewportView(txtRepo);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addGap(34, 34, 34)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jScrollPane1)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(28, 28, 28)
            .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(199, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtTamanio)
          .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
        .addGap(30, 30, 30)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 157, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
    
    // Dato
    int tamanio = Integer.parseInt(txtTamanio.getText());
    
    // Proceso
    MateController mateController = new MateController();
    int serie[] = mateController.generaFibonacci(tamanio);
    
    // Reporte
    String repo = "";
    for (int elemento : serie) {
      repo += elemento + "\t";
    }
    txtRepo.setText(repo);
    
  }//GEN-LAST:event_btnGenerarActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnGenerar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea txtRepo;
  private javax.swing.JTextField txtTamanio;
  // End of variables declaration//GEN-END:variables

}
