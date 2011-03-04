/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * itemPanel.java
 *
 * Created on 2011-feb-28, 11:41:22
 */

package imat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;

/**
 *
 * @author David
 */
public class itemPanel extends javax.swing.JPanel {

    public JButton getAddToCartButton() {
        return addToCartButton;
    }

    public void setAddToCartButton(JButton addToCartButton) {
        this.addToCartButton = addToCartButton;
    }

    public JSpinner getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(JSpinner productAmount) {
        this.productAmount = productAmount;
    }

    public JButton getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(JButton productIcon) {
        this.productIcon = productIcon;
    }

    public JLabel getProductName() {
        return productName;
    }

    public void setProductName(JLabel productName) {
        this.productName = productName;
    }

    public JLabel getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(JLabel productPrice) {
        this.productPrice = productPrice;
    }

    public JLabel getProductTotalPrice() {
        return productTotalPrice;
    }

    public void setProductTotalPrice(JLabel productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
    }

    /** Creates new form itemPanel */
    public itemPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        productIcon = new javax.swing.JButton();
        addToCartButton = new javax.swing.JButton();
        productTotalPrice = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        productAmount = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        productPrice = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setName("Form"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setName("jPanel1"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(itemPanel.class);
        productIcon.setText(resourceMap.getString("productIcon.text")); // NOI18N
        productIcon.setName("productIcon"); // NOI18N

        addToCartButton.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        addToCartButton.setText(resourceMap.getString("addToCartButton.text")); // NOI18N
        addToCartButton.setName("addToCartButton"); // NOI18N
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        productTotalPrice.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        productTotalPrice.setText(resourceMap.getString("productTotalPrice.text")); // NOI18N
        productTotalPrice.setName("productTotalPrice"); // NOI18N

        productName.setBackground(resourceMap.getColor("productName.background")); // NOI18N
        productName.setFont(resourceMap.getFont("productName.font")); // NOI18N
        productName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName.setText(resourceMap.getString("productName.text")); // NOI18N
        productName.setBorder(new javax.swing.border.MatteBorder(null));
        productName.setName("productName"); // NOI18N

        productAmount.setFont(resourceMap.getFont("productAmount.font")); // NOI18N
        productAmount.setName("productAmount"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        productPrice.setFont(resourceMap.getFont("productPrice.font")); // NOI18N
        productPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPrice.setText(resourceMap.getString("productPrice.text")); // NOI18N
        productPrice.setName("productPrice"); // NOI18N

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(productName, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(productIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addToCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(productTotalPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(productName, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_addToCartButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner productAmount;
    private javax.swing.JButton productIcon;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPrice;
    private javax.swing.JLabel productTotalPrice;
    // End of variables declaration//GEN-END:variables

}
