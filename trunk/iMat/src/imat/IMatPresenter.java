package imat;

import imat.navigationhistory.NavigationHistoryUpdater;
import imat.navigationhistory.NavigationHistoryState;
import imat.navigationhistory.NavigationHistoryManager;
import imat.categories.Category;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import se.chalmers.ait.dat215.project.Product;


/**
 *
 * @author David and Max
 */
public class IMatPresenter implements NavigationHistoryUpdater {

    NavigationHistoryManager historyManager;

    private JPanel           navigationSearchPanel,
                             bottomContentsPanel,
                             bottomBorderPanel,
                             centerStagePanel;
    
    matStep2Mall             subCategoryMall;
    matStep3Mall             productDetails;

    public IMatPresenter(JButton backButton, JButton forwardButton, JPanel navigationSearchPanel, JPanel bottomContentsPanel, JPanel bottomBorderPanel, JPanel centerStagePanel, matStep2Mall subCategoryMall, matStep3Mall productDetails) {
        this.navigationSearchPanel = navigationSearchPanel;
        this.bottomContentsPanel   = bottomContentsPanel;
        this.bottomBorderPanel     = bottomBorderPanel;
        this.centerStagePanel      = centerStagePanel;
        this.subCategoryMall       = subCategoryMall;
        this.productDetails        = productDetails;

        init(backButton, forwardButton);
    }

    private void init(JButton backButton, JButton forwardButton) {
        historyManager = new NavigationHistoryManager(backButton, forwardButton);
        historyManager.init(this, new NavigationHistoryState());
    }

    /**
     * Update GUI by calling the Navigation History Manager that calls method updateState below.
     */
    public void display(Category category) {
        historyManager.update(new NavigationHistoryState(category));
    }

    public void display(Category selectedCategory, Product productDetails) {
        historyManager.update(new NavigationHistoryState(selectedCategory, productDetails));
    }

    /**
     * Called by the Navigation History Manager through the display method above.
     */
    public void updateState(NavigationHistoryState state) {
        CardLayout layout     = (CardLayout) centerStagePanel.getLayout();
        Category   category   = state.getSelectedCategory();
        Color      color      = category.getColor();
        Product    product    = state.getProductDetails();

        navigationSearchPanel.setBackground(color);
        bottomContentsPanel.setBackground(color);
        bottomBorderPanel.setBackground(color);

        // update header and description for subcategory template only
        if(category.getClass() != Category.class) {
            subCategoryMall.setPic(state.getHeaderIcon());
            subCategoryMall.setDescription(state.getDescription());
        }
        
        if(product != null) {
            // TODO: update product details stuff
            productDetails.showProduct(product);
        }

        layout.show(centerStagePanel, category.getCard());
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
}