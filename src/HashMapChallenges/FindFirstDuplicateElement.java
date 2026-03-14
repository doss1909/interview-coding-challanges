package HashMapChallenges;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstDuplicateElement {

    public static void main(String[] args) {
        String name = "yomann";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : name.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
