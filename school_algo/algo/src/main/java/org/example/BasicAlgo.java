package org.example;

public class BasicAlgo {
    public static void main(String[] args) {
        System.out.println("merge");
//        breakNumber(345);
//        revearseNumber(12345);
        removeOdNumbers(12345);
    }

    public static void breakNumber(int n){
        while (n > 0){
            int cif = n  % 10;
            System.out.println("Numbers"+cif);
            n = n / 10;
            System.out.println(n);
        }
    }

    public static void revearseNumber(int n){
        int revNum = 0;
        while(n>0){
            int lastNum = n % 10;
            revNum = revNum * 10 + lastNum;
            n = n / 10;
        }
        System.out.println(revNum);
    }

    public static void removeOdNumbers(int n){
        int p = 1;
        int nr = 0;
        while(n>0){
            int cif = n % 10;
            if(cif % 2 != 0){
                nr = nr + cif * p;
                p = p * 10;
            }
            n = n / 10;
        }
        System.out.println(nr);
    }
}
