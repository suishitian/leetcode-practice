import java.util.Arrays;


public class HeapSort2 {
	int[] heap;
	boolean build_flag = false;
	int heap_size = 0;
	public HeapSort2(int[] nums,int length){
		heap = nums;
		heap_size = length;
	}
	public void buildHeap(){
		for(int i=heap_size/2;i>=0;i--){
			maxHeapify(i);
		}
		build_flag = true;
	}
	void maxHeapify(int i){
		//System.out.println("maxHeapify"+i);
		int l = LEFT(i);
		int r = RIGHT(i);
		int largest=i;
		if(l<heap_size && heap[l]>heap[i]) largest = 2*i;
		if(r<heap_size && heap[r]>heap[largest]) largest = 2*i+1;
		if(largest!=i){
			int temp = heap[i];
			heap[i] = heap[largest];
			heap[largest] = temp;
			maxHeapify(largest);
		}
	}
	public void heapSort(){
		System.out.println("heapSort");
		if(build_flag){
			for(int i = heap.length-1;i>=1;i--){
				int temp = heap[0];
				heap[0] = heap[i];
				heap[i] = temp;
				heap_size--;
				maxHeapify(0);
			}
		}
	}
	int LEFT(int i){
		return 2*i;
	}
	int RIGHT(int i){
		return 2*i+1;
	}
	int RARENT(int i){
		 return i/2;
	}
	public String toString(){
		return Arrays.toString(heap);
	}
	public static void main(String[] args){
		int[] nums = new int[]{8,9,7,3,2,1,4,6,6,8,87,145,65,65};
		HeapSort2 heap = new HeapSort2(nums,nums.length);
		heap.buildHeap();
		System.out.println(heap);
		heap.heapSort();
		System.out.println(heap);
	}
}
