
public class QuickSort {
	public static void swap(int[] data,int i,int j){
		int temp=data[i];
		data[i] = data[j];
		data[j]=temp;
	}
	public static void QuickSort(int[] A,int p,int r){
		if(p<r){
			int q = Partition(A,p,r);
			QuickSort(A,p,q-1);
			QuickSort(A,q+1,r);
		}
	}
	public static int Partition(int[] A,int p,int r){
		int x = A[r];
		int i = p-1;
		for(int j=p;j<=r-1;j++){
			if(A[j]<=x){
				i=i+1;
				swap(A,i,j);
			}
		}
		swap(A,i+1,r);
		return i+1;
	}
	public static void main(String[] args){
		int[] A = new int[]{0,3,2,80,1,8,56,9,7,6,5,4};
		QuickSort(A,0,A.length-1);
		for(int i=0;i<A.length;i++){
			System.out.println(A[i]);
		}
	}
}
