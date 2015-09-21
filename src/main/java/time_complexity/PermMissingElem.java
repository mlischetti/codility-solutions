package time_complexity;

import org.junit.Assert;

public class PermMissingElem {

	public static void main(String[] args) {
		PermMissingElem permMissingElem = new PermMissingElem();
		int[] A = new int[] { 2, 3, 1, 5 };
		int solution = permMissingElem.solution(A);
		System.out.println("Solution:" + solution);
		Assert.assertEquals(4, solution);

		int[] B = new int[] {};
		solution = permMissingElem.solution(B);
		System.out.println("Solution:" + solution);
		Assert.assertEquals(1, solution);

		int[] C = new int[] { 1 };
		solution = permMissingElem.solution(C);
		System.out.println("Solution:" + solution);
		Assert.assertEquals(2, solution);

		int[] D = new int[] { 2 };
		solution = permMissingElem.solution(D);
		System.out.println("Solution: " + solution);
		Assert.assertEquals(1, solution);
	}

	public int solution(int[] A) {
		long N = A.length + 1;
		long total = N * (N + 1) / 2;
		for (int element : A) {
            total = total - element;
        }
		return (int) (total);
	}
}
