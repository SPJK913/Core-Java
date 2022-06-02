/**
 * 
 */

/**
 * @author Administrator
 * Merging the two strings.
 */

import java.util.*;
public class Stringmerge {
	
	public static void main(String[] args) {
		String s1;
		String s2;
		Scanner scan = new Scanner(System.in);
		s1=scan.nextLine();
		s2=scan.nextLine();
		System.out.println(merge(s1,s2));

	}
	public static String merge(String str1, String str2) {
		StringBuilder result = new StringBuilder();
		for(int i=0;i<str1.length() || i<str2.length();i++) {
			if(i<str1.length()) {
				result.append(str1.charAt(i));
			}
			if(i<str2.length()) {
				result.append(str2.charAt(i));
			}
			
		}
		return result.toString();
	}

}
