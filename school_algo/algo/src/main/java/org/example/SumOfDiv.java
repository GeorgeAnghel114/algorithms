package org.example;

public class SumOfDiv {
    public static void main(String[] args) {
        System.out.println("merge");

        System.out.println(sumOfDivizors(6));
    }


    public static boolean sumOfDivizors(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                sum+=i;
            }

        }
        if(n==sum){
            return true;
        }
        return false;
    }
}
