import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

import java.util.Random;

public class Algorithm6BTest {

	@Test
	public void preSortedStrings() {
		LinkedList<String> L = new LinkedList<String>();
		L.add("Aaa");
		L.add("Bbb");
		L.add("Ccc");
		L.add("Ddd");
		L.add("Eee");
		assertTrue(Algorithm6B.kth_largest(L, 2).equals("Ddd"));
	}
	
	@Test
	public void nonSortedStrings() {
		LinkedList<String> L = new LinkedList<String>();
		L.add("ICanHazString?");
		L.add("This is a string");
		L.add("Moar");
		L.add("Testee");
		assertTrue(Algorithm6B.kth_largest(L,1).equals("This is a string"));
	}
	
	@Test
	public void lotsOfRandomInts() {
		LinkedList<Integer> manyInts = new LinkedList<Integer>();
		Random generator = new Random();
		//Adds 1000 integers to the linked list
		for (int i = 0; i < 1000; i++) {
			manyInts.add(generator.nextInt());
		}
		//Creates a copy of the linked list as an array for testing.
		Integer[] manyIntsCopy = manyInts.toArray(new Integer[1000]);
		Arrays.sort(manyIntsCopy);
		//Compares the kth(100th) largest in the LinkedList to the 100th largest in the array copy.
		assertTrue(Algorithm6B.kth_largest(manyInts, 100).equals(manyIntsCopy[900]));
	}

}
