package telran.introduction;

public class Calculations {
    public static int sum(int op1, int op2){
        int res = op1 + op2;
        return res;
    }
    public static int multiply(int op1, int op2){
        int res = op1 * op2;
        return res;
    }
    public static int divide(int op1, int op2){
        if (op2 != 0){
            int res = op1 / op2;
            return res;
        }
        return op2;
        
    }
    public static int substract(int op1, int op2){
        int res = op1 - op2;
        return res;
    }
    public static int sumOfDigits(int number){
        int digit = 0;
        int sum = 0;
        while (number > 0){
            digit = number % 10;
            number /= 10;
            sum += digit;
        }
        return sum;
    }
    public static int maxDigit(int number){
        int digit = 0;
        int digit_max = 0;
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
        if (divider != 0 ){
            int res = number % divider;
            if (res == 0){
                return true;
            }
        }
        
        return false;
    }
}