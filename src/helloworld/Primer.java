package helloworld;
import java.util.Scanner;

public class Primer {
    public boolean isPrime(int n) {
        for (int i = 2; i<n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main (String[] args) {
        Primer p = new Primer();
        System.out.println("Prime numbers less than 50");
        for (int i=2; i<=50; i++) {
            if(p.isPrime(i)) {
            	System.out.println(i);
            }
       }
        
        System.out.println("100 first prime numbers");
        int count = 0;
        int j =2;
        while (count < 100) {
        	if(p.isPrime(j)) {
            	count++;
        		System.out.println(j);
            }
        	j++;
        }
        
        Scanner myObj = new Scanner(System.in);
		
	    System.out.println("Enter a number:");
	    int number = myObj.nextInt();
	    
	    if (p.isPrime(number)) {
	    	System.out.println("Your number is a prime number");
	    } else {
	    	System.out.println("Your number is not a prime number");
	    }   
   }
}