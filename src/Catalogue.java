
import java.util.ArrayList;

public class Catalogue extends javax.swing.JDialog {

    
    public Catalogue(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnreturn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdisplay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnreturn.setText("RETURN");
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SHOPPING CATALOGUE");

        txtdisplay.setColumns(20);
        txtdisplay.setRows(5);
        txtdisplay.setText("\nWelcome! \n\nHowell’s Exotic Markets aims to please its customers with Simcoe County’s \nlargest variety of exotic foods and goods. Browse our catalogue and\nbegin shopping:\n\nPRODUCE\n==========\nAll produce products cost $2.00. Buy as little as\n1 of each item, or up to 100. Luckily, you don’t need \nto pay tax on any produce item. Items include:\n\n-Bananas\n-Durian\n-Mangoes, \n-Pineapple\n-Coconuts\n-Dragon Fruit\n\nDELI\n==========\nOur deli only serves the finest exotic cuts of meat\nand fish! All deli items are 10 cents / g, but if you buy\n500g or more, save 5 cents on every gram.\n Purchase between 1-1000 grams of your favourite\n exotic meats such as:\n\n-Swordfish\n-Shark\n-Rhino Jerky\n-Rattlesnake\n\n\nCLOTHING\n==========\n\nPreparing for vacation? Look no further. \nWe hold a wide variety of exotic and cultural apparel to suit your needs. \nChoose between 4 sizes (S, M, L, XL) on every item:\n\n-Sombrero: $20.00\n-Kimono: $50.00\n-Speedo: $20.00\n-Parka: $100.00\n-Sandals: $20.00\n-Sun Dress: $50.00\n\n\nELECTRONICS\n==============\nChoose between 4 electronic products, each of which\nis priced by screen size! \nEach screen (30-100 inches) costs $10 / inch\n*ALL ELECTRONICS INCLUDE A $15 INSTALLATION COST*\n\nComputer, Laptop, Television, 4D Television\n\n\nENJOY YOUR SHOPPING EXPERIENCE AT HOWELL EXOTIC MARKETS\n");
        jScrollPane1.setViewportView(txtdisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnreturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnreturn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnreturnActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(ListPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListPopUp dialog = new ListPopUp(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtdisplay;
    // End of variables declaration//GEN-END:variables
}
