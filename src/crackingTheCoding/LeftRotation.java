package crackingTheCoding;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation
 * 
 * @author shree665
 *
 */
public class LeftRotation {

	public static void main(String[] args) {
		int rotation = 4;
		int[] a = {1,2,3,4,5};

		for(int i=0; i<rotation; i++) {
            int temp = a[0];
            for(int j=1; j<a.length; j++) {
                a[j-1] = a[j];
            }
            a[a.length-1] = temp;
        }
        
        for(int b=0; b<a.length; b++) {
            System.out.print(a[b] + " ");
        }
	}

}
