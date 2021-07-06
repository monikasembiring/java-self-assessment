import java.util.Scanner;

public class Palindrome {
	public boolean isPalindrome (String word) {
		int start = 0;
		int end = word.length() - 1;
		//System.out.println(end);
		while (start <= end) {
			if (word.charAt(start) != word.charAt(end)) {
				return false;
			} else {
				start = start+1;
				end = end-1;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Palindrome pl = new Palindrome();
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String word = myObj.nextLine();
		
		if (pl.isPalindrome(word)) {
			System.out.println("Your word is palindrome");
		} else {
			System.out.println("Your word is not palindrome");
		}
	}
}
