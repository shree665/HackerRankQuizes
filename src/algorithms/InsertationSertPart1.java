package algorithms;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/insertionsort1
 * @author shree665
 *
 */
public class InsertationSertPart1 {
	public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        for(int i=0; i<ar.length-1; i++) {
            if(ar[i+1] <= ar[i]) {
                int temp = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = temp;
            }
        }
    }
    
    
    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         in.close();
         insertIntoSorted(ar);
         printArray(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar) {
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
}
