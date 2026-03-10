package numberChallenges;

public class ReverseNumber {
    static int reverseNum(int num){
        int result = 0;
        /*while(num > 0){
            result = result * 10 + num % 10;
            num /= 10;
        }*/
        //optimized
        while(num > 0){
            int digit = num % 10;
            result = result * 10 + digit;
            num = num / 10;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverseNum(011101));
        int num = 11101;     // remove leading zero
        int digits = 6;      // original digit count

        System.out.printf("%0" + digits + "d", reverseNum(num));
    }
}
