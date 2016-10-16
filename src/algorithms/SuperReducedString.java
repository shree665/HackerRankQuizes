package algorithms;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/reduced-string
 * 
 * @author shree665
 *
 */
public class SuperReducedString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        StringBuilder sb =  new StringBuilder(input.next());
        input.close();
        
        for(int i=1; i< sb.length(); i++) {
        	if(sb.charAt(i) == sb.charAt(i-1)) {
        		sb.delete(i-1, i+1);
        		i=0;
        	}
        }
        
        if(sb.length() != 0) {
        	System.out.println(sb);
        } else {
        	System.out.println("Empty String");
        }

	}

}
