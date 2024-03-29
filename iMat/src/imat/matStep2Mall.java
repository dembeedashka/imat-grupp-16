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
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;

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

    


    public void addProduct(Product p){
        itemPanel pa = new itemPanel();
        pa.setProductName(p.getName());
        pa.setProductIcon(new ImageIcon("src/imat/resources/imat/images/"+p.getImageName()));
        pa.setProduct(p);

        if(IMatDataHandler.getInstance().isFavorite(p))
        {
            pa.setStar("src/imat/resources/images/buttons/star.gif");
        }

        pa.setProductPrice(p.getPrice());
        pa.setProductUnitLabel(p.getUnit());
        productPanel.add(pa);
        productPanel.revalidate();
        productPanel.repaint();


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

        setMaximumSize(new java.awt.Dimension(795, 600));
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(790, 600));

        productPanel.setMaximumSize(new java.awt.Dimension(770, 500));
        productPanel.setName("productPanel"); // NOI18N
        productPanel.setPreferredSize(new java.awt.Dimension(770, 500));
        productPanel.setLayout(new java.awt.GridLayout(0, 2, 3, 3));

        matMallHeaderPanel.setName("matMallHeaderPanel"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matMallHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(matMallHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imat.HeaderPanel2 matMallHeaderPanel;
    private javax.swing.JPanel productPanel;
    // End of variables declaration//GEN-END:variables

}
