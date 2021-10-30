package com.pb.Avramenko.h4;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первую фразу: ");
        String FrazaOne = console.nextLine();
        char[] chFrazaOne= FrazaOne.toCharArray();
        System.out.println("Введите вторую фразу: ");
        String FrazaTwo = console.nextLine();
        char[] chFrazaTwo= FrazaTwo.toCharArray();
        chFrazaOne= onlyUpperLetter (chFrazaOne);
        chFrazaTwo= onlyUpperLetter (chFrazaTwo);
        chFrazaOne= Sort (chFrazaOne);
        chFrazaTwo= Sort (chFrazaTwo);
        if (chFrazaOne.length == chFrazaTwo.length)
        {Ansver (chFrazaOne, chFrazaTwo);}
        else
        {
            System.out.println("Это не анаграмма");
        }
    }


    static void Ansver (char[] chFrazaOne,char[] chFrazaTwo) {
        int count1=0;
        int count2=0;
        int count3=0;
        for (int i=0;i<chFrazaOne.length;i++)
        {
            if (Character.isLetter(chFrazaOne[i]))
                count1++;

        }
        for (int i=0;i<chFrazaTwo.length;i++)
        {
            if (Character.isLetter(chFrazaTwo[i]))
                count2++;

        }
        char aa []=new char[count1];
        char aa2 []=new char[count2];
        for (int i=0, j=0;i<chFrazaTwo.length;i++)
        {
            if (Character.isLetter(chFrazaTwo[i])) {
                aa [j]=chFrazaTwo[i];
                j++;
            }

        }
        for (int i=0, j=0;i<chFrazaOne.length;i++)
        {
            if (Character.isLetter(chFrazaOne[i])) {
                aa2 [j]=chFrazaOne[i];
                j++;
            }

        }
        for (int i=0;i<aa.length;i++)
        {
            if (aa[i]==aa2[i]) {
                count3++;
            }

        }
        if (count2==count1&&count3==count2) {
            System.out.println("Это анаграмма");
        }
        else
        {
            System.out.println("Это не анаграмма");
        }
    }
    static char[] onlyUpperLetter (char[] C) {

        for (int i=0;i<C.length;i++)
        {
            if (Character.isLetter(C[i]))
            {
                C[i]= Character.toUpperCase(C[i]);
            }
            else {
                C[i] = ' ';
            }
        }
        return C;
    }
    static char[] Sort (char[] C) {

        for (int i = 0; i < C.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = C.length - 1; j > i; j--) {
                if (C[j - 1] > C[j]) {
                    char tmp = C[j - 1];
                    C[j - 1] = C[j];
                    C[j] = tmp;
                }
            }
        }
        return C;
    }
}