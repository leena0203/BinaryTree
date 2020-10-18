package com.MyBinaryTree;

public class MyBinayNode<K extends Comparable<K>> {
	K key;
	MyBinayNode<K> left;
	MyBinayNode<K> right;

	public MyBinayNode(K key) {
		super();
		this.key = key;
		this.left = null;
		this.right = null;
	}
	
}
