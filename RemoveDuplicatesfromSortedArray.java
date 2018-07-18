
public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int length=nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) length--;
        }
        return length;
    }
    public static void main(String[] args){
    	int[] a=new int[]{1,1,2};
    	System.out.println(removeDuplicates(a));
    }
}
