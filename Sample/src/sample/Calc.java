package sample;

public class Calc {

    public static void main(String[] args) {
   
        int num1 = 50;
        int num2 = 15;
        
        //足し算
        int result1 =num1 + num2;
        System.out.println("num1+num2=" + result1);
                
        //引き算
        int result2 = num1 - num2;
        System.out.println("num1-num2=" + result2);
        
        //掛け算
        int result3 = num1*num2;
        System.out.println("num1*num2=" + result3);
        
        //割り算
        int result4 = num1/num2;
        System.out.println("num1/num2=" + result4);
        
        //剰余
        int result5 = num1%num2;
        System.out.println("num1%num2=" + result5);
        
            
    }

}
