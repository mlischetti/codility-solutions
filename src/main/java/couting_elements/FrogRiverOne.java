package couting_elements;

import org.junit.Assert;

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
		Integer[] positions = new Integer[100001];
		for (int i = 0; i < A.length; i++) {
			int position = A[i];
			Integer leaveTime = positions[position];
			if (leaveTime == null || i < leaveTime) {
				positions[position] = i;
			}
		}
		int max = 0;
		for (int position = 1; position <= X; position++) {
			Integer leaveTime = positions[position];
			if (leaveTime == null) {
				return -1;
			}
			max = Math.max(max, leaveTime);
		}

		return max;
	}
}
