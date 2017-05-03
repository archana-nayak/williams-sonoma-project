/**
 *   File Name: AppBasics.java<br>

 *
 *   Nayak, Archana<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 29, 2017
 *   
 */

package com.sqa.anayak.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Nayak, Archana
 * @version 1.0.1
 * @since 1.0
 *
 */
public class AppBasics {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @param name
	 * Prints a farewell message to the output stream
	 */
	public static void farewellUser(String name) {
		System.out.println("Thank you for using my app " + name);
	}

	/**
	 * @param appName
	 * @return string
	 * Welcomes the user and scans for the users
	 * name from the input stream.
	 */
	public static String greetUser(String appName) {
		String name;
		System.out.println("welecome to the " + appName);
		System.out.println("Could i get your name: ");

		return scanner.nextLine();
	}

	/**
	 * @param question
	 * @return boolean
	 * Outputs a question to the output stream(user) and scans
	 * and parses the input stream. Returns a boolean.
	 */
	public static boolean requestBoolean(String question) {
		System.out.println(question);
		return Boolean.parseBoolean(scanner.nextLine().trim());

	}

	/** 
	 * @param question
	 * @return char
	 * Outputs a question to the output stream(user) and scans and
	 * parses the input stream. Returns a char.
	 */
	public static char requestChar(String question) {
		System.out.println(question);
		char inputChar = scanner.nextLine().trim().charAt(0);
		// char ch = scanner.next(".").charAt(0);
		// char ch = scanner.findLine(".").CharAt(0);
		return inputChar;
	}

	/**
	 * @param question
	 * @return float
	 * Outputs a question to the output stream(user) and scans and
	 * parses the input stream. Returns a float.
	 */
	public static float requestFloat(String question) {
		System.out.println(question);
		return Float.parseFloat(scanner.nextLine().trim());
	}

	/**
	 * @param question
	 * @return integer
	 * Outputs a question to the output stream(user) and scans and
	 * parses the input stream. Returns a integer.
	 */
	public static int requestInt(String question) {
		System.out.print(question);
		int value = Integer.parseInt(scanner.nextLine());// (input);
		return value;
	}

	/**
	 * @param question
	 * @return long
	 * Outputs a question to the output stream(user) and scans and
	 * parses the input stream. Returns a long.
	 */
	public static long requestLong(String question) {
		System.out.println(question);
		return Long.parseLong(scanner.nextLine().trim());
	}

	/** 
	 * @param question
	 * @return short Outputs a question to the output stream(user) and scans and
	 * parses the input stream. Returns a short.
	 */
	public static short requestShort(String question) {
		System.out.println(question);
		return Short.parseShort(scanner.nextLine().trim());
	}

	/**
	 * @param question
	 * @return String. Outputs a question to the output stream(user) and scans
	 * and parses the input stream. Returns a string.
	 */
	public static String requestString(String question) {
		System.out.println(question);
		return scanner.nextLine().trim();
	}

}
