package imat;

import java.awt.Color;

/**
 *
 * @author max
 */
public class NavigationHistoryState {

    // behöver hålla reda på: kategori, underkategori/detaljvy/kort, kortets innehåll, sökfältet, scroll-position (?)

    Category selectedCategory;

    public NavigationHistoryState() {
        this.selectedCategory = new Category(Color.WHITE, "card4", null);
    }

    public NavigationHistoryState(Category selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    public Category getSelectedCategory() {
        return selectedCategory;
    }
}