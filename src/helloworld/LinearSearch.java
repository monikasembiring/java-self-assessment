package helloworld;

public class LinearSearch {
	int search(String[] strings, String searchString) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i]==searchString) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        LinearSearch lsearch = new LinearSearch();
        String[] fruits = new String[10];
        
        //int result = lsearch.search(fruits, "banana");
        //System.out.println(result);
        lsearch.search(fruits, "banana");
    }
}
