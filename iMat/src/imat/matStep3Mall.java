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

/**
 *
 * @author David
 */
public class matStep3Mall extends javax.swing.JPanel {

    /** Creates new form matStep2Mall */
    public matStep3Mall() {
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

        detailPanel = new javax.swing.JPanel();
        detailPicturePanel = new javax.swing.JLabel();
        detailScrollPanel = new javax.swing.JScrollPane();
        detailDescriptionTextPanel = new javax.swing.JTextPane();
        detailProductNameLabel = new javax.swing.JLabel();
        detailFavoriteButton = new javax.swing.JButton();
        detailBasketAmountLabel1 = new javax.swing.JLabel();
        detailBasketAmountLabel2 = new javax.swing.JLabel();
        detailPriceLabel = new javax.swing.JLabel();
        detailAmountSpinner = new javax.swing.JSpinner();
        detailAmountLabel = new javax.swing.JLabel();
        detailUnitLabel = new javax.swing.JLabel();
        detailCostLabel = new javax.swing.JLabel();
        detailBasketButton = new javax.swing.JButton();
        detailFavoriteLabel = new javax.swing.JLabel();

        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(795, 784));

        detailPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        detailPanel.setName("detailPanel"); // NOI18N
        detailPanel.setOpaque(false);
        detailPanel.setPreferredSize(new java.awt.Dimension(775, 209));

        detailPicturePanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(matStep3Mall.class);
        detailPicturePanel.setText(resourceMap.getString("detailPicturePanel.text")); // NOI18N
        detailPicturePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        detailPicturePanel.setName("detailPicturePanel"); // NOI18N

        detailScrollPanel.setName("detailScrollPanel"); // NOI18N

        detailDescriptionTextPanel.setText(resourceMap.getString("detailDescriptionTextPanel.text")); // NOI18N
        detailDescriptionTextPanel.setName("detailDescriptionTextPanel"); // NOI18N
        detailScrollPanel.setViewportView(detailDescriptionTextPanel);

        detailProductNameLabel.setFont(resourceMap.getFont("detailProductNameLabel.font")); // NOI18N
        detailProductNameLabel.setText(resourceMap.getString("detailProductNameLabel.text")); // NOI18N
        detailProductNameLabel.setName("detailProductNameLabel"); // NOI18N

        detailFavoriteButton.setIcon(resourceMap.getIcon("detailFavoriteButton.icon")); // NOI18N
        detailFavoriteButton.setText(resourceMap.getString("detailFavoriteButton.text")); // NOI18N
        detailFavoriteButton.setName("detailFavoriteButton"); // NOI18N

        detailBasketAmountLabel1.setText(resourceMap.getString("detailBasketAmountLabel1.text")); // NOI18N
        detailBasketAmountLabel1.setName("detailBasketAmountLabel1"); // NOI18N

        detailBasketAmountLabel2.setText(resourceMap.getString("detailBasketAmountLabel2.text")); // NOI18N
        detailBasketAmountLabel2.setName("detailBasketAmountLabel2"); // NOI18N

        detailPriceLabel.setFont(resourceMap.getFont("detailPriceLabel.font")); // NOI18N
        detailPriceLabel.setText(resourceMap.getString("detailPriceLabel.text")); // NOI18N
        detailPriceLabel.setName("detailPriceLabel"); // NOI18N

        detailAmountSpinner.setName("detailAmountSpinner"); // NOI18N

        detailAmountLabel.setText(resourceMap.getString("detailAmountLabel.text")); // NOI18N
        detailAmountLabel.setName("detailAmountLabel"); // NOI18N

        detailUnitLabel.setText(resourceMap.getString("detailUnitLabel.text")); // NOI18N
        detailUnitLabel.setName("detailUnitLabel"); // NOI18N

        detailCostLabel.setText(resourceMap.getString("detailCostLabel.text")); // NOI18N
        detailCostLabel.setName("detailCostLabel"); // NOI18N

        detailBasketButton.setText(resourceMap.getString("detailBasketButton.text")); // NOI18N
        detailBasketButton.setName("detailBasketButton"); // NOI18N
        detailBasketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailBasketButtonActionPerformed(evt);
            }
        });

        detailFavoriteLabel.setText(resourceMap.getString("detailFavoriteLabel.text")); // NOI18N
        detailFavoriteLabel.setName("detailFavoriteLabel"); // NOI18N

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailPicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailPriceLabel)
                            .addGroup(detailPanelLayout.createSequentialGroup()
                                .addComponent(detailBasketAmountLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(detailBasketAmountLabel2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addComponent(detailAmountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(detailAmountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detailUnitLabel)
                        .addGap(18, 18, 18)
                        .addComponent(detailCostLabel)
                        .addGap(65, 65, 65)
                        .addComponent(detailBasketButton))
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addComponent(detailProductNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                        .addComponent(detailFavoriteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(detailFavoriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addComponent(detailPicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(detailBasketAmountLabel1)
                            .addComponent(detailBasketAmountLabel2)))
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(detailProductNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(detailFavoriteLabel))
                            .addComponent(detailFavoriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detailScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailAmountLabel)
                    .addComponent(detailAmountSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(detailUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailCostLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(detailPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(detailBasketButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void detailBasketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailBasketButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailBasketButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel detailAmountLabel;
    private javax.swing.JSpinner detailAmountSpinner;
    private javax.swing.JLabel detailBasketAmountLabel1;
    private javax.swing.JLabel detailBasketAmountLabel2;
    private javax.swing.JButton detailBasketButton;
    private javax.swing.JLabel detailCostLabel;
    private javax.swing.JTextPane detailDescriptionTextPanel;
    private javax.swing.JButton detailFavoriteButton;
    private javax.swing.JLabel detailFavoriteLabel;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JLabel detailPicturePanel;
    private javax.swing.JLabel detailPriceLabel;
    private javax.swing.JLabel detailProductNameLabel;
    private javax.swing.JScrollPane detailScrollPanel;
    private javax.swing.JLabel detailUnitLabel;
    // End of variables declaration//GEN-END:variables

}
