/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ShoppingListRow.java
 *
 * Created on 2011-mar-05, 13:48:52
 */

package imat;

import java.awt.Container;
import javax.swing.JTextField;

/**
 *
 * @author Boel_
 */
public class ShoppingListRow extends javax.swing.JPanel {

    /** Creates new form ShoppingListRow */
    public ShoppingListRow() {
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

        rowItemTextField = new javax.swing.JTextField();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(ShoppingListRow.class);
        rowItemTextField.setFont(resourceMap.getFont("rowItemTextField.font")); // NOI18N
        rowItemTextField.setText(resourceMap.getString("rowItemTextField.text")); // NOI18N
        rowItemTextField.setName("rowItemTextField"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(rowItemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rowItemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public String getRowItemTextField(){
        return rowItemTextField.getText();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField rowItemTextField;
    // End of variables declaration//GEN-END:variables

}
