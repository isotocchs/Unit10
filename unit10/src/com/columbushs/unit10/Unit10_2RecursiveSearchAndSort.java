package com.columbushs.unit10;

public class Unit10_2RecursiveSearchAndSort {
	
	int target = 24;
	int [] arraySearch = {0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38};
	int [] arraySearch2 = {0,2,4,6,8,12,34,56,24,32,10,64,26,18,78,30,20,38,48,44};
	
	//Linear Search
	public void linearSearch() {
		
		int position = 0;
		
		while(position<arraySearch.length) {
			int timesRun = position+1;
			System.out.println("Times run: "+timesRun);
			
			if (arraySearch[position]==target) {
				System.out.println("This is where the target is: "+position);
				position=arraySearch.length;
			}
			
			position++;
		}
		
	}
	
	//Binary Search - divide things into chunks
	
	public void binarySearch() {
		
		int lowPosition = 0;
		int midPosition;
		int highPosition = arraySearch.length;
		int timesRun = 1;
		
		while(lowPosition<=highPosition) {
			
			System.out.println("Times run: "+timesRun);
			timesRun++;
			
			midPosition = (highPosition+lowPosition)/2;
			if (arraySearch[midPosition]<target) {
				lowPosition = midPosition+1;
			} else if (arraySearch[midPosition]>target) {
				highPosition = midPosition-1;
			} else {
				System.out.println(midPosition);
				break;
			}
			
		}
		
	}
	
	//Binary Search - recursive
	
	public void binarySearchRecursive(int [] arraySearch, int lowPosition, 
			int highPosition, int target) {
		
		
	}
	
}
