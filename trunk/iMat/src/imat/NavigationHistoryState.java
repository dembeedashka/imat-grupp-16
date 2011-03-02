package imat;

import java.awt.Color;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author max
 */
public class NavigationHistoryState {

    // behöver hålla reda på: kategori, underkategori/detaljvy/kort, kortets innehåll, sökfältet, scroll-position (?)

    Category selectedCategory;
    Product  productDetails;

    public NavigationHistoryState() {
        this.selectedCategory = new Category(Color.WHITE, "card4");
    }

    public NavigationHistoryState(Category selectedCategory, Product productDetails) {
        this.selectedCategory = selectedCategory;
        this.productDetails   = productDetails;
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
        if (this.productDetails != other.productDetails && (this.productDetails == null || !this.productDetails.equals(other.productDetails))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.selectedCategory != null ? this.selectedCategory.hashCode() : 0);
        hash = 97 * hash + (this.productDetails != null ? this.productDetails.hashCode() : 0);
        return hash;
    }
}