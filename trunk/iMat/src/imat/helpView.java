/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * helpView.java
 *
 * Created on Feb 25, 2011, 12:26:19 PM
 */

package imat;

/**
 *
 * @author harryson
 */
public class helpView extends javax.swing.JFrame {

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
        jScrollPane2 = new javax.swing.JScrollPane();
        helpShoppningListTA = new javax.swing.JTextArea();
        helpFavoritesLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        helpFavoritesTA = new javax.swing.JTextArea();
        helpHowTo = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        helpHowToTA = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        helpPanel1.setName("helpPanel1"); // NOI18N

        helpInfoCardPanel.setName("helpInfoCardPanel"); // NOI18N

        helpViewHeaderPanel.setName("helpViewHeaderPanel"); // NOI18N

        javax.swing.GroupLayout helpInfoCardPanelLayout = new javax.swing.GroupLayout(helpInfoCardPanel);
        helpInfoCardPanel.setLayout(helpInfoCardPanelLayout);
        helpInfoCardPanelLayout.setHorizontalGroup(
            helpInfoCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpInfoCardPanelLayout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(helpViewHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        helpInfoCardPanelLayout.setVerticalGroup(
            helpInfoCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpInfoCardPanelLayout.createSequentialGroup()
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

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        helpShoppningListTA.setColumns(20);
        helpShoppningListTA.setEditable(false);
        helpShoppningListTA.setRows(5);
        helpShoppningListTA.setText(resourceMap.getString("helpShoppningListTA.text")); // NOI18N
        helpShoppningListTA.setName("helpShoppningListTA"); // NOI18N
        jScrollPane2.setViewportView(helpShoppningListTA);

        helpFavoritesLabel.setText(resourceMap.getString("helpFavoritesLabel.text")); // NOI18N
        helpFavoritesLabel.setName("helpFavoritesLabel"); // NOI18N

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        helpFavoritesTA.setColumns(20);
        helpFavoritesTA.setEditable(false);
        helpFavoritesTA.setRows(5);
        helpFavoritesTA.setName("helpFavoritesTA"); // NOI18N
        jScrollPane3.setViewportView(helpFavoritesTA);

        helpHowTo.setText(resourceMap.getString("helpHowTo.text")); // NOI18N
        helpHowTo.setName("helpHowTo"); // NOI18N

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        helpHowToTA.setColumns(20);
        helpHowToTA.setEditable(false);
        helpHowToTA.setRows(5);
        helpHowToTA.setName("helpHowToTA"); // NOI18N
        jScrollPane4.setViewportView(helpHowToTA);

        javax.swing.GroupLayout helpInstructionPanelLayout = new javax.swing.GroupLayout(helpInstructionPanel);
        helpInstructionPanel.setLayout(helpInstructionPanelLayout);
        helpInstructionPanelLayout.setHorizontalGroup(
            helpInstructionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpInstructionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(helpInstructionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                    .addComponent(helpShoppingLIstLabel)
                    .addComponent(helpFavoritesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                    .addComponent(helpHowTo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        helpInstructionPanelLayout.setVerticalGroup(
            helpInstructionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpInstructionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpShoppingLIstLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpFavoritesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpHowTo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(643, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout helpPanel1Layout = new javax.swing.GroupLayout(helpPanel1);
        helpPanel1.setLayout(helpPanel1Layout);
        helpPanel1Layout.setHorizontalGroup(
            helpPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(helpPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpInstructionPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpInfoCardPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpInstructionLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 919, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(helpPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 968, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(helpPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

}
