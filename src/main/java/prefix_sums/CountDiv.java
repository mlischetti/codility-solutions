package prefix_sums;

import org.junit.Assert;

/**
 * See <a href="">Solution</a>
 *
 * http://codesays.com/2014/solution-to-count-div-by-codility/
 * Created by Mariano on 9/21/2015.
 */
public class CountDiv {

    public static void main(String[] args) {
        CountDiv countDiv = new CountDiv();
        int A = 6, B = 11, K = 2;
        int solution = countDiv.solution(A, B, K);
        Assert.assertEquals(3, solution);
        System.out.println("Solution: " + solution);

        solution = countDiv.solutionStolen(A, B, K);
        Assert.assertEquals(3, solution);
        System.out.println("Solution: " + solution);
    }

    public int solution(int A, int B, int K) {
        int countDiv = 0;
        for (int x = A; x <= B; x++) {
            if (x % K == 0) {
                countDiv++;
            }
        }
        return countDiv;
    }

    public int solutionStolen(int A, int B, int K) {
        int b = B / K;
        int a = (A > 0 ? (A - 1) / K : 0);
        if (A == 0) {
            b++;
        }
        return b - a;
    }
}
