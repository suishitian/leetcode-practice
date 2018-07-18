
public class MaximumProductofThreeNumbers {
	public static int maximumProduct(int[] nums) {
        int num_3 = RSelect_3(nums,0,nums.length-1,nums.length-3);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>num_3) num_3 = num_3*nums[i];
        }
        return num_3;
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
    public static void swap(int[] data,int i,int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
    public static int RSelect_3(int[] A,int p,int r,int i){
        if(p==r) return A[p];
        int q = Partition(A,p,r);
        int k = q-p+1;
        if(i==k) return A[q];
        else if(i<k){
            return RSelect_3(A,p,q-1,i);
        }
        else return RSelect_3(A,q+1,r,i-k);
    }
    
    public static void main(String[] args){
    	int[] a = new int[]{1,2,3,4};
    	System.out.println(RSelect_3(a,0,a.length-1,a.length-2));
    }
}
