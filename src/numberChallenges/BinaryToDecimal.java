package numberChallenges;

public class BinaryToDecimal {

    static long binaryToDecimal(long num){
        int base = 1;
        long result = 0;
        while(num != 0){
            result += (num % 10) * base;
            base *= 2;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(11001));
    }
}
