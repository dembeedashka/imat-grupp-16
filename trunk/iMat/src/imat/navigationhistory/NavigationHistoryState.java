package imat.navigationhistory;

import imat.IMatView;
import imat.categories.Category;
import javax.swing.ImageIcon;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author max
 */
public class NavigationHistoryState {

    // behöver hålla reda på: kategori, underkategori/detaljvy/kort, kortets innehåll, sökfältet, scroll-position (?)

    Category  selectedCategory; // used to get color and card to show
    ImageIcon headerIcon;
    String    description;
    Product   productDetails;   // should be null unless product details are shown in the state

    public NavigationHistoryState() {
        this(IMatView.home, null);
    }

    public NavigationHistoryState(Category selectedCategory) {
        this(selectedCategory, null);
    }

    public NavigationHistoryState(Category selectedCategory, Product productDetails) {
        this.selectedCategory    = selectedCategory;
        this.headerIcon          = selectedCategory.getHeaderIcon();
        this.description         = selectedCategory.getDescription();
        this.productDetails      = productDetails;
    }

    public Product getProductDetails() {
        return productDetails;
    }

    public Category getSelectedCategory() {
        return selectedCategory;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NavigationHistoryState other = (NavigationHistoryState) obj;
        if (this.selectedCategory != other.selectedCategory && (this.selectedCategory == null || !this.selectedCategory.equals(other.selectedCategory))) {
            return false;
        }
        if (this.headerIcon != other.headerIcon && (this.headerIcon == null || !this.headerIcon.equals(other.headerIcon))) {
            return false;
        }
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        if (this.productDetails != other.productDetails && (this.productDetails == null || !this.productDetails.equals(other.productDetails))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.selectedCategory != null ? this.selectedCategory.hashCode() : 0);
        hash = 53 * hash + (this.headerIcon != null ? this.headerIcon.hashCode() : 0);
        hash = 53 * hash + (this.description != null ? this.description.hashCode() : 0);
        hash = 53 * hash + (this.productDetails != null ? this.productDetails.hashCode() : 0);
        return hash;
    }
}