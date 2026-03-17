package StringManipulationChallenges;

import java.util.Arrays;

public class SortString {

    public static void main(String[] args) {
        String name = "yoman";
        char names[] = name.toCharArray();
        Arrays.sort(names);
        System.out.println(new String(names));
    }
}
