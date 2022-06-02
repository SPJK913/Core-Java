/**
 * @author Administrator
 * Program to print Age of the entered string
 * Age= length of the string S+Alphabetical index of the last-character
 * 
 */

import java.util.*;
import java.lang.*;

public class stringAge {
	static void ageString(String s) {
        s = s.trim();
        int len = s.length();
        int firstValue = 0;
        if (Character.isLowerCase((s.charAt(len - 1)))) {
            firstValue = 'a';
        } else if (Character.isUpperCase((s.charAt(len - 1)))) {
            firstValue = 'A';
        }
        int lastChar = s.charAt(len - 1);
        int age = len + (lastChar - firstValue+1);
        System.out.println("Age of string : " + age);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;	
		Scanner scan= new Scanner(System.in);
		str=scan.nextLine();
		scan.close();
		ageString(str);
	}

}
