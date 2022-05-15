package myproject;

import java.util.Scanner;

public class celsicus {

	public static void main(String[] args) {
		int celsicus,farenheit,kelvin;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in celcius: ");
		celsicus = sc.nextInt();
		farenheit = (celsicus*9/5)+32;
		System.out.println(farenheit);
		
		


	}

}
