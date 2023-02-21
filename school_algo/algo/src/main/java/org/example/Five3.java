package org.example;

public class Five3 {
    public static void main(String[] args) {
        System.out.println("merge");

        System.out.println(getDescOrder(85, 93));
        System.out.println(getBiggestNum(15));
    }

    public static String getDescOrder(int p1, int p2){
        if(p1 > p2){
            return String.valueOf(p1)+ " "+String.valueOf(p2);
        }
        return String.valueOf(p2) + " " + String.valueOf(p1);
    }

    public static int getBiggestNum(int n){
        int first = n / 10;
        int second = n % 10;
        System.out.println(second);

        if(first > second){
            return n;
        }
        return second * 10 + first;
    }
}
