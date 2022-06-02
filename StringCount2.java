import java.util.*;
import java.util.Scanner;
public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String T;
		Scanner scan = new Scanner(System.in);
		int lower=0,upper=0;
		T=scan.nextLine();
		for(int i=0;i<T.length();i++) {
			char t = T.charAt(i);
			if(t>='A'&&t<='Z') {
				upper++;
			}
			if(t>='a'&&t<='z') {
				lower++;
			}
	
		}
		if(upper==lower) {
			System.out.println("Equally Distributed");
			
		}
		else {
			System.out.println("lowercase letters: "+lower);
			System.out.println("uppercase letters: "+upper);
			
		}

	}

}
