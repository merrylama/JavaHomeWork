package com.pb.Avramenko.hv2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int operand1, operand2;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цифры: ");
         operand1 = in.nextInt();
        operand2 = in.nextInt();
        System.out.print("Введите знак желаемого действия: ");
        char sign = in.next(".").charAt(0);

        switch (sign) {
            case '+':
                System.out.println("Ответ: " + (operand1 + operand2));
                break;
            case '-':
                System.out.println("Ответ: " + (operand1 - operand2));
                break;
            case '/':
                if (operand1==0||operand2==0) {
                    System.out.print("Деление на 0 невозможно");
                } else {
                    System.out.println("Ответ: " + (operand1 / operand2));
                }
                break;
            case '*':
                System.out.println("Ответ: " + (operand1 * operand2));
                break;
            default:
                System.out.println("Некорректные данные");
        }

    }
}
