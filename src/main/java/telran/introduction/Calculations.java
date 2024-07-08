package telran.introduction;

public class Calculations {
    public static int sum(int op1, int op2){
        //TODO
        int res;
        do {
            res = op1 + op2;
        } while (op2 == 0);
        
        return res;
    }
    public static int multiply(int op1, int op2){
        //TODO
        int res = op1 * op2;
        return res;
    }
    public static int divide(int op1, int op2){
        //TODO
        int res = op1 / op2;
        return res;
    }

    public static int substract(int op1, int op2){
        //TODO
        int res = op1 - op2;
        return res;
    }

    public static int sumOfDigits(int number){
        //TODO
        int digit = 0;
        int sum = 0;
        if (number < 0){
            number *= -1;
        }
        while (number > 0){
            digit = number % 10;
            number /= 10;
            sum += digit;
        }
        
        return sum;
    }
    public static int maxDigit(int number){
        //TODO
        int digit = 0;
        int digit_max = 0;
        if (number < 0){
            number *= -1;
        }
        while (number > 0){
            digit = number % 10;
            number /= 10;
            if (digit > digit_max){
                digit_max = digit;
            }
        }
        return digit_max;
    }
    public static boolean isDivideOn(int number, int divider){
        //TODO
        boolean state = false;
        int res = 1;
        if (divider != 0 ){
            res = number % divider;
        }
        if (res == 0){
            state = true;
        }
        return state;
    }
}