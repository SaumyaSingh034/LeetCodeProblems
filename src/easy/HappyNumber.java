package easy;

public class HappyNumber {
    public static void main(String[] args){
        int n = 19;
        Boolean value = isHappy(n);
    }

    private static Boolean isHappy(int n) {
        int lastDigit, frontDigit;
        frontDigit = n/10;
        lastDigit = n%10;
        n = (frontDigit * frontDigit) + (lastDigit * lastDigit);
        return false;
    }
}
