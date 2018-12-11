package com.github.ning4256;

public class Test {
	public static void main(String[] args) {
		BST bst = new BST<Integer>();
		int[] nums = {24,21,53,63,25,62,63};
		for (int i : nums) {
			bst.add(i);
		}
//		bst.preOrder();
//		bst.inOrder();
		bst.lastOrder();
		System.out.println();
		System.out.println(bst);
//		System.out.println(bst.contains(8));
	}
}
