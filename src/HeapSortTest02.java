
public class HeapSortTest02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array01=new int[]{2,8,7,9,5,6,4,3,1,0};
		HeapSort sort=new HeapSort();
		int[]array02=sort.heapSort(array01);
		
		for(int i:array02){
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
