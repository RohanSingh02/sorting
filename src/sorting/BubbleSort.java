package sorting;

import java.util.*;



public class BubbleSort {
	
	public static void main(String[] args) {
		int n = 6;
		int[] arr = {85, 64, 45, 32, 18, 35};
		
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted array is: ");
		for(int k = 0; k< 6; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
	}

}