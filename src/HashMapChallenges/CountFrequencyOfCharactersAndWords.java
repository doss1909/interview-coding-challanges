package HashMapChallenges;

import java.util.*;

public class CountFrequencyOfCharactersAndWords {

    static HashSet<Integer> detectDuplicates(int array[]){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> list = new HashSet<>();
        for (int i : array) if (! set.add(i)) list.add(i);
        return list;
    }

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

        int array[] = {1,2,3,4,5,3,2,6,7,5,3};
        System.out.println(detectDuplicates(array));
    }
}
