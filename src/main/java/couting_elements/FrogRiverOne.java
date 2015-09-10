package couting_elements;

import org.junit.Assert;
/**
 * Solution: {@link: https://codility.com/demo/results/demoM7NRCJ-F8M/}
 * @author Mariano
 *
 */
public class FrogRiverOne {

	public static void main(String[] args) {
		FrogRiverOne frogRiverOne = new FrogRiverOne();
		int[] A = new int[] { 1, 3, 1, 4, 2, 3, 5, 4 };
		int X = 5;
		int solution = frogRiverOne.solution(X, A);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(6, solution);

		X = 8;
		solution = frogRiverOne.solution(X, A);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(-1, solution);

		X = 3;
		solution = frogRiverOne.solution(X, A);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(4, solution);
	}

	public int solution(int X, int[] A) {
		int[] positions = new int[X];
		for (int i = 0; i < positions.length; i++) {
			positions[i] = -1;
		}
		for (int i = 0; i < A.length; i++) {
			int position = A[i];
			if (position <= X) {
				if (positions[position - 1] == -1) {
					positions[position - 1] = i;
				}
			}
		}
		int solution = 0;
		for (int position = 0; position < X; position++) {
			int leaveTime = positions[position];
			if (leaveTime == -1) {
				return -1;
			}
			solution = Math.max(solution, leaveTime);
		}
		return solution;
	}
}
