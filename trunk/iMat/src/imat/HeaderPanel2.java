package imat;

import javax.swing.JLabel;
import javax.swing.JTextPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HeaderPanel2.java
 *
 * Created on 2011-mar-03, 15:31:38
 */

/**
 *
 * @author Boel_
 */
public class HeaderPanel2 extends javax.swing.JPanel {

    /** Creates new form HeaderPanel2 */
    public HeaderPanel2() {
        initComponents();
    }

    public JLabel getHeaderPanelPicLabel() {
        return headerPanelPicLabel;
    }

    public void setHeaderPanelPicLabel(JLabel headerPanelPicLabel) {
        this.headerPanelPicLabel = headerPanelPicLabel;
    }

    public JTextPane getHeaderPanelTextPane() {
        return headerPanelTextPane;
    }

    public void setHeaderPanelTextPane(JTextPane headerPanelTextPane) {
        this.headerPanelTextPane = headerPanelTextPane;
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanelPicLabel = new javax.swing.JLabel();
        headerPanelScrollPane = new javax.swing.JScrollPane();
        headerPanelTextPane = new javax.swing.JTextPane();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(HeaderPanel2.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setName("Form"); // NOI18N

        headerPanelPicLabel.setIcon(resourceMap.getIcon("headerPanelPicLabel.icon")); // NOI18N
        headerPanelPicLabel.setText(resourceMap.getString("headerPanelPicLabel.text")); // NOI18N
        headerPanelPicLabel.setName("headerPanelPicLabel"); // NOI18N

        headerPanelScrollPane.setName("headerPanelScrollPane"); // NOI18N

        headerPanelTextPane.setEditable(false);
        headerPanelTextPane.setText(resourceMap.getString("headerPanelTextPane.text")); // NOI18N
        headerPanelTextPane.setName("headerPanelTextPane"); // NOI18N
        headerPanelTextPane.setOpaque(false);
        headerPanelScrollPane.setViewportView(headerPanelTextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanelPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                    .addComponent(headerPanelScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanelPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(headerPanelScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerPanelPicLabel;
    private javax.swing.JScrollPane headerPanelScrollPane;
    private javax.swing.JTextPane headerPanelTextPane;
    // End of variables declaration//GEN-END:variables

}