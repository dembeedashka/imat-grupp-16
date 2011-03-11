/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * itemPanel.java
 *
 * Created on 2011-feb-28, 11:41:22
 */

package imat;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author David
 */
public class itemPanel extends javax.swing.JPanel {

    private Product product;
    private IMatDataHandler handler = IMatDataHandler.getInstance();
    private ImageIcon star = new ImageIcon("src/imat/resources/images/buttons/star.gif");
    private ImageIcon star2 = new ImageIcon("src/imat/resources/images/buttons/star2.gif");
    private double price;
    private IMatPresenter presenter = IMatPresenter.getInstance();

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public JSpinner getProductAmount() {
        return productAmount;
    }

    public JButton getProductIcon() {
        return productIconButton;
    }

    public void setProductIcon(ImageIcon icon) {
        productIconButton.setIcon(new ImageIcon(icon.getImage().getScaledInstance(productIconButton.getWidth() - 10, productIconButton.getHeight() - 10, Image.SCALE_SMOOTH)));
    }

    public JLabel getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName.setText(productName);

    }

    public JLabel getProductPrice() {
        return productPriceLabel;
    }

    public void setProductUnitLabel(String productUnitLabel) {
        this.productUnitLabel2.setText(productUnitLabel);
    }
    
    public void setProductPrice(double productPrice) {
        String paddedProductPrice = presenter.doublePad(productPrice);
        this.productPriceLabel.setText(paddedProductPrice);
        productTotalPriceDisplay.setText(paddedProductPrice + " kr");
        this.price = productPrice;
    }

    public void setStar(String path) {
        favouriteButton.setIcon(star);
    }



    /** Creates new form itemPanel */
    public itemPanel() {
        initComponents();
        productIconButton.setVerticalTextPosition(SwingConstants.CENTER);
        productIconButton.setHorizontalTextPosition(SwingConstants.CENTER);

        String textNamn = "Detaljer";

        productIconButton.setText("<html><p><p><p><p>" + textNamn + "</p></p></p></p></p></html>");
        productIconButton.setSize(104, 93);
    }

    public void updateFavourite()
    {
        if(handler.isFavorite(product))
        {
            handler.removeFavorite(product);
            favouriteButton.setIcon(star2);
        }
        else
        {
            handler.addFavorite(product);
            favouriteButton.setIcon(star);
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

        jPanel1 = new javax.swing.JPanel();
        productIconButton = new javax.swing.JButton();
        addToCartButton = new javax.swing.JButton();
        productTotalPrice = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        SpinnerModel model = new SpinnerNumberModel(1, 1, 1000, 1);
        productAmount = new javax.swing.JSpinner(model);
        productPriceLabel = new javax.swing.JLabel();
        favouriteButton = new javax.swing.JButton();
        productUnitLabel2 = new javax.swing.JLabel();
        productTotalPriceDisplay = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(398, 184));
        jPanel1.setName("jPanel1"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(itemPanel.class);
        productIconButton.setFont(resourceMap.getFont("productIconButton.font")); // NOI18N
        productIconButton.setForeground(resourceMap.getColor("productIconButton.foreground")); // NOI18N
        productIconButton.setText(resourceMap.getString("productIconButton.text")); // NOI18N
        productIconButton.setToolTipText(resourceMap.getString("productIconButton.toolTipText")); // NOI18N
        productIconButton.setAlignmentY(0.0F);
        productIconButton.setName("productIconButton"); // NOI18N
        productIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIconButtonActionPerformed(evt);
            }
        });

        addToCartButton.setFont(resourceMap.getFont("addToCartButton.font")); // NOI18N
        addToCartButton.setText(resourceMap.getString("addToCartButton.text")); // NOI18N
        addToCartButton.setToolTipText(resourceMap.getString("addToCartButton.toolTipText")); // NOI18N
        addToCartButton.setName("addToCartButton"); // NOI18N
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        productTotalPrice.setFont(resourceMap.getFont("productTotalPrice.font")); // NOI18N
        productTotalPrice.setText(resourceMap.getString("productTotalPrice.text")); // NOI18N
        productTotalPrice.setName("productTotalPrice"); // NOI18N

        productName.setBackground(resourceMap.getColor("productName.background")); // NOI18N
        productName.setFont(resourceMap.getFont("productName.font")); // NOI18N
        productName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productName.setText(resourceMap.getString("productName.text")); // NOI18N
        productName.setBorder(new javax.swing.border.MatteBorder(null));
        productName.setMaximumSize(new java.awt.Dimension(337, 61));
        productName.setName("productName"); // NOI18N

        productAmount.setFont(resourceMap.getFont("productAmount.font")); // NOI18N
        productAmount.setName("productAmount"); // NOI18N
        productAmount.setRequestFocusEnabled(false);
        productAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                productAmountStateChanged(evt);
            }
        });

        productPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPriceLabel.setName("productPriceLabel"); // NOI18N

        favouriteButton.setIcon(resourceMap.getIcon("favouriteButton.icon")); // NOI18N
        favouriteButton.setText(resourceMap.getString("favouriteButton.text")); // NOI18N
        favouriteButton.setToolTipText(resourceMap.getString("favouriteButton.toolTipText")); // NOI18N
        favouriteButton.setName("favouriteButton"); // NOI18N
        favouriteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favouriteButtonActionPerformed(evt);
            }
        });

        productUnitLabel2.setFont(resourceMap.getFont("productUnitLabel2.font")); // NOI18N
        productUnitLabel2.setText(resourceMap.getString("productUnitLabel2.text")); // NOI18N
        productUnitLabel2.setName("productUnitLabel2"); // NOI18N

        productTotalPriceDisplay.setFont(resourceMap.getFont("productTotalPriceDisplay.font")); // NOI18N
        productTotalPriceDisplay.setText(resourceMap.getString("productTotalPriceDisplay.text")); // NOI18N
        productTotalPriceDisplay.setName("productTotalPriceDisplay"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(productPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productUnitLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(productAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(favouriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(productTotalPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productTotalPriceDisplay))
                            .addComponent(addToCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(favouriteButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(productIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(productUnitLabel2)
                                    .addComponent(productPriceLabel)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(productAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(productTotalPrice)
                                    .addComponent(productTotalPriceDisplay))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        presenter.addToCart(product, (Integer) productAmount.getValue());
}//GEN-LAST:event_addToCartButtonActionPerformed

    private void favouriteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favouriteButtonActionPerformed
        updateFavourite();
    }//GEN-LAST:event_favouriteButtonActionPerformed

    private void productAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_productAmountStateChanged
        productTotalPriceDisplay.setText(presenter.doublePad(price * (Integer)productAmount.getValue()) + " kr");
    }//GEN-LAST:event_productAmountStateChanged

    private void productIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productIconButtonActionPerformed
        presenter.displayProduct(presenter.getCurrentCategory(), product);
    }//GEN-LAST:event_productIconButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JButton favouriteButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner productAmount;
    private javax.swing.JButton productIconButton;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPriceLabel;
    private javax.swing.JLabel productTotalPrice;
    private javax.swing.JLabel productTotalPriceDisplay;
    private javax.swing.JLabel productUnitLabel2;
    // End of variables declaration//GEN-END:variables

}
