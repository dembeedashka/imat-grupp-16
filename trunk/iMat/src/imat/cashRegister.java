/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * cashRegister.java
 *
 * Created on 2011-feb-25, 12:36:03
 */

package imat;

/**
 *
 * @author David
 */
public class cashRegister extends javax.swing.JPanel {

    /** Creates new form cashRegister */
    public cashRegister() {
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

        cashRegisterPanel1 = new javax.swing.JPanel();
        cashInfoCardPanel = new javax.swing.JPanel();
        cashHeaderPanel = new imat.HeaderPanel2();
        cashBasketNLabel = new javax.swing.JLabel();
        cashBasketPanel = new javax.swing.JPanel();
        cashUserInfoLabel = new javax.swing.JLabel();
        cashUserInfoPanel = new javax.swing.JPanel();
        cashFNameLabel = new javax.swing.JLabel();
        cashFNameTF = new javax.swing.JTextField();
        cashLNameLabel = new javax.swing.JLabel();
        cashLNameTF = new javax.swing.JTextField();
        cashStAddressLabel = new javax.swing.JLabel();
        cashStAddressTF = new javax.swing.JTextField();
        cashPlaceLabel = new javax.swing.JLabel();
        cashPlaceTF = new javax.swing.JTextField();
        cashPNumberLabel = new javax.swing.JLabel();
        cashPNumberTF = new javax.swing.JTextField();
        cashPCodeLabel = new javax.swing.JLabel();
        cashPcodeTF = new javax.swing.JTextField();
        cashPhoneNumberLabel = new javax.swing.JLabel();
        cashPhoneNumberTF = new javax.swing.JTextField();
        cashDeliveryDateLabel = new javax.swing.JLabel();
        cashDay = new javax.swing.JComboBox();
        cashSlash = new javax.swing.JLabel();
        cashMonth = new javax.swing.JComboBox();
        cashDivide = new javax.swing.JLabel();
        cashYear = new javax.swing.JComboBox();
        cashSecurityNumberTF = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        cashPaymentLabel = new javax.swing.JLabel();
        cashPaymentPanel = new javax.swing.JPanel();
        cashInvoiceRButton = new javax.swing.JRadioButton();
        cashDebitCardRButton = new javax.swing.JRadioButton();
        cashDebitCardPanel = new javax.swing.JPanel();
        cashDebitCardPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setName("Form"); // NOI18N

        cashRegisterPanel1.setName("cashRegisterPanel1"); // NOI18N
        cashRegisterPanel1.setPreferredSize(new java.awt.Dimension(795, 918));
        cashRegisterPanel1.setVerifyInputWhenFocusTarget(false);

        cashInfoCardPanel.setName("cashInfoCardPanel"); // NOI18N

        cashHeaderPanel.setName("cashHeaderPanel"); // NOI18N

        javax.swing.GroupLayout cashInfoCardPanelLayout = new javax.swing.GroupLayout(cashInfoCardPanel);
        cashInfoCardPanel.setLayout(cashInfoCardPanelLayout);
        cashInfoCardPanelLayout.setHorizontalGroup(
            cashInfoCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashInfoCardPanelLayout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(cashHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        cashInfoCardPanelLayout.setVerticalGroup(
            cashInfoCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashInfoCardPanelLayout.createSequentialGroup()
                .addComponent(cashHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(cashRegister.class);
        cashBasketNLabel.setText(resourceMap.getString("cashBasketNLabel.text")); // NOI18N
        cashBasketNLabel.setName("cashBasketNLabel"); // NOI18N

        cashBasketPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cashBasketPanel.setName("cashBasketPanel"); // NOI18N

        javax.swing.GroupLayout cashBasketPanelLayout = new javax.swing.GroupLayout(cashBasketPanel);
        cashBasketPanel.setLayout(cashBasketPanelLayout);
        cashBasketPanelLayout.setHorizontalGroup(
            cashBasketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        cashBasketPanelLayout.setVerticalGroup(
            cashBasketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        cashUserInfoLabel.setText(resourceMap.getString("cashUserInfoLabel.text")); // NOI18N
        cashUserInfoLabel.setName("cashUserInfoLabel"); // NOI18N

        cashUserInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cashUserInfoPanel.setName("cashUserInfoPanel"); // NOI18N

        cashFNameLabel.setText(resourceMap.getString("cashFNameLabel.text")); // NOI18N
        cashFNameLabel.setName("cashFNameLabel"); // NOI18N

        cashFNameTF.setName("cashFNameTF"); // NOI18N

        cashLNameLabel.setText(resourceMap.getString("cashLNameLabel.text")); // NOI18N
        cashLNameLabel.setName("cashLNameLabel"); // NOI18N

        cashLNameTF.setName("cashLNameTF"); // NOI18N

        cashStAddressLabel.setText(resourceMap.getString("cashStAddressLabel.text")); // NOI18N
        cashStAddressLabel.setName("cashStAddressLabel"); // NOI18N

        cashStAddressTF.setName("cashStAddressTF"); // NOI18N

        cashPlaceLabel.setText(resourceMap.getString("cashPlaceLabel.text")); // NOI18N
        cashPlaceLabel.setName("cashPlaceLabel"); // NOI18N

        cashPlaceTF.setName("cashPlaceTF"); // NOI18N

        cashPNumberLabel.setText(resourceMap.getString("cashPNumberLabel.text")); // NOI18N
        cashPNumberLabel.setName("cashPNumberLabel"); // NOI18N

        cashPNumberTF.setName("cashPNumberTF"); // NOI18N

        cashPCodeLabel.setText(resourceMap.getString("cashPCodeLabel.text")); // NOI18N
        cashPCodeLabel.setName("cashPCodeLabel"); // NOI18N

        cashPcodeTF.setName("cashPcodeTF"); // NOI18N

        cashPhoneNumberLabel.setText(resourceMap.getString("cashPhoneNumberLabel.text")); // NOI18N
        cashPhoneNumberLabel.setName("cashPhoneNumberLabel"); // NOI18N

        cashPhoneNumberTF.setName("cashPhoneNumberTF"); // NOI18N

        cashDeliveryDateLabel.setText(resourceMap.getString("cashDeliveryDateLabel.text")); // NOI18N
        cashDeliveryDateLabel.setName("cashDeliveryDateLabel"); // NOI18N

        cashDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cashDay.setName("cashDay"); // NOI18N

        cashSlash.setText(resourceMap.getString("cashSlash.text")); // NOI18N
        cashSlash.setName("cashSlash"); // NOI18N

        cashMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cashMonth.setName("cashMonth"); // NOI18N

        cashDivide.setText(resourceMap.getString("cashDivide.text")); // NOI18N
        cashDivide.setName("cashDivide"); // NOI18N

        cashYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cashYear.setName("cashYear"); // NOI18N

        cashSecurityNumberTF.setName("cashSecurityNumberTF"); // NOI18N

        javax.swing.GroupLayout cashUserInfoPanelLayout = new javax.swing.GroupLayout(cashUserInfoPanel);
        cashUserInfoPanel.setLayout(cashUserInfoPanelLayout);
        cashUserInfoPanelLayout.setHorizontalGroup(
            cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashFNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashLNameLabel)
                    .addComponent(cashPNumberLabel)
                    .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cashLNameTF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cashFNameTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                    .addComponent(cashPhoneNumberLabel)
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cashPNumberTF)
                            .addComponent(cashPhoneNumberTF, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashSecurityNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(258, 258, 258)
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addComponent(cashDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashSlash)
                        .addGap(4, 4, 4)
                        .addComponent(cashMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashDivide)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cashPlaceLabel)
                    .addComponent(cashStAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashPCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashStAddressTF)
                    .addComponent(cashPcodeTF)
                    .addComponent(cashDeliveryDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashPlaceTF))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        cashUserInfoPanelLayout.setVerticalGroup(
            cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addComponent(cashStAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashStAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cashPCodeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashPcodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addComponent(cashFNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashFNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cashLNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashLNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addComponent(cashPlaceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashPlaceTF))
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addComponent(cashPNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cashPNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cashSecurityNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addComponent(cashPhoneNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashPhoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addComponent(cashDeliveryDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cashDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cashSlash)
                            .addComponent(cashMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cashDivide)
                            .addComponent(cashYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N

        cashPaymentLabel.setText(resourceMap.getString("cashPaymentLabel.text")); // NOI18N
        cashPaymentLabel.setName("cashPaymentLabel"); // NOI18N

        cashPaymentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cashPaymentPanel.setName("cashPaymentPanel"); // NOI18N

        cashInvoiceRButton.setText(resourceMap.getString("cashInvoiceRButton.text")); // NOI18N
        cashInvoiceRButton.setName("cashInvoiceRButton"); // NOI18N

        cashDebitCardRButton.setText(resourceMap.getString("cashDebitCardRButton.text")); // NOI18N
        cashDebitCardRButton.setName("cashDebitCardRButton"); // NOI18N

        cashDebitCardPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cashDebitCardPanel.setName("cashDebitCardPanel"); // NOI18N

        cashDebitCardPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cashDebitCardPanel1.setName("cashDebitCardPanel1"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jTextField1.setName("jTextField1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jTextField2.setName("jTextField2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jTextField3.setName("jTextField3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setName("jComboBox1"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setName("jComboBox2"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jTextField4.setName("jTextField4"); // NOI18N

        javax.swing.GroupLayout cashDebitCardPanel1Layout = new javax.swing.GroupLayout(cashDebitCardPanel1);
        cashDebitCardPanel1.setLayout(cashDebitCardPanel1Layout);
        cashDebitCardPanel1Layout.setHorizontalGroup(
            cashDebitCardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashDebitCardPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cashDebitCardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashDebitCardPanel1Layout.createSequentialGroup()
                        .addGroup(cashDebitCardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                        .addGroup(cashDebitCardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(cashDebitCardPanel1Layout.createSequentialGroup()
                                .addGroup(cashDebitCardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(198, 198, 198))
                    .addGroup(cashDebitCardPanel1Layout.createSequentialGroup()
                        .addGroup(cashDebitCardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(579, Short.MAX_VALUE))))
        );
        cashDebitCardPanel1Layout.setVerticalGroup(
            cashDebitCardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashDebitCardPanel1Layout.createSequentialGroup()
                .addGroup(cashDebitCardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashDebitCardPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cashDebitCardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cashDebitCardPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout cashDebitCardPanelLayout = new javax.swing.GroupLayout(cashDebitCardPanel);
        cashDebitCardPanel.setLayout(cashDebitCardPanelLayout);
        cashDebitCardPanelLayout.setHorizontalGroup(
            cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                .addComponent(cashDebitCardPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        cashDebitCardPanelLayout.setVerticalGroup(
            cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                .addComponent(cashDebitCardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cashPaymentPanelLayout = new javax.swing.GroupLayout(cashPaymentPanel);
        cashPaymentPanel.setLayout(cashPaymentPanelLayout);
        cashPaymentPanelLayout.setHorizontalGroup(
            cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashPaymentPanelLayout.createSequentialGroup()
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashPaymentPanelLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(cashInvoiceRButton)
                        .addGap(35, 35, 35)
                        .addComponent(cashDebitCardRButton))
                    .addGroup(cashPaymentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cashDebitCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cashPaymentPanelLayout.setVerticalGroup(
            cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashPaymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashInvoiceRButton)
                    .addComponent(cashDebitCardRButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashDebitCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cashRegisterPanel1Layout = new javax.swing.GroupLayout(cashRegisterPanel1);
        cashRegisterPanel1.setLayout(cashRegisterPanel1Layout);
        cashRegisterPanel1Layout.setHorizontalGroup(
            cashRegisterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashRegisterPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cashRegisterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cashPaymentPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashUserInfoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashBasketPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashInfoCardPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashUserInfoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashPaymentLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashBasketNLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        cashRegisterPanel1Layout.setVerticalGroup(
            cashRegisterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashRegisterPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cashInfoCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashBasketNLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashBasketPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashUserInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashUserInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashPaymentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashPaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cashRegisterPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cashRegisterPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cashBasketNLabel;
    private javax.swing.JPanel cashBasketPanel;
    private javax.swing.JComboBox cashDay;
    private javax.swing.JPanel cashDebitCardPanel;
    private javax.swing.JPanel cashDebitCardPanel1;
    private javax.swing.JRadioButton cashDebitCardRButton;
    private javax.swing.JLabel cashDeliveryDateLabel;
    private javax.swing.JLabel cashDivide;
    private javax.swing.JLabel cashFNameLabel;
    private javax.swing.JTextField cashFNameTF;
    private imat.HeaderPanel2 cashHeaderPanel;
    private javax.swing.JPanel cashInfoCardPanel;
    private javax.swing.JRadioButton cashInvoiceRButton;
    private javax.swing.JLabel cashLNameLabel;
    private javax.swing.JTextField cashLNameTF;
    private javax.swing.JComboBox cashMonth;
    private javax.swing.JLabel cashPCodeLabel;
    private javax.swing.JLabel cashPNumberLabel;
    private javax.swing.JTextField cashPNumberTF;
    private javax.swing.JLabel cashPaymentLabel;
    private javax.swing.JPanel cashPaymentPanel;
    private javax.swing.JTextField cashPcodeTF;
    private javax.swing.JLabel cashPhoneNumberLabel;
    private javax.swing.JTextField cashPhoneNumberTF;
    private javax.swing.JLabel cashPlaceLabel;
    private javax.swing.JTextField cashPlaceTF;
    private javax.swing.JPanel cashRegisterPanel1;
    private javax.swing.JTextField cashSecurityNumberTF;
    private javax.swing.JLabel cashSlash;
    private javax.swing.JLabel cashStAddressLabel;
    private javax.swing.JTextField cashStAddressTF;
    private javax.swing.JLabel cashUserInfoLabel;
    private javax.swing.JPanel cashUserInfoPanel;
    private javax.swing.JComboBox cashYear;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
