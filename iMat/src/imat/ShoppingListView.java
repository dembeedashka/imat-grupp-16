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

        headerPanel21 = new imat.HeaderPanel2();
        shoppingListDisplayPanel = new javax.swing.JPanel();

        setName("Form"); // NOI18N

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
                .addComponent(shoppingListDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(headerPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(shoppingListDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public HeaderPanel2 getHeaderPanel21() {
        return headerPanel21;
    }

    public void add(){
        ShoppingListLoadingRow s = new ShoppingListLoadingRow();
        s.setRowItemTextField("fqewrqwerfqwerwq");
        shoppingListDisplayPanel.add(new ShoppingListLoadingRow());
        shoppingListDisplayPanel.revalidate();
        shoppingListDisplayPanel.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private imat.HeaderPanel2 headerPanel21;
    private javax.swing.JPanel shoppingListDisplayPanel;
    // End of variables declaration//GEN-END:variables

}
