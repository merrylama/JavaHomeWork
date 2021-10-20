package com.pb.Avramenko.hv3;
import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 100");
        System.out.println("Для выхода из программы введите - 111");
        Random random = new Random();
        int x = random.nextInt(101);// рандомное число
        int y = 0; // инт для попыток
        int k = 0;// Счетчик попыток.

        while (x!=y) {
            k++;
            System.out.println("Попытка " + k + ":");
            Scanner in = new Scanner(System.in);
            y = in.nextInt();

            if (y==111){
                break;
            }

            if (y!=x) {
                if (y>x){
                    System.out.println("Нужное число меньше " + y);
                }
                else {
                    System.out.println("Нужное число больше " + y);
                }
                continue;
            }
            else{
            System.out.println("Поздравляем, Вы угадали с " + k + " попытки!");
            break;}
        }

        System.out.println("Конец игры!");
    }
}

