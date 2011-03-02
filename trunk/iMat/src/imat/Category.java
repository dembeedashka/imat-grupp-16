package imat;

import java.awt.Color;

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

    private Color   color;
    private String  card;

    public Category(Color color, String card) {
        this.color = color;
        this.card = card;
    }

    public String getCard() {
        return card;
    }

    public Color getColor() {
        return color;
    }
}