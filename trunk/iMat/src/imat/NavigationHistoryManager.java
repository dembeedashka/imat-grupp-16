package imat;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JButton;

/**
 * A manager for keeping track of history states and back and forward buttons,
 * much like the navigation history of a browser.
 * 
 * @author max
 */
public class NavigationHistoryManager {

    // the actual GUI updater
    private NavigationHistoryUpdater     updater;

    private boolean                      initFlag,
                                         ignoreUpdates;

    private List<NavigationHistoryState> history;
    private int                          historyIndex;

    private JButton                      backButton,
                                         forwardButton;

    public NavigationHistoryManager(JButton backButton, JButton forwardButton) {
        this.backButton    = backButton;
        this.forwardButton = forwardButton;
    }

    /**
     * Must be called after an instance of NavigationHistoryManager is created before it can be used.
     * All other public methods in this class should start by calling initCheck() to verify this.
     */
    public void init(NavigationHistoryUpdater updater, NavigationHistoryState initialState) {
        if(!initFlag) {
            initFlag       = true;
            history        = new LinkedList<NavigationHistoryState>();
            historyIndex   = -1;
            this.updater   = updater;
            
            update(initialState);
        }
    }

    public NavigationHistoryState getCurrentState() {
        initCheck();
        return history.get(historyIndex);
    }

    public void back() {
        initCheck();
        
        if(hasBackHistory()) {
            historyIndex--;
            updateHistoryState();
        }
    }

    public void forward() {
        initCheck();

        if(hasForwardHistory()) {
            historyIndex++;
            updateHistoryState();
        }
    }

    /**
     * Used to block updates caused by repeated firing of events due to state
     * changes caused by ongoing navigation history manager updates to avoid
     * inifite loops.
     */
    public void setIgnoreUpdates(boolean ignore) {
        initCheck();
        ignoreUpdates = ignore;
    }

    public boolean isIgnoreUpdates() {
        initCheck();
        return ignoreUpdates;
    }

    /**
     * Adds the new state to the history and updates the state.
     */
    public void update(NavigationHistoryState newState) {
        initCheck();

        if(isIgnoreUpdates()) {
            return;
        }

        if(hasForwardHistory()) {
            // discard all forward history
            history = history.subList(0, historyIndex + 1);
        }

        history.add(newState);
        historyIndex++;
        updateState();
    }

    /**
     * Used to update the state to previously stored history states.
     */
    private void updateHistoryState() {
        updater.updateHistoryState(getCurrentState());
        updateButtons();
    }

    /**
     * Used to update the state when a state change occurs.
     */
    private void updateState() {
        updater.updateState(getCurrentState());
        updateButtons();
    }

    /**
     * Enables and disables the back and forward buttons based on the history.
     */
    private void updateButtons() {
        if(backButton != null) {
            backButton.setEnabled(hasBackHistory());
        }
        if(forwardButton != null) {
            forwardButton.setEnabled(hasForwardHistory());
        }
    }

    private boolean hasBackHistory() {
        // return the boolean value for the back button's 'enabled' property
        return historyIndex > 0;
    }

    private boolean hasForwardHistory() {
        // return the boolean value for the forward button's 'enabled' property
        return historyIndex < (history.size() -1);
    }

    private void initCheck() {
        if(!initFlag) {
            throw new IllegalStateException("The navigation history manager has not been initiated.");
        }
    }
}