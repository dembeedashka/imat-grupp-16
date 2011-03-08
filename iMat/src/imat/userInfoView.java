/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * userInfoView.java
 *
 * Created on 2011-feb-25, 11:44:46
 */

package imat;

import se.chalmers.ait.dat215.project.CreditCard;
import se.chalmers.ait.dat215.project.Customer;
import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 *
 * @author Boel_
 */
public class userInfoView extends javax.swing.JPanel {

    private Customer customer = IMatDataHandler.getInstance().getCustomer();
    private CreditCard card   = IMatDataHandler.getInstance().getCreditCard();
    /** Creates new form userInfoView */
    public userInfoView() {
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

        uiBreadcrumbsPanel = new javax.swing.JPanel();
        uiFirstNameLabel = new javax.swing.JLabel();
        uiFirstNameTextField = new javax.swing.JTextField();
        uiLastNameLabel = new javax.swing.JLabel();
        uiLastNameTextField = new javax.swing.JTextField();
        uiAddressTextField = new javax.swing.JTextField();
        uiAddressLabel = new javax.swing.JLabel();
        uiCoLabel = new javax.swing.JLabel();
        uiZipCodeLabel = new javax.swing.JLabel();
        uiCityLabel = new javax.swing.JLabel();
        uiCoTextField = new javax.swing.JTextField();
        uiZipCodeTextField = new javax.swing.JTextField();
        uiCityTextField = new javax.swing.JTextField();
        uiPhoneNumberLabel = new javax.swing.JLabel();
        uiIdLabel = new javax.swing.JLabel();
        uiPhoneNumberTextField = new javax.swing.JTextField();
        uiIdTextField = new javax.swing.JTextField();
        uiPaymentOptionLabel = new javax.swing.JLabel();
        invoiceRadioButton = new javax.swing.JRadioButton();
        creditCardRadioButton = new javax.swing.JRadioButton();
        uiChFirstNameLabel = new javax.swing.JLabel();
        uiChFirstNameTextField = new javax.swing.JTextField();
        uiChLastNameLabel = new javax.swing.JLabel();
        uiChLastNameTextField = new javax.swing.JTextField();
        uiCardNumerLabel = new javax.swing.JLabel();
        uiCvvCodeLabel = new javax.swing.JLabel();
        uiCardTypeLabel = new javax.swing.JLabel();
        uiValidThroughLabel = new javax.swing.JLabel();
        uiCardNumerTextField = new javax.swing.JTextField();
        uiCvvCodeTextField = new javax.swing.JTextField();
        uiCardTypeComboBox = new javax.swing.JComboBox();
        uiMonthComboBox = new javax.swing.JComboBox();
        uiYearComboBox = new javax.swing.JComboBox();
        uiIdHelpTextLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        uiHeaderPanel = new imat.HeaderPanel2();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setName("Form"); // NOI18N

        uiBreadcrumbsPanel.setName("uiBreadcrumbsPanel"); // NOI18N
        uiBreadcrumbsPanel.setPreferredSize(new java.awt.Dimension(800, 57));

        javax.swing.GroupLayout uiBreadcrumbsPanelLayout = new javax.swing.GroupLayout(uiBreadcrumbsPanel);
        uiBreadcrumbsPanel.setLayout(uiBreadcrumbsPanelLayout);
        uiBreadcrumbsPanelLayout.setHorizontalGroup(
            uiBreadcrumbsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        uiBreadcrumbsPanelLayout.setVerticalGroup(
            uiBreadcrumbsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(userInfoView.class);
        uiFirstNameLabel.setFont(resourceMap.getFont("uiFirstNameLabel.font")); // NOI18N
        uiFirstNameLabel.setText(resourceMap.getString("uiFirstNameLabel.text")); // NOI18N
        uiFirstNameLabel.setName("uiFirstNameLabel"); // NOI18N

        uiFirstNameTextField.setText(resourceMap.getString("uiFirstNameTextField.text")); // NOI18N
        uiFirstNameTextField.setName("uiFirstNameTextField"); // NOI18N

        uiLastNameLabel.setFont(resourceMap.getFont("uiLastNameLabel.font")); // NOI18N
        uiLastNameLabel.setText(resourceMap.getString("uiLastNameLabel.text")); // NOI18N
        uiLastNameLabel.setName("uiLastNameLabel"); // NOI18N

        uiLastNameTextField.setText(resourceMap.getString("uiLastNameTextField.text")); // NOI18N
        uiLastNameTextField.setName("uiLastNameTextField"); // NOI18N

        uiAddressTextField.setText(resourceMap.getString("uiAddressTextField.text")); // NOI18N
        uiAddressTextField.setName("uiAddressTextField"); // NOI18N

        uiAddressLabel.setFont(resourceMap.getFont("uiAddressLabel.font")); // NOI18N
        uiAddressLabel.setText(resourceMap.getString("uiAddressLabel.text")); // NOI18N
        uiAddressLabel.setName("uiAddressLabel"); // NOI18N

        uiCoLabel.setFont(resourceMap.getFont("uiCoLabel.font")); // NOI18N
        uiCoLabel.setText(resourceMap.getString("uiCoLabel.text")); // NOI18N
        uiCoLabel.setName("uiCoLabel"); // NOI18N

        uiZipCodeLabel.setFont(resourceMap.getFont("uiZipCodeLabel.font")); // NOI18N
        uiZipCodeLabel.setText(resourceMap.getString("uiZipCodeLabel.text")); // NOI18N
        uiZipCodeLabel.setName("uiZipCodeLabel"); // NOI18N

        uiCityLabel.setFont(resourceMap.getFont("uiCityLabel.font")); // NOI18N
        uiCityLabel.setText(resourceMap.getString("uiCityLabel.text")); // NOI18N
        uiCityLabel.setName("uiCityLabel"); // NOI18N

        uiCoTextField.setText(resourceMap.getString("uiCoTextField.text")); // NOI18N
        uiCoTextField.setName("uiCoTextField"); // NOI18N

        uiZipCodeTextField.setText(resourceMap.getString("uiZipCodeTextField.text")); // NOI18N
        uiZipCodeTextField.setName("uiZipCodeTextField"); // NOI18N

        uiCityTextField.setText(resourceMap.getString("uiCityTextField.text")); // NOI18N
        uiCityTextField.setName("uiCityTextField"); // NOI18N

        uiPhoneNumberLabel.setFont(resourceMap.getFont("uiPhoneNumberLabel.font")); // NOI18N
        uiPhoneNumberLabel.setText(resourceMap.getString("uiPhoneNumberLabel.text")); // NOI18N
        uiPhoneNumberLabel.setName("uiPhoneNumberLabel"); // NOI18N

        uiIdLabel.setFont(resourceMap.getFont("uiIdLabel.font")); // NOI18N
        uiIdLabel.setText(resourceMap.getString("uiIdLabel.text")); // NOI18N
        uiIdLabel.setName("uiIdLabel"); // NOI18N

        uiPhoneNumberTextField.setText(resourceMap.getString("uiPhoneNumberTextField.text")); // NOI18N
        uiPhoneNumberTextField.setName("uiPhoneNumberTextField"); // NOI18N

        uiIdTextField.setText(resourceMap.getString("uiIdTextField.text")); // NOI18N
        uiIdTextField.setName("uiIdTextField"); // NOI18N

        uiPaymentOptionLabel.setFont(resourceMap.getFont("uiPaymentOptionLabel.font")); // NOI18N
        uiPaymentOptionLabel.setText(resourceMap.getString("uiPaymentOptionLabel.text")); // NOI18N
        uiPaymentOptionLabel.setName("uiPaymentOptionLabel"); // NOI18N

        invoiceRadioButton.setText(resourceMap.getString("invoiceRadioButton.text")); // NOI18N
        invoiceRadioButton.setName("invoiceRadioButton"); // NOI18N

        creditCardRadioButton.setText(resourceMap.getString("creditCardRadioButton.text")); // NOI18N
        creditCardRadioButton.setName("creditCardRadioButton"); // NOI18N

        uiChFirstNameLabel.setFont(resourceMap.getFont("uiChFirstNameLabel.font")); // NOI18N
        uiChFirstNameLabel.setText(resourceMap.getString("uiChFirstNameLabel.text")); // NOI18N
        uiChFirstNameLabel.setName("uiChFirstNameLabel"); // NOI18N

        uiChFirstNameTextField.setText(resourceMap.getString("uiChFirstNameTextField.text")); // NOI18N
        uiChFirstNameTextField.setName("uiChFirstNameTextField"); // NOI18N

        uiChLastNameLabel.setFont(resourceMap.getFont("uiChLastNameLabel.font")); // NOI18N
        uiChLastNameLabel.setText(resourceMap.getString("uiChLastNameLabel.text")); // NOI18N
        uiChLastNameLabel.setName("uiChLastNameLabel"); // NOI18N

        uiChLastNameTextField.setText(resourceMap.getString("uiChLastNameTextField.text")); // NOI18N
        uiChLastNameTextField.setName("uiChLastNameTextField"); // NOI18N

        uiCardNumerLabel.setFont(resourceMap.getFont("uiCardNumerLabel.font")); // NOI18N
        uiCardNumerLabel.setText(resourceMap.getString("uiCardNumerLabel.text")); // NOI18N
        uiCardNumerLabel.setName("uiCardNumerLabel"); // NOI18N

        uiCvvCodeLabel.setFont(resourceMap.getFont("uiCvvCodeLabel.font")); // NOI18N
        uiCvvCodeLabel.setText(resourceMap.getString("uiCvvCodeLabel.text")); // NOI18N
        uiCvvCodeLabel.setName("uiCvvCodeLabel"); // NOI18N

        uiCardTypeLabel.setFont(resourceMap.getFont("uiCardTypeLabel.font")); // NOI18N
        uiCardTypeLabel.setText(resourceMap.getString("uiCardTypeLabel.text")); // NOI18N
        uiCardTypeLabel.setName("uiCardTypeLabel"); // NOI18N

        uiValidThroughLabel.setFont(resourceMap.getFont("uiValidThroughLabel.font")); // NOI18N
        uiValidThroughLabel.setText(resourceMap.getString("uiValidThroughLabel.text")); // NOI18N
        uiValidThroughLabel.setName("uiValidThroughLabel"); // NOI18N

        uiCardNumerTextField.setText(resourceMap.getString("uiCardNumerTextField.text")); // NOI18N
        uiCardNumerTextField.setName("uiCardNumerTextField"); // NOI18N

        uiCvvCodeTextField.setText(resourceMap.getString("uiCvvCodeTextField.text")); // NOI18N
        uiCvvCodeTextField.setName("uiCvvCodeTextField"); // NOI18N

        uiCardTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VISA", "Mastercard" }));
        uiCardTypeComboBox.setName("uiCardTypeComboBox"); // NOI18N

        uiMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        uiMonthComboBox.setName("uiMonthComboBox"); // NOI18N

        uiYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        uiYearComboBox.setName("uiYearComboBox"); // NOI18N

        uiIdHelpTextLabel.setFont(resourceMap.getFont("uiIdHelpTextLabel.font")); // NOI18N
        uiIdHelpTextLabel.setText(resourceMap.getString("uiIdHelpTextLabel.text")); // NOI18N
        uiIdHelpTextLabel.setName("uiIdHelpTextLabel"); // NOI18N

        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        jButton2.setFont(resourceMap.getFont("jButton2.font")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        uiHeaderPanel.setName("uiHeaderPanel"); // NOI18N
        uiHeaderPanel.setPreferredSize(new java.awt.Dimension(750, 329));

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uiBreadcrumbsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(uiLastNameLabel)
                                    .addComponent(uiFirstNameLabel)
                                    .addComponent(uiAddressLabel)
                                    .addComponent(uiCoLabel)
                                    .addComponent(uiZipCodeLabel)
                                    .addComponent(uiCityLabel)
                                    .addComponent(uiPhoneNumberLabel)
                                    .addComponent(uiIdLabel)
                                    .addComponent(uiPaymentOptionLabel)
                                    .addComponent(uiChFirstNameLabel)
                                    .addComponent(uiChLastNameLabel)
                                    .addComponent(uiCardNumerLabel)
                                    .addComponent(uiCvvCodeLabel)
                                    .addComponent(uiCardTypeLabel)
                                    .addComponent(uiValidThroughLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uiZipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uiCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uiPhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(uiIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addGap(4, 4, 4)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uiIdHelpTextLabel))
                                    .addComponent(invoiceRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(creditCardRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uiChFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uiFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uiLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uiAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uiCoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(uiMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uiYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(uiCardTypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(uiCvvCodeTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(uiChLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uiCardNumerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(uiHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(uiBreadcrumbsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uiHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiFirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiLastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiCoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiCoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiZipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiZipCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(uiCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uiCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiPhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiPhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiIdHelpTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uiPaymentOptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(invoiceRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditCardRadioButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiChFirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiChFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uiChLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiChLastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiCardNumerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiCardNumerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiCvvCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiCvvCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiCardTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiCardTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiValidThroughLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      customer.setAddress(uiAddressTextField.toString());
      customer.setFirstName(uiFirstNameTextField.toString());
      customer.setLastName(uiLastNameTextField.toString());
      customer.setPhoneNumber(uiPhoneNumberTextField.toString());
      customer.setPostCode(uiZipCodeTextField.toString());
      customer.setPostAddress(uiCityTextField.toString());
      card.setCardNumber(uiCardNumerTextField.toString());
      card.setCardType(uiCardTypeComboBox.toString());
      card.setHoldersName(uiChFirstNameTextField.toString()+" "+uiChLastNameTextField.toString());
      card.setValidMonth(Integer.parseInt(uiMonthComboBox.toString()));
      card.setValidMonth(Integer.parseInt(uiYearComboBox.toString()));

      try  
      {
          card.setVerificationCode(Integer.parseInt(uiCvvCodeTextField.toString()));
      }
      catch(NumberFormatException e)
      {
          // TODO Add same page error message
      }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton creditCardRadioButton;
    private javax.swing.JRadioButton invoiceRadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel uiAddressLabel;
    private javax.swing.JTextField uiAddressTextField;
    private javax.swing.JPanel uiBreadcrumbsPanel;
    private javax.swing.JLabel uiCardNumerLabel;
    private javax.swing.JTextField uiCardNumerTextField;
    private javax.swing.JComboBox uiCardTypeComboBox;
    private javax.swing.JLabel uiCardTypeLabel;
    private javax.swing.JLabel uiChFirstNameLabel;
    private javax.swing.JTextField uiChFirstNameTextField;
    private javax.swing.JLabel uiChLastNameLabel;
    private javax.swing.JTextField uiChLastNameTextField;
    private javax.swing.JLabel uiCityLabel;
    private javax.swing.JTextField uiCityTextField;
    private javax.swing.JLabel uiCoLabel;
    private javax.swing.JTextField uiCoTextField;
    private javax.swing.JLabel uiCvvCodeLabel;
    private javax.swing.JTextField uiCvvCodeTextField;
    private javax.swing.JLabel uiFirstNameLabel;
    private javax.swing.JTextField uiFirstNameTextField;
    private imat.HeaderPanel2 uiHeaderPanel;
    private javax.swing.JLabel uiIdHelpTextLabel;
    private javax.swing.JLabel uiIdLabel;
    private javax.swing.JTextField uiIdTextField;
    private javax.swing.JLabel uiLastNameLabel;
    private javax.swing.JTextField uiLastNameTextField;
    private javax.swing.JComboBox uiMonthComboBox;
    private javax.swing.JLabel uiPaymentOptionLabel;
    private javax.swing.JLabel uiPhoneNumberLabel;
    private javax.swing.JTextField uiPhoneNumberTextField;
    private javax.swing.JLabel uiValidThroughLabel;
    private javax.swing.JComboBox uiYearComboBox;
    private javax.swing.JLabel uiZipCodeLabel;
    private javax.swing.JTextField uiZipCodeTextField;
    // End of variables declaration//GEN-END:variables

}
