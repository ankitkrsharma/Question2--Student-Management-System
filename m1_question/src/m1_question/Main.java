package m1_question;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalRequests = sc.nextInt();
        int k = sc.nextInt();

        Analytics analytics = new Analytics(new AnalyticsStore(), k);

        while (totalRequests-- > 0) {
            String command = sc.next();

            switch (command) {
                case "registerAction":
                    String actionName = sc.next();
                    analytics.registerAction(ActionEnum.valueOf(actionName));
                    break;

                case "getTotalNumberOfLoggedActions":
                    System.out.println(analytics.getTotalNumberOfLoggedActions());
                    break;

                case "getMostFrequentlyUsedActions":
                    List<ActionEnum> actions = analytics.getMostFrequentlyUsedActions();
                    for (ActionEnum a : actions) {
                        System.out.print(a + " ");
                    }
                    System.out.println();
                    break;

                case "getNumberOfActionRegisteredButNotSentToAnalyticsStore":
                    System.out.println(
                        analytics.getNumberOfActionRegisteredButNotSentToAnalyticsStore()
                    );
                    break;
            }
        }
        sc.close();
    }
}
