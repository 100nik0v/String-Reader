package stringReader;
import java.util.Scanner;

public class StringReader {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
//		System.out.println("2y = 7x, where y = 7. What is x? Use x in your answer statement.");
		String abc = in.nextLine();
		int[] hello = new int[abc.length()];
		int i = 0;
		while (i < abc.length()){
			hello[i] = abc.charAt(i);
			i++;
		}
		int t = 0;
		while (abc.charAt(t) != 'x') {
			t++;
		}
			System.out.println(abc.charAt(t-1)+""+abc.charAt(t));
	}
}

