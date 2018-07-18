import java.util.Arrays;


public class MergeSort {
	public static void merge(int[] nums,int p,int q,int r){
		int n1 = q-p+1;
		int n2 = r-q;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for(int i=0;i<L.length-1;i++){
			L[i] = nums[p+i];
		}
		L[L.length-1] = Integer.MAX_VALUE;
		for(int i=0;i<R.length-1;i++){
			R[i] = nums[q+1+i];
		}
		R[R.length-1] = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		for(int a = p;a<=r;a++){
			if(L[i]<=R[j]){
				nums[a] = L[i];
				i++;
			}
			else{
				nums[a] = R[j];
				j++;
			}
		}
	}
	public static void mergeSort(int[] nums,int p,int r){
		if(p<r){
			int mid = (p+r)/2;
			mergeSort(nums,p,mid);
			mergeSort(nums,mid+1,r);
			merge(nums,p,mid,r);
		}
	}
	public static void main(String[] args){
		int[] nums = new int[]{5,8,96,7,4,12,3,2,1,4,5,6,6,6};
		mergeSort(nums,0,nums.length-1);
		System.out.println(Arrays.toString(nums));
	}
}
