/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ShoppingListView.java
 *
 * Created on 2011-mar-04, 10:19:09
 */

package imat;

/**
 *
 * @author Boel_
 */
public class ShoppingListView extends javax.swing.JPanel {

    /** Creates new form ShoppingListView */
    public ShoppingListView() {
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

        shoppingBreadcrumbPanel = new javax.swing.JPanel();
        headerPanel21 = new imat.HeaderPanel2();
        shoppingListDisplayPanel = new javax.swing.JPanel();

        setName("Form"); // NOI18N

        shoppingBreadcrumbPanel.setName("shoppingBreadcrumbPanel"); // NOI18N

        javax.swing.GroupLayout shoppingBreadcrumbPanelLayout = new javax.swing.GroupLayout(shoppingBreadcrumbPanel);
        shoppingBreadcrumbPanel.setLayout(shoppingBreadcrumbPanelLayout);
        shoppingBreadcrumbPanelLayout.setHorizontalGroup(
            shoppingBreadcrumbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        shoppingBreadcrumbPanelLayout.setVerticalGroup(
            shoppingBreadcrumbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );

        headerPanel21.setName("headerPanel21"); // NOI18N

        shoppingListDisplayPanel.setName("shoppingListDisplayPanel"); // NOI18N

        javax.swing.GroupLayout shoppingListDisplayPanelLayout = new javax.swing.GroupLayout(shoppingListDisplayPanel);
        shoppingListDisplayPanel.setLayout(shoppingListDisplayPanelLayout);
        shoppingListDisplayPanelLayout.setHorizontalGroup(
            shoppingListDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        shoppingListDisplayPanelLayout.setVerticalGroup(
            shoppingListDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(shoppingListDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shoppingBreadcrumbPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(headerPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(shoppingBreadcrumbPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(headerPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shoppingListDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imat.HeaderPanel2 headerPanel21;
    private javax.swing.JPanel shoppingBreadcrumbPanel;
    private javax.swing.JPanel shoppingListDisplayPanel;
    // End of variables declaration//GEN-END:variables

}
