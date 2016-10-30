package thirtyDayQuizz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SimpleRegexExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        List<String> list = new ArrayList<>(a);
        while(a-- >= 0) {
            String line = in.nextLine();
            String[] firstName ;
            if(line.contains("@gmail.com")) {
            	firstName = line.split("\\s");
            	list.add(firstName[0].trim());
            }
        }
        in.close();
        
        Collections.sort(list);
        
        for(String name : list) {
        	System.out.println(name);
        }

	}

}
