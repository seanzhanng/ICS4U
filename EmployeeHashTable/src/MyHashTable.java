import java.util.*;


public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in the array holds the
	// reference value of an ArrayList.  Each item in an ArrayList holds
	// a reference value pointing to a Employee.

	public ArrayList<EmployeeInfo>[] buckets;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate buckets as an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
	}


	// METHODS

	public int calcBucket(int sN) {
		return(sN % buckets.length);  // Employee number modulo number of buckets
	}


	public void addToTable(EmployeeInfo theEmployee) {
		// Add the Employee referenced by theEmployee to the hash table.
		
		if (theEmployee == null) {
			return; // Nothing to do!
		}
		
		// CODE GOES HERE
		int whichBucket = calcBucket(theEmployee.empNum);
		buckets[whichBucket].add(theEmployee);
		
	}  // end addToTable


	public EmployeeInfo removeFromTable(int EmployeeNum) {
		// Remove that Employee from the hash table and return the reference value for that Employee.
		// Return null if that Employee isn't in the table.

		// CODE GOES HERE
		int whichBucket = calcBucket(EmployeeNum);
		for (int i = 0; i < buckets[whichBucket].size(); i++) {
			if (buckets[whichBucket].get(i).empNum == EmployeeNum) {
				return buckets[whichBucket].remove(i);
			}
		}

		return(null);
		
	}  // end removeFromTable

	
	public EmployeeInfo getFromTable(int EmployeeNum) {
		// Return the reference value for that Employee, return null if Employee isn't in the table.

		// CODE GOES HERE
		int whichBucket = calcBucket(EmployeeNum);
		for (int i = 0; i < buckets[whichBucket].size(); i++) {
			if (buckets[whichBucket].get(i).empNum == EmployeeNum) {
				return buckets[whichBucket].get(i);
			}
		}

		return(null);
		

	}  // end getFromTable


	public void displayTable() {
		
		// Walk through the buckets and display the items in each bucket's ArrayList.
		
		System.out.println("\n\nHERE ARE THE CONTENTS OF THE TABLE:\n");
		for (int i = 0; i < buckets.length; i++) {
			if (buckets[i].isEmpty()) {
				System.out.println("BUCKET " + i + " has an empty ArrayList!\n");
			}
			else {
				System.out.println("BUCKET " + i + " has an ArrayList holding the following Employees:");
				// Print out the first name of each Employee in the ArrayList for the current bucket.
				for (int j = 0; j < buckets[i].size(); j++) {
					System.out.println("  " + buckets[i].get(j).firstName);
				}
			}
		}
		
	} // end displayTable


}
