package helloworld;

public class Array2D {
	public static void main (String[] args) {
		int array[][] = new int[2][3];
		array[0][0] = 80;
		array[0][1] = 78;
		array[1][0] = 89;
		array[1][1] = 72;
		array[1][2] = 74;
		
		//row-major traversal
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
		} 
	
		//column-major traversal
		for (int i=0; i<array[0].length; i++) {
			for (int j=0; j<array.length; j++) {
				System.out.print(array[j][i] + " ");
			}
		}

	}
}
