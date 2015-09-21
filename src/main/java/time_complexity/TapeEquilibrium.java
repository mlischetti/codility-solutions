package time_complexity;

import org.junit.Assert;

public class TapeEquilibrium {

	public static void main(String[] args) {
		TapeEquilibrium equilibrium = new TapeEquilibrium();
		int solution = -1;

		int[] A = new int[] { 3, 1, 2, 4, 3 };
		solution = equilibrium.solution(A);
		Assert.assertEquals(1, solution);

		int[] B = new int[] { 5, 6, 2, 4, 1 };
		solution = equilibrium.solution(B);
		Assert.assertEquals(4, solution);
	}

	public int solution(int[] A) {
		if (A == null || A.length == 0 || A.length == 1) {
			return -1;
		}
		int min = Integer.MAX_VALUE;
		final int allSum = sum(A, 0);
		int left = 0;
		for (int p = 0; p < A.length - 1; p++) {
			left = left + A[p];
			int right = allSum - left;
			int diff = Math.abs(left - right);

			if (diff < min) {
				min = diff;
			}
		}

		return min;
	}

	public int sum(int[] A, int index) {
		int sum = 0;
		for (int i = index; i < A.length; i++) {
			sum = sum + A[i];
		}
		return sum;
	}
}
