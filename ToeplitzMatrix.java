package com.sujal;
/*
 * Given nxm matrix ,I want to Find Whether it is toeplitz matrix or not.
 */

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix){
        for(int row = 0; row< matrix.length-1 ; row++){
            for(int col = 0 ; col < matrix[row].length-1 ; col++) {
                if (matrix[row][col] != matrix[row + 1][col + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
    private static void print2DMatrix(int[][] matrix){
        System.out.println("TestMatrix :");
        for(int[] row : matrix){
            for(int valInRow : row){
                System.out.print(valInRow+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();

        int[][] testCase1 = {{1,2,3},{4,5,6},{7,8,9}};
        print2DMatrix(testCase1);
        System.out.println("Is TestCase1 matrix is a Toeplitz Matrix:" +toeplitzMatrix.isToeplitzMatrix(testCase1));
        int[][] testCase2 = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        print2DMatrix(testCase2);
        System.out.println("Is TestCase2 matrix is a Toeplitz Matrix:" +toeplitzMatrix.isToeplitzMatrix(testCase2));

    }
}
