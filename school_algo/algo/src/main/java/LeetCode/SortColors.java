package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortColors {
    public static void main(String[] args) {
        System.out.println("merge");

        int[] nums1 = {2, 0, 2, 1, 1, 0};
        sortColors(nums1);

    }


    public static void sortColors(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int[] res = new int[nums.length];
        int red = 0;
        int white = 0;
        int blue = 0;
        for (int i = 0; i < nums.length; i++) {
                if(nums[i]==0){
                    red++;
                }
                if(nums[i]==1){
                    white++;
                }
                if(nums[i]==2){
                    blue++;
                }
        }
        int index = 0;
        for (int i = 0; i < red; i++) {
            res[index] = 0;
            index++;
        }
        for (int i = 0; i < white; i++) {
            res[index] = 1;
            index++;
        }
        for (int i = 0; i < blue; i++) {
            res[index] = 2;
            index++;
        }

    }
}
