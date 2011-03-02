package imat;

import java.awt.Color;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author max
 */
public class Category {

    private Color   color;
    private String  card;
    private Product product;

    public Category(Color color, String card, Product product) {
        this.color = color;
        this.card = card;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public String getCard() {
        return card;
    }

    public Color getColor() {
        return color;
    }
}