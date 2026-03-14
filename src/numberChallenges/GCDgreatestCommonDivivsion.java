package numberChallenges;

public class GCDgreatestCommonDivivsion {

    static int gcd(int a, int b){
        int result = 0;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
            result = a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(gcd(24,18));
    }
}
