package codility.lessons.lesson2.cyclicRotation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CyclicRotationTest {
	
	private Solution solution = new codility.lessons.lesson2.cyclicRotation.Solution();
	
	
	@Test
	@DisplayName("Test Cyclic Rotation's solution with challenge's provided input")
	void testSolution() {
		int[] input;
		int K;
		
		input = new int[]{3, 8, 9, 7, 6};
		K = 3;
		Assertions.assertArrayEquals(new int[]{9, 7, 6, 3, 8}, solution.solution(input, K));
		
		input = new int[]{0, 0, 0};
		K = 1;
		Assertions.assertArrayEquals(new int[]{0, 0, 0}, solution.solution(input, K));
		
		input = new int[]{1, 2, 3, 4};
		K = 4;
		Assertions.assertArrayEquals(new int[]{1, 2, 3, 4}, solution.solution(input, K));
	}
	
}