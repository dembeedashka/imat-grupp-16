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

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import se.chalmers.ait.dat215.project.CreditCard;
import se.chalmers.ait.dat215.project.Customer;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author David
 */
public class cashRegister extends javax.swing.JPanel {

    private Customer customer = IMatDataHandler.getInstance().getCustomer();
    private CreditCard card   = IMatDataHandler.getInstance().getCreditCard();
    private IMatDataHandler handler = IMatDataHandler.getInstance();

    private List <JTextField> textList = new ArrayList();
    private List <JLabel> labelList = new ArrayList();
    private List <JTextField> cardTextList = new ArrayList();
    private List <JLabel> cardLabelList = new ArrayList();

    private boolean isChecked = true;

    /** Creates new form cashRegister */
    public cashRegister() {
        initComponents();
        initCashUserInfo();

        cardTextList.add(cashCardFNameTField);
        cardTextList.add(cashCardLNameTField);
        cardTextList.add(cashCardnumberTfield);
        cardTextList.add(cashCvcTField);


        cardLabelList.add(jLabel8);
        cardLabelList.add(jLabel9);
        cardLabelList.add(jLabel10);
        cardLabelList.add(jLabel11);


        textList.add(cashFNameTF);
        textList.add(cashLNameTF);
        textList.add(cashPNumberTF);
        textList.add(cashPhoneNumberTF);
        textList.add(cashStAddressTF);
        textList.add(cashPcodeTF);
        textList.add(cashPlaceTF);
        textList.add(cashLastNumbersTextField);
        


        labelList.add(jLabel1);
        labelList.add(jLabel2);
        labelList.add(jLabel3);
        labelList.add(jLabel4);
        labelList.add(jLabel5);
        labelList.add(jLabel6);
        labelList.add(jLabel7);

        
    }



    public HeaderPanel2 getMatMallHeaderPanel() {
        return matMallHeaderPanel;
    }

    public shoppingCartList getShoppingCartList () {

        return shoppingCartList1;

    }

    public JRadioButton getCredit() {
        return cashDebitCardRButton;
    }

    public JRadioButton getInvoice() {
        return cashInvoiceRButton;
    }



    public void checkEmptyText () {
        isChecked=true;

        String userText = "";
        String cardText = "";
        String cartText = "";
        warningText.setText("");

        for(int i= 0; i < labelList.size(); i++) {
           
            labelList.get(i).setText("");
            shoppingCartList1.getPriceLabel().setText("");

            if(textList.get(i).getText().equals("")) {
                labelList.get(i).setText("fel!");
                userText = "Fel i användaruppgifter";
                warningText.setText(userText + cardText);
                isChecked=false;
            }
          
        
        }

        if(textList.get(7).getText().equals("")) {
                labelList.get(2).setText("fel!");
                userText = "användaruppgiter";
                warningText.setText("Fel i: " + userText +" "+ cardText + " " + cartText);
                isChecked=false;
            }
        if(cashDebitCardRButton.isSelected()) {
            for(int j =0; j < cardLabelList.size(); j++) {

                cardLabelList.get(j).setText("");

                if(cardTextList.get(j).getText().equals("")) {



                    cardLabelList.get(j).setText("fel!");
                    cardText = "kontouppgifter";
                    warningText.setText("Fel i: " + userText +" "+ cardText + " " + cartText);
                    isChecked=false;
                }

            }
        }
            if(shoppingCartList1.getPrice() ==0) {
                isChecked=false;
                shoppingCartList1.getPriceLabel().setText("Kundkorgen är tom!");
                cartText = "kundvagnen är tom";
                warningText.setText("Fel i: " + userText + " " + cardText + " " + cartText);
            }

        


    }

    public void initCashUserInfo()
    {
       if(!customer.getAddress().equals(""))
       {
           cashStAddressTF.setText(customer.getAddress());
       }
       if(!customer.getFirstName().equals(""))
       {
           cashFNameTF.setText(customer.getFirstName());
       }
       if(!customer.getLastName().equals(""))
       {
           cashLNameTF.setText(customer.getLastName());
       }
       if(!customer.getPhoneNumber().equals(""))
       {
           cashPhoneNumberTF.setText(customer.getPhoneNumber());
       }
       if(!customer.getPostCode().equals(""))
       {
           cashPcodeTF.setText(customer.getPostCode());
       }
       if(!customer.getPostAddress().equals(""))
       {
           cashPlaceTF.setText(customer.getPostAddress());
       }
       if(!card.getCardNumber().equals(""))
       {
           cashCardnumberTfield.setText(card.getCardNumber());
       }
       if(!card.getCardType().equals(""))
       {
           //TODO display card type in the combobox
       }
       if(!card.getHoldersName().equals(""))
       {
           int nextName = card.getHoldersName().indexOf(" ");
           cashCardFNameTField.setText(card.getHoldersName().substring(0,nextName));
           cashCardLNameTField.setText(card.getHoldersName().substring(nextName+1));
       }
       if(card.getValidMonth()!=0)
       {
           //TODO display month in the combobox
       }
       if(card.getValidYear()!=0)
       {
           //TODO display year in the combobox
       }
       if(card.getVerificationCode() !=0)
       {
           cashCvcTField.setText(card.getVerificationCode()+"");
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
        cashLastNumbersTextField = new javax.swing.JTextField();
        cashSaperatorLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cashCompletepurchaseButton = new javax.swing.JButton();
        shoppingCartList1 = new imat.shoppingCartList();
        matMallHeaderPanel = new imat.HeaderPanel2();
        warningText = new javax.swing.JLabel();

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

        cashMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cashMonth.setName("cashMonth"); // NOI18N

        cashYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2011", "2012", "2013" }));
        cashYear.setName("cashYear"); // NOI18N

        cashLastNumbersTextField.setText(resourceMap.getString("cashLastNumbersTextField.text")); // NOI18N
        cashLastNumbersTextField.setName("cashLastNumbersTextField"); // NOI18N

        cashSaperatorLabel.setText(resourceMap.getString("cashSaperatorLabel.text")); // NOI18N
        cashSaperatorLabel.setName("cashSaperatorLabel"); // NOI18N

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel2.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel3.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel4.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel5.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel6.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel7.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel7.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

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
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cashLNameTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cashFNameTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cashPhoneNumberTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cashPNumberTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                                .addComponent(cashSaperatorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cashLastNumbersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cashFNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
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
                    .addComponent(cashFNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashPCodeLabel)
                    .addComponent(cashLNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashPcodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashLNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addComponent(cashPlaceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cashPlaceTF)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addComponent(cashPNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cashPNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cashLastNumbersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cashSaperatorLabel)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashUserInfoPanelLayout.createSequentialGroup()
                        .addComponent(cashPhoneNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cashUserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cashPhoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        jButton4.setFont(resourceMap.getFont("jButton4.font")); // NOI18N
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
        cashDebitCardRButton.setSelected(true);
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

        jLabel8.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel8.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
        jLabel9.setForeground(resourceMap.getColor("jLabel9.foreground")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel10.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel10.setForeground(resourceMap.getColor("jLabel10.foreground")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        jLabel11.setFont(resourceMap.getFont("jLabel11.font")); // NOI18N
        jLabel11.setForeground(resourceMap.getColor("jLabel11.foreground")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143)
                .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashCardtypeLabel)
                    .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                        .addComponent(cashMonthCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(cashDebitSlash)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cashYearCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cashValidityLabel)
                    .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                        .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cashCvcTField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cashCvcLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cashCardtypeCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );
        cashDebitCardPanelLayout.setVerticalGroup(
            cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                        .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cashCardFNameLabel)
                            .addComponent(cashCardtypeLabel))
                        .addGap(11, 11, 11)
                        .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cashCardFNameTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cashCardtypeCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                        .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cashCardLNameLabel)
                            .addComponent(cashValidityLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cashMonthCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cashDebitSlash)
                                .addComponent(cashYearCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cashCardLNameTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cashDebitCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                            .addComponent(cashCvcLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cashCvcTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cashDebitCardPanelLayout.createSequentialGroup()
                            .addComponent(cashCardnumberLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cashCardnumberTfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(19, Short.MAX_VALUE))
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

        cashCompletepurchaseButton.setFont(resourceMap.getFont("jButton4.font")); // NOI18N
        cashCompletepurchaseButton.setText(resourceMap.getString("cashCompletepurchaseButton.text")); // NOI18N
        cashCompletepurchaseButton.setName("cashCompletepurchaseButton"); // NOI18N
        cashCompletepurchaseButton.setPreferredSize(new java.awt.Dimension(115, 29));
        cashCompletepurchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashCompletepurchaseButtonActionPerformed(evt);
            }
        });

        shoppingCartList1.setName("shoppingCartList1"); // NOI18N
        shoppingCartList1.setPreferredSize(new java.awt.Dimension(817, 350));

        matMallHeaderPanel.setName("matMallHeaderPanel"); // NOI18N

        warningText.setFont(resourceMap.getFont("warningText.font")); // NOI18N
        warningText.setForeground(resourceMap.getColor("warningText.foreground")); // NOI18N
        warningText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warningText.setText(resourceMap.getString("warningText.text")); // NOI18N
        warningText.setName("warningText"); // NOI18N

        javax.swing.GroupLayout cashRegisterPanel1Layout = new javax.swing.GroupLayout(cashRegisterPanel1);
        cashRegisterPanel1.setLayout(cashRegisterPanel1Layout);
        cashRegisterPanel1Layout.setHorizontalGroup(
            cashRegisterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashRegisterPanel1Layout.createSequentialGroup()
                .addGroup(cashRegisterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cashRegisterPanel1Layout.createSequentialGroup()
                        .addComponent(warningText, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(cashCompletepurchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cashRegisterPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cashBasketNLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cashPaymentLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashRegisterPanel1Layout.createSequentialGroup()
                        .addContainerGap(587, Short.MAX_VALUE)
                        .addComponent(cashCompletepurchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cashRegisterPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(cashRegisterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cashUserInfoLabel)
                            .addComponent(shoppingCartList1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cashUserInfoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(matMallHeaderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                            .addComponent(cashPaymentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        cashRegisterPanel1Layout.setVerticalGroup(
            cashRegisterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashRegisterPanel1Layout.createSequentialGroup()
                .addComponent(matMallHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashBasketNLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shoppingCartList1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cashUserInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashUserInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(cashPaymentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashPaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashRegisterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashCompletepurchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warningText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout cashBreadcrumbLayout = new javax.swing.GroupLayout(cashBreadcrumb);
        cashBreadcrumb.setLayout(cashBreadcrumbLayout);
        cashBreadcrumbLayout.setHorizontalGroup(
            cashBreadcrumbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashBreadcrumbLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(cashRegisterPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cashBreadcrumbLayout.setVerticalGroup(
            cashBreadcrumbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashBreadcrumbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cashRegisterPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cashBreadcrumb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cashBreadcrumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showDebitCardButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDebitCardButton
        cashDebitCardPanel.setVisible(true);
    }//GEN-LAST:event_showDebitCardButton

    private void dontShowDebitCardButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dontShowDebitCardButton
        cashDebitCardPanel.setVisible(false);
    }//GEN-LAST:event_dontShowDebitCardButton

    private void cashSaveUserInfo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashSaveUserInfo
       customer.setAddress(cashStAddressTF.getText());
       customer.setFirstName(cashFNameTF.getText());
       customer.setLastName(cashLNameTF.getText());
       customer.setPhoneNumber(cashPhoneNumberTF.getText());
       customer.setPostCode(cashPcodeTF.getText());
       customer.setPostAddress(cashPlaceTF.getText());
       card.setCardNumber(cashCardnumberTfield.getText());
       card.setCardType(cashCardtypeCBox.getItemAt(0).toString());
       card.setHoldersName(cashCardFNameTField.getText()+" "+cashCardLNameTField.getText());
       card.setValidMonth(Integer.parseInt(cashMonthCBox.getItemAt(0).toString()));
       card.setValidYear(Integer.parseInt(cashYearCBox.getItemAt(0).toString()));
       try {
           card.setVerificationCode(Integer.parseInt(cashCvcTField.toString()));
       } catch(NumberFormatException e) {
           // TODO Add same page error message
       }






}//GEN-LAST:event_cashSaveUserInfo


    private void cashCompletepurchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashCompletepurchaseButtonActionPerformed
        

        checkEmptyText();
        if(isChecked) {


        
            Receipt receipt = IMatPresenter.getInstance().getView().getReceipt2();
            double price=0;

            for(ShoppingItem item: handler.getShoppingCart().getItems())
            {
                receipt.addReceiptRow(item);
                price+=item.getTotal();
            }
            receipt.setReceiptPriceLabel(price);
            receipt.setDateLabel("Tack för ditt köp!");

            handler.placeOrder();
            handler.getShoppingCart().clear();
            handler.getShoppingCart().fireShoppingCartChanged();
            IMatPresenter.getInstance().displayCategory(IMatView.ORDERPLACED);



        }

        

        
    }//GEN-LAST:event_cashCompletepurchaseButtonActionPerformed

    public void updateTotal(double total){
        shoppingCartList1.setSum(total);
    }

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
    private javax.swing.JTextField cashLastNumbersTextField;
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
    private javax.swing.JLabel cashSaperatorLabel;
    private javax.swing.JLabel cashSlash;
    private javax.swing.JLabel cashStAddressLabel;
    private javax.swing.JTextField cashStAddressTF;
    private javax.swing.JLabel cashUserInfoLabel;
    private javax.swing.JPanel cashUserInfoPanel;
    private javax.swing.JLabel cashValidityLabel;
    private javax.swing.JComboBox cashYear;
    private javax.swing.JComboBox cashYearCBox;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private imat.HeaderPanel2 matMallHeaderPanel;
    private imat.shoppingCartList shoppingCartList1;
    private javax.swing.JLabel warningText;
    // End of variables declaration//GEN-END:variables

}
