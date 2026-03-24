package slidingWindow;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {

    //input : "abcdabcdefabcd" - output : efabcd
    static int longestSubString(String name){
        if(name.length() == 0 && name.length() < 1) return name.length();
        int max_length = 0, left = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < name.length(); right++) {

            while(set.contains(name.charAt(right))){
                set.remove(name.charAt(left));
                left++;
            }

            set.add(name.charAt(right));
            max_length = Math.max(max_length, right - left + 1);
        }

        System.out.println(set);
        return max_length;
    }
    public static void main(String[] args) {
        System.out.println(longestSubString("prabhudasu"));
    }
}
