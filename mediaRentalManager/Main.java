package mediaRentalManager;

import tests.PublicTests;

public class Main {

	public static void main(String[] args) {
		StringBuffer resultsBuffer = new StringBuffer();
		MediaRentalManager manager = new MediaRentalManager();
		PublicTests.loadCustomersData(manager);
		PublicTests.loadMediaData(manager);
					
		if (!manager.addToQueue("Albert, Mike", "Rocky")) {
			resultsBuffer.append("Failed to add to queue");
		}
		if (!manager.addToQueue("Smith, John", "Mickey")) {
			resultsBuffer.append("Failed to add to queue");
		}
		resultsBuffer.append(manager.processRequests());
		resultsBuffer.append("Result of processing requests\n");
		resultsBuffer.append("**** Customer Info ****\n");
		resultsBuffer.append(manager.getAllCustomersInfo());
		resultsBuffer.append("\n**** Media Info ****\n");
		resultsBuffer.append(manager.getAllMediaInfo());
		
		manager.returnMedia("Smith, John", "Mickey");
		resultsBuffer.append("\nAfter returning media\n");
		resultsBuffer.append(manager.getAllCustomersInfo());
		resultsBuffer.append(manager.getAllMediaInfo());
		System.out.println(resultsBuffer.toString());
	}

}
