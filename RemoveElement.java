
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int index_f=0;
        int index_e=nums.length-1;
        while(index_f<=index_e){
            if(nums[index_f]==val && nums[index_e]==val) index_e--;
            else if(nums[index_f]!=val && nums[index_e]!=val) index_f++;
            else if(nums[index_f]==val && nums[index_e]!=val){
                nums[index_f]=nums[index_e];
                index_f++;
                index_e--;
            }
            else if(nums[index_f]!=val && nums[index_e]==val){
                index_e--;
                index_f++;
            }
        }
        return index_f;
    }
    public static int removeElement2(int[] nums, int val) {
        int length = nums.length;
    	int i = 0;
    	while(i < length){
    		if(nums[i] == val){
    			nums[i] = nums[length-1];
    			length --;
    		}
    		else {
    			i ++;
    		}
    	}
        return length;
    }
	public static void main(String[] args){
		int[] a = new int[]{3,1,1,5,2,2,3};
		System.out.println(removeElement(a,3));
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
