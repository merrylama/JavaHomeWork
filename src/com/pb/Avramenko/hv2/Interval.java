package com.pb.Avramenko.hv2;
import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цифру: ");
        int operand1 = in.nextInt();
        if (operand1<0||operand1>100) {
            System.out.print("Значение не входит не в один интервал");
        } else if (0<=operand1&&operand1<=14) {
            System.out.print("Входит в интервал  [0 -14]");
        } else if (15<=operand1&&operand1<=35) {
            System.out.print("Входит в интервал  [15 -35]");
        }
     else if (36<=operand1&&operand1<=50) {
        System.out.print("Входит в интервал  [36 -50]");
    }
        else if (51<=operand1&&operand1<=100) {
            System.out.print("Входит в интервал  [51 -100]");
        }
    }
}