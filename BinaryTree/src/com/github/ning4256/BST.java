package com.github.ning4256;

public class BST {
	private class Node<E> {
		private E e;
		private Node left, right;
		public Node(E e) {
			this.e = e;
			left = null;
			right = null;
		}
	}
	private Node root;
	private int size;
	public BST() {
		root = null;
		size =0;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public int getSize() {
		return size;
	}
}
