package com.binary;

public class BinarySearch {
	
	public static void search(int first, int last, int key,int ar[]) {
		int mid= (first+last)/2;
		//while loop
		while(first<=last) {
		if(ar[mid]==key) {
			System.out.println(key +" found at the index "+ mid);
			break;
		}
		else if(ar[mid]<key) {
			first=mid+1;
		}else {
			last=mid-1;
		}
		mid= (first+last)/2;
		
	}
		
		
		if(first>last) {
		System.out.println("not Found");
	}
		}
	
	
	public static void main(String args[]) {
		int ar[]= {12,13,14,23,34,45,56,67,78};
		int key=45;
		int last = ar.length;
		search(0,last,key,ar);
	}
	

}
