package utils;

public class Display {
	public static <T> String displayArray(T[] array) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (int i = 0; i < array.length; i++){
			if (!first) {
				sb.append(", ");
			}
			sb.append(array[i]);
		}
		return sb.toString();
	}
}
