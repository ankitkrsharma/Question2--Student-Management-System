package NotificationType;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import NotificationType.InvalidNotificationException;

public class NotificationEngine {
	int batchSize;
	INotificationStore store =new NotificationStore();
	Deque<NotificationType> dq=new ArrayDeque<NotificationType>();
	LinkedHashMap<NotificationType, Integer> lhash=new LinkedHashMap<NotificationType, Integer>();
	
	
	
	
	

    public NotificationEngine(INotificationStore store, int batchSize) {
    	this.batchSize=batchSize;
    	this.store=store;
    }
    
    

    public void addNotification(NotificationType type) {
    	if(type==null) {
    		throw new InvalidNotificationException("Not a valid Input");
    		
    	}
    	dq.addLast(type);
    	lhash.put(type,lhash.getOrDefault(type,0)+1);
    	if(dq.size()==batchSize) {
    		
    		store.save(new ArrayList<NotificationType>(dq));
    		dq.clear();;
    		
    	}
    
    }

    public List<NotificationType> getTopKFrequent(int k){
    	List<NotificationType> result=lhash.entrySet().stream().sorted((i,j)->j.getValue()-i.getValue()).map(i->i.getKey()).limit(k).collect(Collectors.toList());
    	
    	
    	return result;
    	    
    }

    public int getUnsentCount() {
    	return dq.size();
    
    }

}