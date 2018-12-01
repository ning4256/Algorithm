package com.github.ning4256;

public class Test {
	public static void main(String[] args) {
		LinkedList1<Integer> linkedList = new LinkedList1<>();
		linkedList.addFirst(1);
		linkedList.add(1, 14);
		linkedList.addLast(19);
		linkedList.add(2, 15);
		linkedList.addFirst(2);
		linkedList.addFirst(1);
		linkedList.add(1, 14);
		linkedList.addLast(19);
		linkedList.add(2, 15);
		linkedList.addFirst(2);
		System.out.println(linkedList);
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.get(2));
		linkedList.set(2, 666);
		System.out.println(linkedList);
		linkedList.removeFirst();
		System.out.println(linkedList);
		linkedList.remove(1);
		System.out.println(linkedList);
		linkedList.removeE(19);
		System.out.println(linkedList);
	}
}
