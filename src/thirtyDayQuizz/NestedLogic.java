package thirtyDayQuizz;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-nested-logic
 * 
 * @author shree665
 *
 */
public class NestedLogic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int dayReturned = in.nextInt();
        int monthReturned = in.nextInt();
        int yearReturned = in.nextInt();

        int dayExpected = in.nextInt();
        int monthExpected = in.nextInt();
        int yearExpected = in.nextInt();
        in.close();
        
        LocalDate expectedDate = LocalDate.of(yearExpected, monthExpected, dayExpected);
        LocalDate returnedDate = LocalDate.of(yearReturned, monthReturned, dayReturned);
        
        long fine = 0;
        
        if(returnedDate.isAfter(expectedDate)) {
        	if(returnedDate.getYear() == expectedDate.getYear()) {
        		if(returnedDate.getMonth() == expectedDate.getMonth()) {
        			long daysDifference = returnedDate.getDayOfMonth() - expectedDate.getDayOfMonth();
        			fine = 15 * daysDifference;
        		} else {
        			long monthDifference = returnedDate.getMonth().getValue() - expectedDate.getMonth().getValue();
        			fine = 500 * monthDifference;
        		}
        	} else {
        		fine = 10000;
        	}
        }

        System.out.println(fine);

	}

}
