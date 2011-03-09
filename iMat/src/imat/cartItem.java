/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * cartItem.java
 *
 * Created on 2011-mar-07, 11:01:15
 */

package imat;

import javax.swing.JLabel;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author David
 */
public class cartItem extends javax.swing.JPanel {

    

    private ShoppingItem lol;

    /** Creates new form cartItem */
    public cartItem() {
        initComponents();
    }


    
    public cartItem(ShoppingItem lol) {




        initComponents();
        productName.setText(lol.getProduct().getName());
        productPrice.setText(lol.getTotal() + " :-");
        productAmount.setValue(lol.getAmount());
        iconLabel.setIcon(IMatDataHandler.getInstance().getImageIcon(lol.getProduct()));
        unitSuffixLabel.setText(lol.getProduct().getUnitSuffix());
        unitLabel.setText(lol.getProduct().getPrice()+ " " + lol.getProduct().getUnit());

    }


   

    /** This method is rodcalled from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productAmount = new javax.swing.JSpinner();
        productName = new javax.swing.JTextField();
        removeProduct = new javax.swing.JButton();
        productPrice = new javax.swing.JTextField();
        iconLabel = new javax.swing.JLabel();
        unitSuffixLabel = new javax.swing.JLabel();
        unitLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(750, 50));
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 50));

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(cartItem.class);
        productAmount.setFont(resourceMap.getFont("productAmount.font")); // NOI18N
        productAmount.setName("productAmount"); // NOI18N
        productAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                productAmountStateChanged(evt);
            }
        });

        productName.setFont(resourceMap.getFont("productName.font")); // NOI18N
        productName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productName.setText(resourceMap.getString("productName.text")); // NOI18N
        productName.setDisabledTextColor(resourceMap.getColor("productName.disabledTextColor")); // NOI18N
        productName.setEnabled(false);
        productName.setName("productName"); // NOI18N

        removeProduct.setFont(resourceMap.getFont("removeProduct.font")); // NOI18N
        removeProduct.setText(resourceMap.getString("removeProduct.text")); // NOI18N
        removeProduct.setName("removeProduct"); // NOI18N
        removeProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProductActionPerformed(evt);
            }
        });

        productPrice.setFont(resourceMap.getFont("productPrice.font")); // NOI18N
        productPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productPrice.setText(resourceMap.getString("productPrice.text")); // NOI18N
        productPrice.setDisabledTextColor(resourceMap.getColor("productPrice.disabledTextColor")); // NOI18N
        productPrice.setEnabled(false);
        productPrice.setName("productPrice"); // NOI18N

        iconLabel.setText(resourceMap.getString("iconLabel.text")); // NOI18N
        iconLabel.setName("iconLabel"); // NOI18N

        unitSuffixLabel.setFont(resourceMap.getFont("unitSuffixLabel.font")); // NOI18N
        unitSuffixLabel.setText(resourceMap.getString("unitSuffixLabel.text")); // NOI18N
        unitSuffixLabel.setName("unitSuffixLabel"); // NOI18N

        unitLabel.setFont(resourceMap.getFont("unitLabel.font")); // NOI18N
        unitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unitLabel.setText(resourceMap.getString("unitLabel.text")); // NOI18N
        unitLabel.setName("unitLabel"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productName, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(unitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(removeProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(productAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unitSuffixLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(productPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productAmount)
                    .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(unitSuffixLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void productAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_productAmountStateChanged
        
       //productPrice.setText(lol.getTotal() +" :-");
    }//GEN-LAST:event_productAmountStateChanged

    private void removeProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProductActionPerformed
      
    }//GEN-LAST:event_removeProductActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JSpinner productAmount;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productPrice;
    private javax.swing.JButton removeProduct;
    private javax.swing.JLabel unitLabel;
    private javax.swing.JLabel unitSuffixLabel;
    // End of variables declaration//GEN-END:variables

}
