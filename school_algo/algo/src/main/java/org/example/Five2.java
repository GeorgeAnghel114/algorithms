package org.example;

public class Five2 {
    public static void main(String[] args) {
        int k = 5;
        int p = 345;

        System.out.println(getMbEmpty(k, p));
        System.out.println(123/10);
        System.out.println(123%10);
        // reverse 2 digit int;
        System.out.println(reversedInt(75));
        System.out.println("next");
        // reverse 3 digit int;
        System.out.println(reversedBiggerInt(125));
        // double each digit
        System.out.println("next");

        System.out.println(doubleEachDigit(75));
        System.out.println(addZeroBetweenDigits(12));

    }

    public static int getMbEmpty(int k, int p){
        int gbToMb = k * 1024;
        return gbToMb - p;
    }

    public static int reversedInt(int n){
        int a = n % 10;
        int b = n / 10;
        return a * 10 + b;
    }

    public static int reversedBiggerInt(int n ){
        int last = n % 10;
        int b = n % 100;
        int middle = b / 10;
        int first = n / 100;
        return last * 100 + middle * 10 + first;

    }

    public static int doubleEachDigit(int n){
        int a = n % 10;
        int b = n / 10;


        System.out.println(a);
        System.out.println(b);
        return b * 1000 + b * 100 + a * 10 + a;
    }

    public static int addZeroBetweenDigits(int n ){
        int first = n / 10;
        int last = n % 10;

        return first * 1000 + last * 10;
    }
}
