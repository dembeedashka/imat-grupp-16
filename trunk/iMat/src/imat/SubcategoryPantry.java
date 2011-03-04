package imat;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author max
 */
public class SubcategoryPantry extends Category {

    public SubcategoryPantry(String card, ImageIcon pic, String description, JPanel contentsPanel) {
        super(Category.PANTRY_YELLOW, card, pic, description, contentsPanel);
    }

}
