package com.search.algo;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] input = {99,88,77,32,23,22,4,1};
        int [] input2 = {9,8,7,32,33,55,77};
        System.out.println(binarySearch(input,77));
        System.out.println(binarySearch(input2,77));

    }

    static int binarySearch(int[] input, int target){
        int start =0,end=input.length-1;
        boolean isAsc = input[start] < input[end]?true:false;
        while(start<=end){
            int mid = start+(end-start)/2 ;
            if(input[mid]==target){
                return mid;
            }
            if(isAsc){
                if (input[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else {
                if (input[mid] < target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
