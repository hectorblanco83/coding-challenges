package codility.lessons.lesson1.binaryGap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class BinaryGapTest {
	
	private Solution solution = new codility.lessons.lesson1.binaryGap.Solution();
	
	
	@Test
	@DisplayName("Test Binary Gap's solution with challenge's provided input")
	void testSolution() {
		Assertions.assertEquals(2, solution.solution(9));
		Assertions.assertEquals(4, solution.solution(529));
		Assertions.assertEquals(1, solution.solution(20));
		Assertions.assertEquals(0, solution.solution(15));
		Assertions.assertEquals(0, solution.solution(32));
	}
	
}