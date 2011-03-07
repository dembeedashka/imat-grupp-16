/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * shoppingList.java
 *
 * Created on 2011-feb-28, 22:11:19
 */

package imat;

/**
 *
 * @author Boel_
 */
public class shoppingList extends javax.swing.JPanel {

    /** Creates new form shoppingList */
    public shoppingList() {
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

        shoppingListTopPanel = new javax.swing.JPanel();
        shoppingListHeader = new javax.swing.JLabel();
        shoppingListName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        shoppingListBottomPanel = new javax.swing.JPanel();
        shoppingListAddRow = new javax.swing.JButton();
        shoppingListRowScrollPane = new javax.swing.JScrollPane();
        shoppingListRowPanel = new javax.swing.JPanel();

        setName("Form"); // NOI18N

        shoppingListTopPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shoppingListTopPanel.setName("shoppingListTopPanel"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(shoppingList.class);
        shoppingListHeader.setFont(resourceMap.getFont("shoppingListHeader.font")); // NOI18N
        shoppingListHeader.setText(resourceMap.getString("shoppingListHeader.text")); // NOI18N
        shoppingListHeader.setName("shoppingListHeader"); // NOI18N

        shoppingListName.setFont(resourceMap.getFont("shoppingListName.font")); // NOI18N
        shoppingListName.setText(resourceMap.getString("shoppingListName.text")); // NOI18N
        shoppingListName.setName("shoppingListName"); // NOI18N

        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        javax.swing.GroupLayout shoppingListTopPanelLayout = new javax.swing.GroupLayout(shoppingListTopPanel);
        shoppingListTopPanel.setLayout(shoppingListTopPanelLayout);
        shoppingListTopPanelLayout.setHorizontalGroup(
            shoppingListTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shoppingListName, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shoppingListTopPanelLayout.createSequentialGroup()
                .addComponent(shoppingListHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );
        shoppingListTopPanelLayout.setVerticalGroup(
            shoppingListTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shoppingListTopPanelLayout.createSequentialGroup()
                .addGroup(shoppingListTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(shoppingListHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shoppingListName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        shoppingListBottomPanel.setName("shoppingListBottomPanel"); // NOI18N

        shoppingListAddRow.setFont(resourceMap.getFont("shoppingListAddRow.font")); // NOI18N
        shoppingListAddRow.setIcon(resourceMap.getIcon("shoppingListAddRow.icon")); // NOI18N
        shoppingListAddRow.setText(resourceMap.getString("shoppingListAddRow.text")); // NOI18N
        shoppingListAddRow.setName("shoppingListAddRow"); // NOI18N
        shoppingListAddRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoppingListAddRowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout shoppingListBottomPanelLayout = new javax.swing.GroupLayout(shoppingListBottomPanel);
        shoppingListBottomPanel.setLayout(shoppingListBottomPanelLayout);
        shoppingListBottomPanelLayout.setHorizontalGroup(
            shoppingListBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shoppingListAddRow, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );
        shoppingListBottomPanelLayout.setVerticalGroup(
            shoppingListBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shoppingListBottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shoppingListAddRow, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        shoppingListRowScrollPane.setName("shoppingListRowScrollPane"); // NOI18N

        shoppingListRowPanel.setName("shoppingListRowPanel"); // NOI18N
        shoppingListRowPanel.setLayout(new javax.swing.BoxLayout(shoppingListRowPanel, javax.swing.BoxLayout.Y_AXIS));
        shoppingListRowScrollPane.setViewportView(shoppingListRowPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shoppingListTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(shoppingListBottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(shoppingListRowScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(shoppingListTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shoppingListRowScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shoppingListBottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void shoppingListAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoppingListAddRowActionPerformed
        shoppingListRowPanel.add(new ShoppingListRow());
        shoppingListRowPanel.revalidate();
        shoppingListRowPanel.repaint();
    }//GEN-LAST:event_shoppingListAddRowActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton shoppingListAddRow;
    private javax.swing.JPanel shoppingListBottomPanel;
    private javax.swing.JLabel shoppingListHeader;
    private javax.swing.JTextField shoppingListName;
    private javax.swing.JPanel shoppingListRowPanel;
    private javax.swing.JScrollPane shoppingListRowScrollPane;
    private javax.swing.JPanel shoppingListTopPanel;
    // End of variables declaration//GEN-END:variables

}
