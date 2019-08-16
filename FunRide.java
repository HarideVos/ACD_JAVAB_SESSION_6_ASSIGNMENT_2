package sixpointtwo;

import java.util.Scanner;

public class FunRide {
	public static void main(String[] args) throws NegativeAgeException {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		try{
			if (age<0) {
				throw new NegativeAgeException();	
			} else {
				System.out.println("Welcome on board!");
			}
		} finally {
			sc.close();
		}
	}

}
