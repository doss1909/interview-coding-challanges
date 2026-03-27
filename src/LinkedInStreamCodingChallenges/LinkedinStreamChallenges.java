package LinkedInStreamCodingChallenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LinkedinStreamChallenges {



    public static void main(String[] args) {

        // 1. find all palindrome strings in an array of strings
        String array_of_strings[] = {"radar", "level", "ramuism", "madam", "yoman"};
        System.out.println(Arrays.stream(array_of_strings).filter(e -> e.equals(new StringBuffer(e).reverse().toString())).toList());

        // 2. reverse each string
        System.out.println(Arrays.stream(array_of_strings).map(u -> new StringBuilder(u).reverse()).toList());

        // 3. concat all string in an array
        System.out.println(Arrays.stream(array_of_strings).collect(Collectors.joining(",")));

        System.out.println(Arrays.stream(array_of_strings).reduce("",String::concat));

        // 4. find the longest string in an array
        System.out.println(Arrays.stream(array_of_strings).sorted(Comparator.comparing(String::length).reversed()).findFirst().orElse(null));

        System.out.println(Arrays.stream(array_of_strings).max(Comparator.comparing(String::length)).orElse(null));
        //

    }
}
