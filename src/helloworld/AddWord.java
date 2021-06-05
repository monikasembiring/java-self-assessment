package helloworld;

public class AddWord {
	public String addLongWords(String[] words) {
		String concatenate = "";
		for (int i=0; i<words.length; i++) {
				if (words[i].length() >= 6) {
						concatenate = concatenate + words[i];
				}
		}
		return concatenate;
	}
	
	public static void main(String args[]) {
		String arr[] = {"Saya", "adalah", "Monika", "Sembiring"};

		AddWord ob = new AddWord();

		System.out.println(ob.addLongWords(arr));
	}
}
