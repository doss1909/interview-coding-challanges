package slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {

    //input : "abcdabcdefabcd" - output : efabcd
    static int longestSubStringCount(String name) {
        if (name.length() == 0 && name.length() < 1) return name.length();
        int max_length = 0, left = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < name.length(); right++) {

            while (set.contains(name.charAt(right))) {
                set.remove(name.charAt(left));
                left++;
            }

            set.add(name.charAt(right));
            max_length = Math.max(max_length, right - left + 1);
        }

        System.out.println(set);
        return max_length;
    }

static String longestSubString(String name){
        int start = 0, end = 0;
    Map<Character, Integer> map = new HashMap<>(); // ip : ababcdab - op : abcd - start = 4 , end = 7
    for (int i = 0; i < name.length(); i++) {
        char ch = name.charAt(i);
        if(map.containsKey(ch)){
            start = map.get(ch);
            map.remove(map.get(ch));
        }
        map.put(ch, i);
        start++;
    }

        return name.substring(start, end);
}

    public static void main(String[] args) {
        //System.out.println(longestSubStringCount("prabhudasu"));
        System.out.println(new String("ababcdab").substring(4, 8));
    }
}
