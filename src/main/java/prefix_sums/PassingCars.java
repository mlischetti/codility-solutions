package prefix_sums;

import org.junit.Assert;

public class PassingCars {

	private static final int EAST = 0;
	private static final int WEST = 1;
	private static final int MAX_COUNTER = 1000000000;

	public static void main(String[] args) {
		PassingCars passingCars = new PassingCars();
		int[] A = { 0, 1, 0, 1, 1 };
		int solution = passingCars.firstSolution(A);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(5, solution);
	}

	public int firstSolution(int[] A) {
		int passingCars = 0;
		for (int index = 0, length = A.length; index < length; index++) {
			if (A[index] == EAST) {
				passingCars = passingCars + countPassing(A, index + 1);
				if (passingCars >= MAX_COUNTER) {
					return -1;
				}
			}
		}

		return passingCars;
	}

	private int countPassing(int[] A, int from) {
		int count = 0;
		for (int index = from, length = A.length; index < length; index++) {
			if (A[index] == WEST) {
				count++;
			}
		}
		return count;
	}
}
