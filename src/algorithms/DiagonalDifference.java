package algorithms;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference
 * 
 * @author shree665
 *
 */
public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        in.close();
        int difference = getDifference(a);
        System.out.println(difference);

	}
	
	public static int getDifference(int[][] a) {
        int length = a.length;
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        int counter = length - 1;
        for(int i=0; i<length; i++) {
            firstDiagonalSum += a[i][i];
            secondDiagonalSum += a[counter][i];
            counter--;
            /*
            for(int j=0; j<length; j++) {
                if(i==j) {
                    firstDiagonalSum += a[i][j];
                } 
                
                if(i + j == length -1 ) {
                    secondDiagonalSum += a[i][j];
                }
            }
            */
        }
        
        return Math.abs(firstDiagonalSum - secondDiagonalSum);
    }

}
