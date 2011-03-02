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
        shoppingListBottomPanel = new javax.swing.JPanel();
        shoppingListAddRow = new javax.swing.JButton();
        shoppingListRow = new javax.swing.JPanel();
        shoppingListTrashCan = new javax.swing.JLabel();
        shoppingListItem = new javax.swing.JTextField();
        shoppingListCheckBox = new javax.swing.JCheckBox();
        shoppingListScrollBar = new javax.swing.JScrollBar();

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

        javax.swing.GroupLayout shoppingListTopPanelLayout = new javax.swing.GroupLayout(shoppingListTopPanel);
        shoppingListTopPanel.setLayout(shoppingListTopPanelLayout);
        shoppingListTopPanelLayout.setHorizontalGroup(
            shoppingListTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shoppingListHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
            .addComponent(shoppingListName, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );
        shoppingListTopPanelLayout.setVerticalGroup(
            shoppingListTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shoppingListTopPanelLayout.createSequentialGroup()
                .addComponent(shoppingListHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shoppingListName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        shoppingListBottomPanel.setName("shoppingListBottomPanel"); // NOI18N

        shoppingListAddRow.setFont(resourceMap.getFont("shoppingListAddRow.font")); // NOI18N
        shoppingListAddRow.setText(resourceMap.getString("shoppingListAddRow.text")); // NOI18N
        shoppingListAddRow.setName("shoppingListAddRow"); // NOI18N

        javax.swing.GroupLayout shoppingListBottomPanelLayout = new javax.swing.GroupLayout(shoppingListBottomPanel);
        shoppingListBottomPanel.setLayout(shoppingListBottomPanelLayout);
        shoppingListBottomPanelLayout.setHorizontalGroup(
            shoppingListBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shoppingListBottomPanelLayout.createSequentialGroup()
                .addComponent(shoppingListAddRow, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        shoppingListBottomPanelLayout.setVerticalGroup(
            shoppingListBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shoppingListBottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shoppingListAddRow, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        shoppingListRow.setName("shoppingListRow"); // NOI18N

        shoppingListTrashCan.setText(resourceMap.getString("shoppingListTrashCan.text")); // NOI18N
        shoppingListTrashCan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        shoppingListTrashCan.setName("shoppingListTrashCan"); // NOI18N

        shoppingListItem.setText(resourceMap.getString("shoppingListItem.text")); // NOI18N
        shoppingListItem.setName("shoppingListItem"); // NOI18N

        shoppingListCheckBox.setText(resourceMap.getString("shoppingListCheckBox.text")); // NOI18N
        shoppingListCheckBox.setName("shoppingListCheckBox"); // NOI18N

        javax.swing.GroupLayout shoppingListRowLayout = new javax.swing.GroupLayout(shoppingListRow);
        shoppingListRow.setLayout(shoppingListRowLayout);
        shoppingListRowLayout.setHorizontalGroup(
            shoppingListRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shoppingListRowLayout.createSequentialGroup()
                .addComponent(shoppingListTrashCan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shoppingListItem, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shoppingListCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );
        shoppingListRowLayout.setVerticalGroup(
            shoppingListRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shoppingListRowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shoppingListRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shoppingListCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(shoppingListItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(shoppingListTrashCan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap())
        );

        shoppingListScrollBar.setName("shoppingListScrollBar"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(shoppingListRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(shoppingListBottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shoppingListTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(shoppingListScrollBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(shoppingListTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(shoppingListRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(shoppingListBottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(shoppingListScrollBar, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton shoppingListAddRow;
    private javax.swing.JPanel shoppingListBottomPanel;
    private javax.swing.JCheckBox shoppingListCheckBox;
    private javax.swing.JLabel shoppingListHeader;
    private javax.swing.JTextField shoppingListItem;
    private javax.swing.JTextField shoppingListName;
    private javax.swing.JPanel shoppingListRow;
    private javax.swing.JScrollBar shoppingListScrollBar;
    private javax.swing.JPanel shoppingListTopPanel;
    private javax.swing.JLabel shoppingListTrashCan;
    // End of variables declaration//GEN-END:variables

}