package com.epam.tat.matrixprocessor.exception;

import com.epam.tat.matrixprocessor.impl.MatrixProcessor;

import java.util.Arrays;

public class MatrDemo {
    public static void main(String[] args) {
        MatrixProcessor matrixProcessor = new MatrixProcessor();

        double [][] twoDimArray = {{5.3426456327,7.432623,3.3245}, {7.23452,0.3462,5.865}, {8.214325,1.6585,6.34235}};
        //double [][] twoDimArray = {};
        double [][] twoDimArray22 = {{0.64326,1.7645}, {1.123,2.547457}, {7.2342,0.68967}};
        //double [][] twoDimArray22 = null;



        double[][] arr = matrixProcessor.multiplyMatrices(twoDimArray, twoDimArray22);

        System.out.println(Arrays.deepToString(arr));
    }
}
