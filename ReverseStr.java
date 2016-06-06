package easy;

public class ReverseStr {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = s.length()-1; i >= 0; i--){
        	sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    
    public String reverseString2(String s) {
    	return (new StringBuilder(s)).reverse().toString();
    }

}
