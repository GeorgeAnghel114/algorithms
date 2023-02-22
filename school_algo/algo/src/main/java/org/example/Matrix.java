package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("merge");
        int[][] arr =   {{1,2,3}
                        ,{4,1,6}
                        ,{7,100,4}};
//        System.out.println(biggestDiagonalNumber(arr));
//        System.out.println(Arrays.deepToString(orderSecondLineInTheMatrix(arr)));
//        System.out.println(Arrays.toString(lineWithMostOddNum(arr)));
//        System.out.println(Arrays.toString(maxSumOfRow(arr)));
        System.out.println(Arrays.toString(maxSumOfCol(arr)));

    }

    public static int biggestDiagonalNumber(int[][] arr){
        int n = arr.length;
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j){
                    if(arr[i][j]>max){
                        max = arr[i][j];
                    }
                }
            }
        }
        return max;
    }

    public static int[][] orderSecondLineInTheMatrix(int[][] arr){
        int[] temp = new int[arr[1].length];
        int k = 0;
        for (int i = 0; i < arr[1].length; i++) {
            temp[k] = arr[1][i];
            k++;
        }
        Arrays.sort(temp);
        arr[1] = temp;
        return arr;
    }

    public static int[] lineWithMostOddNum(int[][] arr){
        int max = 0;
        int line = 0;
        int[] temp = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 != 0){
                    count++;
                }
            }
            if(count>max){
                max = count;
                line = i;
            }
        }

        for (int i = 0; i < arr[line].length; i++) {
         temp[i] = arr[line][i];
        }
        return temp;
    }

    public static int[] maxSumOfRow(int[][] arr){
        int n = arr.length;
        System.out.println(n);
        int maxSum = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum+=arr[i][j];
            }
            if(maxSum<sum){
                maxSum = sum;
                idx = i;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(idx);
        res.add(maxSum);
        System.out.println(res);
        return new int[]{1};
    }


        public static int[] maxSumOfCol(int[][] arr){
            int n = arr.length;
            int maxSum = Integer.MIN_VALUE;
            int idx = -1;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum+= arr[j][i];
                }
                if(maxSum<sum){
                    maxSum = sum;
                    idx = i;
                }

            }
            ArrayList<Integer> res = new ArrayList<>();
            res.add(idx);
            res.add(maxSum);
            System.out.println(res);
            return new int[]{1};

        }
}
