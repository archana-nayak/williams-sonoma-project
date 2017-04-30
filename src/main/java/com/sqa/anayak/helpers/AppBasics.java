/**
 *   File Name: AppBasics.java<br>
 *
 *   LastName, FirstName<br>
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
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AppBasics {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @param name
	 */
	public static void farewellUser(String name) {
		System.out.println("Thank you for using my app " + name);
	}

	public static String greetUser(String appName) {
		String name;
		System.out.println("welecome to the " + appName);
		System.out.println("Could i get your name: ");

		return scanner.nextLine();
	}

	/**
	 * @param string
	 * @return
	 */
	public static int requestInt(String question) {
		// TODO Auto-generated method stub
		System.out.print(question);
		// String input = scanner.nextLine();
		int value = Integer.parseInt(scanner.nextLine());// (input);
		return value;
	}
}
