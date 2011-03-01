package imat;

import java.awt.Color;

/**
 *
 * @author max
 */
public class Category {

    private Color  color;
    private String card;

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