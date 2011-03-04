package imat;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author max
 */
public class SubcategoryFruit extends Category {

    public SubcategoryFruit(String card, ImageIcon pic, String description, JPanel contentsPanel) {
        super(Category.FRUIT_GREEN, card, pic, description, contentsPanel);
    }

}
