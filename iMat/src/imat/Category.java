package imat;

import java.awt.Color;

/**
 *
 * @author max
 */
public class Category {

    /* Category colors */
    public static final Color HOME_WHITE      = Color.WHITE;
    public static final Color FRUIT_GREEN     = new Color(0, 0, 0);
    public static final Color MEAT_RED        = new Color(0, 0, 0);
    public static final Color DAIRY_BLUE      = new Color(0, 0, 0);
    public static final Color PANTRY_YELLOW   = new Color(0, 0, 0);
    public static final Color SNACKS_ORANGE   = new Color(0, 0, 0);
    public static final Color FAVOURITE_BROWN = new Color(0, 0, 0);

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