package StringManipulationChallenges;

import java.util.*;

public class FindDuplicatesInString {

    public static void main(String[] args) {
        String name = "you can do it man";
        name = name.replaceAll("\\s+", "");
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : name.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
        List<Character> duplicateCharacters = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) duplicateCharacters.add(entry.getKey());
        }
        System.out.println(duplicateCharacters);
    }
}
