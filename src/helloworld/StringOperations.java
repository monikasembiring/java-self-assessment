package helloworld;

public class StringOperations {
	public static void main (String[] args) {
		String name = "Monika Sembiring";
		char first = name.charAt(0);
		char last = name.charAt(name.length() - 1);
		name = name.replace(first, 'A');
		name = name.replace(last, 'Z');
		System.out.println(name);
		String address = "www.stackoverflow.com";
		System.out.println(address);
		int start = address.indexOf(".");
		int end = address.lastIndexOf(".");
		address = address.substring((start+1), end);
		address = address.concat("1331");
		System.out.println(address);
	}
}
