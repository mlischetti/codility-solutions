package couting_elements;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;

/**
 * Solution: {@link https://codility.com/demo/results/demoM75EUJ-H3Y/}
 * 
 * @author Mariano
 *
 */
public class PermCheck {

	public static void main(String[] args) {
		PermCheck permCheck = new PermCheck();
		int[] A = new int[] { 4, 1, 3, 2 };
		int solution = permCheck.solution(A);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(1, solution);

		A = new int[] { 4, 1, 3 };
		solution = permCheck.solution(A);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(0, solution);
	}

	public int solution(int[] A) {
		final int maxElement = A.length;

		final Set<Integer> set = new HashSet<Integer>();
		for (int element : A) {
			if (element > maxElement || element < 0) {
				return 0;
			}
			if (set.contains(element)) {
				return 0;
			}
			set.add(element);
		}

		return set.size() == maxElement ? 1 : 0;
	}
}
