package com.pb.Avramenko.hv3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        char[] chName= name.toCharArray();
        chName= meUpper(chName);
        print (chName);
    }


    static void print(char[] N) {
        System.out.println(N);
    }
    static char[] meUpper (char[] N) {
        for (int i=0;i<N.length;i++)
        {
            if ((i==0)|| (N[i-1]=='\t')||(N[i-1]==' '))
            {
                N [i]= Character.toUpperCase(N[i]);

            }
        }
        return N;
    }
}
