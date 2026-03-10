package numberChallenges;

public class PrimeNumOrNot {
    public boolean isPrimeNum(int num){
        for (int i = 2; i < num/2; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    //interview ready
    public boolean isPrimeNumEff(int num){
        if(num <= 1) return false;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        PrimeNumOrNot obj = new PrimeNumOrNot();
        System.out.println(obj.isPrimeNum(997));
        System.out.println(obj.isPrimeNumEff(-997));
    }

}
