public class MergeSortPractise {
	public static void main(String args[]) {
		
		int arr[] = {3,4, 1, 6, 2, 5, 7};
		int n = arr.length;
		
        divide(arr,0,n-1);
        
	}
    
    public static void divide(int []arr, int si, int ei){
       
        if(si >= ei) return;
        
        int mid = si + (ei - si)/2;
        // divide the left part of array
        divide(arr, si, mid);
        
        // divide the right part of array
        divide(arr, mid+1, ei);
        
        merge(arr, si, mid, ei);
    }
    
    public static void merge(int []arr, int si, int mid, int ei){
        
        int n = mid - si + 1;
        int m = ei - mi;
        
        int[] L = new int[n];
        int[] R = new int[m];
        
        int k = 0;
        for(int i=si; i<=mid; i++){
            L[k++] = arr[i++];
        }
        
        k=0;
        for(int i=mid+1; i<=ei; i++){
            R[k++] = arr[i++];
        }
        
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