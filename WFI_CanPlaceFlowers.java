/*Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True
Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False
Note:
The input array won't violate no-adjacent-flowers rule.
The input array size is in the range of [1, 20000].
n is a non-negative integer which won't exceed the input array size.
*/

public class WFI_CanPlaceFlowers {
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int num_start = 0;
        int num_end = 0;
        int num_middle = 0;
        int flag = 0;
        for(int i=0;i<flowerbed.length;i++){
            if(flag==0 && flowerbed[i]==0) num_start++;
            else if(flag==0 && flowerbed[i]==1) flag=1;
            else if(flag==1 && flowerbed[i]==0) num_middle++;
            else if(flag==1 && flowerbed[i]==1){
                n = n-numOfFlowers(num_middle);
                num_middle=0;
            }
        }
        if(flag>0){
            num_end = num_middle;
            n=n-numOfBorderFlowers(num_start)-numOfBorderFlowers(num_end);
        }
        else if(flag==0){
            n=n-(int)Math.ceil((double)num_start/2);
        }
        
        if(n<=0) return true;
        else return false;
    }
    public static int numOfFlowers(int num){
        if(num<3) return 0;
        else return (int)Math.ceil((double)num/2)-1;
    }
    public static int numOfBorderFlowers(int num){
        if(num<2) return 0;
        return numOfFlowers(num-1)+1;
    }
    
    public static void main(String[] args){
    	
    }
}
