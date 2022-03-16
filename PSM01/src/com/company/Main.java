package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Wybierz co chcesz policzyć: \n 1. Sin(x) \n 2. Cos(x)");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();


        if(Objects.equals(text, "1"))
            {
            System.out.println("Podaj x i n");
                Scanner input1 = new Scanner(System.in);
                String text1 = input.nextLine();
                Scanner input2 = new Scanner(System.in);
                String text2 = input.nextLine();

                double x= Double.parseDouble(text1);
                int n = Integer.parseInt(text2);

                System.out.println("Wynik sin(x) to: " + Liczenie.Sin(x, n));



            }else
            {
            System.out.println("Podaj n i k\"");
                Scanner input1 = new Scanner(System.in);
                String text1 = input.nextLine();
            }



    }


}
class Liczenie {
    public static int silnia(int n) {
        return (n == 1 || n == 0) ? 1 : silnia(n - 1) * n;
    }

    public static double Sin(double x, int n) {
        double sum = 0.0;

        for (int k = 0; k <= n; k++) {
            double poww = Math.pow(x, (2 * k) + 1);
            double licznik = Math.pow(-1, k);
            licznik = licznik * poww;
            double mianownik = silnia((2 * k) + 1);
            sum += (licznik / mianownik);
        }
        return sum;
    }



}
