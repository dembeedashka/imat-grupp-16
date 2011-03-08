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

import se.chalmers.ait.dat215.project.CreditCard;
import se.chalmers.ait.dat215.project.Customer;
import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 *
 * @author David
 */
public class cashRegister extends javax.swing.JPanel {

    private Customer customer = IMatDataHandler.getInstance().getCustomer();
    private CreditCard card   = IMatDataHandler.getInstance().getCreditCard();

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        cashBreadcrumb = new javax.swing.JPanel();
        cashRegisterPanel1 = new javax.swing.JPanel();
        cashBasketNLabel = new javax.swing.JLabel();
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
        cashYear = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        cashPaymentLabel = new javax.swing.JLabel();
        cashPaymentPanel = new javax.swing.JPanel();
        cashInvoiceRButton = new javax.swing.JRadioButton();
        cashDebitCardRButton = new javax.swing.JRadioButton();
        cashDebitCardPanel = new javax.swing.JPanel();
        cashCardFNameLabel = new javax.swing.JLabel();
        cashCardLNameTField = new javax.swing.JTextField();
        cashCardtypeCBox = new javax.swing.JComboBox();
        cashCvcTField = new javax.swing.JTextField();
        cashCvcLabel = new javax.swing.JLabel();
        cashCardLNameLabel = new javax.swing.JLabel();
        cashMonthCBox = new javax.swing.JComboBox();
        cashCardnumberTfield = new javax.swing.JTextField();
        cashCardnumberLabel = new javax.swing.JLabel();
        cashCardtypeLabel = new javax.swing.JLabel();
        cashValidityLabel = new javax.swing.JLabel();
        cashDebitSlash = new javax.swing.JLabel();
        cashYearCBox = new javax.swing.JComboBox();
        cashCardFNameTField = new javax.swing.JTextField();
        cashCompletepurchaseButton = new javax.swing.JButton();
        shoppingCartList1 = new imat.shoppingCartList();
        matMallHeaderPanel = new imat.HeaderPanel2();

        setName("Form"); // NOI18N

        cashBreadcrumb.setName("cashBreadcrumb"); // NOI18N

        cashRegisterPanel1.setName("cashRegisterPanel1"); // NOI18N
        cashRegisterPanel1.setPreferredSize(new java.awt.Dimension(795, 1200));
        cashRegisterPanel1.setVerifyInputWhenFocusTarget(false);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(cashRegister.class);
        cashBasketNLabel.setText(resourceMap.getString("cashBasketNLabel.text")); // NOI18N
        cashBasketNLabel.setName("cashBasketNLabel"); // NOI18N

        cashUserInfoLabel.setText(resourceMap.getString("cashUserInfoLabel.text")); // NOI18N
        cashUserInfoLabel.setName("cashUserInfoLabel"); // NOI18N

        cashUserInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cashUserInfoPanel.setName("cashUserInfoPanel"); // NOI18N

        cashFNameLabel.setText(resourceMap.getString("cashFNameLabel.text")); // NOI18N

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

        cashDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cashDay.setName("cashDay"); // NOI18N

        cashSlash.setText(resourceMap.getString("cashSlash.text")); // NOI18N
        cashSlash.setName("cashSlash"); // NOI18N

        cashMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "070", "8", "09", "10", "11", "12" }));
        cashMonth.setName("cashMonth"); // NOI18N

        cashYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2011", "2012", "2013" }));
        cashYear.setName("cashYear"); // NOI18N

        javax.swing.GroupLayout cashUserInfoPanelLayout = new javax.swing.GroupLayout(cashUserInfoPanel);
        cashUserInfoPanel.setLayout(cashUserInfoPanelLayout);
        cashUserInfoPanelLayout.setHorizontalGroup(
            cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashPNumberLabel)
                    .addComponent(cashPhoneNumberLabel)
                    .addComponent(cashLNameLabel)
                    .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cashLNameTF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cashFNameTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                    .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cashPhoneNumberTF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cashPNumberTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                    .addComponent(cashFNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(258, 258, 258)
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addComponent(cashDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashSlash)
                        .addGap(4, 4, 4)
                        .addComponent(cashMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(cashYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cashPlaceLabel)
                    .addComponent(cashStAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashPCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashStAddressTF)
                    .addComponent(cashPcodeTF)
                    .addComponent(cashDeliveryDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashPlaceTF))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        cashUserInfoPanelLayout.setVerticalGroup(
            cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashStAddressLabel)
                    .addComponent(cashFNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashStAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashFNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashPCodeLabel)
                    .addComponent(cashLNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashPcodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashLNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addComponent(cashPlaceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashPlaceTF))
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addComponent(cashPNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashPNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(cashYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashSaveUserInfo(evt);
            }
        });

        cashPaymentLabel.setText(resourceMap.getString("cashPaymentLabel.text")); // NOI18N
        cashPaymentLabel.setName("cashPaymentLabel"); // NOI18N

        cashPaymentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cashPaymentPanel.setName("cashPaymentPanel"); // NOI18N

        buttonGroup1.add(cashInvoiceRButton);
        cashInvoiceRButton.setText(resourceMap.getString("cashInvoiceRButton.text")); // NOI18N
        cashInvoiceRButton.setName("cashInvoiceRButton"); // NOI18N
        cashInvoiceRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dontShowDebitCardButton(evt);
            }
        });

        buttonGroup1.add(cashDebitCardRButton);
        cashDebitCardRButton.setText(resourceMap.getString("cashDebitCardRButton.text")); // NOI18N
        cashDebitCardRButton.setName("cashDebitCardRButton"); // NOI18N
        cashDebitCardRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDebitCardButton(evt);
            }
        });

        cashDebitCardPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cashDebitCardPanel.setName("cashDebitCardPanel"); // NOI18N

        cashCardFNameLabel.setText(resourceMap.getString("cashCardFNameLabel.text")); // NOI18N
        cashCardFNameLabel.setName("cashCardFNameLabel"); // NOI18N

        cashCardLNameTField.setName("cashCardLNameTField"); // NOI18N

        cashCardtypeCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VISA", "Mastercard" }));
        cashCardtypeCBox.setName("cashCardtypeCBox"); // NOI18N

        cashCvcTField.setName("cashCvcTField"); // NOI18N

        cashCvcLabel.setText(resourceMap.getString("cashCvcLabel.text")); // NOI18N
        cashCvcLabel.setName("cashCvcLabel"); // NOI18N

        cashCardLNameLabel.setText(resourceMap.getString("cashCardLNameLabel.text")); // NOI18N
        cashCardLNameLabel.setName("cashCardLNameLabel"); // NOI18N

        cashMonthCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cashMonthCBox.setName("cashMonthCBox"); // NOI18N

        cashCardnumberTfield.setName("cashCardnumberTfield"); // NOI18N

        cashCardnumberLabel.setText(resourceMap.getString("cashCardnumberLabel.text")); // NOI18N
        cashCardnumberLabel.setName("cashCardnumberLabel"); // NOI18N

        cashCardtypeLabel.setText(resourceMap.getString("cashCardtypeLabel.text")); // NOI18N
        cashCardtypeLabel.setName("cashCardtypeLabel"); // NOI18N

        cashValidityLabel.setText(resourceMap.getString("cashValidityLabel.text")); // NOI18N
        cashValidityLabel.setName("cashValidityLabel"); // NOI18N

        cashDebitSlash.setText(resourceMap.getString("cashDebitSlash.text")); // NOI18N
        cashDebitSlash.setName("cashDebitSlash"); // NOI18N

        cashYearCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        cashYearCBox.setName("cashYearCBox"); // NOI18N

        cashCardFNameTField.setName("cashCardFNameTField"); // NOI18N

        javax.swing.GroupLayout cashDebitCardPanelLayout = new javax.swing.GroupLayout(cashDebitCardPanel);
        cashDebitCardPanel.setLayout(cashDebitCardPanelLayout);
        cashDebitCardPanelLayout.setHorizontalGroup(
            cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(cashCardFNameLabel))
                    .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cashCardnumberTfield, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(cashCardnumberLabel)))
                    .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cashCardLNameTField)
                            .addComponent(cashCardLNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cashCardFNameTField, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                .addGap(290, 290, 290)
                .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashCardtypeLabel)
                    .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                        .addComponent(cashMonthCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(cashDebitSlash)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashYearCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cashValidityLabel)
                    .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cashCvcTField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cashCvcLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cashCardtypeCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(185, 185, 185))
        );
        cashDebitCardPanelLayout.setVerticalGroup(
            cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashCardFNameLabel)
                    .addComponent(cashCardtypeLabel))
                .addGap(11, 11, 11)
                .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashCardFNameTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashCardtypeCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashCardLNameLabel)
                    .addComponent(cashValidityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cashMonthCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cashDebitSlash)
                        .addComponent(cashYearCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cashCardLNameTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                        .addComponent(cashCvcLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashCvcTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                        .addComponent(cashCardnumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashCardnumberTfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
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
                        .addComponent(cashDebitCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        cashPaymentPanelLayout.setVerticalGroup(
            cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashPaymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashInvoiceRButton)
                    .addComponent(cashDebitCardRButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cashDebitCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cashCompletepurchaseButton.setText(resourceMap.getString("cashCompletepurchaseButton.text")); // NOI18N
        cashCompletepurchaseButton.setName("cashCompletepurchaseButton"); // NOI18N
        cashCompletepurchaseButton.setPreferredSize(new java.awt.Dimension(115, 29));

        shoppingCartList1.setName("shoppingCartList1"); // NOI18N

        matMallHeaderPanel.setName("matMallHeaderPanel"); // NOI18N

        javax.swing.GroupLayout cashRegisterPanel1Layout = new javax.swing.GroupLayout(cashRegisterPanel1);
        cashRegisterPanel1.setLayout(cashRegisterPanel1Layout);
        cashRegisterPanel1Layout.setHorizontalGroup(
            cashRegisterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashRegisterPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cashBasketNLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(682, Short.MAX_VALUE))
            .addGroup(cashRegisterPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(cashRegisterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shoppingCartList1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matMallHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(cashRegisterPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cashUserInfoLabel)
                .addContainerGap(590, Short.MAX_VALUE))
            .addGroup(cashRegisterPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cashUserInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(cashRegisterPanel1Layout.createSequentialGroup()
                .addComponent(cashPaymentLabel)
                .addContainerGap(718, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashRegisterPanel1Layout.createSequentialGroup()
                .addGroup(cashRegisterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cashRegisterPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cashCompletepurchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cashRegisterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cashPaymentPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cashRegisterPanel1Layout.createSequentialGroup()
                            .addContainerGap(601, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        cashRegisterPanel1Layout.setVerticalGroup(
            cashRegisterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashRegisterPanel1Layout.createSequentialGroup()
                .addComponent(matMallHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashBasketNLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shoppingCartList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cashUserInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashUserInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(cashPaymentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashPaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cashCompletepurchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );

        javax.swing.GroupLayout cashBreadcrumbLayout = new javax.swing.GroupLayout(cashBreadcrumb);
        cashBreadcrumb.setLayout(cashBreadcrumbLayout);
        cashBreadcrumbLayout.setHorizontalGroup(
            cashBreadcrumbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashBreadcrumbLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cashRegisterPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cashBreadcrumbLayout.setVerticalGroup(
            cashBreadcrumbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashBreadcrumbLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cashRegisterPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cashBreadcrumb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cashBreadcrumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showDebitCardButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDebitCardButton
        cashDebitCardPanel.setVisible(true);
    }//GEN-LAST:event_showDebitCardButton

    private void dontShowDebitCardButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dontShowDebitCardButton
        cashDebitCardPanel.setVisible(false);
    }//GEN-LAST:event_dontShowDebitCardButton

    private void cashSaveUserInfo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashSaveUserInfo
        customer.setAddress(cashStAddressTF.toString());
        customer.setFirstName(cashFNameTF.toString());
        customer.setLastName(cashLNameTF.toString());
        customer.setPhoneNumber(cashPhoneNumberTF.toString());
        customer.setPostCode(cashPcodeTF.toString());
        customer.setPostAddress(cashPlaceTF.toString());
        card.setCardNumber(cashCardnumberTfield.toString());
        card.setCardType(cashCardtypeCBox.toString());
        card.setHoldersName(cashCardFNameTField.toString()+" "+cashCardLNameTField.toString());
        card.setValidMonth(Integer.parseInt(cashMonthCBox.toString()));
        card.setValidYear(Integer.parseInt(cashYearCBox.toString()));

        try {
            card.setVerificationCode(Integer.parseInt(cashCvcTField.toString()));
        } catch(NumberFormatException e) {
            // TODO Add same page error message
        }
}//GEN-LAST:event_cashSaveUserInfo


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cashBasketNLabel;
    private javax.swing.JPanel cashBreadcrumb;
    private javax.swing.JLabel cashCardFNameLabel;
    private javax.swing.JTextField cashCardFNameTField;
    private javax.swing.JLabel cashCardLNameLabel;
    private javax.swing.JTextField cashCardLNameTField;
    private javax.swing.JLabel cashCardnumberLabel;
    private javax.swing.JTextField cashCardnumberTfield;
    private javax.swing.JComboBox cashCardtypeCBox;
    private javax.swing.JLabel cashCardtypeLabel;
    private javax.swing.JButton cashCompletepurchaseButton;
    private javax.swing.JLabel cashCvcLabel;
    private javax.swing.JTextField cashCvcTField;
    private javax.swing.JComboBox cashDay;
    private javax.swing.JPanel cashDebitCardPanel;
    private javax.swing.JRadioButton cashDebitCardRButton;
    private javax.swing.JLabel cashDebitSlash;
    private javax.swing.JLabel cashDeliveryDateLabel;
    private javax.swing.JLabel cashFNameLabel;
    private javax.swing.JTextField cashFNameTF;
    private javax.swing.JRadioButton cashInvoiceRButton;
    private javax.swing.JLabel cashLNameLabel;
    private javax.swing.JTextField cashLNameTF;
    private javax.swing.JComboBox cashMonth;
    private javax.swing.JComboBox cashMonthCBox;
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
    private javax.swing.JLabel cashSlash;
    private javax.swing.JLabel cashStAddressLabel;
    private javax.swing.JTextField cashStAddressTF;
    private javax.swing.JLabel cashUserInfoLabel;
    private javax.swing.JPanel cashUserInfoPanel;
    private javax.swing.JLabel cashValidityLabel;
    private javax.swing.JComboBox cashYear;
    private javax.swing.JComboBox cashYearCBox;
    private javax.swing.JButton jButton4;
    private imat.HeaderPanel2 matMallHeaderPanel;
    private imat.shoppingCartList shoppingCartList1;
    // End of variables declaration//GEN-END:variables

}
