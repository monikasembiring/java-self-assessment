import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter file name:");
	    String filename = obj.nextLine();
	    System.out.println("Enter word you want to search in the file:");
	    String keyword = obj.nextLine(); // Input word to be searched
	    
		File file = new File(filename); //Creation of File Descriptor for input file
		String[] words = null;  //Initialize the word array
		FileReader fr = new FileReader(file);  //Creation of File Reader object
		BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
		String text;
		int count = 0;   //Initialize the count to zero
		
		while((text=br.readLine())!=null) {   //Reading Content from the file
			words = text.split(" ");  //Split the word using space
			for (String word:words) {
				if (word.equals(keyword)) {   //Search for the given word
                   count++;    //If Present increase the count by one
				}
			}
		}
		
		if(count!=0) {  //Check for count not equal to zero
			System.out.println("The given word is found for "+count+ " times in the file");
		} else {
			System.out.println("The given word is not found in the file");
		}
		fr.close();
	}
}
