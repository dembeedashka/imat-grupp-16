/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * matStep2Mall.java
 *
 * Created on 2011-feb-25, 09:57:17
 */

package imat;

import javax.swing.Icon;
import javax.swing.JPanel;

/**
 *
 * @author David
 */
public class matStep2Mall extends javax.swing.JPanel {

    /** Creates new form matStep2Mall */
    public matStep2Mall() {
        initComponents();
    }

    public void setPic(Icon icon)
    {
        matMallHeaderPanel.getHeaderPanelPicLabel().setIcon(icon);
    }

    public void setDescription(String string)
    {
        matMallHeaderPanel.getHeaderPanelTextPane().setText(string);
    }

    public JPanel getProductPanel() {
        return productPanel;
    }

    public void setProductPanel(JPanel productPanel) {
        this.productPanel = productPanel;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productPanel = new javax.swing.JPanel();
        matMallHeaderPanel = new imat.HeaderPanel2();

        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(795, 784));

        productPanel.setName("productPanel"); // NOI18N

        javax.swing.GroupLayout productPanelLayout = new javax.swing.GroupLayout(productPanel);
        productPanel.setLayout(productPanelLayout);
        productPanelLayout.setHorizontalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        productPanelLayout.setVerticalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        matMallHeaderPanel.setName("matMallHeaderPanel"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(matMallHeaderPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                    .addComponent(productPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(matMallHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imat.HeaderPanel2 matMallHeaderPanel;
    private javax.swing.JPanel productPanel;
    // End of variables declaration//GEN-END:variables

}