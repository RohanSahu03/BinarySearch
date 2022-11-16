package com.binary;

public class Binary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		int l=0;
		int key=4;
		int r=a.length-1;
		binary(a,l,r,key);
		
	}

	private static void binary(int[] a, int l, int r, int key) {
		// TODO Auto-generated method stub
		
	int mid=(l+r)/2;
	while(l<=r) {
		if(a[mid]==key) {
			System.out.println("found at index "+mid);
			break;
		}else {
			if(key<a[mid]) {
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		mid=(l+r)/2;
		
	}
		if(l>r) {
			System.out.println("not found");
		}
	}

}
