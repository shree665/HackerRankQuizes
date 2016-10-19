package thirtyDayQuizz;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase
 * 
 * @author shree665
 *
 */
public class StairCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close(); 
        for(int i=0; i < n; i++){
            for(int j = 1; j<= n; j++) {
                if(j < n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }

	}

}
