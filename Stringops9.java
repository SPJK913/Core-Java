/**
 * @author Administrator
 *
 * Sorting the characters of the string.
 * Extract  the odd-positioned characters and store it into a string variable.
 * Printing the stored variable.
 *
 */

import java.util.*;
import java.lang.*;
public class stringSort {
	public static void main(String[] args) {
		String str,odd="";
		Scanner scan = new Scanner(System.in);
		str=scan.nextLine();
		String sort = sortString(str);
		System.out.println("Before sorting string..."+str);
		System.out.println("After sorting string..."+sort);
		for(int i=0;i<sort.length();i++) {
			if(i%2==1) {
				odd+=sort.charAt(i);
			}
			}
		System.out.println("odd string is..."+odd);
	}
	public static String sortString(String str) {
		char tempArray[] = str.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}

}
