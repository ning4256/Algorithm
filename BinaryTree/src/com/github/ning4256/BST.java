package com.github.ning4256;

public class BST<E extends Comparable<E>> {
	// Node类有三个元素：自身保存的元素e，左右两个节点left,right
	private class Node {
		private E e;
		private Node left, right;

		// 初始元素e，左右节点皆为空
		public Node(E e) {
			this.e = e;
			left = null;
			right = null;
		}
	}

	// 将自身节点设为空节点，并且设置长度
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
		if (root == null) {
			root = new Node(e);
			size++;
		} else {
			add(root, e);
		}
	}
//	public void add(Node node, E e) {
//		//判断大小，找到添加的位置
//		if(e.equals(node.e))
//			return;
//		else if (e.compareTo(node.e) < 0 && node.left == null) {
//			node.left = new Node(e);
//			size++;
//			return;
//		}
//		else if (e.compareTo(node.e) > 0 && node.right == null) {
//			node.right = new Node(e);
//			size++;
//			return;
//		}
//		//递归调用找到添加位置
//		if(e.compareTo(node.e) < 0)
//			add(node.left, e);
//		else
//			add(node.right, e);	

	// 将节点视为添加位置，如果该位置为空，则添加元素e，否则递归调用比较大小，找到添加位置
	private Node add(Node node, E e) {
		if (node == null) {
			size++;
			return new Node(e);
		}
		if (e.compareTo(node.e) < 0) {
			node.left = add(node.left, e);
		} else if (e.compareTo(node.e) > 0) {
			node.right = add(node.right, e);
		}

		return node;
	}

	// 查询元素
	public boolean contains(E e) {

		return contains(root, e);
	}

	// 以node为根是否包含元素e
	private boolean contains(BST<E>.Node node, E e) {
		// TODO Auto-generated method stub
		if (node == null)
			return false;

		if (e.compareTo(node.e) < 0)
			return contains(node.left, e);
		else if (e.compareTo(node.e) > 0)
			return contains(node.right, e);
		else
			return true;

	}

	// 遍历所有元素
	// 1.前序遍历
	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node node) {
		if (node == null)
			return;
		System.out.println(node.e);
		preOrder(node.left);
		preOrder(node.right);
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		generateBSTString(root, 0, res);
		return res.toString();
	}

	// 生成以node为根节点，深度为depth的描述二叉树的字符串
	private void generateBSTString(Node node, int depth, StringBuilder res) {

		if (node == null) {
			res.append(generateDepthString(depth) + "null\n");
			return;
		}

		res.append(generateDepthString(depth) + node.e + "\n");
		generateBSTString(node.left, depth + 1, res);
		generateBSTString(node.right, depth + 1, res);
	}

	private String generateDepthString(int depth) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < depth; i++)
			res.append("--");
		return res.toString();
	}
}
