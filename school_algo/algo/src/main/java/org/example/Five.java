package org.example;

import java.util.ArrayList;
import java.util.List;

public class Five {
    public static void main(String[] args) {
        double w = 20;
        double l = 30;
        int a = 9;
        int b = 12;

        int digits = 145;
        System.out.println(getPerimeter(w, l));
        System.out.println(getArea(w, l));
        System.out.println(getEvenNumbers(a, b));
        System.out.println(getLastDigit(digits));
        System.out.println(getLastTwoDigits(digits));
        System.out.println(getFirstDigit(digits));
        System.out.println(getFristTwoDigits(digits));
        System.out.println(getClosestTwoEvenNum(5));
    }



    public static double getPerimeter(double w, double l){
        return 2*(l+w);
    }

    public static double getArea(double w,double l){
        return w*l;
    }


    public static int getEvenNumbers(int a, int b){
        int countEvenNumbers = 0;
        for (int i = a; i <= b; i++) {
            if(i % 2 == 0){
                countEvenNumbers++;
            }
        }
        return countEvenNumbers;
    }

    public static String getLastDigit(int a){
        String numToString = String.valueOf(a);
        return numToString.substring(numToString.length()-1);
    }

    public static String getLastTwoDigits(int a){
        String numToString = String.valueOf(a);
        return numToString.substring(numToString.length()-2);
    }

    public static String getFirstDigit(int a){
        String numToString = String.valueOf(a);
        return numToString.substring(0,1);
    }

    public static String getFristTwoDigits(int a){
        String numToString = String.valueOf(a);
        return numToString.substring(0,2);

    }

    public static List<Integer> getClosestTwoEvenNum(int n){
        List<Integer> res = new ArrayList<>();
        if(n == 2){
            res.add(4);
            res.add(6);
            return res;
        } else if (n == 3) {
            res.add(2);
            res.add(4);
            return res;
        }

        for (int i = n; i >= 0; i--) {
            if(i % 2 == 0){
                res.add(i);
            }
            if(res.size()==2){
                return res;
            }
        }
        return res;
    }

}
