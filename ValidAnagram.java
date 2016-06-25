package easy;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram1(String s, String t) {
    	if (s.length() != t.length()) return false;
    	
    	HashMap<Character, Integer> hashS = new HashMap<Character, Integer>();
    	for (Character c : s.toCharArray()) {
    		if (hashS.containsKey(c)) {
    			hashS.put(c, hashS.get(c) + 1);
    		} else {
    			hashS.put(c, 1);
    		}
    	}
    	
    	for (Character c : t.toCharArray()) {
    		if(hashS.containsKey(c) && hashS.get(c) > 0) {
    			hashS.put(c, hashS.get(c) - 1);
    		} else {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    public boolean isAnagram(String s, String t) {
    	if (s.length() != t.length()) return false;
    	
    	int[] alpha = new int[26];
    	for (Character c : s.toCharArray()) {
    		alpha[c - 'a']++;
    	}
    	for (Character c : t.toCharArray()) {
    		if (--alpha[c - 'a'] < 0) return false;
    	}
    	
    	return true;
    }
}
