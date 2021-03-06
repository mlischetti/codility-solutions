package couting_elements;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;

/**
 * See <a href="https://codility.com/demo/results/demoJYBU6G-HEX/">Solution</a>
 *
 * @author mlischetti
 *
 */
public class MissingInteger {

	public static void main(String[] args) {
		int[] A = new int[] { 1, 3, 6, 4, 1, 2 };
		MissingInteger missingInteger = new MissingInteger();
		int solution = missingInteger.solution(A);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(5, solution);

		A = new int[] { 1, 3, 6, 4, 1, 5 };
		solution = missingInteger.solution(A);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(2, solution);
	}

	public int solution(int[] A) {
		final Set<Integer> positives = new HashSet<>();
		for (int element : A) {
			if (element > 0) {
				positives.add(element);
			}
		}
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (!positives.contains(i)) {
				return i;
			}
		}
		return -1;
	}

}
