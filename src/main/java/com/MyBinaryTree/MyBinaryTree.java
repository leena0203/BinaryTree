package com.MyBinaryTree;

public class MyBinaryTree<K extends Comparable<K>> {
	public MyBinayNode<K> root;
	/**
	 * Add method
	 * @param key
	 */
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	/**
	 * Add method in binary tree as smaller no. to left side and larger to right side
	 * @param current
	 * @param key
	 * @return
	 */
	public MyBinayNode<K> addRecursively(MyBinayNode<K> current, K key) {
		if (current == null) {
			return new MyBinayNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0) {
			return current;
		}
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		}else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	/**
	 * Size of tree
	 * @return
	 */
	public int getSize() {
		return this.getSizeRecursive(root);
	}
	public int getSizeRecursive(MyBinayNode<K> current) {
		return current == null ? 0 : 1+ this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}


}
