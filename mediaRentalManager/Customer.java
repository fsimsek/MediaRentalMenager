package mediaRentalManager;

import java.util.ArrayList;
import java.util.List;

/*
 * Create getters/setters
 * constructors
 */
public class Customer {
	
	private String name;
	private String address;
	private String plan;
	
	private List<String> rented = new ArrayList<>();
	private List<String> queued = new ArrayList<>();
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPlan() {
		return plan;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public List<String> getRented() {
		return rented;
	}

	public List<String> getQueued() {
		return queued;
	}

	public void setRented(List<String> rented) {
		this.rented = rented;
	}

	public void setQueued(List<String> queued) {
		this.queued = queued;
	}

	public Customer(String name, String address, String plan) {
		super();
		this.name = name;
		this.address = address;
		this.plan = plan;
	}

	public void addToQueuedList(String mediaTitle) {
		//add mediaTitle to queued list
		queued.add(mediaTitle);
	}
	
	public void addToRentedList(String mediaTitle) {
		//add mediaTitle to rented list
		rented.add(mediaTitle);
	}
	
	public void removeFromQueuedList(String mediaTitle) {
		//remove mediaTitle from queued list
		int removeFromQueuedListIndex = queued.indexOf(mediaTitle);
		if(removeFromQueuedListIndex!=-1)
			queued.remove(removeFromQueuedListIndex);
	}
	
	public void removeFromRentedList(String mediaTitle) {
		//remove mediaTitle from rented list
		int removeFromRentedListIndex = rented.indexOf(mediaTitle);
			if(removeFromRentedListIndex!=-1)
				rented.remove(removeFromRentedListIndex);
	}
	
	//return object info in this format:
	/*Name: Albert, Mike, Address: 11 Apple Mount VA, Plan: LIMITED
	  Rented: []
	  Queue: []
	*/
	@Override
	public String toString() {
		return "Name: " +name+", Address: "+address+", Plan: "+plan + "\nRented: "+ rented.toString() +"\nQueue: "+queued.toString();
	}
	
}
