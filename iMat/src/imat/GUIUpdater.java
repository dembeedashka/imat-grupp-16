package imat;

/**
 *
 * @author max
 */
public class GUIUpdater implements NavigationHistoryUpdater {

    private NavigationHistoryManager manager;

    public GUIUpdater() {
    }

    public void updateState(NavigationHistoryState state) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateHistoryState(NavigationHistoryState state) {
        manager.setIgnoreUpdates(true);
        updateState(state);
        manager.setIgnoreUpdates(false);
    }

    public NavigationHistoryManager getManager() {
        return manager;
    }

    public void setManager(NavigationHistoryManager manager) {
        this.manager = manager;
    }

}