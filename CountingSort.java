
public class CountingSort {
	public static void CountingSort(int[] A,int[] B,int k){
		int[] C = new int[k+1];
		for(int i=0;i<C.length;i++){
			C[i] = 0;
		}
		for(int j=0;j<A.length;j++){
			C[A[j]]=C[A[j]]+1;
		}
		for(int i=1;i<k+1;i++){
			C[i]=C[i]+C[i-1];
		}
		for(int j=A.length-1;j>=0;j--){
			B[C[A[j]]-1] = A[j];
			C[A[j]] = C[A[j]]-1;
		}
	}
	public static void main(String[] args){
		int[] A = new int[]{3,6,5,4,7,9,8,8,2,4,1};
		int[] B = new int[A.length];
		for(int i=0;i<B.length;i++){
			B[i]=0;
		}
		CountingSort(A,B,9);
		for(int i=0;i<B.length;i++){
			System.out.println(B[i]);
		}
	}
}
