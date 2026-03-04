										package m1_question;

import java.util.*;

public class Analytics {

    private IAnalyticsStore analyticsStore;
    private int k;

    private Queue<ActionEnum> buffer;
    private Map<ActionEnum, Integer> frequencyMap;

    public Analytics(IAnalyticsStore analyticsStore, int k) {
        this.analyticsStore = analyticsStore;
        this.k = k;
        this.buffer = new LinkedList<>();
        this.frequencyMap = new HashMap<>();
    }

    public void registerAction(ActionEnum action) {
        buffer.add(action);
        frequencyMap.put(action, frequencyMap.getOrDefault(action, 0) + 1);

        if (buffer.size() == k) {
            analyticsStore.storeActions(new LinkedList<>(buffer));
            buffer.clear();
        }
    }

    public int getNumberOfActionRegisteredButNotSentToAnalyticsStore() {
        return buffer.size();
    }

    public int getTotalNumberOfLoggedActions() {
        return analyticsStore.getLoggedActionsInStore().size()
                + getNumberOfActionRegisteredButNotSentToAnalyticsStore();
    }

    public List<ActionEnum> getMostFrequentlyUsedActions() {
        int maxFreq = 0;
        for (int v : frequencyMap.values()) {
            maxFreq = Math.max(maxFreq, v);
        }

        List<ActionEnum> result = new ArrayList<>();
        for (Map.Entry<ActionEnum, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                result.add(entry.getKey());
            }
        }
        	

       //result.sort(Comparator.comparing(Enum::name));
        return result;
    }
}
