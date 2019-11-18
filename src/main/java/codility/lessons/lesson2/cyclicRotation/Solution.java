package codility.lessons.lesson2.cyclicRotation;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;


/**
 * @see <a href="https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/">Challenge</a>
 */
class Solution {
	
	public int[] solution(int[] A, int K) {
		// This solution will need some extra MEM, but the K operations will be executed in O(1)
		// If K >> A.length maybe it's a valid choice.
		//return solutionWithList(A,K);
		
		// This solution will only need another array large as A
		// K will no be a term for complexity, while we will do only ONE loop over A
		return solutionWithArray(A, K);
	}
	
	
	private int[] solutionWithArray(int[] A, int K) {
		return shiftRight(A, K);
	}
	
	
	private int[] solutionWithList(int[] A, int K) {
		// need a linkedlist as support, this will add some memory to keep track of all node's pointers
		LinkedList<Integer> list = new LinkedList<>();
		
		// O(n) to copy array
		for(int value : A) {
			list.add(value);
		}
		
		// O(k) to shift elements of the list to right. O(1) operations executed K times
		for(int i = 0; i < K; i++) {
			shiftRight(list);
		}
		
		// just to print
		// prettyPrintCollection(list);
		
		// Another O(n) to unbox the list
		return list.stream().mapToInt(i -> i).toArray();
	}
	
	
	private void shiftRight(LinkedList<Integer> list) {
		list.addFirst(list.removeLast());
	}
	
	
	private int[] shiftRight(int[] array, int times) {
		// if we shift N times with N a multiple of array.length, we will end up if the orginal array
		if(times % array.length == 0) return array;
		
		// shifted array
		int[] copy = new int[array.length];
		
		// some counters to help in the array copy
		int mod = times % array.length;
		int indexFromTheEnd = array.length - mod;
		int arrayIndex = 0;
		
		// Next two for loops will iterate eventuali for the whole array, so it's O(n)
		for(int copyIndex = indexFromTheEnd; copyIndex < array.length; copyIndex++) {
			copy[arrayIndex++] = array[copyIndex];
		}
		
		int stillToCopy = copy.length - arrayIndex;
		for(int i = 0; i < stillToCopy; i++) {
			copy[arrayIndex++] = array[i];
		}
		
		// just to print
		// prettyPrintArray(copy);
		
		//
		return copy;
	}
	
	
	private void prettyPrintCollection(Collection<Integer> collection) {
		// pretty print
		System.out.print("[ ");
		collection.forEach(x -> System.out.print(x + " "));
		System.out.print("]");
	}
	
	
	private void prettyPrintArray(int[] array) {
		// pretty print
		System.out.println(Arrays.toString(array));
	}
	
	
	public static void main(String[] args) {
		int[] input = {1, 2, 3, 4, 5};
		int K = 1;
		new Solution().solution(input, K);
	}
}
