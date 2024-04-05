package sample;

import java.util.PrimitiveIterator.OfDouble;

import javax.swing.GroupLayout.Alignment;

public class IfSample {

    public static void main(String[] args) {
    var score = 59; //成績
    
    if(score==100) {
        System.out.print("満点です!");
    }else if(score>=80) {
        System.out.print("よくできました！");
    }else if(score>=60) {
        System.out.print("合格です。");
    }else {
        System.out.print("赤点です。。。");
    }
    }
}
