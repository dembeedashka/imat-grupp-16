/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * actionPanel.java
 *
 * Created on 2011-mar-02, 14:54:52
 */

package imat;

/**
 *
 * @author Harryson
 */
public class actionPanel extends javax.swing.JPanel {

    /** Creates new form actionPanel */
    public actionPanel() {
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

        actionPanel1 = new javax.swing.JPanel();
        apBasketButton = new javax.swing.JButton();
        apUserinfoButton = new javax.swing.JButton();
        apReceiptButton = new javax.swing.JButton();
        apCashregisterButton = new javax.swing.JButton();

        setName("Form"); // NOI18N

        actionPanel1.setName("actionPanel1"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(actionPanel.class);
        apBasketButton.setText(resourceMap.getString("apBasketButton.text")); // NOI18N
        apBasketButton.setName("apBasketButton"); // NOI18N

        apUserinfoButton.setText(resourceMap.getString("apUserinfoButton.text")); // NOI18N
        apUserinfoButton.setName("apUserinfoButton"); // NOI18N

        apReceiptButton.setText(resourceMap.getString("apReceiptButton.text")); // NOI18N
        apReceiptButton.setName("apReceiptButton"); // NOI18N

        apCashregisterButton.setText(resourceMap.getString("apCashregisterButton.text")); // NOI18N
        apCashregisterButton.setName("apCashregisterButton"); // NOI18N

        javax.swing.GroupLayout actionPanel1Layout = new javax.swing.GroupLayout(actionPanel1);
        actionPanel1.setLayout(actionPanel1Layout);
        actionPanel1Layout.setHorizontalGroup(
            actionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apReceiptButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(apCashregisterButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(apBasketButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(apUserinfoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, Short.MAX_VALUE))
                .addContainerGap())
        );
        actionPanel1Layout.setVerticalGroup(
            actionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanel1Layout.createSequentialGroup()
                .addComponent(apBasketButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apUserinfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apReceiptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apCashregisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actionPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actionPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel1;
    private javax.swing.JButton apBasketButton;
    private javax.swing.JButton apCashregisterButton;
    private javax.swing.JButton apReceiptButton;
    private javax.swing.JButton apUserinfoButton;
    // End of variables declaration//GEN-END:variables

}
