package couting_elements;

import org.junit.Assert;
/**
 * Solution: {@link https://codility.com/demo/results/demoFQYE6M-WEA/}
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
		int[] countingElements = new int[maxElement];

		for (int element : A) {
			if(element > A.length) {
				return 0;
			}
			int count = countingElements[element - 1] + 1;
			if (count > 1) {
				return 0;
			}
			countingElements[element - 1] = countingElements[element - 1] + 1;
		}

		for (int count : countingElements) {
			if (count == 0) {
				return 0;
			}
		}
		return 1;
	}
}
