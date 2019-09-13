package package_1;

import java.util.HashSet;

import org.testng.annotations.Test;

// Write a java program to find the duplicate words and their number of 
// occurrences in a string
public class StringOccurance{
	public static boolean checkStringOccurance(String str) {
		int c = 0;
		char[] strArray = str.toCharArray();
		HashSet<Character> st = new HashSet<Character>();
		for(char a : strArray){
			st.add(a);
		}
		for (int i = 0; i < st.size(); i++) {
			for (int j = 0; j < strArray.length; j++) {
				if (strArray[i] == strArray[j]) {
					c++;
				}
			}			
					System.out.printf("%s :", strArray[i]);
					System.out.printf("%d\n", c);
                    c = 0;
		}
		return true;
	}

	@Test
	public void CheckStringOccurance(){
		boolean var;
		var = checkStringOccurance("shashidhar");
		assert (var == true);
	}
}
