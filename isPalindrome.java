
public class isPalindrome {
	public static boolean isPalindrome(int x) {
        if(x==0) return true;
		if(x<0 || x%10==0){
            return false;
        }
        int result = 0;
        while(x!=0){
            int tail = x%10;
            result = result*10+tail;
            x=x/10;
            if(result==x) return true;
            if(result>x){
                if((result/10)==x){
                    return true;
                }
                else return false;
            }
        }
        return false;
    }
	public static void main(String[] args){
		int a = 10;
		System.out.println(isPalindrome(a));
	}
}
