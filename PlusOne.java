package easy;

import java.util.Arrays;
public class PlusOne {
	
	public static void main(String args[]){
		class Solution {
		    public int[] plusOne(int[] digits) {
		    	if (digits == null) {
		    		return null;
		    	}
		        int[] result = Arrays.copyOf(digits, digits.length);
		        int i = result.length -1;
		        while(i >= 0 & result[i] == 9) {
		        	result[i] = 0;
		        	if (i == 0){
		        		int[] tmp = new int[result.length+1];
		        		System.arraycopy(result, 0, tmp, 1, result.length);
		        		result = tmp;
		        		i++;
		        	}
		        	i--;
		        }
		        result[i]++;
		        return result;
		    }
		}

		class Solution1 {
		    public int[] plusOne(int[] digits) {
		    	if (digits == null) {
		    		return null;
		    	}
		        int i = digits.length -1;
		        while(i >= 0 & digits[i] == 9) {
		        	digits[i] = 0;
		        	if (i == 0){
		        		int[] tmp = new int[digits.length+1];
		        		System.arraycopy(digits, 0, tmp, 1, digits.length);
		        		digits = tmp;
		        		i++;
		        	}
		        	i--;
		        }
		        digits[i]++;
		        return digits;
		    }
		}
		
		Solution solution = new Solution();
		Solution1 s1 = new Solution1();
		int[] digits = {9,0,9,9};
		System.out.println(Arrays.toString
				(solution.plusOne(digits)));

		System.out.println(Arrays.toString
				(s1.plusOne(digits)));
		
	}
	


}

