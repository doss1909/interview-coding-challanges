package StringManipulationChallenges;

public class ReverseWordsInSentence {

    static StringBuilder reverseWordsInSentence(String name){
        StringBuilder result = new StringBuilder();
        String names [] = name.split(" ");
        for (int i = 0; i < names.length; i++) {
            result.append(new StringBuilder(names[i]).reverse()).append(" ");
        }
        return result;
    }

    public static void main(String[] args) {
        String name = "yo man come on man you can do it";
        String names[] = name.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = names.length-1; i >= 0; i--) {
            result.append(names[i]).append(" ");
        }
        System.out.println(result);
        System.out.println(reverseWordsInSentence(result.toString()));
    }
}
