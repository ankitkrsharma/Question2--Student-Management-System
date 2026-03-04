package m1_question;

import java.util.LinkedList;
import java.util.Queue;

public class AnalyticsStore implements IAnalyticsStore {

    private Queue<ActionEnum> store=new LinkedList<ActionEnum>();

    @Override
    public void storeActions(Queue<ActionEnum> actions) {
        store.addAll(actions);
    }

    @Override
    public Queue<ActionEnum> getLoggedActionsInStore() {
        return store;
    }
}
