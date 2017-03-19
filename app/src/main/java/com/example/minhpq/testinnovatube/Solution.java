package com.example.minhpq.testinnovatube;

import java.util.Arrays;

public class Solution {
    private int result;
    public int solution(int[] A){
        Arrays.sort(A);
        for(int i=0; i<(A.length+1); i++){
            if((A[i] + 1) != A[i+1]){
                result = A[i] + 1;
                break;
            }
        }
        return result;
    };
}
