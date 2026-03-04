package m1_question;

import java.util.Queue;

public interface IAnalyticsStore {
    void storeActions(Queue<ActionEnum> actions);
    Queue<ActionEnum> getLoggedActionsInStore();
}

