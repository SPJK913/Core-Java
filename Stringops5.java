/**
 * @author Administrator
 * Toggling the given string 
 * 
 */
import java.util.Scanner;
public class Toggle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the string to be toggled");
		 String str=sc.nextLine();
		 char a[]=str.toCharArray();
		     for(c=0;c<a.length;c++)
		     {
		         if(a[c]>='A' && a[c]<='Z')
		         {
		             a[c]=(char)((int)a[c]+32);
		         }
		         else if(a[c]>='a' && a[c]<='z')
		         {
		             a[c]=(char)((int)a[c]-32);
		         }
		     }
		       System.out.println("The toggled string is :-");
		 for(c=0;c<a.length;c++)
		     System.out.print(a[c]);

	}

}
