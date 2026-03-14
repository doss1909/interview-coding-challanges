package HashMapChallenges;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfCharactersAndWords {

    public static void main(String[] args) {
        String name = "yomancomeon";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : name.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) System.out.println(entry.getKey());
        }
    }
}
