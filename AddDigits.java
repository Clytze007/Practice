package easy;

public class AddDigits {
    public int addDigits(int num) {
    	if (num < 10) return num;
    	int result = num % 10 + num / 10;
        return addDigits(result);
    }
    
    public int addDidgits(int num) {
    	
    	return 0;
    }
}
