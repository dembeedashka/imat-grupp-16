/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package imat;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author David
 */
public class iMatPresenter {
    
      
    
    public iMatPresenter(JPanel navigationSearchPanel) {
        
        this.navigationSearchPanel = navigationSearchPanel;
        
    }
    
    public void homeButtonClick() {
        
        navigationSearchPanel.setBackground(Color.WHITE);

    
    }
            
            
            
            
            
        
  
    
    
    
    
    private javax.swing.JPanel navigationSearchPanel;

}
