package imat;

import imat.navigationhistory.NavigationHistoryUpdater;
import imat.navigationhistory.NavigationHistoryState;
import imat.navigationhistory.NavigationHistoryManager;
import imat.categories.Category;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingCart;


/**
 * This class uses the singleton pattern.
 * @author David and Max
 */
public class IMatPresenter implements NavigationHistoryUpdater {

    private static IMatPresenter instance;

    private NavigationHistoryManager historyManager;

    private JPanel                   navigationSearchPanel,
                                     bottomContentsPanel,
                                     bottomBorderPanel,
                                     centerStagePanel;

    private JScrollPane              mainScrollPane;

    private shoppingCart             shoppingCartPanel;

    
    private matStep2Mall             subCategoryMall;
    private matStep3Mall             productDetails;
    
    private String                   productDetailsCard;

    private IMatPresenter() {
    }

    public void init(JButton backButton, JButton forwardButton, JPanel navigationSearchPanel, JPanel bottomContentsPanel, JPanel bottomBorderPanel, JPanel centerStagePanel, matStep2Mall subCategoryMall, matStep3Mall productDetails, JScrollPane mainScrollPane, shoppingCart shoppingCartPanel, String productDetailsCard) {
        this.navigationSearchPanel = navigationSearchPanel;
        this.bottomContentsPanel   = bottomContentsPanel;
        this.bottomBorderPanel     = bottomBorderPanel;
        this.centerStagePanel      = centerStagePanel;
        this.subCategoryMall       = subCategoryMall;
        this.productDetails        = productDetails;
        this.mainScrollPane        = mainScrollPane;
        this.productDetailsCard    = productDetailsCard;
        this.shoppingCartPanel     = shoppingCartPanel;

        historyManager             = new NavigationHistoryManager(backButton, forwardButton);
        historyManager.init(this, new NavigationHistoryState());
    }


    public void addToCart () {

    }

    public static synchronized IMatPresenter getInstance() {
        if(instance == null) {
            instance = new IMatPresenter();
        }

        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }


    public shoppingCart getShoppingCartPanel () {
        return shoppingCartPanel;
    }

    /**
     * Update GUI by calling the Navigation History Manager that calls method updateState below.
     */
    public void displayCategory(Category category) {
        historyManager.update(new NavigationHistoryState(category));
    }

    public void displaySubcategory(Category selectedCategory, ImageIcon headerIcon, String description) {
        historyManager.update(new NavigationHistoryState(selectedCategory, headerIcon, description));
    }

    public void displayProduct(Category selectedCategory, Product productDetails) {
        historyManager.update(new NavigationHistoryState(selectedCategory, productDetails));
    }

    /**
     * Called by the Navigation History Manager through the display method above.
     */
    public void updateState(NavigationHistoryState state) {
        CardLayout layout     = (CardLayout) centerStagePanel.getLayout();
        Category   category   = state.getSelectedCategory();
        Color      color      = category.getColor();
        Product    product    = state.getProduct();

        navigationSearchPanel.setBackground(color);
        bottomContentsPanel.setBackground(color);
        bottomBorderPanel.setBackground(color);

        // update header and description for subcategory template only
        if(category.getClass() != Category.class) {
            subCategoryMall.setPic(state.getHeaderIcon());
            subCategoryMall.setDescription(state.getDescription());
        }
        
        if(product != null) {
            productDetails.showProduct(product);
            layout.show(centerStagePanel, productDetailsCard);
        }
        else {
            layout.show(centerStagePanel, category.getCard());
        }

        // reset scroll bar position
        mainScrollPane.getViewport().setViewPosition(new java.awt.Point(0, 0));
    }

    /**
     * Called by the Navigation History Manager through the back and forward methods below.
     */
    public void updateHistoryState(NavigationHistoryState state) {
        updateState(state);
    }

    /**
     * Called when pressing the back button.
     */
    public void back() {
        historyManager.back();
    }

    /**
     * Called when pressing the forward button.
     */
    public void forward() {
        historyManager.forward();
    }

    public void clearSubProducts()
    {
        subCategoryMall.getProductPanel().removeAll();
    }

    public Category getCurrentCategory() {
        return historyManager.getCurrentState().getSelectedCategory();
    }
}