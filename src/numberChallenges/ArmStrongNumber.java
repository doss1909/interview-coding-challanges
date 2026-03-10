package numberChallenges;

public class ArmStrongNumber {
    public int armStrongNum(int num){
        int result = 0, indivualNum, power = 0;
        //1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        int temp = num;
        while(temp > 0){
            power++;
            temp /=10;
        }
        System.out.println(power);
        while(num > 0){
            result += Math.pow(num % 10, power);
            num /= 10;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        ArmStrongNumber obj = new ArmStrongNumber();
        int num = 153;
        if(num == obj.armStrongNum(num)) System.out.println("it's an armstrong num");
        else System.out.println("it's not an armstrong number");
    }
}
