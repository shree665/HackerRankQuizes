package thirtyDayQuizz;

import java.util.Scanner;
/**
 * https://www.hackerrank.com/challenges/30-running-time-and-complexity
 * 
 * @author shree665
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while(a-- > 0) {
            int n = in.nextInt();
            boolean prime = isPrime(n);
            if(prime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
            
        }
        in.close();

	}
	
	public static boolean isPrime(int number) {
        if(number == 1) {
            return false;
        }
        //divide by 2 approach
        for(int i=2; i <= number/2; i++) {
            if(number%i == 0) {
                return false;
            }
        }
        
        /*
        //mulitply by i approach
        for(int i=2; i*i <= number; i++) {
            if(number%i == 0) {
                return false;
            }
        }*/
        return true;
    }

}
