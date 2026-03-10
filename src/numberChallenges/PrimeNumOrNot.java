package numberChallenges;

public class PrimeNumOrNot {
    public boolean isPrimeNum(int num){
        for (int i = 2; i < num/2; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        PrimeNumOrNot obj = new PrimeNumOrNot();
        System.out.println(obj.isPrimeNum(9));
    }

}
