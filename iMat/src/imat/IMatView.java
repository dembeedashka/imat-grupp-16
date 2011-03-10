/*
 * IMatView.java
 */

package imat;

import imat.categories.Category;
import imat.categories.SubcategoryDairy;
import imat.categories.SubcategoryFruit;
import imat.categories.SubcategoryMeat;
import imat.categories.SubcategoryOther;
import imat.categories.SubcategoryPantry;
import imat.categories.SubcategorySnacks;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ProductCategory;
import se.chalmers.ait.dat215.project.ShoppingCart;
import se.chalmers.ait.dat215.project.ShoppingCartListener;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 * The application's main frame.
 */
public class IMatView extends FrameView implements WindowListener, ShoppingCartListener {


    /* header icons */
    public static final ImageIcon BERRY_HEADER            = new ImageIcon("src/imat/resources/images/subcategories/berry_big.gif");
    public static final ImageIcon BREAD_HEADER            = new ImageIcon("src/imat/resources/images/subcategories/bread_big.gif");
    public static final ImageIcon CABBAGE_HEADER          = new ImageIcon("src/imat/resources/images/subcategories/cabbage_big.gif");
    public static final ImageIcon CITRUS_FRUIT_HEADER     = new ImageIcon("src/imat/resources/images/subcategories/citrus_fruit_big.gif");
    public static final ImageIcon COLD_DRINKS_HEADER      = new ImageIcon("src/imat/resources/images/subcategories/cold_drinks_big.gif");
    public static final ImageIcon DAIRIES_HEADER          = new ImageIcon("src/imat/resources/images/subcategories/dairies_big.gif");
    public static final ImageIcon EXOTIC_FRUIT_HEADER     = new ImageIcon("src/imat/resources/images/subcategories/exotic_fruit_big.gif");
    public static final ImageIcon FISH_HEADER             = new ImageIcon("src/imat/resources/images/subcategories/fish_big.gif");
    public static final ImageIcon FLOUR_SUGAR_SALT_HEADER = new ImageIcon("src/imat/resources/images/subcategories/flour_sugar_salt_big.gif");
    public static final ImageIcon FRUIT_HEADER            = new ImageIcon("src/imat/resources/images/subcategories/fruit_big.gif");
    public static final ImageIcon HERB_HEADER             = new ImageIcon("src/imat/resources/images/subcategories/herb_big.gif");
    public static final ImageIcon HOT_DRINKS_HEADER       = new ImageIcon("src/imat/resources/images/subcategories/hot_drinks_big.gif");
    public static final ImageIcon NUTS_AND_SEEDS_HEADER   = new ImageIcon("src/imat/resources/images/subcategories/nuts_and_seeds_big.gif");
    public static final ImageIcon MEAT_HEADER             = new ImageIcon("src/imat/resources/images/subcategories/meat_big.gif");
    public static final ImageIcon MELONS_HEADER           = new ImageIcon("src/imat/resources/images/subcategories/melons_big.gif");
    public static final ImageIcon PASTA_HEADER            = new ImageIcon("src/imat/resources/images/subcategories/pasta_big.gif");
    public static final ImageIcon POD_HEADER              = new ImageIcon("src/imat/resources/images/subcategories/pod_big.gif");
    public static final ImageIcon POTATO_RICE_HEADER      = new ImageIcon("src/imat/resources/images/subcategories/potato_rice_big.gif");
    public static final ImageIcon ROOT_VEGETABLE_HEADER   = new ImageIcon("src/imat/resources/images/subcategories/root_vegetable_big.gif");
    public static final ImageIcon SNACKS_HEADER           = new ImageIcon("src/imat/resources/images/subcategories/sweet_big.gif");
    public static final ImageIcon VEGETABLE_FRUIT_HEADER  = new ImageIcon("src/imat/resources/images/subcategories/vegetable_fruit_big.gif");

    /* main categories */
    public static final Category  HOME                    = new Category(Category.HOME_WHITE,       "home",   new ImageIcon("src/imat/resources/images/headers/kat0big.gif"), "HELLO WORLD");
    public static final Category  FRUIT                   = new Category(Category.FRUIT_GREEN,      "fruit",  new ImageIcon("src/imat/resources/images/headers/kat1big.gif"), "HELLO WORLD");
    public static final Category  MEAT                    = new Category(Category.MEAT_RED,         "meat",   new ImageIcon("src/imat/resources/images/headers/kat2big.gif"), "HELLO WORLD");
    public static final Category  DAIRY                   = new Category(Category.DAIRY_BLUE,       "dairy",  new ImageIcon("src/imat/resources/images/headers/kat3big.gif"), "HELLO WORLD");
    public static final Category  PANTRY                  = new Category(Category.PANTRY_YELLOW,    "pantry", new ImageIcon("src/imat/resources/images/headers/kat4big.gif"), "HELLO WORLD");
    public static final Category  SNACKS                  = new Category(Category.SNACKS_ORANGE,    "drinks", new ImageIcon("src/imat/resources/images/headers/kat5big.gif"), "HELLO WORLD");
    public static final Category  FAVOURITES              = new Category(Category.FAVOURITES_BROWN, "fav",    new ImageIcon("src/imat/resources/images/headers/kat6big.gif"), "HELLO WORLD");
    /* pseudo-categories used as main categories */
    public static final Category  HELP                    = new SubcategoryOther("help",   new ImageIcon("src/imat/resources/images/headers/kat6big.gif"), "Help");
    public static final Category  SEARCH                  = new SubcategoryOther("search", new ImageIcon("src/imat/resources/images/headers/kat6big.gif"), "SEARCH");
    public static final Category  SHOP                    = new SubcategoryOther("shop",   new ImageIcon("src/imat/resources/images/headers/kat6big.gif"), "Shopping lists");
    public static final Category  CART                    = new SubcategoryOther("cart",   new ImageIcon("src/imat/resources/images/headers/kat6big.gif"), "Varor och sånt");
    public static final Category  USERINFO                = new SubcategoryOther("user",   new ImageIcon("src/imat/resources/images/headers/kat6big.gif"), "Användarinfo");
    public static final Category  CASH                    = new SubcategoryOther("cash",   new ImageIcon("src/imat/resources/images/headers/kat6big.gif"), "Kassa");
    public static final Category  PURCHASES               = new SubcategoryOther("purchases",new ImageIcon("src/imat/resources/images/headers/kat6big.gif"), "Tidigare inköp");
    public static final Category  ORDERPLACED             = new SubcategoryOther("orderPlaced",new ImageIcon("src/imat/resources/images/headers/kat6big.gif"), "Köp slutfört");
    public static final Category  LISTVIEW                = new SubcategoryOther("listview",new ImageIcon("src/imat/resources/images/headers/kat6big.gif"), "Lista över inköpslistor");
    public static final Category  RECEIPT                 = new SubcategoryOther("receipt",new ImageIcon("src/imat/resources/images/headers/kat6big.gif"), "Kvitto");

    /* subcategories */
    public static Category        subPantry               = new SubcategoryPantry("subCategory", null, null);
    public static Category        subFruit                = new SubcategoryFruit( "subCategory", null, null);
    public static Category        subDairy                = new SubcategoryDairy( "subCategory", null, null);
    public static Category        subMeat                 = new SubcategoryMeat(  "subCategory", null, null);
    public static Category        subSnacks               = new SubcategorySnacks("subCategory", null, null);

    private IMatPresenter         presenter;

    private ShoppingCart cart = IMatDataHandler.getInstance().getShoppingCart();

    
    public IMatView(SingleFrameApplication app) {
        super(app);
        
        initComponents();
        initHeaders();

        IMatDataHandler.getInstance().getShoppingCart().addShoppingCartListener(this);

        // make window size static
        getFrame().setResizable(false);

        // scroll bar behaviour
        mainScrollPane.getVerticalScrollBar().setUnitIncrement(16);
        mainScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        mainScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        presenter = IMatPresenter.getInstance();
        presenter.init(
            this,
            backButton,
            forwardButton,
            navigationSearchPanel,
            bottomContentsPanel,
            bottomBorderPanel,
            centerStagePanel,
            subCategoryMall,
            matStep3Mall1,
            mainScrollPane,
            shoppingCart1,
            "detailedView"
        );

        getFrame().addWindowListener(this);
    }

    private void initHeaders()
    {
        fruitMall.getMatMallHeaderPanel().getHeaderPanelPicLabel().setIcon(new ImageIcon("src/imat/resources/images/headers/kat1big.gif"));
        meatMall.getMatMallHeaderPanel().getHeaderPanelPicLabel().setIcon(new ImageIcon("src/imat/resources/images/headers/kat2big.gif"));
        dairyMall.getMatMallHeaderPanel().getHeaderPanelPicLabel().setIcon(new ImageIcon("src/imat/resources/images/headers/kat3big.gif"));
        pantryMall.getMatMallHeaderPanel().getHeaderPanelPicLabel().setIcon(new ImageIcon("src/imat/resources/images/headers/kat4big.gif"));
        drinksMall.getMatMallHeaderPanel().getHeaderPanelPicLabel().setIcon(new ImageIcon("src/imat/resources/images/headers/kat5big.gif"));
        favMall.getMatMallHeaderPanel().getHeaderPanelPicLabel().setIcon(new ImageIcon("src/imat/resources/images/headers/kat6big.gif"));
        searchView1.getSearchHeaderPanel().getHeaderPanelPicLabel().setIcon(new ImageIcon("src/imat/resources/images/headers/search.gif"));
        cashRegister1.getMatMallHeaderPanel().getHeaderPanelPicLabel().setIcon(new ImageIcon("src/imat/resources/images/headers/register.gif"));
        shoppingListView1.getHeaderPanel21().getHeaderPanelPicLabel().setIcon(new ImageIcon("src/imat/resources/images/headers/shoppinglist.gif"));
        helpView1.getHelpViewHeaderPanel().getHeaderPanelPicLabel().setIcon(new ImageIcon("src/imat/resources/images/headers/help.gif"));
        shoppingCart1.getMatMallHeaderPanel().getHeaderPanelPicLabel().setIcon(new ImageIcon("src/imat/resources/images/headers/cart.gif"));
        userInfoView1.getUiHeaderPanel().getHeaderPanelPicLabel().setIcon(new ImageIcon("src/imat/resources/images/headers/user.gif"));
        orderPlacedView1.getOrderPlacedHeaderPanel().getHeaderPanelPicLabel().setIcon(new ImageIcon("src/imat/resources/images/headers/kat0big.gif"));
    }

    public cashRegister getCashRegister1() {
        return cashRegister1;
    }

    public userInfoView getUserInfoView1() {
        return userInfoView1;
    }

    public Receipt getReceipt1() {
        return receipt1;
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
        dairyButton = new javax.swing.JButton();
        pantryButton = new javax.swing.JButton();
        snacksButton = new javax.swing.JButton();
        favouritesButton = new javax.swing.JButton();
        bottomContentsPanel = new javax.swing.JPanel();
        navigationSearchPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        forwardButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        shoppingListPanel = new javax.swing.JPanel();
        shoppingList1 = new imat.shoppingList();
        showShoppingListButton = new javax.swing.JButton();
        actionPanel = new javax.swing.JPanel();
        actionPanel1 = new imat.actionPanel();
        framePanel = new javax.swing.JPanel();
        mainScrollPane = new javax.swing.JScrollPane();
        centerStagePanel = new javax.swing.JPanel();
        cardPantryPanel = new javax.swing.JPanel();
        pantryMall = new imat.matMall();
        breadButton = new javax.swing.JButton();
        flourButton = new javax.swing.JButton();
        pastaButton = new javax.swing.JButton();
        cardHomePanel = new javax.swing.JPanel();
        homeView1 = new imat.homeView();
        cardHelpPanel = new javax.swing.JPanel();
        helpView1 = new imat.helpView();
        cardSearchPanel = new javax.swing.JPanel();
        searchView1 = new imat.SearchView();
        cardShoppingPanel = new javax.swing.JPanel();
        shoppingListView1 = new imat.ShoppingListView();
        cardShoppingCartPanel = new javax.swing.JPanel();
        shoppingCart1 = new imat.shoppingCart();
        cardFruitPanel = new javax.swing.JPanel();
        fruitMall = new imat.matMall();
        berryButton = new javax.swing.JButton();
        cabbageButton = new javax.swing.JButton();
        citrusFruitButton = new javax.swing.JButton();
        exoticFruitButton = new javax.swing.JButton();
        drupeButton = new javax.swing.JButton();
        herbButton = new javax.swing.JButton();
        melonButton = new javax.swing.JButton();
        podButton = new javax.swing.JButton();
        potatoButton = new javax.swing.JButton();
        rootVegetableButton = new javax.swing.JButton();
        vegetableButton = new javax.swing.JButton();
        cardDairyPanel = new javax.swing.JPanel();
        dairyMall = new imat.matMall();
        dairySubButton = new javax.swing.JButton();
        cardMeatPanel = new javax.swing.JPanel();
        meatMall = new imat.matMall();
        fishButton = new javax.swing.JButton();
        meatSubButton = new javax.swing.JButton();
        cardFavourites = new javax.swing.JPanel();
        favMall = new imat.matMall();
        jPanel1 = new javax.swing.JPanel();
        cardDrinksPanel = new javax.swing.JPanel();
        drinksMall = new imat.matMall();
        coldDrinksButton = new javax.swing.JButton();
        hotDrinksButton = new javax.swing.JButton();
        nutsSeedsButton = new javax.swing.JButton();
        sweetsButton = new javax.swing.JButton();
        cardSubCategoryPanel = new javax.swing.JPanel();
        subCategoryMall = new imat.matStep2Mall();
        cardDetailedViewPanel = new javax.swing.JPanel();
        matStep3Mall1 = new imat.matStep3Mall();
        cardUserInfoPanel = new javax.swing.JPanel();
        userInfoView1 = new imat.userInfoView();
        cardCashPanel = new javax.swing.JPanel();
        cashRegister1 = new imat.cashRegister();
        cardPreviousPurchasesPanel = new javax.swing.JPanel();
        purchases1 = new imat.Purchases();
        cardOrderPlaced = new javax.swing.JPanel();
        orderPlacedView1 = new imat.OrderPlacedView();
        cardShoppingListPanel = new javax.swing.JPanel();
        shoppingListView2 = new imat.ShoppingListView();
        cardReceiptPabel = new javax.swing.JPanel();
        receipt1 = new imat.Receipt();
        bottomBorderPanel = new javax.swing.JPanel();

        mainPanel.setName("mainPanel"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(IMatView.class);
        topNavigationPanel.setBackground(resourceMap.getColor("topNavigationPanel.background")); // NOI18N
        topNavigationPanel.setName("topNavigationPanel"); // NOI18N
        topNavigationPanel.setPreferredSize(new java.awt.Dimension(1273, 82));

        homeButton.setIcon(resourceMap.getIcon("homeButton.icon")); // NOI18N
        homeButton.setText(resourceMap.getString("homeButton.text")); // NOI18N
        homeButton.setToolTipText(resourceMap.getString("homeButton.toolTipText")); // NOI18N
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
        fruitButton.setToolTipText(resourceMap.getString("fruitButton.toolTipText")); // NOI18N
        fruitButton.setBorderPainted(false);
        fruitButton.setName("fruitButton"); // NOI18N
        fruitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitButtonActionPerformed(evt);
            }
        });

        meatButton.setIcon(resourceMap.getIcon("meatButton.icon")); // NOI18N
        meatButton.setText(resourceMap.getString("meatButton.text")); // NOI18N
        meatButton.setToolTipText(resourceMap.getString("meatButton.toolTipText")); // NOI18N
        meatButton.setBorderPainted(false);
        meatButton.setContentAreaFilled(false);
        meatButton.setName("meatButton"); // NOI18N
        meatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatButtonActionPerformed(evt);
            }
        });

        dairyButton.setIcon(resourceMap.getIcon("dairyButton.icon")); // NOI18N
        dairyButton.setText(resourceMap.getString("dairyButton.text")); // NOI18N
        dairyButton.setToolTipText(resourceMap.getString("dairyButton.toolTipText")); // NOI18N
        dairyButton.setBorderPainted(false);
        dairyButton.setContentAreaFilled(false);
        dairyButton.setDefaultCapable(false);
        dairyButton.setName("dairyButton"); // NOI18N
        dairyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dairyButtonActionPerformed(evt);
            }
        });

        pantryButton.setIcon(resourceMap.getIcon("pantryButton.icon")); // NOI18N
        pantryButton.setText(resourceMap.getString("pantryButton.text")); // NOI18N
        pantryButton.setToolTipText(resourceMap.getString("pantryButton.toolTipText")); // NOI18N
        pantryButton.setBorderPainted(false);
        pantryButton.setContentAreaFilled(false);
        pantryButton.setName("pantryButton"); // NOI18N
        pantryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantryButtonActionPerformed(evt);
            }
        });

        snacksButton.setIcon(resourceMap.getIcon("snacksButton.icon")); // NOI18N
        snacksButton.setText(resourceMap.getString("snacksButton.text")); // NOI18N
        snacksButton.setToolTipText(resourceMap.getString("snacksButton.toolTipText")); // NOI18N
        snacksButton.setContentAreaFilled(false);
        snacksButton.setDefaultCapable(false);
        snacksButton.setName("snacksButton"); // NOI18N
        snacksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snacksButtonActionPerformed(evt);
            }
        });

        favouritesButton.setIcon(resourceMap.getIcon("favouritesButton.icon")); // NOI18N
        favouritesButton.setText(resourceMap.getString("favouritesButton.text")); // NOI18N
        favouritesButton.setToolTipText(resourceMap.getString("favouritesButton.toolTipText")); // NOI18N
        favouritesButton.setContentAreaFilled(false);
        favouritesButton.setDefaultCapable(false);
        favouritesButton.setName("favouritesButton"); // NOI18N
        favouritesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favouritesButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout topNavigationPanelLayout = new org.jdesktop.layout.GroupLayout(topNavigationPanel);
        topNavigationPanel.setLayout(topNavigationPanelLayout);
        topNavigationPanelLayout.setHorizontalGroup(
            topNavigationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(topNavigationPanelLayout.createSequentialGroup()
                .add(19, 19, 19)
                .add(homeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fruitButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(meatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 188, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(8, 8, 8)
                .add(dairyButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 188, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pantryButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 192, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(snacksButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(favouritesButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        topNavigationPanelLayout.setVerticalGroup(
            topNavigationPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(homeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(meatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(fruitButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(dairyButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(pantryButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(snacksButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(favouritesButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        bottomContentsPanel.setBackground(resourceMap.getColor("bottomContentsPanel.background")); // NOI18N
        bottomContentsPanel.setName("bottomContentsPanel"); // NOI18N

        navigationSearchPanel.setBackground(resourceMap.getColor("navigationSearchPanel.background")); // NOI18N
        navigationSearchPanel.setName("navigationSearchPanel"); // NOI18N

        backButton.setFont(resourceMap.getFont("backButton.font")); // NOI18N
        backButton.setIcon(resourceMap.getIcon("backButton.icon")); // NOI18N
        backButton.setText(resourceMap.getString("backButton.text")); // NOI18N
        backButton.setToolTipText(resourceMap.getString("backButton.toolTipText")); // NOI18N
        backButton.setName("backButton"); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        forwardButton.setFont(resourceMap.getFont("forwardButton.font")); // NOI18N
        forwardButton.setIcon(resourceMap.getIcon("forwardButton.icon")); // NOI18N
        forwardButton.setText(resourceMap.getString("forwardButton.text")); // NOI18N
        forwardButton.setToolTipText(resourceMap.getString("forwardButton.toolTipText")); // NOI18N
        forwardButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        forwardButton.setName("forwardButton"); // NOI18N
        forwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardButtonActionPerformed(evt);
            }
        });

        searchTextField.setFont(resourceMap.getFont("searchTextField.font")); // NOI18N
        searchTextField.setText(resourceMap.getString("searchTextField.text")); // NOI18N
        searchTextField.setToolTipText(resourceMap.getString("searchTextField.toolTipText")); // NOI18N
        searchTextField.setName("searchTextField"); // NOI18N
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        searchTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusLost(evt);
            }
        });

        searchButton.setFont(resourceMap.getFont("searchButton.font")); // NOI18N
        searchButton.setIcon(resourceMap.getIcon("searchButton.icon")); // NOI18N
        searchButton.setText(resourceMap.getString("searchButton.text")); // NOI18N
        searchButton.setToolTipText(resourceMap.getString("searchButton.toolTipText")); // NOI18N
        searchButton.setName("searchButton"); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        helpButton.setFont(resourceMap.getFont("helpButton.font")); // NOI18N
        helpButton.setIcon(resourceMap.getIcon("helpButton.icon")); // NOI18N
        helpButton.setText(resourceMap.getString("helpButton.text")); // NOI18N
        helpButton.setToolTipText(resourceMap.getString("helpButton.toolTipText")); // NOI18N
        helpButton.setName("helpButton"); // NOI18N
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout navigationSearchPanelLayout = new org.jdesktop.layout.GroupLayout(navigationSearchPanel);
        navigationSearchPanel.setLayout(navigationSearchPanelLayout);
        navigationSearchPanelLayout.setHorizontalGroup(
            navigationSearchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(navigationSearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(backButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(forwardButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(162, 162, 162)
                .add(searchTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 401, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(searchButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 316, Short.MAX_VALUE)
                .add(helpButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        navigationSearchPanelLayout.setVerticalGroup(
            navigationSearchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(navigationSearchPanelLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(navigationSearchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(backButton)
                    .add(forwardButton)
                    .add(searchTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(searchButton)
                    .add(helpButton))
                .addContainerGap())
        );

        shoppingListPanel.setName("shoppingListPanel"); // NOI18N

        shoppingList1.setName("shoppingList1"); // NOI18N

        showShoppingListButton.setFont(resourceMap.getFont("showShoppingListButton.font")); // NOI18N
        showShoppingListButton.setIcon(resourceMap.getIcon("showShoppingListButton.icon")); // NOI18N
        showShoppingListButton.setText(resourceMap.getString("showShoppingListButton.text")); // NOI18N
        showShoppingListButton.setName("showShoppingListButton"); // NOI18N
        showShoppingListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showShoppingListButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout shoppingListPanelLayout = new org.jdesktop.layout.GroupLayout(shoppingListPanel);
        shoppingListPanel.setLayout(shoppingListPanelLayout);
        shoppingListPanelLayout.setHorizontalGroup(
            shoppingListPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(shoppingList1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, shoppingListPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .add(showShoppingListButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 202, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(29, 29, 29))
        );
        shoppingListPanelLayout.setVerticalGroup(
            shoppingListPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(shoppingListPanelLayout.createSequentialGroup()
                .add(shoppingList1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 462, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(showShoppingListButton)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        actionPanel.setMaximumSize(null);
        actionPanel.setName("actionPanel"); // NOI18N
        actionPanel.setPreferredSize(new java.awt.Dimension(251, 604));

        actionPanel1.setToolTipText(resourceMap.getString("actionPanel1.toolTipText")); // NOI18N
        actionPanel1.setName("actionPanel1"); // NOI18N

        org.jdesktop.layout.GroupLayout actionPanelLayout = new org.jdesktop.layout.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(actionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(actionPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(actionPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        framePanel.setBackground(resourceMap.getColor("framePanel.background")); // NOI18N
        framePanel.setName("framePanel"); // NOI18N
        framePanel.setPreferredSize(new java.awt.Dimension(805, 804));

        mainScrollPane.setHorizontalScrollBar(null);
        mainScrollPane.setMaximumSize(new java.awt.Dimension(800, 600));
        mainScrollPane.setName("mainScrollPane"); // NOI18N
        mainScrollPane.setPreferredSize(new java.awt.Dimension(800, 600));

        centerStagePanel.setBackground(resourceMap.getColor("centerStagePanel.background")); // NOI18N
        centerStagePanel.setName("centerStagePanel"); // NOI18N
        centerStagePanel.setPreferredSize(new java.awt.Dimension(800, 1200));
        centerStagePanel.setLayout(new java.awt.CardLayout());

        cardPantryPanel.setName("cardPantryPanel"); // NOI18N
        cardPantryPanel.setPreferredSize(new java.awt.Dimension(861, 600));

        pantryMall.setName("pantryMall"); // NOI18N

        breadButton.setIcon(resourceMap.getIcon("breadButton.icon")); // NOI18N
        breadButton.setText(resourceMap.getString("breadButton.text")); // NOI18N
        breadButton.setMaximumSize(new java.awt.Dimension(300, 62));
        breadButton.setMinimumSize(new java.awt.Dimension(300, 62));
        breadButton.setName("breadButton"); // NOI18N
        breadButton.setPreferredSize(new java.awt.Dimension(300, 62));
        breadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breadButtonActionPerformed(evt);
            }
        });

        flourButton.setIcon(resourceMap.getIcon("flourButton.icon")); // NOI18N
        flourButton.setText(resourceMap.getString("flourButton.text")); // NOI18N
        flourButton.setName("flourButton"); // NOI18N
        flourButton.setPreferredSize(new java.awt.Dimension(300, 62));
        flourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flourButtonActionPerformed(evt);
            }
        });

        pastaButton.setIcon(resourceMap.getIcon("pastaButton.icon")); // NOI18N
        pastaButton.setText(resourceMap.getString("pastaButton.text")); // NOI18N
        pastaButton.setName("pastaButton"); // NOI18N
        pastaButton.setPreferredSize(new java.awt.Dimension(300, 62));
        pastaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastaButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout cardPantryPanelLayout = new org.jdesktop.layout.GroupLayout(cardPantryPanel);
        cardPantryPanel.setLayout(cardPantryPanelLayout);
        cardPantryPanelLayout.setHorizontalGroup(
            cardPantryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pantryMall, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .add(cardPantryPanelLayout.createSequentialGroup()
                .add(105, 105, 105)
                .add(cardPantryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pastaButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cardPantryPanelLayout.createSequentialGroup()
                        .add(breadButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 296, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(flourButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        cardPantryPanelLayout.setVerticalGroup(
            cardPantryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardPantryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(pantryMall, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 380, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(cardPantryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cardPantryPanelLayout.createSequentialGroup()
                        .add(breadButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pastaButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(1468, 1468, 1468))
                    .add(cardPantryPanelLayout.createSequentialGroup()
                        .add(flourButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        centerStagePanel.add(cardPantryPanel, "pantry");

        cardHomePanel.setName("cardHomePanel"); // NOI18N

        homeView1.setName("homeView1"); // NOI18N

        org.jdesktop.layout.GroupLayout cardHomePanelLayout = new org.jdesktop.layout.GroupLayout(cardHomePanel);
        cardHomePanel.setLayout(cardHomePanelLayout);
        cardHomePanelLayout.setHorizontalGroup(
            cardHomePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(homeView1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        cardHomePanelLayout.setVerticalGroup(
            cardHomePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(homeView1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );

        centerStagePanel.add(cardHomePanel, "home");

        cardHelpPanel.setName("cardHelpPanel"); // NOI18N

        helpView1.setName("helpView1"); // NOI18N

        org.jdesktop.layout.GroupLayout cardHelpPanelLayout = new org.jdesktop.layout.GroupLayout(cardHelpPanel);
        cardHelpPanel.setLayout(cardHelpPanelLayout);
        cardHelpPanelLayout.setHorizontalGroup(
            cardHelpPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(helpView1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        cardHelpPanelLayout.setVerticalGroup(
            cardHelpPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(helpView1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );

        centerStagePanel.add(cardHelpPanel, "help");

        cardSearchPanel.setName("cardSearchPanel"); // NOI18N

        searchView1.setName("searchView1"); // NOI18N

        org.jdesktop.layout.GroupLayout cardSearchPanelLayout = new org.jdesktop.layout.GroupLayout(cardSearchPanel);
        cardSearchPanel.setLayout(cardSearchPanelLayout);
        cardSearchPanelLayout.setHorizontalGroup(
            cardSearchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(searchView1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1257, Short.MAX_VALUE)
        );
        cardSearchPanelLayout.setVerticalGroup(
            cardSearchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(searchView1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );

        centerStagePanel.add(cardSearchPanel, "search");

        cardShoppingPanel.setName("cardShoppingPanel"); // NOI18N

        shoppingListView1.setName("shoppingListView1"); // NOI18N

        org.jdesktop.layout.GroupLayout cardShoppingPanelLayout = new org.jdesktop.layout.GroupLayout(cardShoppingPanel);
        cardShoppingPanel.setLayout(cardShoppingPanelLayout);
        cardShoppingPanelLayout.setHorizontalGroup(
            cardShoppingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardShoppingPanelLayout.createSequentialGroup()
                .add(shoppingListView1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        cardShoppingPanelLayout.setVerticalGroup(
            cardShoppingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardShoppingPanelLayout.createSequentialGroup()
                .add(shoppingListView1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        centerStagePanel.add(cardShoppingPanel, "shop");

        cardShoppingCartPanel.setName("cardShoppingCartPanel"); // NOI18N

        shoppingCart1.setName("shoppingCart1"); // NOI18N

        org.jdesktop.layout.GroupLayout cardShoppingCartPanelLayout = new org.jdesktop.layout.GroupLayout(cardShoppingCartPanel);
        cardShoppingCartPanel.setLayout(cardShoppingCartPanelLayout);
        cardShoppingCartPanelLayout.setHorizontalGroup(
            cardShoppingCartPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardShoppingCartPanelLayout.createSequentialGroup()
                .add(shoppingCart1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardShoppingCartPanelLayout.setVerticalGroup(
            cardShoppingCartPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardShoppingCartPanelLayout.createSequentialGroup()
                .add(shoppingCart1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        centerStagePanel.add(cardShoppingCartPanel, "cart");

        cardFruitPanel.setName("cardFruitPanel"); // NOI18N
        cardFruitPanel.setPreferredSize(new java.awt.Dimension(800, 1200));

        fruitMall.setName("fruitMall"); // NOI18N

        berryButton.setIcon(resourceMap.getIcon("berryButton.icon")); // NOI18N
        berryButton.setText(resourceMap.getString("berryButton.text")); // NOI18N
        berryButton.setName("berryButton"); // NOI18N
        berryButton.setPreferredSize(new java.awt.Dimension(300, 62));
        berryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berryButtonActionPerformed(evt);
            }
        });

        cabbageButton.setIcon(resourceMap.getIcon("cabbageButton.icon")); // NOI18N
        cabbageButton.setText(resourceMap.getString("cabbageButton.text")); // NOI18N
        cabbageButton.setName("cabbageButton"); // NOI18N
        cabbageButton.setPreferredSize(new java.awt.Dimension(300, 62));
        cabbageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabbageButtonActionPerformed(evt);
            }
        });

        citrusFruitButton.setIcon(resourceMap.getIcon("citrusFruitButton.icon")); // NOI18N
        citrusFruitButton.setText(resourceMap.getString("citrusFruitButton.text")); // NOI18N
        citrusFruitButton.setName("citrusFruitButton"); // NOI18N
        citrusFruitButton.setPreferredSize(new java.awt.Dimension(300, 62));
        citrusFruitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citrusFruitButtonActionPerformed(evt);
            }
        });

        exoticFruitButton.setIcon(resourceMap.getIcon("exoticFruitButton.icon")); // NOI18N
        exoticFruitButton.setText(resourceMap.getString("exoticFruitButton.text")); // NOI18N
        exoticFruitButton.setName("exoticFruitButton"); // NOI18N
        exoticFruitButton.setPreferredSize(new java.awt.Dimension(300, 62));
        exoticFruitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exoticFruitButtonActionPerformed(evt);
            }
        });

        drupeButton.setIcon(resourceMap.getIcon("drupeButton.icon")); // NOI18N
        drupeButton.setText(resourceMap.getString("drupeButton.text")); // NOI18N
        drupeButton.setName("drupeButton"); // NOI18N
        drupeButton.setPreferredSize(new java.awt.Dimension(300, 62));
        drupeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drupeButtonActionPerformed(evt);
            }
        });

        herbButton.setIcon(resourceMap.getIcon("herbButton.icon")); // NOI18N
        herbButton.setText(resourceMap.getString("herbButton.text")); // NOI18N
        herbButton.setName("herbButton"); // NOI18N
        herbButton.setPreferredSize(new java.awt.Dimension(300, 62));
        herbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                herbButtonActionPerformed(evt);
            }
        });

        melonButton.setIcon(resourceMap.getIcon("melonButton.icon")); // NOI18N
        melonButton.setText(resourceMap.getString("melonButton.text")); // NOI18N
        melonButton.setName("melonButton"); // NOI18N
        melonButton.setPreferredSize(new java.awt.Dimension(300, 62));
        melonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                melonButtonActionPerformed(evt);
            }
        });

        podButton.setIcon(resourceMap.getIcon("podButton.icon")); // NOI18N
        podButton.setText(resourceMap.getString("podButton.text")); // NOI18N
        podButton.setName("podButton"); // NOI18N
        podButton.setPreferredSize(new java.awt.Dimension(300, 62));
        podButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                podButtonActionPerformed(evt);
            }
        });

        potatoButton.setIcon(resourceMap.getIcon("potatoButton.icon")); // NOI18N
        potatoButton.setText(resourceMap.getString("potatoButton.text")); // NOI18N
        potatoButton.setName("potatoButton"); // NOI18N
        potatoButton.setPreferredSize(new java.awt.Dimension(300, 62));
        potatoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potatoButtonActionPerformed(evt);
            }
        });

        rootVegetableButton.setIcon(resourceMap.getIcon("rootVegetableButton.icon")); // NOI18N
        rootVegetableButton.setText(resourceMap.getString("rootVegetableButton.text")); // NOI18N
        rootVegetableButton.setName("rootVegetableButton"); // NOI18N
        rootVegetableButton.setPreferredSize(new java.awt.Dimension(300, 62));
        rootVegetableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootVegetableButtonActionPerformed(evt);
            }
        });

        vegetableButton.setIcon(resourceMap.getIcon("vegetableButton.icon")); // NOI18N
        vegetableButton.setText(resourceMap.getString("vegetableButton.text")); // NOI18N
        vegetableButton.setName("vegetableButton"); // NOI18N
        vegetableButton.setPreferredSize(new java.awt.Dimension(300, 62));
        vegetableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegetableButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout cardFruitPanelLayout = new org.jdesktop.layout.GroupLayout(cardFruitPanel);
        cardFruitPanel.setLayout(cardFruitPanelLayout);
        cardFruitPanelLayout.setHorizontalGroup(
            cardFruitPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardFruitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(fruitMall, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE))
            .add(cardFruitPanelLayout.createSequentialGroup()
                .add(213, 213, 213)
                .add(fruitMall, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, cardFruitPanelLayout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .add(cardFruitPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(vegetableButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cardFruitPanelLayout.createSequentialGroup()
                        .add(potatoButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(rootVegetableButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(cardFruitPanelLayout.createSequentialGroup()
                        .add(melonButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(podButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(cardFruitPanelLayout.createSequentialGroup()
                        .add(drupeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(herbButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(cardFruitPanelLayout.createSequentialGroup()
                        .add(citrusFruitButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(exoticFruitButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(cardFruitPanelLayout.createSequentialGroup()
                        .add(berryButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(cabbageButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(162, 162, 162))
        );
        cardFruitPanelLayout.setVerticalGroup(
            cardFruitPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardFruitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(fruitMall, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 340, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(42, 42, 42)
                .add(cardFruitPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cabbageButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(berryButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(cardFruitPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(citrusFruitButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(exoticFruitButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(cardFruitPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(drupeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(herbButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(cardFruitPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(melonButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(podButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(cardFruitPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(potatoButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rootVegetableButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(vegetableButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(380, Short.MAX_VALUE))
        );

        centerStagePanel.add(cardFruitPanel, "fruit");

        cardDairyPanel.setName("cardDairyPanel"); // NOI18N

        dairyMall.setName("dairyMall"); // NOI18N

        dairySubButton.setIcon(resourceMap.getIcon("dairySubButton.icon")); // NOI18N
        dairySubButton.setText(resourceMap.getString("dairySubButton.text")); // NOI18N
        dairySubButton.setName("dairySubButton"); // NOI18N
        dairySubButton.setPreferredSize(new java.awt.Dimension(300, 62));
        dairySubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dairySubButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout cardDairyPanelLayout = new org.jdesktop.layout.GroupLayout(cardDairyPanel);
        cardDairyPanel.setLayout(cardDairyPanelLayout);
        cardDairyPanelLayout.setHorizontalGroup(
            cardDairyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(dairyMall, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .add(cardDairyPanelLayout.createSequentialGroup()
                .add(221, 221, 221)
                .add(dairySubButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        cardDairyPanelLayout.setVerticalGroup(
            cardDairyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardDairyPanelLayout.createSequentialGroup()
                .add(dairyMall, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 335, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(dairySubButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(785, Short.MAX_VALUE))
        );

        centerStagePanel.add(cardDairyPanel, "dairy");

        cardMeatPanel.setName("cardMeatPanel"); // NOI18N

        meatMall.setName("meatMall"); // NOI18N

        fishButton.setIcon(resourceMap.getIcon("fishButton.icon")); // NOI18N
        fishButton.setText(resourceMap.getString("fishButton.text")); // NOI18N
        fishButton.setName("fishButton"); // NOI18N
        fishButton.setPreferredSize(new java.awt.Dimension(300, 62));
        fishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fishButtonActionPerformed(evt);
            }
        });

        meatSubButton.setIcon(resourceMap.getIcon("meatSubButton.icon")); // NOI18N
        meatSubButton.setText(resourceMap.getString("meatSubButton.text")); // NOI18N
        meatSubButton.setName("meatSubButton"); // NOI18N
        meatSubButton.setPreferredSize(new java.awt.Dimension(300, 62));
        meatSubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatSubButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout cardMeatPanelLayout = new org.jdesktop.layout.GroupLayout(cardMeatPanel);
        cardMeatPanel.setLayout(cardMeatPanelLayout);
        cardMeatPanelLayout.setHorizontalGroup(
            cardMeatPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(meatMall, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .add(cardMeatPanelLayout.createSequentialGroup()
                .add(103, 103, 103)
                .add(fishButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(meatSubButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        cardMeatPanelLayout.setVerticalGroup(
            cardMeatPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardMeatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(meatMall, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 339, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(cardMeatPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fishButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(meatSubButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(770, Short.MAX_VALUE))
        );

        centerStagePanel.add(cardMeatPanel, "meat");

        cardFavourites.setName("cardFavourites"); // NOI18N

        favMall.setName("favMall"); // NOI18N

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        org.jdesktop.layout.GroupLayout cardFavouritesLayout = new org.jdesktop.layout.GroupLayout(cardFavourites);
        cardFavourites.setLayout(cardFavouritesLayout);
        cardFavouritesLayout.setHorizontalGroup(
            cardFavouritesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(favMall, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .add(cardFavouritesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(cardFavouritesLayout.createSequentialGroup()
                    .add(11, 11, 11)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 712, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(77, Short.MAX_VALUE)))
        );
        cardFavouritesLayout.setVerticalGroup(
            cardFavouritesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardFavouritesLayout.createSequentialGroup()
                .add(favMall, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 346, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(854, Short.MAX_VALUE))
            .add(cardFavouritesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(cardFavouritesLayout.createSequentialGroup()
                    .add(352, 352, 352)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        centerStagePanel.add(cardFavourites, "fav");

        cardDrinksPanel.setName("cardDrinksPanel"); // NOI18N

        drinksMall.setName("drinksMall"); // NOI18N

        coldDrinksButton.setIcon(resourceMap.getIcon("coldDrinksButton.icon")); // NOI18N
        coldDrinksButton.setText(resourceMap.getString("coldDrinksButton.text")); // NOI18N
        coldDrinksButton.setName("coldDrinksButton"); // NOI18N
        coldDrinksButton.setPreferredSize(new java.awt.Dimension(300, 62));
        coldDrinksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coldDrinksButtonActionPerformed(evt);
            }
        });

        hotDrinksButton.setIcon(resourceMap.getIcon("hotDrinksButton.icon")); // NOI18N
        hotDrinksButton.setText(resourceMap.getString("hotDrinksButton.text")); // NOI18N
        hotDrinksButton.setName("hotDrinksButton"); // NOI18N
        hotDrinksButton.setPreferredSize(new java.awt.Dimension(300, 62));
        hotDrinksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotDrinksButtonActionPerformed(evt);
            }
        });

        nutsSeedsButton.setIcon(resourceMap.getIcon("nutsSeedsButton.icon")); // NOI18N
        nutsSeedsButton.setText(resourceMap.getString("nutsSeedsButton.text")); // NOI18N
        nutsSeedsButton.setName("nutsSeedsButton"); // NOI18N
        nutsSeedsButton.setPreferredSize(new java.awt.Dimension(300, 62));
        nutsSeedsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsSeedsButtonActionPerformed(evt);
            }
        });

        sweetsButton.setIcon(resourceMap.getIcon("sweetsButton.icon")); // NOI18N
        sweetsButton.setText(resourceMap.getString("sweetsButton.text")); // NOI18N
        sweetsButton.setName("sweetsButton"); // NOI18N
        sweetsButton.setPreferredSize(new java.awt.Dimension(300, 62));
        sweetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetsButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout cardDrinksPanelLayout = new org.jdesktop.layout.GroupLayout(cardDrinksPanel);
        cardDrinksPanel.setLayout(cardDrinksPanelLayout);
        cardDrinksPanelLayout.setHorizontalGroup(
            cardDrinksPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(drinksMall, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .add(cardDrinksPanelLayout.createSequentialGroup()
                .add(88, 88, 88)
                .add(cardDrinksPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cardDrinksPanelLayout.createSequentialGroup()
                        .add(nutsSeedsButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(sweetsButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(cardDrinksPanelLayout.createSequentialGroup()
                        .add(coldDrinksButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(hotDrinksButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        cardDrinksPanelLayout.setVerticalGroup(
            cardDrinksPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardDrinksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(drinksMall, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 338, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(cardDrinksPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(coldDrinksButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(hotDrinksButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(cardDrinksPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(nutsSeedsButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(sweetsButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(698, Short.MAX_VALUE))
        );

        centerStagePanel.add(cardDrinksPanel, "drinks");

        cardSubCategoryPanel.setName("cardSubCategoryPanel"); // NOI18N

        subCategoryMall.setName("subCategoryMall"); // NOI18N

        org.jdesktop.layout.GroupLayout cardSubCategoryPanelLayout = new org.jdesktop.layout.GroupLayout(cardSubCategoryPanel);
        cardSubCategoryPanel.setLayout(cardSubCategoryPanelLayout);
        cardSubCategoryPanelLayout.setHorizontalGroup(
            cardSubCategoryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(subCategoryMall, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        cardSubCategoryPanelLayout.setVerticalGroup(
            cardSubCategoryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(subCategoryMall, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );

        centerStagePanel.add(cardSubCategoryPanel, "subCategory");

        cardDetailedViewPanel.setName("cardDetailedViewPanel"); // NOI18N

        matStep3Mall1.setName("matStep3Mall1"); // NOI18N

        org.jdesktop.layout.GroupLayout cardDetailedViewPanelLayout = new org.jdesktop.layout.GroupLayout(cardDetailedViewPanel);
        cardDetailedViewPanel.setLayout(cardDetailedViewPanelLayout);
        cardDetailedViewPanelLayout.setHorizontalGroup(
            cardDetailedViewPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardDetailedViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(matStep3Mall1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 639, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        cardDetailedViewPanelLayout.setVerticalGroup(
            cardDetailedViewPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardDetailedViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(matStep3Mall1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 348, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(841, Short.MAX_VALUE))
        );

        centerStagePanel.add(cardDetailedViewPanel, "detailedView");

        cardUserInfoPanel.setName("cardUserInfoPanel"); // NOI18N

        userInfoView1.setName("userInfoView1"); // NOI18N

        org.jdesktop.layout.GroupLayout cardUserInfoPanelLayout = new org.jdesktop.layout.GroupLayout(cardUserInfoPanel);
        cardUserInfoPanel.setLayout(cardUserInfoPanelLayout);
        cardUserInfoPanelLayout.setHorizontalGroup(
            cardUserInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardUserInfoPanelLayout.createSequentialGroup()
                .add(userInfoView1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardUserInfoPanelLayout.setVerticalGroup(
            cardUserInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardUserInfoPanelLayout.createSequentialGroup()
                .add(userInfoView1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        centerStagePanel.add(cardUserInfoPanel, "user");

        cardCashPanel.setName("cardCashPanel"); // NOI18N

        cashRegister1.setName("cashRegister1"); // NOI18N

        org.jdesktop.layout.GroupLayout cardCashPanelLayout = new org.jdesktop.layout.GroupLayout(cardCashPanel);
        cardCashPanel.setLayout(cardCashPanelLayout);
        cardCashPanelLayout.setHorizontalGroup(
            cardCashPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardCashPanelLayout.createSequentialGroup()
                .add(cashRegister1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardCashPanelLayout.setVerticalGroup(
            cardCashPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardCashPanelLayout.createSequentialGroup()
                .add(cashRegister1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        centerStagePanel.add(cardCashPanel, "cash");

        cardPreviousPurchasesPanel.setName("cardPreviousPurchasesPanel"); // NOI18N

        purchases1.setName("purchases1"); // NOI18N

        org.jdesktop.layout.GroupLayout cardPreviousPurchasesPanelLayout = new org.jdesktop.layout.GroupLayout(cardPreviousPurchasesPanel);
        cardPreviousPurchasesPanel.setLayout(cardPreviousPurchasesPanelLayout);
        cardPreviousPurchasesPanelLayout.setHorizontalGroup(
            cardPreviousPurchasesPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardPreviousPurchasesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(purchases1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardPreviousPurchasesPanelLayout.setVerticalGroup(
            cardPreviousPurchasesPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardPreviousPurchasesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(purchases1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        centerStagePanel.add(cardPreviousPurchasesPanel, "purchases");

        cardOrderPlaced.setName("cardOrderPlaced"); // NOI18N

        orderPlacedView1.setName("orderPlacedView1"); // NOI18N

        org.jdesktop.layout.GroupLayout cardOrderPlacedLayout = new org.jdesktop.layout.GroupLayout(cardOrderPlaced);
        cardOrderPlaced.setLayout(cardOrderPlacedLayout);
        cardOrderPlacedLayout.setHorizontalGroup(
            cardOrderPlacedLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(orderPlacedView1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        cardOrderPlacedLayout.setVerticalGroup(
            cardOrderPlacedLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardOrderPlacedLayout.createSequentialGroup()
                .add(orderPlacedView1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 797, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(403, Short.MAX_VALUE))
        );

        centerStagePanel.add(cardOrderPlaced, "orderPlaced");

        cardShoppingListPanel.setName("cardShoppingListPanel"); // NOI18N

        shoppingListView2.setName("shoppingListView2"); // NOI18N

        org.jdesktop.layout.GroupLayout cardShoppingListPanelLayout = new org.jdesktop.layout.GroupLayout(cardShoppingListPanel);
        cardShoppingListPanel.setLayout(cardShoppingListPanelLayout);
        cardShoppingListPanelLayout.setHorizontalGroup(
            cardShoppingListPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, cardShoppingListPanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .add(shoppingListView2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cardShoppingListPanelLayout.setVerticalGroup(
            cardShoppingListPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardShoppingListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(shoppingListView2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(416, Short.MAX_VALUE))
        );

        centerStagePanel.add(cardShoppingListPanel, "listview");

        cardReceiptPabel.setName("cardReceiptPabel"); // NOI18N

        receipt1.setName("receipt1"); // NOI18N

        org.jdesktop.layout.GroupLayout cardReceiptPabelLayout = new org.jdesktop.layout.GroupLayout(cardReceiptPabel);
        cardReceiptPabel.setLayout(cardReceiptPabelLayout);
        cardReceiptPabelLayout.setHorizontalGroup(
            cardReceiptPabelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardReceiptPabelLayout.createSequentialGroup()
                .addContainerGap()
                .add(receipt1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(511, Short.MAX_VALUE))
        );
        cardReceiptPabelLayout.setVerticalGroup(
            cardReceiptPabelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cardReceiptPabelLayout.createSequentialGroup()
                .addContainerGap()
                .add(receipt1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(815, Short.MAX_VALUE))
        );

        centerStagePanel.add(cardReceiptPabel, "receipt");

        mainScrollPane.setViewportView(centerStagePanel);

        org.jdesktop.layout.GroupLayout framePanelLayout = new org.jdesktop.layout.GroupLayout(framePanel);
        framePanel.setLayout(framePanelLayout);
        framePanelLayout.setHorizontalGroup(
            framePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );
        framePanelLayout.setVerticalGroup(
            framePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout bottomContentsPanelLayout = new org.jdesktop.layout.GroupLayout(bottomContentsPanel);
        bottomContentsPanel.setLayout(bottomContentsPanelLayout);
        bottomContentsPanelLayout.setHorizontalGroup(
            bottomContentsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(navigationSearchPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(bottomContentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(shoppingListPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(framePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(actionPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 252, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        bottomContentsPanelLayout.setVerticalGroup(
            bottomContentsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bottomContentsPanelLayout.createSequentialGroup()
                .add(navigationSearchPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(bottomContentsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(actionPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .add(bottomContentsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(framePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                        .add(shoppingListPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        bottomBorderPanel.setBackground(resourceMap.getColor("bottomBorderPanel.background")); // NOI18N
        bottomBorderPanel.setName("bottomBorderPanel"); // NOI18N

        org.jdesktop.layout.GroupLayout bottomBorderPanelLayout = new org.jdesktop.layout.GroupLayout(bottomBorderPanel);
        bottomBorderPanel.setLayout(bottomBorderPanelLayout);
        bottomBorderPanelLayout.setHorizontalGroup(
            bottomBorderPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1402, Short.MAX_VALUE)
        );
        bottomBorderPanelLayout.setVerticalGroup(
            bottomBorderPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 10, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(topNavigationPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1402, Short.MAX_VALUE)
            .add(bottomContentsPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(bottomBorderPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .add(topNavigationPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(bottomContentsPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(bottomBorderPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setComponent(mainPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        presenter.displayCategory(HOME);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void fruitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitButtonActionPerformed
        presenter.displayCategory(FRUIT);
    }//GEN-LAST:event_fruitButtonActionPerformed

    private void meatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatButtonActionPerformed
        presenter.displayCategory(MEAT);
    }//GEN-LAST:event_meatButtonActionPerformed

    private void dairyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dairyButtonActionPerformed
        presenter.displayCategory(DAIRY);
    }//GEN-LAST:event_dairyButtonActionPerformed

    private void pantryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantryButtonActionPerformed
        presenter.displayCategory(PANTRY);
    }//GEN-LAST:event_pantryButtonActionPerformed

    private void snacksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snacksButtonActionPerformed
        presenter.displayCategory(SNACKS);
    }//GEN-LAST:event_snacksButtonActionPerformed

    private void favouritesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favouritesButtonActionPerformed
        jPanel1.removeAll();
        for(Product p: IMatDataHandler.getInstance().favorites())
        {
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
        jPanel1.add(pa);
        jPanel1.revalidate();
        jPanel1.repaint();
        }

        presenter.displayCategory(FAVOURITES);
    }//GEN-LAST:event_favouritesButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        presenter.back();
    }//GEN-LAST:event_backButtonActionPerformed

    private void forwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardButtonActionPerformed
        presenter.forward();
    }//GEN-LAST:event_forwardButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchView1.getResultsPanel().removeAll();
        String text = searchTextField.getText();
        if(text.equals("Till exempel: fralla eller mjölk"))
        {
            return;
        }
        else
        {
            for (Product p : IMatDataHandler.getInstance().findProducts(text)){
                searchView1.addProduct(p);
            }
            presenter.displayCategory(SEARCH);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void showShoppingListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showShoppingListButtonActionPerformed
        presenter.displayCategory(SHOP);
    }//GEN-LAST:event_showShoppingListButtonActionPerformed

    private void breadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breadButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.BREAD))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subPantry, BREAD_HEADER, "Bröd");
    }//GEN-LAST:event_breadButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
       presenter.displayCategory(HELP);
    }//GEN-LAST:event_helpButtonActionPerformed

    private void flourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flourButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.FLOUR_SUGAR_SALT))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subPantry, FLOUR_SUGAR_SALT_HEADER, "Mjöl, socker & salt");
    }//GEN-LAST:event_flourButtonActionPerformed

    private void pastaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastaButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.PASTA))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subPantry, PASTA_HEADER, "Pasta");
    }//GEN-LAST:event_pastaButtonActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        searchButtonActionPerformed(evt);
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void berryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berryButtonActionPerformed
        presenter.clearSubProducts();
         for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.BERRY))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subFruit, BERRY_HEADER, "Bär");
    }//GEN-LAST:event_berryButtonActionPerformed

    private void cabbageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabbageButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.CABBAGE))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subFruit, CABBAGE_HEADER, "Kål");
    }//GEN-LAST:event_cabbageButtonActionPerformed

    private void citrusFruitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citrusFruitButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.CITRUS_FRUIT))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subFruit, CITRUS_FRUIT_HEADER, "Citrusfrukter");
    }//GEN-LAST:event_citrusFruitButtonActionPerformed

    private void exoticFruitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exoticFruitButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.EXOTIC_FRUIT))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subFruit, EXOTIC_FRUIT_HEADER, "Exotiska frukter");
    }//GEN-LAST:event_exoticFruitButtonActionPerformed

    private void drupeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drupeButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.FRUIT))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subFruit, FRUIT_HEADER, "Stenfrukter");
    }//GEN-LAST:event_drupeButtonActionPerformed

    private void herbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_herbButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.HERB))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subFruit, HERB_HEADER, "Örtkryddor");
    }//GEN-LAST:event_herbButtonActionPerformed

    private void melonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_melonButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.MELONS))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subFruit, MELONS_HEADER, "Meloner");
    }//GEN-LAST:event_melonButtonActionPerformed

    private void podButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.POD))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subFruit, POD_HEADER, "Baljväxter");
    }//GEN-LAST:event_podButtonActionPerformed

    private void potatoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potatoButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.POTATO_RICE))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subFruit, POTATO_RICE_HEADER, "Potatis & ris");
    }//GEN-LAST:event_potatoButtonActionPerformed

    private void rootVegetableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootVegetableButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.ROOT_VEGETABLE))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subFruit, ROOT_VEGETABLE_HEADER, "Rotfrukter");
    }//GEN-LAST:event_rootVegetableButtonActionPerformed

    private void vegetableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegetableButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.VEGETABLE_FRUIT))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subFruit, VEGETABLE_FRUIT_HEADER, "Grönsaker");
    }//GEN-LAST:event_vegetableButtonActionPerformed

    private void dairySubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dairySubButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.DAIRIES))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subDairy, DAIRIES_HEADER, "Mejeriprodukter");
    }//GEN-LAST:event_dairySubButtonActionPerformed

    private void fishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.FISH))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subMeat, FISH_HEADER, "Fisk");
    }//GEN-LAST:event_fishButtonActionPerformed

    private void meatSubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatSubButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.MEAT))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subMeat, MEAT_HEADER, "Kött");
    }//GEN-LAST:event_meatSubButtonActionPerformed

    private void coldDrinksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coldDrinksButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.COLD_DRINKS))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subSnacks, COLD_DRINKS_HEADER, "Drycker (kalla)");
    }//GEN-LAST:event_coldDrinksButtonActionPerformed

    private void hotDrinksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotDrinksButtonActionPerformed
        presenter.clearSubProducts();
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.HOT_DRINKS))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subSnacks, HOT_DRINKS_HEADER, "Drycker (varma)");
    }//GEN-LAST:event_hotDrinksButtonActionPerformed

    private void nutsSeedsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsSeedsButtonActionPerformed
        presenter.clearSubProducts(); 
        for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.NUTS_AND_SEEDS))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subSnacks, NUTS_AND_SEEDS_HEADER, "Nötter och frön");
    }//GEN-LAST:event_nutsSeedsButtonActionPerformed

    private void sweetsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetsButtonActionPerformed
        presenter.clearSubProducts();
         for(Product p: IMatDataHandler.getInstance().getProducts(ProductCategory.SWEET))
        {
            subCategoryMall.addProduct(p);
        }
        presenter.displaySubcategory(subSnacks, SNACKS_HEADER, "Sötsaker");
    }//GEN-LAST:event_sweetsButtonActionPerformed

    private void searchTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusGained
        if(searchTextField.getText().equals("Till exempel: fralla eller mjölk")) {
            searchTextField.setText("");
        }
    }//GEN-LAST:event_searchTextFieldFocusGained

    private void searchTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusLost
        if(searchTextField.getText().equals("")) {
            searchTextField.setText("Till exempel: fralla eller mjölk");
        }
    }//GEN-LAST:event_searchTextFieldFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private imat.actionPanel actionPanel1;
    private javax.swing.JButton backButton;
    private javax.swing.JButton berryButton;
    private javax.swing.JPanel bottomBorderPanel;
    private javax.swing.JPanel bottomContentsPanel;
    private javax.swing.JButton breadButton;
    private javax.swing.JButton cabbageButton;
    private javax.swing.JPanel cardCashPanel;
    private javax.swing.JPanel cardDairyPanel;
    private javax.swing.JPanel cardDetailedViewPanel;
    private javax.swing.JPanel cardDrinksPanel;
    private javax.swing.JPanel cardFavourites;
    private javax.swing.JPanel cardFruitPanel;
    private javax.swing.JPanel cardHelpPanel;
    private javax.swing.JPanel cardHomePanel;
    private javax.swing.JPanel cardMeatPanel;
    private javax.swing.JPanel cardOrderPlaced;
    private javax.swing.JPanel cardPantryPanel;
    private javax.swing.JPanel cardPreviousPurchasesPanel;
    private javax.swing.JPanel cardReceiptPabel;
    private javax.swing.JPanel cardSearchPanel;
    private javax.swing.JPanel cardShoppingCartPanel;
    private javax.swing.JPanel cardShoppingListPanel;
    private javax.swing.JPanel cardShoppingPanel;
    private javax.swing.JPanel cardSubCategoryPanel;
    private javax.swing.JPanel cardUserInfoPanel;
    private imat.cashRegister cashRegister1;
    private javax.swing.JPanel centerStagePanel;
    private javax.swing.JButton citrusFruitButton;
    private javax.swing.JButton coldDrinksButton;
    private javax.swing.JButton dairyButton;
    private imat.matMall dairyMall;
    private javax.swing.JButton dairySubButton;
    private imat.matMall drinksMall;
    private javax.swing.JButton drupeButton;
    private javax.swing.JButton exoticFruitButton;
    private imat.matMall favMall;
    private javax.swing.JButton favouritesButton;
    private javax.swing.JButton fishButton;
    private javax.swing.JButton flourButton;
    private javax.swing.JButton forwardButton;
    private javax.swing.JPanel framePanel;
    private javax.swing.JButton fruitButton;
    private imat.matMall fruitMall;
    private javax.swing.JButton helpButton;
    private imat.helpView helpView1;
    private javax.swing.JButton herbButton;
    private javax.swing.JButton homeButton;
    private imat.homeView homeView1;
    private javax.swing.JButton hotDrinksButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private imat.matStep3Mall matStep3Mall1;
    private javax.swing.JButton meatButton;
    private imat.matMall meatMall;
    private javax.swing.JButton meatSubButton;
    private javax.swing.JButton melonButton;
    private javax.swing.JPanel navigationSearchPanel;
    private javax.swing.JButton nutsSeedsButton;
    private imat.OrderPlacedView orderPlacedView1;
    private javax.swing.JButton pantryButton;
    private imat.matMall pantryMall;
    private javax.swing.JButton pastaButton;
    private javax.swing.JButton podButton;
    private javax.swing.JButton potatoButton;
    private imat.Purchases purchases1;
    private imat.Receipt receipt1;
    private javax.swing.JButton rootVegetableButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private imat.SearchView searchView1;
    private imat.shoppingCart shoppingCart1;
    private imat.shoppingList shoppingList1;
    private javax.swing.JPanel shoppingListPanel;
    private imat.ShoppingListView shoppingListView1;
    private imat.ShoppingListView shoppingListView2;
    private javax.swing.JButton showShoppingListButton;
    private javax.swing.JButton snacksButton;
    private imat.matStep2Mall subCategoryMall;
    private javax.swing.JButton sweetsButton;
    private javax.swing.JPanel topNavigationPanel;
    private imat.userInfoView userInfoView1;
    private javax.swing.JButton vegetableButton;
    // End of variables declaration//GEN-END:variables

    public void windowOpened(WindowEvent e) {
        
    }

    public void windowClosing(WindowEvent e) {
        IMatDataHandler.getInstance().shutDown();
    }

    public void windowClosed(WindowEvent e) {
        
    }

    public void windowIconified(WindowEvent e) {
        
    }

    public void windowDeiconified(WindowEvent e) {
        
    }

    public void windowActivated(WindowEvent e) {
        
    }

    public void windowDeactivated(WindowEvent e) {
        
    }

    public void shoppingCartChanged() {
        shoppingCart1.getShoppingCartList().getProductPanel().removeAll();
        cashRegister1.getShoppingCartList().getProductPanel().removeAll();

        for(ShoppingItem item : cart.getItems())
        {
            shoppingCart1.getShoppingCartList().addShoppingItem(item);
            cashRegister1.getShoppingCartList().addShoppingItem(item);
        }
        actionPanel1.updateCartButtonText(cart.getItems().size(), cart.getTotal());
        cashRegister1.updateTotal(cart.getTotal());
    }
    
    public shoppingList getShoppingList(){
        return shoppingList1;
    }
    public void setShoppingList(shoppingList shopping){
        shoppingList1=shopping;
    }
}
