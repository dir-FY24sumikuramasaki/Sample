package sample;

import java.security.PublicKey;

public class MerhodSample {

    public static void main(String[] args) {
       var number1 = 100;
       var number2 = 10;
       var number3 = 1;
       
       sumMethod1(number1,number2);
       sumMethod1(number1,number3);
       
       var result2 = sumMethod2(number1,number2);
       System.out.println("sumMethod2の結果は"+ result2 +"です。");
    }
       public static void sumMethod1(int num1, int num2) {
           var result1 = num1 +num2;
           System.out.println("sumMethod1の結果は"+ result1 +"です。");
    }
       public static int sumMethod2(int num1, int num2) {
           var result2 = num1+num2;
           return result2;
       }
}
