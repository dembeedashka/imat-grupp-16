/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SearchView.java
 *
 * Created on 2011-mar-04, 10:27:16
 */

package imat;

import java.awt.Component;
import javax.swing.JLabel;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Boel_
 */
public class SearchView extends javax.swing.JPanel {

    /** Creates new form SearchView */
    public SearchView() {
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

        searchBreadcrumbPanel = new javax.swing.JPanel();
        searchHeaderPanel = new imat.HeaderPanel2();
        searchDisplayPanel = new javax.swing.JPanel();
        resultsPanel = new javax.swing.JPanel();

        setName("Form"); // NOI18N

        searchBreadcrumbPanel.setName("searchBreadcrumbPanel"); // NOI18N

        javax.swing.GroupLayout searchBreadcrumbPanelLayout = new javax.swing.GroupLayout(searchBreadcrumbPanel);
        searchBreadcrumbPanel.setLayout(searchBreadcrumbPanelLayout);
        searchBreadcrumbPanelLayout.setHorizontalGroup(
            searchBreadcrumbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );
        searchBreadcrumbPanelLayout.setVerticalGroup(
            searchBreadcrumbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        searchHeaderPanel.setName("searchHeaderPanel"); // NOI18N

        searchDisplayPanel.setName("searchDisplayPanel"); // NOI18N

        javax.swing.GroupLayout searchDisplayPanelLayout = new javax.swing.GroupLayout(searchDisplayPanel);
        searchDisplayPanel.setLayout(searchDisplayPanelLayout);
        searchDisplayPanelLayout.setHorizontalGroup(
            searchDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        searchDisplayPanelLayout.setVerticalGroup(
            searchDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        resultsPanel.setName("resultsPanel"); // NOI18N

        javax.swing.GroupLayout resultsPanelLayout = new javax.swing.GroupLayout(resultsPanel);
        resultsPanel.setLayout(resultsPanelLayout);
        resultsPanelLayout.setHorizontalGroup(
            resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );
        resultsPanelLayout.setVerticalGroup(
            resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resultsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(426, 426, 426)
                                .addComponent(searchBreadcrumbPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(searchDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(136, 136, 136))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                        .addGap(865, 865, 865))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBreadcrumbPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(329, 329, 329)
                        .addComponent(searchDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void addProduct(Product p){
        itemPanel pa = new itemPanel();
        pa.setProductName(p.getName());
        resultsPanel.add(pa);
        resultsPanel.revalidate();
        resultsPanel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel resultsPanel;
    private javax.swing.JPanel searchBreadcrumbPanel;
    private javax.swing.JPanel searchDisplayPanel;
    private imat.HeaderPanel2 searchHeaderPanel;
    // End of variables declaration//GEN-END:variables

}
