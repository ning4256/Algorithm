package com.github.ning4256;

public class BST<E extends Comparable<E>> {
	//Node类有三个元素：自身保存的元素e，左右两个节点left,right
	private class Node {
		private E e;
		private Node left, right;
		//初始元素，左右节点皆为空
		public Node(E e) {
			e = null;
			left = null;
			right = null;
		}
	}
	//将自身节点设为空节点，并且设置长度
	private Node root;
	private int size;

	public BST() {
		super();
		this.root = null;
		this.size = 0;
	}

	// 获得size个数
	public int size() {
		return size;
	}

	// 判断是否为空
	public boolean isEmpty() {
		return size == 0;
	}

	// 添加元素
	public void add(E e) {
		if(root == null) {
			root = new Node(e);
			size++;
		}
	}
	public void add(Node node, E e) {
		//判断大小，找到添加的位置
		if(e.equals(node.e))
			return;
		else if (e.compareTo(node.e) < 0 && node.left == null) {
			node.left = new Node(e);
			size++;
			return;
		}
		else if (e.compareTo(node.e) > 0 && node.right == null) {
			node.right = new Node(e);
			size++;
			return;
		}
		//递归调用找到添加位置
		if(e.compareTo(node.e) < 0)
			add(node.left, e);
		else
			add(node.right, e);
	}
}