package StringManipulationChallenges;

public class CountVowelsAndConstants {

    static boolean isContainsOnlyDigits(String input){
        for(char ch : input.toCharArray()){
            if(!Character.isDigit(ch)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "come on man";
        name = name.replaceAll("\\s+", "");
        int vowels = 0, constants = 0;
        for(char ch : name.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
                else constants++;
            }
        }
        System.out.println("vowels : "+vowels+" and "+"constants : "+constants);

        System.out.println(isContainsOnlyDigits("1234a"));
    }
}
