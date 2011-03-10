/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * homeView.java
 *
 * Created on 2011-feb-28, 21:51:58
 */

package imat;

/**
 *
 * @author Boel_
 */
public class homeView extends javax.swing.JPanel {

    private IMatPresenter presenter = IMatPresenter.getInstance();

    /** Creates new form homeView */
    public homeView() {
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

        homeBreadcrumbsPanel = new javax.swing.JPanel();
        homeUserInfoButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        homeInfoTextArea2 = new javax.swing.JTextArea();
        homeHelpButton = new javax.swing.JButton();
        homeViewHeaderPanel = new imat.HeaderPanel2();

        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(795, 1160));

        homeBreadcrumbsPanel.setName("homeBreadcrumbsPanel"); // NOI18N

        javax.swing.GroupLayout homeBreadcrumbsPanelLayout = new javax.swing.GroupLayout(homeBreadcrumbsPanel);
        homeBreadcrumbsPanel.setLayout(homeBreadcrumbsPanelLayout);
        homeBreadcrumbsPanelLayout.setHorizontalGroup(
            homeBreadcrumbsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        homeBreadcrumbsPanelLayout.setVerticalGroup(
            homeBreadcrumbsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(homeView.class);
        homeUserInfoButton.setFont(resourceMap.getFont("homeUserInfoButton.font")); // NOI18N
        homeUserInfoButton.setIcon(resourceMap.getIcon("homeUserInfoButton.icon")); // NOI18N
        homeUserInfoButton.setText(resourceMap.getString("homeUserInfoButton.text")); // NOI18N
        homeUserInfoButton.setToolTipText(resourceMap.getString("homeUserInfoButton.toolTipText")); // NOI18N
        homeUserInfoButton.setName("homeUserInfoButton"); // NOI18N
        homeUserInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeUserInfoButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        homeInfoTextArea2.setColumns(20);
        homeInfoTextArea2.setEditable(false);
        homeInfoTextArea2.setFont(resourceMap.getFont("homeInfoTextArea2.font")); // NOI18N
        homeInfoTextArea2.setLineWrap(true);
        homeInfoTextArea2.setRows(5);
        homeInfoTextArea2.setText(resourceMap.getString("homeInfoTextArea2.text")); // NOI18N
        homeInfoTextArea2.setName("homeInfoTextArea2"); // NOI18N
        jScrollPane2.setViewportView(homeInfoTextArea2);

        homeHelpButton.setFont(resourceMap.getFont("homeHelpButton.font")); // NOI18N
        homeHelpButton.setIcon(resourceMap.getIcon("homeHelpButton.icon")); // NOI18N
        homeHelpButton.setText(resourceMap.getString("homeHelpButton.text")); // NOI18N
        homeHelpButton.setToolTipText(resourceMap.getString("homeHelpButton.toolTipText")); // NOI18N
        homeHelpButton.setName("homeHelpButton"); // NOI18N
        homeHelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeHelpButtonActionPerformed(evt);
            }
        });

        homeViewHeaderPanel.setName("homeViewHeaderPanel"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBreadcrumbsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeViewHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(homeUserInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(homeHelpButton, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homeBreadcrumbsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeViewHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeUserInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeHelpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeUserInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeUserInfoButtonActionPerformed
        presenter.displayCategory(IMatView.USERINFO);
    }//GEN-LAST:event_homeUserInfoButtonActionPerformed

    private void homeHelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeHelpButtonActionPerformed
        presenter.displayCategory(IMatView.HELP);
    }//GEN-LAST:event_homeHelpButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homeBreadcrumbsPanel;
    private javax.swing.JButton homeHelpButton;
    private javax.swing.JTextArea homeInfoTextArea2;
    private javax.swing.JButton homeUserInfoButton;
    private imat.HeaderPanel2 homeViewHeaderPanel;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
