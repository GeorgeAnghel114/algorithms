package org.example;

public class Xyz {
    public static void main(String[] args) {
        String x = "5 4 3";
        System.out.println(getXyzNumber(x));


        System.out.println(12 % 10);
        System.out.println(12 / 10);
    }

    public static int getXyzNumber(String x){
        String res = x.replaceAll(" ","");
        int resToInt = Integer.parseInt(res);

        int firstDigit = resToInt / 100;
        int toSecondDigit = resToInt % 100;
        int secondDigit = toSecondDigit / 10;
        int lastDigit = resToInt % 10;

        String result = "";
        result += secondDigit;
        for (int i = 0; i < secondDigit; i++) {
            result+=lastDigit;
        }


        return Integer.parseInt(result);
    }
}
