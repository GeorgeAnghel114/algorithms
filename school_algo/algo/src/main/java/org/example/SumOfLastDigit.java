package org.example;

public class SumOfLastDigit {
    public static void main(String[] args) {
        System.out.println("merg");

        System.out.println(sumOfLastDigit(1, 5));
    }

    public static int sumOfLastDigit(int a,int b){
        int sum = 0;
        for (int i = a; i < b; i++) {
            if(i<9){
                sum+=i;
            }else{
                int lastDigit = i / 10;
                sum+=lastDigit;
            }

        }
        return sum;
    }
}
