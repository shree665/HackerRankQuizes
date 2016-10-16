package algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/maximum-perimeter-triangle
 * 
 * @author shree665
 *
 */

public class MaximuPerimeterTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        //sorting an array
        Arrays.sort(arr);
        int i = n - 3;
        
        //look for non-degenerate triangle (A + B <= C)
        while(i >= 0 && (arr[i] + arr[i+1] <= arr[i+2])) {
            i -= 1;
        }
        
        if(i >= 0) {
            System.out.println(arr[i] + " " + arr[i+1] + " " + arr[i+2]);
        } else {
            System.out.println("-1");
        }

	}

}
