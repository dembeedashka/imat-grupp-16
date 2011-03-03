package imat;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author David and Max
 */
public class IMatPresenter implements NavigationHistoryUpdater {

    NavigationHistoryManager historyManager;

    private JPanel           navigationSearchPanel,
                             framePanel,
                             centerStagePanel;
    private HeaderPanel1     headerPanel;

    public IMatPresenter(JButton backButton, JButton forwardButton, JPanel navigationSearchPanel, JPanel framePanel, JPanel centerStagePanel, HeaderPanel1 headerPanel) {
        this.navigationSearchPanel = navigationSearchPanel;
        this.framePanel            = framePanel;
        this.centerStagePanel      = centerStagePanel;
        this.headerPanel           = headerPanel;

        init(backButton, forwardButton);
    }

    private void init(JButton backButton, JButton forwardButton) {
        historyManager = new NavigationHistoryManager(backButton, forwardButton);
        historyManager.init(this, new NavigationHistoryState());
    }

    /**
     * Update GUI.
     */
    public void display(Category category) {
        historyManager.update(new NavigationHistoryState(category, null));
    }

    /**
     * Called by the Navigation History Manager through the display method above.
     */
    public void updateState(NavigationHistoryState state) {
        CardLayout layout = (CardLayout) centerStagePanel.getLayout();
        Category category = state.getSelectedCategory();

        navigationSearchPanel.setBackground(category.getColor());
        framePanel.setBackground(category.getColor());
        //headerPanel.getHeaderPicLabel().setIcon(category.getPic());
        //headerPanel.getHeaderTextPane().setText(category.getDescription());
        
        layout.show(centerStagePanel, category.getCard());

    }

    /**
     * Called by the Navigation History Manager through the back and forward methods below.
     */
    public void updateHistoryState(NavigationHistoryState state) {
        updateState(state);
    }

    /**
     * Called when pressing the back button.
     */
    public void back() {
        historyManager.back();
    }

    /**
     * Called when pressing the forward button.
     */
    public void forward() {
        historyManager.forward();
    }
}