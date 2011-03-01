package imat;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author David
 */
public class iMatPresenter {

    public enum Category {HOME, FRUIT, MEAT, DAIRY, PANTRY, SNACK, FAVOURITES}
      
    
    public iMatPresenter(JPanel navigationSearchPanel) {
        
        this.navigationSearchPanel = navigationSearchPanel;
        
    }
    
    public void homeButtonClick() {
        
        navigationSearchPanel.setBackground(Color.WHITE);

    
    }
            
            
            
            
            
        
  
    
    
    
    
    private javax.swing.JPanel navigationSearchPanel;

}
