package place;

public class davsc {
	//room no max toggled and no of times it was toggled
	

	
	    public static void main(String[] args) {
	        int numberOfClassrooms = 100;
	        boolean[] doors = new boolean[numberOfClassrooms + 1]; // +1 to handle 1-based indexing
	        int[] toggleCount = new int[numberOfClassrooms + 1]; // Array to count the number of toggles for each door

	        // All doors are initially closed (false)
	        for (int i = 1; i <= numberOfClassrooms; i++) {
	            doors[i] = false;
	        }

	        // Simulate Rajan's actions over the week
	        for (int day = 1; day <= 7; day++) {
	            for (int room = day; room <= numberOfClassrooms; room += day) {
	                doors[room] = !doors[room]; // Toggle the door state
	                toggleCount[room]++; // Increment the toggle count for this door
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

	        // Find the room number that was toggled the most times
	        int maxToggleCount = 0;
	        int maxToggledRoom = 0;
	        for (int i = 1; i <= numberOfClassrooms; i++) {
	            if (toggleCount[i] > maxToggleCount) {
	                maxToggleCount = toggleCount[i];
	                maxToggledRoom = i;
	            }
	        }

	        System.out.println("Number of Open doors: " + openCount);
	        System.out.println("Number of Closed doors: " + closedCount);
	        System.out.println("Maximum number of times any door was toggled: " + maxToggleCount);
	        System.out.println("Room number that was toggled the most: " + maxToggledRoom);
	    }
	}


