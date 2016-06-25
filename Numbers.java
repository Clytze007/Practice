package utils;

public class Numbers {
	public static int[] getDigitsAsArray(int n) {
		int len = Integer.toString(n).length();
		int[] result = new int[len];
		for (int i = len - 1; i >= 0; i--) {
			result[i] = n % 10;
			n = n / 10;
		}
		return result;
	}

	public static int getNumFromDigits(int[] digits) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < digits.length; i++){
			sb.append(digits[i]);
		}
		return Integer.parseInt(sb.toString());
	}
	
	
}
