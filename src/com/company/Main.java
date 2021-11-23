package com.company;

public class Main {

    public static void main(String[] args) {

        int sayi=(int)(Math.random()*10+1);
        System.out.println("Üretilen sayi: "+sayi);
        int bosluk=0;
        for (int i = 0; i <= sayi; i=i++) {

            for (int j = 1; j <= bosluk ; j++) {
                System.out.print("  ");
            }
            bosluk++;

            for (int j = sayi; j >= 1 ; j--) {
                System.out.print("* ");
            }
            sayi=sayi-2;
            System.out.println();
        }
    }
}
