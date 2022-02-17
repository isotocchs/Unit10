package com.columbushs.unit10;

public class Unit10Main {

	public static void main(String[] args) {
		
		Unit10_1Recursion recur = new Unit10_1Recursion();
		//recur.recursion1(4);
		//recur.recursion2(4);
		
		//System.out.println(recur.recursion3(8));
		
		//System.out.println(recur.recursion4(4));
		
		//recur.recursion5("apple");
		System.out.println(1234%10);
		
		int target = 24;
		int [] arraySearch = {0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38};
		int [] arraySearch2 = {0,2,4,6,8,12,34,56,24,32,10,64,26,18,78,30,20,38,48,44};
		int lowPosition = 0;
		int midPosition;
		int highPosition = arraySearch2.length;
		
		Unit10_2RecursiveSearchAndSort sort = new Unit10_2RecursiveSearchAndSort();
		//sort.linearSearch();
		//sort.binarySearch();
		//sort.binarySearchRecursive(arraySearch, lowPosition, highPosition, target);
		//why extra????
		
		//int[] array3 = sort.mergeSort(arraySearch2, arraySearch2.length);
		
//		for(int num:array3) {
//			System.out.print(num+" ");
//		}
	}

}
