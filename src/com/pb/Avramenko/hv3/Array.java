package com.pb.Avramenko.hv3;
import java.util.Random;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] array = new int[3];
        System.out.println("Введите значения элементов массива");
        for (int i = 0; i < array.length; i++) {
            Scanner in = new Scanner(System.in);
            array[i] = in.nextInt();
        }
        System.out.println("Элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int sym = 0;
        for (int i = 0; i < array.length; i++) {
            sym= sym+array[i];
        }
        System.out.println("Сумма элементов массива: "+ sym);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>0)
                count++;
        }
        System.out.println("Количество положительных элементов: "+ count);
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
