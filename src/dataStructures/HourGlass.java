package dataStructures;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/2d-array
 * 
 * @author shree665
 *
 */
public class HourGlass {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        in.close();
        int max = Integer.MIN_VALUE;
        //Java does row first and column second i.e. i for row and J for column
        //each sub-matric is 3 by 3 i.e. 3 rows and 3 columns
        for(int i=0; i < 4; i++) {
            for(int j=0; j < 4; j++) {
                //adding first row by incrementing column
                int topRow = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                //just adding second value of row by column i.e. i[1] X j[1]
                int middleRow = arr[i+1][j+1];
                //just adding third value of row by incrementing row since we incremented column already
                int bottomRow= arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                int sum = topRow + middleRow + bottomRow;

                //checking for summation for max
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}
