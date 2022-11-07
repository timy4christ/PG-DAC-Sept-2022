// Merge Sort


import java.util.Scanner;

class P8{
	
	public static void main(String[] args){

		int[] arr = {4, 5, 3, 8, 1, 5, 7, 8, 9 };
		
		mergeSort(arr,0,arr.length-1);
		
		for(int x :  arr)
			System.out.print(x + " ");
				
	}
	
	public static void mergeSort(int[] arr, int si, int ei){
		
		int mid = si + (ei - si)/2;
		if(si >= ei) return;		
		
		// divinding left part
		mergeSort(arr, si, mid);
		
		// dividing right part
		mergeSort(arr, mid+1, ei);
		
		merge(arr, si, mid, ei);
		
	}
	
	public static void merge(int[] arr, int si, int mid, int ei){
		
		int n = mid - si + 1;
		int m = ei - mid;
		
		int[] L = new int[n];
		int[] R = new int[m];
		
		int k=0;
		// copy left part to L 
		for(int i=si; i<=mid; i++){
			L[k++] = arr[i];
		}
		
		k=0;
		// copy right part to R
		for(int i=mid+1; i<=ei; i++){
			R[k++] = arr[i];
		}
		
		// comapring the L and R array and storing them to main array in sorted fashion
		
		int i=0;
		int j=0;
		k=si;
		
		while(i<n && j<m){
			if(L[i] < R[j])
				arr[k++] = L[i++];
			
			else
				arr[k++] = R[j++];	
		}
		
		while(i<n){
			arr[k++] = L[i++];
		}
		
		while(j<m){
			arr[k++] = R[j++];
		}

	}
	
}