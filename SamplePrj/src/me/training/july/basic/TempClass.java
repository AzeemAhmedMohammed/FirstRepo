package me.training.july.basic;

import java.io.InputStream;
import java.util.Scanner;

public class TempClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter date");

		String date = scanner.next();

		System.out.println("Date entered:" + " " + date);

		String[] dateArray = date.split("/");
		System.out.println("First word:" + dateArray[0]);
		System.out.println("Second word:" + dateArray[1]);
		System.out.println("Third word:" + dateArray[2]);

		Integer monthNumber = 1;

		switch (dateArray[0]) {

		case "1":
			System.out.println("Print January");
			break;

		case "2":
			System.out.println("Print February");
			break;
		case "9":
			System.out.println("Print September");
			break;

		case "13":
			System.out.println("No Print");

		}

	}

}
