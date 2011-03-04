package imat.navigationhistory;

/**
 *
 * @author max
 */
public interface NavigationHistoryUpdater {

    public abstract void updateState(NavigationHistoryState state);
    public abstract void updateHistoryState(NavigationHistoryState state);
}
