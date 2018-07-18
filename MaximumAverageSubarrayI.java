
public class MaximumAverageSubarrayI {
	public static double findMaxAverage(int[] nums, int k) {
        int sums = 0;
        for(int i=0;i<k;i++){
            sums += nums[i];
        }
        System.out.println(sums);
        int sum = sums;
        int max = sums;
        for(int i=k;i<nums.length;i++){
            sum = sum+nums[i]-nums[i-k];
            System.out.println(sum);
            if(sum>max) max=sum;
        }
        System.out.println(max);
        return (double)max/k;
    }
	public static void main(String[] args){
		int[] a = new int[]{1,12,-5,-6,50,3};
		System.out.println(findMaxAverage(a,4));
	}
}
