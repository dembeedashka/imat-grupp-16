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

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 *
 * @author Boel_
 */
public class ShoppingListLoadingRow extends javax.swing.JPanel {

    private IMatPresenter presenter = IMatPresenter.getInstance();
    private IMatView i;

    public String name;

    /** Creates new form ShoppingListRow */
    public ShoppingListLoadingRow() {
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

        shoppingListButton = new javax.swing.JButton();

        setName("Form"); // NOI18N

        shoppingListButton.setName("shoppingListButton"); // NOI18N
        shoppingListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoppingListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shoppingListButton, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shoppingListButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void shoppingListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoppingListButtonActionPerformed
        i = presenter.getView();
        shoppingList s = i.getShoppingList();
        try {
            FileInputStream fis = new FileInputStream(getShoppingListButton()+".txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);
            s.clearAll();
            while (dis.available() != 0) {
                ShoppingListRow sr = new ShoppingListRow();
                sr.setRowItemTextField(dis.readLine());
                s.addRow(sr);
            }
            fis.close();
            bis.close();
            dis.close();
            i.setShoppingList(s);
            presenter.displayCategory(IMatView.HOME);
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_shoppingListButtonActionPerformed

    public String getShoppingListButton(){
        return shoppingListButton.getText();
    }
    public void setShoppingListButton(String s){
        shoppingListButton.setText(s);
        name=s;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton shoppingListButton;
    // End of variables declaration//GEN-END:variables

}
