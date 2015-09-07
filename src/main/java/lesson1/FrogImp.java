package lesson1;

import org.junit.Assert;

public class FrogImp {

	public static void main(String[] args) {
		FrogImp frogImp = new FrogImp();
		int solution = frogImp.solution(10, 85, 30);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(3, solution);

		solution = frogImp.solution(1, 1, 3);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(0, solution);

		solution = frogImp.solution(5, 105, 3);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(34, solution);

		solution = frogImp.solution(3, 999111321, 7);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(142730189, solution);

		solution = frogImp.solutionStolen(3, 999111321, 7);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(142730189, solution);
	}

	public int solution(int X, int Y, int D) {
		if (Y < X) {
			return -1;
		}
		double result = (Y - X) / (double) D;
		return (int) Math.ceil(result);
	}

	public int solutionStolen(int X, int Y, int D) {
		if (Y < X) {
			return -1;
		}
		if ((Y - X) % D == 0) {
			return (Y - X) / D;
		}
		return (Y - X) / D + 1;
	}
}
