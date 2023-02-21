package org.example;

public class Five4 {
    public static void main(String[] args) {
        System.out.println("merge");

        getNumbers(30);
    }

    public static void getNumbers(int n){
        for (int i = 0; i < n; i++) {
            if(i>=10){
                int first = i / 10;
                int second = i % 10;
                if(first== second){
                    System.out.println(i);
                }
            }
        }
    }
}
