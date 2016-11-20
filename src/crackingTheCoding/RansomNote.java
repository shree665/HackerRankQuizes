package crackingTheCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-ransom-note
 * 
 * @author shree665
 *
 */
public class RansomNote {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        
        //putting value magazine into the list
        Map<String, Integer> magazineWordCount = new HashMap<>(m * 2);
        Map<String, Integer> ransonWordCount = new HashMap<>(n * 2);
        
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            String word = in.next();
            magazine[magazine_i] = word;
            if(magazineWordCount.containsKey(word)) {
                magazineWordCount.put(word, magazineWordCount.get(word) + 1);
            } else {
                magazineWordCount.put(word, 1);
            }
        }
        
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            String word = in.next();
            ransom[ransom_i] = word;
            if(ransonWordCount.containsKey(word)) {
                ransonWordCount.put(word, ransonWordCount.get(word) + 1);
            } else {
                ransonWordCount.put(word, 1);
            }
        }
        in.close();
        
        //finding traceable or not
        isTraceable(magazineWordCount, ransonWordCount);

	}

	private static void isTraceable(Map<String, Integer> magazineWordCount, Map<String, Integer> ransonWordCount) {
		//looking id ransom words exists in magazine or not
        boolean untraceable = false;
        for(Map.Entry<String, Integer> entry : ransonWordCount.entrySet()) {
            String word = entry.getKey();
            Integer count = entry.getValue();
            if(magazineWordCount.containsKey(word)) {
                if(magazineWordCount.get(word) >= count) {
                    untraceable = true;
                } else {
                    untraceable = false;
                    break;
                }
            } else {
                untraceable = false;
                break;
            }
        }
        
        if(untraceable) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
		
	}

}
