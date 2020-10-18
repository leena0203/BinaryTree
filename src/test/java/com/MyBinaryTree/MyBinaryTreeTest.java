package com.MyBinaryTree;

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

}
