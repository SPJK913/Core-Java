/**
 * @author Administrator
 * Splitting string based on white spaces
 * 
 * print the string with alphabetical order.
 */
public class orderString {

	static void sortString(String s) {
        String[] words = s.split("\\s");
        Arrays.sort(words);

        System.out.println("Elements in dictionary order :");
        Arrays.stream(words).forEach(System.out::println);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s =sc.nextLine();
		sc.close();
		sortString(s);

	}

}
