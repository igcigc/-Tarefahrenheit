package com.cebem;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la temperatura en ºC: ");
		int t = sc.nextInt();
		float f = 32 + (9 * t / 5);
		System.out.println("La temperatura en Fahrenheit es " + f);
		sc.close();
	}

}
