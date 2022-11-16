package com.binary3;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {12,23,34,45,56,67,78};
		int last= a.length-1;
		int key=34;
		BinarySearch(a,last,0,key);

	}

	private static void BinarySearch(int[] a, int last, int first, int key) {
		// TODO Auto-generated method stub
		int mid=(first+last)/2;
		
		while(first<=last) {
		if(a[mid]==key) {
			System.out.println("fount at "+ mid);
			break;
		}
		else if(a[mid]>key) {
			last=mid-1;
			
		}else {
			first=mid+1;
		}
		
		mid=(first+last)/2;
		
	}
		
	if(first>last) {
		System.out.println("not found");
	
	}
}
}

