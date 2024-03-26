package com.search.algo;

import java.util.Arrays;


public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] input = {{21,22,23},{1,2,4},{2846,2354,24567},{123,567,234},{12,23,34}};
        int target =12;
        System.out.println(search(input,target));
        int[] output = search1(input,target);
        System.out.println(Arrays.toString(output));
        System.out.println(max(input));


    }

    static boolean search(int[][] input,int target){
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j]==target){
                    return true;
                }
            }
        }

        return false;
    }

    static int[] search1(int[][] input,int target){
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }


    static int max(int[][] input){
        int ans = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] rows : input) {
            int sum=0;
            for(int element : rows){
                if(element>max){
                    max=element;
                }
                sum+=element;
            }
            if(sum>ans){
                ans=sum;
            }
        }
        System.out.println(ans); // Prints max sum of row elements
        System.out.println((int)Math.log10(max)+1); //no of digits in an element - best time complexity
        return max;
    }
}
