package NotificationType;



import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create store
        INotificationStore store = new NotificationStore();

        // batchSize = 3
        NotificationEngine engine = new NotificationEngine(store, 3);

        try {

            // ===== EDGE CASE TEST INPUT =====

            // 1️⃣ Normal batch
            engine.addNotification(NotificationType.PUSH);
            engine.addNotification(NotificationType.EMAIL);
            engine.addNotification(NotificationType.SMS);   // batch sent

            // 2️⃣ Duplicate frequency test
            engine.addNotification(NotificationType.EMAIL);
            engine.addNotification(NotificationType.EMAIL);
            engine.addNotification(NotificationType.IN_APP); // batch sent

            // 3️⃣ Partial buffer
            engine.addNotification(NotificationType.SMS);    // remains unsent

            // 4️⃣ More data for tie-frequency case
            engine.addNotification(NotificationType.PUSH);
            engine.addNotification(NotificationType.PUSH);   // batch sent

            // 5️⃣ Additional entries (unsent)
            engine.addNotification(NotificationType.IN_APP);
            engine.addNotification(NotificationType.IN_APP);

            // ===== OUTPUT TESTS =====
            System.out.println("Unsent Count: " + engine.getUnsentCount());

            List<NotificationType> top = engine.getTopKFrequent(2);
            System.out.println("Top 2 Frequent Notifications: " + top);

        } catch (InvalidNotificationException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}