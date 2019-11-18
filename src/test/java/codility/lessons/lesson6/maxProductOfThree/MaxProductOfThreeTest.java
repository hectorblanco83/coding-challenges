package codility.lessons.lesson6.maxProductOfThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class MaxProductOfThreeTest {
	
	private Solution solution = new codility.lessons.lesson6.maxProductOfThree.Solution();
	
	
	@Test
	@DisplayName("Test Max Product of Three's solution with challenge's provided input")
	void testSolution() {
		int[] input = {-3, 1, 2, -2, 5, 6};
		Assertions.assertEquals(60, solution.solution(input));
	}
	
}