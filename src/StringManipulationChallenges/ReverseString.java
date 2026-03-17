package StringManipulationChallenges;

public class ReverseString {

    public static void main(String[] args) {

        String name = "love you man", result = "";

        for (int i = name.length()-1; i >= 0; i--) {
            result += name.charAt(i);
        }
        System.out.println(result);
    }
}
