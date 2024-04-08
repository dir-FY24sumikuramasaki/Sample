package sample;

public class ExceptionalExample2 {

      public static void main(String[] args) {
            System.out.println("処理開始");
            
            try {
                System.out.println("割り算開始");
                int a =division (10,0);
                System.out.println(a);
            }catch(ArithmeticException e) {
                System.out.println("ArithmeticExceptionが発生:" + e.getMessage());
        }   finally {
                System.out.println("割り算終了");
        }
            System.out.println("処理終了");

    }
     public static int division(int a,int b)throws ArithmeticException{
         if(b == 0) {
             throw new ArithmeticException("ゼロ除算エラーです");
         }
             return a/b;
}
}


