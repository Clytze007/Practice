package easy;

public class StrStr {
    public int strStr1(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        if (haystack.length() == 0 || needle.length() == 0) {
           if (needle.length() == 0) {
               return 0;
           }
           return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)){
                int j = 1;
                for (; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }                
                }
                if (j == needle.length()) return i;
            }
        }
        return -1;
    }
    
    public int strStr(String haystack, String needle) {
    	if (haystack == null || needle == null) return -1;
    	if (haystack.length() < needle.length()) {
    		return -1;
    	} else if (needle.equals("")) {
    		return 0;
    	}
    	
    	for (int i = 0; i <= haystack.length() - needle.length(); i++) {
    		if (haystack.charAt(i) == needle.charAt(0)){
    			int j = needle.length() - 1;
    			for (; j >= 0; j--) {
    				if (haystack.charAt(i + j) != needle.charAt(j)) {
    					break;
    				}
    			}
    			if (j == -1) return i;
    		}
    	}
    	return -1;
    }
}
