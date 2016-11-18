package crackingTheCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-making-anagrams
 * 
 * @author shree665
 *
 */
public class Anagrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        in.close();
        System.out.println(numberNeeded(a, b));
	}

	private static int numberNeeded(String a, String b) {
		
		//putting count of character to this map
		Map<Character, Integer> count = new HashMap<>();
		
		//looping through first string to count the number of char
		for(char c : a.toCharArray()) {
			int charCount = 0;
			if(count.containsKey(c)) {
				charCount = count.get(c);
			} 
			
			count.put(c, charCount + 1);
		}
		
		//looping through second string to find the character in the string and subtracting the count
		//because we want to remove all the character which are not on both string
		for(char c : b.toCharArray()) {
			int charCount = 0;
			if(count.containsKey(c)) {
				charCount = count.get(c);
			} 
			
			count.put(c, charCount - 1);
		}
		
		for(Entry<Character, Integer> entry : count.entrySet()) {
			System.out.println(entry.getKey() + ":- "+entry.getValue());
		}
		
		//holds all the count of character from map
		List<Integer> values = new ArrayList<>(count.values());
		int total = 0;
		
		//we are doing absolute because char can not be in first string. 
		//if we don't do absolute, it will get subtracted from the total value to give us wrong answer
        for( Integer v: values ) {
            total += Math.abs(v);
        }
        
		return total;
	}

}
