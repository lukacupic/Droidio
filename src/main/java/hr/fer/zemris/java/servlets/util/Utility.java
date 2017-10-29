package hr.fer.zemris.java.servlets.util;

import java.util.Random;

public class Utility {

	/**
	 * A random object, used for generating random values.
	 */
	private static Random random = new Random();

	/**
	 * Returns a random, uniformly distributed integer from the interval
	 * [min, max];
	 *
	 * @param min the lower bound of the interval (inclusive)
	 * @param max the upper bound of the interval  (inclusive)
	 * @return a random, uniformly distributed integer from the interval
	 * [min, max]
	 */
	public static int getRandomInt(int min, int max) {
		return random.nextInt(max - min + 1) + min;
	}
}
