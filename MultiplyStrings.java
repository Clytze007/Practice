package easy;

public class MultiplyStrings {
	public String multiply(String num1, String num2) {
		if (num1 == null || num2 == null) {
			return null;
		} else if ((num1.length() == 1 && num1.charAt(0) == '0') || (num2.length() == 1 && num2.charAt(0) == '0')){
			return "0";
		}
    	int[] intNum1 = convertStrToIntArray(num1);
    	int[] intNum2 = convertStrToIntArray(num2);
    	return convertIntArrayToStr(multiply(intNum1, intNum2));
    }

	private int[] multiply(int[] num1, int[] num2) {
    	int i, j, iTen,jTen, startIndex;
    	int[] result = new int[num1.length + num2.length];
    	for (i = num1.length - 1; i >=0; i-- ) {
    		if (num1[i] == 0) continue;
    		iTen = num1.length - i - 1;
    		for (j = num2.length - 1; j >=0; j--){
    			if (num2[j] == 0) continue;
    			jTen = num2.length - j - 1;
    			int temp = num1[i] * num2[j];
    			startIndex = iTen + jTen; 
    			
    			addToIntArray(result, result.length - 1 - startIndex, temp % 10);
    			addToIntArray(result, result.length - 1 - startIndex - 1, temp / 10);
    			
    		}
    		
    	}
    	return result;
    }

    private int[] convertStrToIntArray(String num1) {
    	int[] result = new int[num1.length()];
    	for (int i = 0; i < num1.length(); i++){
    		try {
    			result[i] = Character.getNumericValue(num1.charAt(i));
    		} catch (NumberFormatException nfe) {};
    	}
		return result;
	}

	private String convertIntArrayToStr(int[] multiply) {
		StringBuilder sb = new StringBuilder();
		boolean afterFirst = false;
		for (int val : multiply) {
			if (afterFirst || val != 0) {
				sb.append(val);
				afterFirst = true;
			}
		}
		if (sb.length() == 0) {
			return "0";
		}
		return sb.toString();
	}
    
    /***
     * int array digits is big enough 
     * @param digits
     * @param index
     * @param val
     */
	private void addToIntArray(int[] digits, int index, int val) {
		if (val != 0) {
			int sum;
			while (index >= 0 && digits[index] + val >= 10) {
				sum = digits[index] + val;
				digits[index] = sum % 10;
				val = sum / 10;
				index--;
			}
			digits[index] = digits[index] + val;
		}
		
	}
}
