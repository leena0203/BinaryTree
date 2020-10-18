package com.MyBinaryTree;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyBinaryTreeTest {
	
	/**
	 * Add Numbers to binary tree
	 */
	@Test
	public void given3Numbers_whenAddedToBinaryTree_shouldReturnSize3() {
		MyBinaryTree<Integer> test = new MyBinaryTree<>();
		test.add(56);
		test.add(30);
		test.add(70);
		assertEquals(3, test.getSize());
	}
	
	/**
	 * Create binary tree 
	 */
	@Test
	public void given13Numbers_whenAddedToBinaaryTree_shouldReturnSize() {
		MyBinaryTree<Integer> test = new MyBinaryTree<>();
		test.add(56);
		test.add(30);
		test.add(70);
		test.add(22);
		test.add(60);
		test.add(40);
		test.add(11);
		test.add(3);
		test.add(95);
		test.add(65);
		test.add(63);
		test.add(16);
		test.add(67);
		assertEquals(13, test.getSize());
	}
	@Test
	public void givenNumbers_whenSearchInBinaryTree_shouldReturnNo() {
		MyBinaryTree<Integer> test = new MyBinaryTree<>();
		test.add(56);
		test.add(30);
		test.add(70);
		test.add(22);
		test.add(60);
		test.add(40);
		test.add(11);
		test.add(3);
		test.add(95);
		test.add(65);
		test.add(63);
		test.add(16);
		test.add(67);
		assertTrue(test.search(63));
	}

}
