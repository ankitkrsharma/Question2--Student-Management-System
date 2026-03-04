package NotificationType;

import java.util.ArrayList;
import java.util.List;

public class NotificationStore implements INotificationStore {
	List<NotificationType> str;

    public NotificationStore() {
    	this.str=new ArrayList<NotificationType>();
    	
    
    }

    @Override
    public void save(List<NotificationType> batch) {

    		str.addAll(batch);
    		
    	
    
    }

}