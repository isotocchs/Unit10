package com.columbushs.unit10;

public class Unit10_1Recursion {
	
	//A recursive method is one that calls itself.
	//Similar to loops. 
	
	public void recursion1(int n) {
		System.out.println(n);
		if (n>2) {
			recursion1(n-1);
		}
		System.out.println(n);
	}
	
	public void recursion2(int n) {
		System.out.println(n);
		if (n>2) {
			recursion1(n+1);
		}
		System.out.println(n);
	}
	
	public int recursion3(int n) {
		if (n==0) {
			return 0;
		}
		return n + recursion3(n/2);
	}
	
	public int recursion4(int n) {
		if (n>0) {
			return n+recursion4(n/2)+recursion4(n/3);
		}
		return 0;
	}
	
	public void recursion5(String s) {
		if (s.length()>1) {
			recursion5(s.substring(2));
			System.out.print(s.substring(0,1));
		}
	}

}
