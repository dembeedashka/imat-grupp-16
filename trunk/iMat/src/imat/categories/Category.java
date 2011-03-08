package imat.categories;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author max
 */
public class Category {

    /* Category colors */
    public static final Color HOME_WHITE       = Color.WHITE;
    public static final Color FRUIT_GREEN      = new Color(143, 228, 139);
    public static final Color MEAT_RED         = new Color(228, 139, 139);
    public static final Color DAIRY_BLUE       = new Color(139, 194, 228);
    public static final Color PANTRY_YELLOW    = new Color(228, 227, 139);
    public static final Color SNACKS_ORANGE    = new Color(234, 168, 82);
    public static final Color FAVOURITES_BROWN = new Color(143, 110, 67);

    protected Color     color;
    protected String    card;
    protected ImageIcon headerIcon;
    protected String    description;

    public Category(Color color, String card, ImageIcon headerIcon, String description) {
        this.color       = color;
        this.card        = card;
        this.headerIcon  = headerIcon;
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHeaderIcon(ImageIcon headerIcon) {
        this.headerIcon = headerIcon;
    }

    public String getDescription() {
        return description;
    }

    public ImageIcon getHeaderIcon() {
        return headerIcon;
    }

    public String getCard() {
        return card;
    }

    public Color getColor() {
        return color;
    }
}