package numberChallenges;

public class DecimalToBinary {

    static long decimalToBinary(int num){
        StringBuilder binary = new StringBuilder();
        while(num != 0){
            binary.append(num % 2);
            num /= 2;
        }

        return Long.parseLong(binary.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(25));
    }
}
