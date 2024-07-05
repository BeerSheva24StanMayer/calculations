package telran.introduction;

public class Calculations {
    public static int sum(int op1, int op2){
        int res = op1 + op2;
        System.out.println("sum" + res);
        return res;
    }
    public static int multiply(int op1, int op2){
        int res = op1 * op2;
        System.out.println("multiply" + res);
        return res;
    }
    public static int divide(int op1, int op2){
        if (op2 != 0){
            int res = op1 / op2;
            System.out.println("devide" + res);
            return res;
        }
        System.out.println("devide" + op2);
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
            System.out.println("sumOfDigits" + number);
            sum += digit;
        }
        System.out.println("sumOfDigits" + number);
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
        System.out.println("maxDigit" + digit_max);
        return digit_max;
    }
    public static boolean isDivideOn(int number, int divider){
        if (divider != 0 ){
            int res = number % divider;
            if (res == 0){
                return true;
                ///System.out.println("isDivideOn true");
            }
        }
        
        return false;
    }
}