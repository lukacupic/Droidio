package swwg.util;

import java.util.Random;

/**
 * A utility class used for accessing the pseudo-random number mechanism.
 *
 * @author Luka Cupic
 */
public class RandUtil {

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
