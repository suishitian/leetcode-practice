import java.util.*;
public class RandomizedQuickSort {
	public static void swap(int[] data,int i,int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	public static void RQuickSort(int[] A,int p,int r){
		if(p<r){
			int q = RPartition(A,p,r);
			RQuickSort(A,p,q-1);
			RQuickSort(A,q+1,r);
		}
	}
	public static int RPartition(int[] A,int p,int r){
		int i = Random(p,r);
		swap(A,r,i);
		return Partition(A,p,r);
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
	public static int Random(int p,int r){
		Random rand = new Random();
		int randnum = rand.nextInt(r-p+1)+p;
		return randnum;
	}
	public static void main(String[] args){
		int[] A = new int[]{9,98,7,3,2,6,5,4,1,65,89,78,42};
		RQuickSort(A,0,A.length-1);
		for(int i=0;i<A.length;i++){
			System.out.println(A[i]);
		}
	}
}
