package imat;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 *
 * @author David and Max
 */
public class IMatPresenter implements NavigationHistoryUpdater {

    NavigationHistoryManager historyManager;

    private JPanel           navigationSearchPanel,
                             bottomContentsPanel,
                             bottomBorderPanel,
                             centerStagePanel;
    private HeaderPanel2     headerPanel;

    public IMatPresenter(JButton backButton, JButton forwardButton, JPanel navigationSearchPanel, JPanel bottomContentsPanel, JPanel bottomBorderPanel, JPanel centerStagePanel, HeaderPanel2 headerPanel) {
        this.navigationSearchPanel = navigationSearchPanel;
        this.bottomContentsPanel   = bottomContentsPanel;
        this.bottomBorderPanel     = bottomBorderPanel;
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
        bottomContentsPanel.setBackground(category.getColor());
        bottomBorderPanel.setBackground(category.getColor());
        headerPanel.getHeaderPanelPicLabel().setIcon(category.getPic());
        headerPanel.getHeaderPanelTextPane().setText(category.getDescription());
        
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