/*Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.*/

import java.util.Scanner;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String Name = sc.next();
		char alph = sc.next().charAt(0);
		
		System.out.println(num);
		System.out.println(Name);
		System.out.println(alph);
	}
}