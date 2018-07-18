
public class BubbleSort {
	public static void BubbleSort(int[] A){
		for(int i=0;i<A.length-1;i++){
			for(int j=A.length-1;j>0;j--){
				if(A[j]<A[j-1]) swap(A,j,j-1);
			}
		}
	}
	//Java cannot use usual method to swap data like C/C++ does
	//because Java cannot pass basic type parameter by reference
	//(btw,there is no reference in Java like the &a in C/C++)
	//So in this case we should find a way where we can access the data without being past by function
	public static void swap(int[] data,int a,int b){
		int t = data[a];
		data[a] = data[b];
		data[b] = t;
	}
	public static void main(String args[]){
		int[] A = new int[]{3,2,0,9,8,7,4,5};
		BubbleSort(A);
		for(int i=0;i<A.length;i++){
			System.out.println(A[i]);
		}
	}
}
