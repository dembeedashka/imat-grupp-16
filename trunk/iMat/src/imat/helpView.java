/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * helpView.java
 *
 * Created on Mar 7, 2011, 9:59:01 AM
 */

package imat;

/**
 *
 * @author harryson
 */
public class helpView extends javax.swing.JPanel {

    /** Creates new form helpView */
    public helpView() {
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

        helpPanel1 = new javax.swing.JPanel();
        helpInfoCardPanel = new javax.swing.JPanel();
        helpViewHeaderPanel = new imat.HeaderPanel2();
        helpInstructionLabel = new javax.swing.JLabel();
        helpInstructionPanel = new javax.swing.JPanel();
        helpShoppingLIstLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        helpShoppningListTA = new javax.swing.JTextArea();
        helpFavoritesLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        helpFavoritesTA = new javax.swing.JTextArea();
        helpHowTo = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        helpHowToTA = new javax.swing.JTextArea();
        helpContactLabel = new javax.swing.JLabel();
        helpContactPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setName("Form"); // NOI18N

        helpPanel1.setName("helpPanel1"); // NOI18N

        helpInfoCardPanel.setName("helpInfoCardPanel"); // NOI18N

        helpViewHeaderPanel.setName("helpViewHeaderPanel"); // NOI18N

        javax.swing.GroupLayout helpInfoCardPanelLayout = new javax.swing.GroupLayout(helpInfoCardPanel);
        helpInfoCardPanel.setLayout(helpInfoCardPanelLayout);
        helpInfoCardPanelLayout.setHorizontalGroup(
            helpInfoCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpInfoCardPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(helpViewHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        helpInfoCardPanelLayout.setVerticalGroup(
            helpInfoCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpInfoCardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(helpViewHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(helpView.class);
        helpInstructionLabel.setText(resourceMap.getString("helpInstructionLabel.text")); // NOI18N
        helpInstructionLabel.setName("helpInstructionLabel"); // NOI18N

        helpInstructionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        helpInstructionPanel.setName("helpInstructionPanel"); // NOI18N

        helpShoppingLIstLabel.setText(resourceMap.getString("helpShoppingLIstLabel.text")); // NOI18N
        helpShoppingLIstLabel.setName("helpShoppingLIstLabel"); // NOI18N

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        helpShoppningListTA.setColumns(20);
        helpShoppningListTA.setEditable(false);
        helpShoppningListTA.setRows(5);
        helpShoppningListTA.setText(resourceMap.getString("helpShoppningListTA.text")); // NOI18N
        helpShoppningListTA.setName("helpShoppningListTA"); // NOI18N
        jScrollPane4.setViewportView(helpShoppningListTA);

        helpFavoritesLabel.setText(resourceMap.getString("helpFavoritesLabel.text")); // NOI18N
        helpFavoritesLabel.setName("helpFavoritesLabel"); // NOI18N

        jScrollPane5.setName("jScrollPane5"); // NOI18N

        helpFavoritesTA.setColumns(20);
        helpFavoritesTA.setEditable(false);
        helpFavoritesTA.setRows(5);
        helpFavoritesTA.setName("helpFavoritesTA"); // NOI18N
        jScrollPane5.setViewportView(helpFavoritesTA);

        helpHowTo.setText(resourceMap.getString("helpHowTo.text")); // NOI18N
        helpHowTo.setName("helpHowTo"); // NOI18N

        jScrollPane6.setName("jScrollPane6"); // NOI18N

        helpHowToTA.setColumns(20);
        helpHowToTA.setEditable(false);
        helpHowToTA.setRows(5);
        helpHowToTA.setName("helpHowToTA"); // NOI18N
        jScrollPane6.setViewportView(helpHowToTA);

        javax.swing.GroupLayout helpInstructionPanelLayout = new javax.swing.GroupLayout(helpInstructionPanel);
        helpInstructionPanel.setLayout(helpInstructionPanelLayout);
        helpInstructionPanelLayout.setHorizontalGroup(
            helpInstructionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpInstructionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(helpInstructionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpShoppingLIstLabel)
                    .addComponent(helpFavoritesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addComponent(helpHowTo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE))
                .addContainerGap())
        );
        helpInstructionPanelLayout.setVerticalGroup(
            helpInstructionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpInstructionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpShoppingLIstLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpFavoritesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpHowTo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        helpContactLabel.setText(resourceMap.getString("helpContactLabel.text")); // NOI18N
        helpContactLabel.setName("helpContactLabel"); // NOI18N

        helpContactPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        helpContactPanel.setName("helpContactPanel"); // NOI18N

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        javax.swing.GroupLayout helpContactPanelLayout = new javax.swing.GroupLayout(helpContactPanel);
        helpContactPanel.setLayout(helpContactPanelLayout);
        helpContactPanelLayout.setHorizontalGroup(
            helpContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpContactPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(530, Short.MAX_VALUE))
        );
        helpContactPanelLayout.setVerticalGroup(
            helpContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpContactPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(helpContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout helpPanel1Layout = new javax.swing.GroupLayout(helpPanel1);
        helpPanel1.setLayout(helpPanel1Layout);
        helpPanel1Layout.setHorizontalGroup(
            helpPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(helpPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(helpInstructionLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpContactLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpInstructionPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpInfoCardPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpContactPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        helpPanel1Layout.setVerticalGroup(
            helpPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpInfoCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(helpInstructionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpInstructionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(helpContactLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpContactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
            .addGap(0, 806, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(helpPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 944, Short.MAX_VALUE)
            .addGap(0, 944, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(helpPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel helpContactLabel;
    private javax.swing.JPanel helpContactPanel;
    private javax.swing.JLabel helpFavoritesLabel;
    private javax.swing.JTextArea helpFavoritesTA;
    private javax.swing.JLabel helpHowTo;
    private javax.swing.JTextArea helpHowToTA;
    private javax.swing.JPanel helpInfoCardPanel;
    private javax.swing.JLabel helpInstructionLabel;
    private javax.swing.JPanel helpInstructionPanel;
    private javax.swing.JPanel helpPanel1;
    private javax.swing.JLabel helpShoppingLIstLabel;
    private javax.swing.JTextArea helpShoppningListTA;
    private imat.HeaderPanel2 helpViewHeaderPanel;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables

}
