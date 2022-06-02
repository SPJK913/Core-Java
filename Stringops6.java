/**
 * 
 */

/**
 * @author Administrator
 
 * If the length of the string is even then the string is rotated to clockwise direction.
 * Otherwise the string is rotated to anti-clockwise direction.
 */
import java.util.*;
public class Rotation {
	static void rotateString(String s) {
		int strLen = s.length();
		StringBuilder rotatedString = new StringBuilder();
		if(strLen %2==0) {
			//clockwise rotated string
			rotatedString.insert(0,s.charAt(strLen-1));
			rotatedString.insert(1, s.substring(0,strLen-1));
		}else {
			//string rotated anti-clockwise
			rotatedString.insert(0,s.substring(1, strLen));
			rotatedString.insert(strLen-1,s.charAt(0));
		}
		System.out.println(rotatedString);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s =sc.nextLine();
		sc.close();
		rotateString(s);

	}

}
