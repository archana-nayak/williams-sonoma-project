/**
 *   File Name: AppBasics.java<br>
 *
 *   Nayak, Archana<br>
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 29, 2017
 *   
 */

package com.sqa.anayak.helpers;

import java.util.*;

import com.sqa.anayak.helpers.exceptions.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * 
 * @author Nayak, Archana
 * @version 1.0.1
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AppBasics {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @param name
	 *            Prints a farewell message to the output stream
	 */
	public static void farewellUser(String name) {
		System.out.println("Thank you for using my app " + name);
	}

	/**
	 * @param appName
	 * @return string Welcomes the user and scans for the users name from the
	 *         input stream.
	 */
	public static String greetUser(String appName) {
		System.out.println("welecome to the " + appName);
		System.out.print("Could i get your name: ");
		return scanner.nextLine();
	}

	/**
	 * @param question
	 * @return boolean Outputs a question to the output stream(user) and scans
	 *         and parses the input stream. Returns a boolean.
	 */
	public static boolean requestBoolean(String question) {
		System.out.print(question);
		System.out.print(" Please enter true/false: ");
		return Boolean.parseBoolean(scanner.nextLine().trim());

	}

	/**
	 * @param question
	 * @return char Outputs a question to the output stream(user) and scans and
	 *         parses the input stream. Returns a char.
	 */
	public static char requestChar(String question) {
		System.out.print(question);
		char inputChar = scanner.nextLine().trim().charAt(0);
		return inputChar;
	}

	/**
	 * 
	 * @param question
	 * @return Double. Outputs a question to the output stream(user) and scans
	 *         and parses the input stream. Returns a double.
	 */
	public static Double requestDouble(String question) {
		System.out.print(question);
		return Double.parseDouble(scanner.nextLine().trim());
	}

	/**
	 * @param question
	 * @return float Outputs a question to the output stream(user) and scans and
	 *         parses the input stream. Returns a float.
	 */
	public static float requestFloat(String question) {
		System.out.print(question);
		return Float.parseFloat(scanner.nextLine().trim());
	}

	/**
	 * @param question
	 * @return integer Outputs a question to the output stream(user) and scans
	 *         and parses the input stream. Returns a integer.
	 */
	public static int requestInt(String question) {
		System.out.print(question);
		int value = Integer.parseInt(scanner.nextLine().trim());
		return value;
	}

	/**
	 * @param string
	 * @param min
	 * @param max
	 * @return integer Outputs a question to the output stream(user) and scans
	 *         and parses the input stream. Returns a integer.
	 */
	public static int requestInt(String question, int min, int max, String errorMessage) {

		int value = 0;
		String input = "";
		boolean isValid = false;
		while (!isValid) {
			try {
				System.out.print(question + " ");
				input = scanner.nextLine().trim();
				value = Integer.parseInt(input);
				if (value < min) {
					throw new UnderMinRangeException();
				} else if (value > max) {
					throw new OverMaxRangeException();
				}
				isValid = true;
			} catch (NumberFormatException e) {

				System.out.println("You have not entered valid numeric value (" + input + ")");

			} catch (UnderMinRangeException e) {
				System.out.println(errorMessage + "( " + input + ")[under " + min + "]");
			} catch (OverMaxRangeException e) {
				System.out.println(errorMessage + "( " + input + ")[over " + max + "]");
			}
		}
		return value;

	}

	/**
	 * @param question
	 * @return long Outputs a question to the output stream(user) and scans and
	 *         parses the input stream. Returns a long.
	 */
	public static long requestLong(String question) {
		System.out.print(question);
		return Long.parseLong(scanner.nextLine().trim());
	}

	/**
	 * @param question
	 * @return short Outputs a question to the output stream(user) and scans and
	 *         parses the input stream. Returns a short.
	 */
	public static short requestShort(String question) {
		System.out.print(question);
		return Short.parseShort(scanner.nextLine().trim());
	}

	/**
	 * @param question
	 * @return String. Outputs a question to the output stream(user) and scans
	 *         and parses the input stream. Returns a string.
	 */
	public static String requestString(String question) {
		System.out.print(question);
		return scanner.nextLine().trim();
	}
}