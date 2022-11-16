package com.binary1;

public class LinearSearch1 {
	
	
	public static void main(String[] args) {
		int arr[]= {12,23,34,45,56,67,78};
		int key=22;
		int last=arr.length;
		linearSearch(arr,0,last,key);
	}

	private static void linearSearch(int[] arr, int first, int last, int key) {
		// TODO Auto-generated method stub
		int mid=(first+last)/2;
		
		while(first<=last) {
			
			if(arr[mid]==key) {
				System.out.println("found at "+mid);
				break;
			}else if(arr[mid]<key) {
				first=mid+1;
			}else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("not found");
		}
	}

}
