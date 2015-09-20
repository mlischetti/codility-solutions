package couting_elements;

import java.util.Arrays;

import org.junit.Assert;

/**
 * 
 * Solution: {@link https://codility.com/demo/results/trainingQEBJUN-XUU/}
 * @author mlischetti
 *
 */
public class MaxCounter {

	public static void main(String[] args) {
		MaxCounter counter = new MaxCounter();
		int[] A = new int[] { 3, 4, 4, 6, 1, 4, 4 };
		int N = 5;
		int[] expectedCounters = new int[] { 3, 2, 2, 4, 2 };

		int[] solution = counter.solution(N, A);
		Assert.assertArrayEquals(expectedCounters, solution);
		System.out.println("Solution: " + Arrays.toString(solution));

		solution = counter.solutionB(N, A);
		Assert.assertArrayEquals(expectedCounters, solution);
		System.out.println("Solution: " + Arrays.toString(solution));
	}

	public int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		final int topCondition = N + 1;
		int maxCounter = 0;

		for (int x : A) {
			if (x == topCondition) {
				// Max counter
				Arrays.fill(counters, maxCounter);
			} else if (x >= 1 && x <= N) {
				// Increase counter
				int counterIndex = x - 1;
				int counter = counters[counterIndex] + 1;
				counters[counterIndex] = counter;
				maxCounter = Math.max(maxCounter, counter);
			}
		}

		return counters;
	}

	public int[] solutionB(int N, int[] A) {
		int[] counters = new int[N];
		final int topCondition = N + 1;
		int max = 0, aux = 0;

		for (int x : A) {
			if (x == topCondition) {
				// Max counter
				aux = max;
			} else if (x >= 1 && x <= N) {
				// Increase counter
				int index = x - 1;
				int counterValue = counters[index];
				counterValue = Math.max(aux, counterValue) + 1;
				counters[index] = counterValue;
				max = Math.max(max, counterValue);
			}
		}

		// Set all rest to max counter
		for (int index = 0, len = counters.length; index < len; index++) {
			counters[index] = Math.max(counters[index], aux);
		}

		return counters;
	}
}
