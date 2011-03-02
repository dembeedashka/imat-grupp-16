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
                             framePanel,
                             centerStagePanel;

    public IMatPresenter(JButton backButton, JButton forwardButton, JPanel navigationSearchPanel, JPanel framePanel, JPanel centerStagePanel) {
        this.navigationSearchPanel = navigationSearchPanel;
        this.framePanel            = framePanel;
        this.centerStagePanel      = centerStagePanel;

        historyManager             = new NavigationHistoryManager(backButton, forwardButton);
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

        navigationSearchPanel.setBackground(state.getSelectedCategory().getColor());
        framePanel.setBackground(state.getSelectedCategory().getColor());
        layout.show(centerStagePanel, state.getSelectedCategory().getCard());
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