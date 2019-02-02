package com.company;
import java.util.Random;
import java.util.Scanner;

/*
    Steps:
    1) Allow use to input number of rows and columns (must be the same | square matrix)
    2) Use the input to generate 2D Matrix with dimensions from 1)
    3) Transpose generated 2D Matrix
 */

/*
    Example:
    If the value given by the user is 3, the matrix will have 3 rows and 3 columns
    | 1 2 3 |    Transpose   | 1 4 7 |
    | 4 5 6 |   -----------> | 2 5 8 |
    | 7 8 9 |                | 3 6 9 |
 */

public class ArrayTranspose {

    public static void main(String[] args)
    {
        //Import Scanner to read users input
        Scanner in = new Scanner(System.in);

        // Step 1)
        System.out.println("How many rows and columns");
        int n = in.nextInt();

        int array [][] = array = makeArray(n);
        int transposedArray [][] = transpose(array);
    }

    //printArray method to view a matrix
    public static void printArray(int [][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j]);
            }
         System.out.println("");
        }
    }

    //Step 2)
    public static int [][] makeArray (int n)
    {
        int result [][] = new int [n][n];
        Random r = new Random();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                result[i][j] = r.nextInt((9-0)+1) + 0;
            }
        }
        System.out.println("Randomized 2D Matrix: ");
        printArray(result);
        return result;
    }

    //Step 3)
    public static int [][] transpose (int [][] arr)
    {
        int [][] result = new int[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                result[i][j] = arr[j][i];
            }
        }
        System.out.println("Transposed 2D Matrix: ");
        printArray(result);
        return result;
    }
}