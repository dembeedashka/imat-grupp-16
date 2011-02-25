/*
 * IMatView.java
 */

package imat;

import java.awt.CardLayout;
import java.awt.Color;
import org.jdesktop.application.Action;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * The application's main frame.
 */
public class IMatView extends FrameView {

    

    public IMatView(SingleFrameApplication app) {
        super(app);
        
        initComponents();
  
        
    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = IMatApp.getApplication().getMainFrame();
            aboutBox = new IMatAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        IMatApp.getApplication().show(aboutBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        topNavigationPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        fruitButton = new javax.swing.JButton();
        meatButton = new javax.swing.JButton();
        diaryButton = new javax.swing.JButton();
        dryButton = new javax.swing.JButton();
        drinkButton = new javax.swing.JButton();
        favButton = new javax.swing.JButton();
        bottomContentsPanel = new javax.swing.JPanel();
        navigationSearchPanel = new javax.swing.JPanel();
        shoppingListPanel = new javax.swing.JPanel();
        actionPanel = new javax.swing.JPanel();
        framePanel = new javax.swing.JPanel();
        centerStagePanel = new javax.swing.JPanel();
        startPagePanel = new javax.swing.JPanel();
        mainStartPagePanel = new javax.swing.JPanel();
        matMallPanel = new javax.swing.JPanel();
        matMall1 = new imat.matMall();
        userInfoPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cashRegisterPanel = new javax.swing.JPanel();
        cashRegister1 = new imat.cashRegister();
        helpSectionPanel = new javax.swing.JPanel();

        mainPanel.setName("mainPanel"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(IMatView.class);
        topNavigationPanel.setBackground(resourceMap.getColor("topNavigationPanel.background")); // NOI18N
        topNavigationPanel.setName("topNavigationPanel"); // NOI18N
        topNavigationPanel.setPreferredSize(new java.awt.Dimension(1273, 82));

        homeButton.setIcon(resourceMap.getIcon("homeButton.icon")); // NOI18N
        homeButton.setText(resourceMap.getString("homeButton.text")); // NOI18N
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setName("homeButton"); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        fruitButton.setIcon(resourceMap.getIcon("fruitButton.icon")); // NOI18N
        fruitButton.setText(resourceMap.getString("fruitButton.text")); // NOI18N
        fruitButton.setBorderPainted(false);
        fruitButton.setName("fruitButton"); // NOI18N
        fruitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitButtonActionPerformed(evt);
            }
        });

        meatButton.setIcon(resourceMap.getIcon("meatButton.icon")); // NOI18N
        meatButton.setText(resourceMap.getString("meatButton.text")); // NOI18N
        meatButton.setBorderPainted(false);
        meatButton.setContentAreaFilled(false);
        meatButton.setName("meatButton"); // NOI18N
        meatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatButtonActionPerformed(evt);
            }
        });

        diaryButton.setIcon(resourceMap.getIcon("diaryButton.icon")); // NOI18N
        diaryButton.setText(resourceMap.getString("diaryButton.text")); // NOI18N
        diaryButton.setBorderPainted(false);
        diaryButton.setContentAreaFilled(false);
        diaryButton.setDefaultCapable(false);
        diaryButton.setName("diaryButton"); // NOI18N

        dryButton.setIcon(resourceMap.getIcon("dryButton.icon")); // NOI18N
        dryButton.setText(resourceMap.getString("dryButton.text")); // NOI18N
        dryButton.setBorderPainted(false);
        dryButton.setContentAreaFilled(false);
        dryButton.setName("dryButton"); // NOI18N

        drinkButton.setIcon(resourceMap.getIcon("drinkButton.icon")); // NOI18N
        drinkButton.setText(resourceMap.getString("drinkButton.text")); // NOI18N
        drinkButton.setContentAreaFilled(false);
        drinkButton.setDefaultCapable(false);
        drinkButton.setName("drinkButton"); // NOI18N

        favButton.setIcon(resourceMap.getIcon("favButton.icon")); // NOI18N
        favButton.setText(resourceMap.getString("favButton.text")); // NOI18N
        favButton.setContentAreaFilled(false);
        favButton.setDefaultCapable(false);
        favButton.setName("favButton"); // NOI18N

        org.jdesktop.layout.GroupLayout topNavigationPanelLayout = new org.jdesktop.layout.GroupLayout(topNavigationPanel);
        topNavigationPanel.setLayout(topNavigationPanelLayout);
        topNavigationPanelLayout.setHorizontalGroup(
            topNavigationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(topNavigationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(homeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fruitButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 165, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(meatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 164, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(diaryButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 171, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dryButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 175, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(drinkButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 175, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(favButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 175, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        topNavigationPanelLayout.linkSize(new java.awt.Component[] {diaryButton, drinkButton, dryButton, favButton, fruitButton, homeButton, meatButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        topNavigationPanelLayout.setVerticalGroup(
            topNavigationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, topNavigationPanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(topNavigationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, favButton, 0, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, drinkButton, 0, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, dryButton, 0, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, diaryButton, 0, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, meatButton, 0, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, fruitButton, 0, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, homeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, Short.MAX_VALUE)))
        );

        topNavigationPanelLayout.linkSize(new java.awt.Component[] {diaryButton, drinkButton, dryButton, favButton, fruitButton, homeButton, meatButton}, org.jdesktop.layout.GroupLayout.VERTICAL);

        bottomContentsPanel.setName("bottomContentsPanel"); // NOI18N

        navigationSearchPanel.setName("navigationSearchPanel"); // NOI18N

        org.jdesktop.layout.GroupLayout navigationSearchPanelLayout = new org.jdesktop.layout.GroupLayout(navigationSearchPanel);
        navigationSearchPanel.setLayout(navigationSearchPanelLayout);
        navigationSearchPanelLayout.setHorizontalGroup(
            navigationSearchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1383, Short.MAX_VALUE)
        );
        navigationSearchPanelLayout.setVerticalGroup(
            navigationSearchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 40, Short.MAX_VALUE)
        );

        shoppingListPanel.setName("shoppingListPanel"); // NOI18N

        org.jdesktop.layout.GroupLayout shoppingListPanelLayout = new org.jdesktop.layout.GroupLayout(shoppingListPanel);
        shoppingListPanel.setLayout(shoppingListPanelLayout);
        shoppingListPanelLayout.setHorizontalGroup(
            shoppingListPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 222, Short.MAX_VALUE)
        );
        shoppingListPanelLayout.setVerticalGroup(
            shoppingListPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1095, Short.MAX_VALUE)
        );

        actionPanel.setName("actionPanel"); // NOI18N
        actionPanel.setPreferredSize(new java.awt.Dimension(222, 554));

        org.jdesktop.layout.GroupLayout actionPanelLayout = new org.jdesktop.layout.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 222, Short.MAX_VALUE)
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1095, Short.MAX_VALUE)
        );

        framePanel.setBackground(resourceMap.getColor("framePanel.background")); // NOI18N
        framePanel.setName("framePanel"); // NOI18N
        framePanel.setPreferredSize(new java.awt.Dimension(805, 804));

        centerStagePanel.setName("centerStagePanel"); // NOI18N
        centerStagePanel.setLayout(new java.awt.CardLayout());

        startPagePanel.setName("startPagePanel"); // NOI18N
        startPagePanel.setLayout(new java.awt.CardLayout());

        mainStartPagePanel.setName("mainStartPagePanel"); // NOI18N

        org.jdesktop.layout.GroupLayout mainStartPagePanelLayout = new org.jdesktop.layout.GroupLayout(mainStartPagePanel);
        mainStartPagePanel.setLayout(mainStartPagePanelLayout);
        mainStartPagePanelLayout.setHorizontalGroup(
            mainStartPagePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 885, Short.MAX_VALUE)
        );
        mainStartPagePanelLayout.setVerticalGroup(
            mainStartPagePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 940, Short.MAX_VALUE)
        );

        startPagePanel.add(mainStartPagePanel, "card2");

        centerStagePanel.add(startPagePanel, "card2");

        matMallPanel.setName("matMallPanel"); // NOI18N

        matMall1.setName("matMall1"); // NOI18N

        org.jdesktop.layout.GroupLayout matMallPanelLayout = new org.jdesktop.layout.GroupLayout(matMallPanel);
        matMallPanel.setLayout(matMallPanelLayout);
        matMallPanelLayout.setHorizontalGroup(
            matMallPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(matMall1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
        );
        matMallPanelLayout.setVerticalGroup(
            matMallPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(matMall1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );

        centerStagePanel.add(matMallPanel, "card2");

        userInfoPanel.setName("userInfoPanel"); // NOI18N
        userInfoPanel.setLayout(new java.awt.CardLayout());

        jPanel5.setName("jPanel5"); // NOI18N
        jPanel5.setLayout(new java.awt.CardLayout());

        jLabel8.setName("jLabel8"); // NOI18N
        jPanel5.add(jLabel8, "card5");

        jTextField1.setName("jTextField1"); // NOI18N
        jPanel5.add(jTextField1, "card6");

        jTextField2.setName("jTextField2"); // NOI18N
        jPanel5.add(jTextField2, "card7");

        jLabel9.setName("jLabel9"); // NOI18N
        jPanel5.add(jLabel9, "card8");

        jTextField3.setName("jTextField3"); // NOI18N
        jPanel5.add(jTextField3, "card9");

        jLabel10.setName("jLabel10"); // NOI18N
        jPanel5.add(jLabel10, "card10");

        jTextField4.setName("jTextField4"); // NOI18N
        jPanel5.add(jTextField4, "card11");

        jLabel11.setName("jLabel11"); // NOI18N
        jPanel5.add(jLabel11, "card12");

        jTextField5.setName("jTextField5"); // NOI18N
        jPanel5.add(jTextField5, "card13");

        jTextField6.setName("jTextField6"); // NOI18N
        jPanel5.add(jTextField6, "card14");

        jLabel12.setName("jLabel12"); // NOI18N
        jPanel5.add(jLabel12, "card15");

        jLabel13.setName("jLabel13"); // NOI18N
        jPanel5.add(jLabel13, "card16");

        jTextField7.setName("jTextField7"); // NOI18N
        jPanel5.add(jTextField7, "card17");

        jTextField8.setName("jTextField8"); // NOI18N
        jPanel5.add(jTextField8, "card18");

        jLabel14.setName("jLabel14"); // NOI18N
        jPanel5.add(jLabel14, "card19");

        jLabel15.setName("jLabel15"); // NOI18N
        jPanel5.add(jLabel15, "card20");

        jRadioButton1.setName("jRadioButton1"); // NOI18N
        jPanel5.add(jRadioButton1, "card21");

        jRadioButton2.setName("jRadioButton2"); // NOI18N
        jPanel5.add(jRadioButton2, "card22");

        jLabel16.setName("jLabel16"); // NOI18N
        jPanel5.add(jLabel16, "card23");

        jTextField9.setName("jTextField9"); // NOI18N
        jPanel5.add(jTextField9, "card24");

        jLabel18.setName("jLabel18"); // NOI18N
        jPanel5.add(jLabel18, "card26");

        jTextField10.setName("jTextField10"); // NOI18N
        jPanel5.add(jTextField10, "card27");

        jTextField11.setName("jTextField11"); // NOI18N
        jPanel5.add(jTextField11, "card28");

        jTextField12.setName("jTextField12"); // NOI18N
        jPanel5.add(jTextField12, "card29");

        jLabel19.setName("jLabel19"); // NOI18N
        jPanel5.add(jLabel19, "card30");

        jLabel20.setName("jLabel20"); // NOI18N
        jPanel5.add(jLabel20, "card31");

        jLabel21.setName("jLabel21"); // NOI18N
        jPanel5.add(jLabel21, "card32");

        jLabel22.setName("jLabel22"); // NOI18N
        jPanel5.add(jLabel22, "card33");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VISA", "Mastercard" }));
        jComboBox1.setName("jComboBox1"); // NOI18N
        jPanel5.add(jComboBox1, "card34");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mån", "jan", "feb", "mar", "apr", "maj", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }));
        jComboBox2.setName("jComboBox2"); // NOI18N
        jPanel5.add(jComboBox2, "card35");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "år", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2019", "2020" }));
        jComboBox3.setName("jComboBox3"); // NOI18N
        jPanel5.add(jComboBox3, "card36");

        jButton2.setName("jButton2"); // NOI18N
        jPanel5.add(jButton2, "card37");

        jButton3.setName("jButton3"); // NOI18N
        jPanel5.add(jButton3, "card38");

        jLabel17.setName("jLabel17"); // NOI18N
        jPanel5.add(jLabel17, "card25");

        userInfoPanel.add(jPanel5, "card2");

        centerStagePanel.add(userInfoPanel, "card3");

        cashRegisterPanel.setName("jPanel4"); // NOI18N
        cashRegisterPanel.setPreferredSize(new java.awt.Dimension(795, 940));

        cashRegister1.setName("cashRegister1"); // NOI18N

        org.jdesktop.layout.GroupLayout cashRegisterPanelLayout = new org.jdesktop.layout.GroupLayout(cashRegisterPanel);
        cashRegisterPanel.setLayout(cashRegisterPanelLayout);
        cashRegisterPanelLayout.setHorizontalGroup(
            cashRegisterPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cashRegisterPanelLayout.createSequentialGroup()
                .add(cashRegister1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cashRegisterPanelLayout.setVerticalGroup(
            cashRegisterPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cashRegister1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );

        centerStagePanel.add(cashRegisterPanel, "card4");

        helpSectionPanel.setName("helpSectionPanel"); // NOI18N

        org.jdesktop.layout.GroupLayout helpSectionPanelLayout = new org.jdesktop.layout.GroupLayout(helpSectionPanel);
        helpSectionPanel.setLayout(helpSectionPanelLayout);
        helpSectionPanelLayout.setHorizontalGroup(
            helpSectionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 885, Short.MAX_VALUE)
        );
        helpSectionPanelLayout.setVerticalGroup(
            helpSectionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 940, Short.MAX_VALUE)
        );

        centerStagePanel.add(helpSectionPanel, "card6");

        org.jdesktop.layout.GroupLayout framePanelLayout = new org.jdesktop.layout.GroupLayout(framePanel);
        framePanel.setLayout(framePanelLayout);
        framePanelLayout.setHorizontalGroup(
            framePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(framePanelLayout.createSequentialGroup()
                .add(centerStagePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        framePanelLayout.setVerticalGroup(
            framePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(framePanelLayout.createSequentialGroup()
                .add(centerStagePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout bottomContentsPanelLayout = new org.jdesktop.layout.GroupLayout(bottomContentsPanel);
        bottomContentsPanel.setLayout(bottomContentsPanelLayout);
        bottomContentsPanelLayout.setHorizontalGroup(
            bottomContentsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, bottomContentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(shoppingListPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(framePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 895, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(actionPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(navigationSearchPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bottomContentsPanelLayout.setVerticalGroup(
            bottomContentsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bottomContentsPanelLayout.createSequentialGroup()
                .add(navigationSearchPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(bottomContentsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(shoppingListPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, actionPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
                    .add(framePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1023, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(topNavigationPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1383, Short.MAX_VALUE)
            .add(bottomContentsPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .add(topNavigationPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 15, Short.MAX_VALUE)
                .add(bottomContentsPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        setComponent(mainPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        navigationSearchPanel.setBackground(Color.WHITE);
        framePanel.setBackground(Color.WHITE);
        CardLayout layout = (CardLayout)centerStagePanel.getLayout();
        layout.show(centerStagePanel, "card4");
    }//GEN-LAST:event_homeButtonActionPerformed

    private void fruitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitButtonActionPerformed
        navigationSearchPanel.setBackground(Color.GREEN);
        framePanel.setBackground(Color.GREEN);
        CardLayout layout = (CardLayout)centerStagePanel.getLayout();
        layout.show(centerStagePanel, "card2");
        matMall1.getHeaderText().setText("Välkommen!" + "\n" + "Detta är frukt & grönt sektionen!" );




        // TODO add you+ handling code here:
    }//GEN-LAST:event_fruitButtonActionPerformed

    private void meatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatButtonActionPerformed
        navigationSearchPanel.setBackground(Color.RED);
        framePanel.setBackground(Color.RED);
        CardLayout layout = (CardLayout)centerStagePanel.getLayout();
        layout.show(centerStagePanel, "card2");
        matMall1.getHeaderText().setText("Välkommen!" + "\n" + "Detta är kött & fisk sektionen!");
    }//GEN-LAST:event_meatButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JPanel bottomContentsPanel;
    private imat.cashRegister cashRegister1;
    private javax.swing.JPanel cashRegisterPanel;
    private javax.swing.JPanel centerStagePanel;
    private javax.swing.JButton diaryButton;
    private javax.swing.JButton drinkButton;
    private javax.swing.JButton dryButton;
    private javax.swing.JButton favButton;
    private javax.swing.JPanel framePanel;
    private javax.swing.JButton fruitButton;
    private javax.swing.JPanel helpSectionPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainStartPagePanel;
    private imat.matMall matMall1;
    private javax.swing.JPanel matMallPanel;
    private javax.swing.JButton meatButton;
    private javax.swing.JPanel navigationSearchPanel;
    private javax.swing.JPanel shoppingListPanel;
    private javax.swing.JPanel startPagePanel;
    private javax.swing.JPanel topNavigationPanel;
    private javax.swing.JPanel userInfoPanel;
    // End of variables declaration//GEN-END:variables

    private JDialog aboutBox;
}
