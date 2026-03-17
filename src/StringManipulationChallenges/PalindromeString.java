package StringManipulationChallenges;

public class PalindromeString {

    static boolean palindrome(String input){
        input = input.replaceAll("\\s+", "");
        int start = 0, end = input.length()-1;
        while(start <= end){
            if(input.charAt(start) != input.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("r ac e c ar"));
    }
}
