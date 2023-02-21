package org.example;

public class EqualsNumbers {
    public static void main(String[] args) {
        System.out.println("merge");
        getEqualNum(125);
    }

    public static void getEqualNum(int n) {


        for (int i = 1; i < n; i++) {
            if (i > 10 && i <= 99) {
                int lastDigit = i % 10;
                int secondDigit = i / 10;
                if (lastDigit == secondDigit) {
                    System.out.println(i);
                }
            } else  {
                int lastDigit = i % 10;
                int temp = i % 100;
                int secondDigit = temp / 10;
                if (lastDigit == secondDigit) {
                    System.out.println(i);
                }
            }

        }
    }
}