package couting_elements;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;

/**
 * Solution {@link https://codility.com/demo/results/demoJYBU6G-HEX/}
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
		final Set<Integer> possitives = new HashSet<Integer>();
		for (int element : A) {
			if (element > 0) {
				possitives.add(element);
			}
		}
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (!possitives.contains(i)) {
				return i;
			}
		}
		return -1;
	}

}
