package easy;

import java.util.Arrays;

import utils.Numbers;

public class NumOfOne {
	
	public static void main(String args[]){
		int n = 110;
//		String test = "123";
//		System.out.println(test.charAt(0));
    	System.out.println(new NumOfOne().getDigitOneNum(n));
    	System.out.println(new NumOfOne().getDigitOneNumA(n));
    	System.out.println(new NumOfOne().getDigitOneNumTotal(n));
	}


	public int countDigitOne(int n) {
    	if (n <= 0) return 0;
    	if (n <= 9) return 1;
    	int[] digits = Numbers.getDigitsAsArray(n);
    	return getDigitOneNumTotal(digits);
    }
    

    public int getDigitOneNum(int n) {
    	if (n <= 9) return 1;
    	int[] digits = Numbers.getDigitsAsArray(n);
    	return getDigitOneNum(digits);
    }
    
    public int getDigitOneNumA(int n){
    	if (n <= 9) return 1;
    	int[] digits = Numbers.getDigitsAsArray(n);
    	return getDigitOneNumA(digits);
    }
	
    public int getDigitOneNumTotal(int n) {
    	if (n <= 9) return 1;
    	int[] digits = Numbers.getDigitsAsArray(n);
    	return getDigitOneNumTotal(digits);
	}
    
    private int getDigitOneNum(int[] digits) {
    	int result = 0, len = digits.length;
    	if (len <= 1) {
    		return len;
    	}
    	//most significant digit is one
    	if (digits[0] == 1) {
    		//part 1 is all the combinations for the rest of digits 
    		int partOne = 1;
    		partOne = Numbers.getNumFromDigits(Arrays.copyOfRange(digits, 1, len)) + 1;
    		//part 2 is the combinations of len-1 digits that has 1.
    		int[] largest= new int[len - 1];
    		Arrays.fill(largest, 9);
    		int partTwo = getDigitOneNum(largest);
    		result = partOne + partTwo;
    	}
    	else{
    		//when resultNum[0] == 1
    		int partOne = (int) Math.pow(10, len - 1);
    		//when resultNum[0] != 1 && resultNum[0] < digits[0]
    		int[] largest= new int[len - 1];
    		Arrays.fill(largest, 9);
    		int partTwo = (digits[0] - 1) * getDigitOneNum(largest);
    		//when resultNum[0] == digits[0]
    		int partThree = getDigitOneNum(Arrays.copyOfRange(digits, 1, len));
    		result = partOne + partTwo + partThree;
    	}
    	return result;
    }
  
    private int getDigitOneNumA(int[] digits) {
    	int len = digits.length, other = 0;
    	if (len <= 1) {
    		return len;
    	}
    	int part1 = 0, part2 = 0, part3 = 0;
    	//case1 md == 1 
    	if (digits[0] == 1) {
    		//case1&2 md == digist[0] && md == 1
    		part1 = Numbers.getNumFromDigits(Arrays.copyOfRange(digits, 1, len)) + 1;
    		other = 1;
    	} else {
    		part1 = (int) Math.pow(10, len - 1);
    		//case2 md == digist[0] && md != 1
    		part2 = getDigitOneNumA(Arrays.copyOfRange(digits, 1, len));
    		other = digits[0] - 1;
    	}
    	//case3 others
		int[] largest= new int[len - 1];
		Arrays.fill(largest, 9);
    	part3 = other * getDigitOneNumA(largest);
    	
    	return part1 + part2 + part3;
    }
    
    private int getDigitOneNumTotal(int[] digits) {
    	int len = digits.length, other = 0;
    	if (len == 0) {
    		return 0;
    	} else if (digits[0] == 0){
    		int i = 1;
    		while(i < len && digits[i] == 0){i++;}
    		return getDigitOneNumTotal(Arrays.copyOfRange(digits, i, len));
    	} else if (len == 1) {
    		return 1;
    	}
    	int part1 = 0, part2 = 0, part3 = 0;
    	//case1 msd == 1 (msd => Most Significant Digit)
    	if (digits[0] == 1) {
    		//case1 msd == digits[0] && digits[0] == 1
    		int[] subDigits = Arrays.copyOfRange(digits, 1, len);
    		part1 = 1;
    		for (int i = 0, d = 0; i < subDigits.length; i++){
    			d = subDigits[i] != 0? subDigits[i]: 1;
    			part1 *= d;
    		}
    		part1 += getDigitOneNumTotal(Arrays.copyOfRange(digits, 1, len)) * 2;
    		
    		other = 1;
    	} else {
    		//case1 msd == 1 && digits[0] != 1
    		part1 = (int) Math.pow(9, len - 1);
    		int[] largest= new int[len - 1];
    		Arrays.fill(largest, 9);
    		part1 += getDigitOneNumTotal(largest) * 2;
        	//case2 msd == digits[0]
    		part2 += getDigitOneNumTotal(Arrays.copyOfRange(digits, 1, len));
    		
    		other = digits[0] - 1;
    	}
    	//case3 others
		int[] largest= new int[len - 1];
		Arrays.fill(largest, 9);
    	part3 = other * getDigitOneNumTotal(largest);
    	
    	return part1 + part2 + part3;
    }
}
