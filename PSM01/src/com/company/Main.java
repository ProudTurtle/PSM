package com.company;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        out.println("Wybierz co chcesz policzyć: \n 1. Sin(x) \n 2. Cos(x)");
        Scanner input = new Scanner(in);
        String text = input.nextLine();

        out.println("Podaj x: ");
        String text1 = input.nextLine();
        out.println("Podaj n: ");
        String text2 = input.nextLine();

        double x= Double.parseDouble(text1);
        int n = Integer.parseInt(text2);

        if(Objects.equals(text, "1"))
            {
               out.println("Wynik sin(x) to: " + Liczenie.Sin(x, n));
               out.println("Błąd sin(x) to: " + Liczenie.bladSin(n));



            }else
            {
                out.println("Wynik cos(x) to: " + Liczenie.Cos(x, n));
                out.println("Błąd cos(x) to: " + Liczenie.bladCos(n));
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

    public static double Cos(double x, int n) {
        double sum = 0.0;

        for (int k = 0; k <= n; k++) {
            double poww = Math.pow(x, (2 * k));
            double licznik = Math.pow(-1, k);
            licznik = licznik * poww;
            double mianownik = silnia((2 * k));
            sum += (licznik / mianownik);
        }
        return sum;
    }

    public static double bladSin(int n)
    {
        double sum;
        int k = n +1;

        if(k%2!=0){
            return Blad(k);
        }

        return  bladSin(k);
    }

    public static double bladCos(int n)
    {
        double sum;
        int k = n+1;

        if(k%2==0){
            return Blad(k);
        }

        return  bladSin(k);
    }

    private static double Blad(int k) {
        double sum;
        double poww = Math.pow(Math.PI, k);
        double licznik = Math.pow(-1, k);
        licznik = licznik * poww;
        double mianownik = silnia(k);
        sum = Math.abs(Math.PI *(licznik/mianownik));

        return sum;
    }


}
