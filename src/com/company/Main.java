package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
            int a = 0;
            Random ran = new Random();
            for  (int  i = 0; i < 10; i++) {

                int c = ran.nextInt(1000) + 1;


                a = a + c;
                System.out.println("Losowa liczba ="+c);

            }
            System.out.println("suma Losowych liczb  ="+" "+" "+a);


    }
}


