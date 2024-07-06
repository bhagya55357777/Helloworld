package place;

public class dav {
	
	    public static void main(String[] args) {
	        int numberOfClassrooms = 100;
	        boolean[] doors = new boolean[numberOfClassrooms + 1]; // +1 to handle 1-based indexing

	        // All doors are initially closed (false)
	        for (int i = 1; i <= numberOfClassrooms; i++) {
	            doors[i] = false;
	        }

	        // Simulate Rajan's actions over the week
	        for (int day = 1; day <= 7; day++) {
	            for (int room = day; room <= numberOfClassrooms; room += day) {
	                doors[room] = !doors[room]; // Toggle the door state
	            }
	        }

	        // Count the number of open and closed doors
	        int openCount = 0;
	        int closedCount = 0;

	        for (int i = 1; i <= numberOfClassrooms; i++) {
	            if (doors[i]) {
	                openCount++;
	            } else {
	                closedCount++;
	            }
	        }

	        System.out.println("Number of Open doors: " + openCount);
	        System.out.println("Number of Closed doors: " + closedCount);
	    }
	}



