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
	//- good when things are in order
	
	public void binarySearch() {
		
		int lowPosition = 0;
		int midPosition;
		int highPosition = arraySearch.length;
		int timesRun = 1;
		
		
		while(lowPosition<=highPosition) {
			
			System.out.println("Times run: "+timesRun);
			timesRun++;
			//int [] arraySearch = {0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38};
			midPosition = (highPosition+lowPosition)/2;
			if (arraySearch[midPosition]<target) {
				lowPosition = midPosition+1;
			} else if (arraySearch[midPosition]>target) {
				highPosition = midPosition-1;
			} else {
				System.out.println("This is where the target is: "+midPosition);
				break;
			}
			
		}
		
	}
	
	//Binary Search - recursive
	
	public void binarySearchRecursive(int [] arraySearch, int lowPosition, 
			int highPosition, int target) {
		
		int midPosition;
		System.out.println("Times run");
		midPosition = (highPosition+lowPosition)/2;
			if (arraySearch[midPosition]<target) {
				binarySearchRecursive(arraySearch, midPosition+1, highPosition, target);
			} 
			if (arraySearch[midPosition]>target) {
				binarySearchRecursive(arraySearch, lowPosition, midPosition-1, target);	
			}
			System.out.println("Found it in position: "+midPosition);
		}
	
	
	public int[] mergeSort(int[] a, int n) {
		
	
	//left	
	//right
	//merge
		if (n < 2) {
	        return a;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];

	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);

	    return merge(a, l, r, mid, n - mid);
		
	}
	
	public static int[] merge(
			  int[] a, int[] l, int[] r, int left, int right) {
			 
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			    return a;
			}
	
}
