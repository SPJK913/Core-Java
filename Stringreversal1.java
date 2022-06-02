import java.util.*;
import java.util.Scanner;
import java.lang.*;
public class Stringreversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1,S2;
		String t="";
		char ch;
		Scanner S=new Scanner(System.in);
		S1=S.nextLine();
		S2=S.nextLine(); 
		if(S1.equals(S2))
		{	
			for(int i=0;i<S1.length();i++) {
			ch = S1.charAt(i);
			t=ch+t;
			}
			System.out.println(t);
		}
		else
			System.out.println("Revesre not Supported");
		
	}

}
