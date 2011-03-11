/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ShoppingListView.java
 *
 * Created on 2011-mar-04, 10:19:09
 */

package imat;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import javax.swing.JButton;

/**
 *
 * @author Boel_
 */
public class ShoppingListView extends javax.swing.JPanel {

    /** Creates new form ShoppingListView */
    public ShoppingListView() {
        initComponents();
        displayShoppingLists();
        
    }

    public void displayShoppingLists()
    {
        shoppingListDisplayPanel.removeAll();
        try {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("lists.txt")));

            while (dis.available() != 0) {
                ShoppingListLoadingRow s = new ShoppingListLoadingRow();
                s.setShoppingListButton(dis.readLine());
                shoppingListDisplayPanel.add(s);
                shoppingListDisplayPanel.revalidate();
                shoppingListDisplayPanel.repaint();
            }
            dis.close();
        }
        catch(Exception e) {
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel21 = new imat.HeaderPanel2();
        shoppingListDisplayPanel = new javax.swing.JPanel();

        setName("Form"); // NOI18N

        headerPanel21.setName("headerPanel21"); // NOI18N

        shoppingListDisplayPanel.setName("shoppingListDisplayPanel"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(headerPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE))
                    .addComponent(shoppingListDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shoppingListDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public HeaderPanel2 getHeaderPanel21() {
        return headerPanel21;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imat.HeaderPanel2 headerPanel21;
    private javax.swing.JPanel shoppingListDisplayPanel;
    // End of variables declaration//GEN-END:variables

}
