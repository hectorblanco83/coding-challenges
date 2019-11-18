package codility.lessons.lesson6.maxProductOfThree;

/**
 * @see <a href="https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/">Challenge</a>
 */
class Solution {
	
	
	public int solution(int[] A) {
		
		// there's just one triplet
		if(A.length == 3) {
			return A[0] * A[1] * A[2];
		}
		
		// maxs and mins initial values
		int max = Integer.MIN_VALUE,
			secondMax = Integer.MIN_VALUE,
			thirdMax = Integer.MIN_VALUE;
		int lesser = Integer.MAX_VALUE,
			secondLesser = Integer.MAX_VALUE;
		
		// get greaters and lessers in one for
		for(int i = 0; i < A.length; i++) {
			if(A[i] > max) {
				thirdMax = secondMax;
				secondMax = max;
				max = A[i];
			} else if(A[i] > secondMax) {
				thirdMax = secondMax;
				secondMax = A[i];
			} else if(A[i] > thirdMax) {
				thirdMax = A[i];
			}
			
			if(A[i] < lesser) {
				secondLesser = lesser;
				lesser = A[i];
			} else if(A[i] < secondLesser) {
				secondLesser = A[i];
			}
		}
		
		// max product of greaters
		int productOfThreeGreaters = max * secondMax * thirdMax;
		
		// max product between greater and 2 lessers
		int productOfGreaterAndTwoLessers = max * lesser * secondLesser;
		
		// max between two products
		return Math.max(productOfThreeGreaters, productOfGreaterAndTwoLessers);
	}
	
}