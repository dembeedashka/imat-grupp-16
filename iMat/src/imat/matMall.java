/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * matMall.java
 *
 * Created on 2011-feb-24, 15:42:19
 */

package imat;

import javax.swing.JLabel;
import javax.swing.JTextPane;

/**
 *
 * @author David
 */
public class matMall extends javax.swing.JPanel {

    /** Creates new form matMall */
    public matMall() {

        


        initComponents();
        setVisible(true);
    }

    public HeaderPanel2 getMatMallHeaderPanel() {
        return matMallHeaderPanel;
    }

    public void setMatMallHeaderPanel(HeaderPanel2 matMallHeaderPanel) {
        this.matMallHeaderPanel = matMallHeaderPanel;
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
        matMallHeaderPanel = new imat.HeaderPanel2();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(795, 784));
        setLayout(new java.awt.CardLayout());

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(795, 784));

        matMallHeaderPanel.setName("matMallHeaderPanel"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(matMallHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(matMallHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addGap(579, 579, 579))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private imat.HeaderPanel2 matMallHeaderPanel;
    // End of variables declaration//GEN-END:variables

}
