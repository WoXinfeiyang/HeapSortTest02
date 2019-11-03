import java.util.Arrays;


public class HeapSort {
	
	public int[] heapSort(int[]sourceArray){
		int []array=Arrays.copyOf(sourceArray, sourceArray.length);
		
		int len=array.length;
		buildMaxHeap(array,len);
		
		for(int i=len-1;i>=0;i--){
			swap(array,0,i);
			len--;
			heapify(array,0,len);
		}
		
		return array;
	}

	private void buildMaxHeap(int[] array, int len) {
		for(int i=(int)Math.floor(len/2);i>=0;i--){
			heapify(array,i,len);
		}	
	}

	private void heapify(int[] array, int i, int len) {
		int left=2*i+1;
		int right=2*i+2;
		int largest=i;
		if(left<len&&array[left]>array[largest]){
			largest=left;
		}
		
		if(right<len&&array[right]>array[largest]){
			largest=right;
		}
		if(largest!=i){
			swap(array,largest,i);
			heapify(array,largest,len);
		}
	}
	
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
