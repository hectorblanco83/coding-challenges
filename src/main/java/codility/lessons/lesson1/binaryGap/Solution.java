package codility.lessons.lesson1.binaryGap;

/**
 * @see <a href="https://app.codility.com/programmers/lessons/1-iterations/binary_gap/">Challenge</a>
 */
class Solution {
	
	public int solution(int N) {
		int firstOne = -1, gap = 0;
		String binary = toBinary(N);
		for(int i = 0; i < binary.length(); i++) {
			char c = binary.charAt(i);
			if(c == '1' && (firstOne == -1 || firstOne == i - 1)) {
				firstOne = i;
			} else if(c == '1') {
				gap = Math.max(gap, (i - firstOne - 1));
				firstOne = i;
			}
		}
		return gap;
	}
	
	
	private String toBinary(int N) {
		int number = N;
		
		StringBuilder binaryBuilder = new StringBuilder();
		while(number > 0) {
			binaryBuilder.insert(0, number % 2);
			number = number / 2;
		}
		
		return binaryBuilder.toString();
	}
	
}