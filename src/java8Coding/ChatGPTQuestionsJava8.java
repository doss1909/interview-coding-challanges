package java8Coding;

import java.util.*;
import java.util.stream.Collectors;

public class ChatGPTQuestionsJava8 {

    public static void main(String[] args) {

        // 1. First Non-Repeating Character
        String str = "prabhudasu";

        Character character = str.chars()
                .mapToObj(ch -> (char)ch)
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(character);

        // 2. Remove Duplicates from List
        List<Integer> list = Arrays.asList(1,2,3,4,5,2,3,4,8);
        System.out.println(list.stream().distinct().toList());

        // 3. Even Numbers → Square
        System.out.println(list.stream().filter(n -> n % 2 == 0).map(n -> n * n).toList());

        // 4. Flatten Nested List
        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1,2,3,4),
                                                        Arrays.asList(6,7,8,9),
                                                        Arrays.asList(10,11,12,13));
        System.out.println(nestedList.parallelStream().toList());
        System.out.println(nestedList.stream().flatMap(Collection::stream).toList());
        System.out.println(nestedList.stream().map(nlist -> nlist.stream().toList()).toList());

        // 5. Second Highest Number
        System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null));

        // 6. Frequency of Characters
        String name = "goodboy";
        System.out.println(name.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting())));

        // 7. Group Strings by Length
        String names[] = {"Rajesh", "Naresh", "Mahesh", "vinay", "prabhudasu"};
        System.out.println(Arrays.stream(names).collect(Collectors.groupingBy(String::length)));

        // 8. Longest String
        System.out.println(Arrays.stream(names).max(Comparator.comparingInt(String::length)).orElse(null));

        // 9. Partition Even & Odd
        System.out.println(list.stream().distinct().collect(Collectors.partitioningBy(n -> n % 2 == 0)));

        // 10. Convert List to Map (String → Length)
        List<String> namesList = Arrays.stream(names).toList();
        System.out.println(namesList.stream().collect(Collectors.toMap(s -> s, s -> s.length()/*String::length*/)));
    }
}
