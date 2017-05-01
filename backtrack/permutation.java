package com.ajay.backtrack;

public class permutation {
	
	
	public static void main(String []arg){
		int arr[] = {1,2,3};
		perm(arr,0,2);
	}

	private static void perm(int []arr, int s, int e) {
		// TODO Auto-generated method stub
		if(s==e){
			for (int i = 0; i < arr.length; i++) {
				System.out.print(""+arr[i]);
			}
			System.out.println();
			return;
		}
		for(int i=s; i<=e; ++i){
			swap(arr,s,i);
			perm(arr,s+1,e);
			swap(arr, s,i);
		}
	}

	private static void swap(int[] arr, int s, int e) {
		// TODO Auto-generated method stub
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
		
		
	}
}
