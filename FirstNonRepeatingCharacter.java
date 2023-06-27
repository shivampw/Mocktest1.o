 // First Unique Character in a String Example 1

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
		        String s = "leetcode";
		        int index = firstUniqChar(s);
		        System.out.println("first non-repeating character: " + index);
		    }

		    public static int firstUniqChar(String s) {
		        Map<Character, Integer> charCountMap = new HashMap<>();

		        // Count the occurrences of each character in the string
		        for (char c : s.toCharArray()) {
		            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		        }

		        // Find the index of the first non-repeating character
		        for (int i = 0; i < s.length(); i++) {
		            if (charCountMap.get(s.charAt(i)) == 1) {
		                return i;
		            }
		        }

		        // If no non-repeating character is found, return -1
		        return -1;
		    }
    
}