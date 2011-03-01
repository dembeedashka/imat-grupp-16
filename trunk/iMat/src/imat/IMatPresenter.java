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

    private JButton          backButton,
                             forwardButton;

    private JPanel           navigationSearchPanel,
                             framePanel,
                             centerStagePanel;

    public IMatPresenter(JButton backButton, JButton forwardButton, JPanel navigationSearchPanel, JPanel framePanel, JPanel centerStagePanel) {
        this.backButton            = backButton;
        this.forwardButton         = forwardButton;
        this.navigationSearchPanel = navigationSearchPanel;
        this.framePanel            = framePanel;
        this.centerStagePanel      = centerStagePanel;

        historyManager             = new NavigationHistoryManager(backButton, forwardButton);
        historyManager.init(this, new NavigationHistoryState());
    }

    public void display(Category category) {
        historyManager.update(new NavigationHistoryState(category));
    }

    public void updateState(NavigationHistoryState state) {
        CardLayout layout = (CardLayout) centerStagePanel.getLayout();

        navigationSearchPanel.setBackground(state.getSelectedCategory().getColor());
        framePanel.setBackground(state.getSelectedCategory().getColor());
        layout.show(centerStagePanel, state.getSelectedCategory().getCard());
    }

    public void updateHistoryState(NavigationHistoryState state) {
        updateState(state);
    }

    public void back() {
        historyManager.back();
    }

    public void forward() {
        historyManager.forward();
    }
}