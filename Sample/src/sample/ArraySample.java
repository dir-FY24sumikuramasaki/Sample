package sample;

import javax.print.attribute.standard.NumberUpSupported;
import javax.swing.plaf.basic.BasicMenuBarUI;

public class ArraySample {

    public static void main(String[] args) {
        //配列の要素数を定義
        var numbers=new int[5];
        //配列の各要素に値を代入
        for(var i=0;i<numbers.length;i++) {
            numbers[i]=i*2;
        }
        //配列を表示
        for(var i=0;i<numbers.length;i++)
        System.out.println(numbers[i]);
    }

}
