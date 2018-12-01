package com.github.ning4256;

import java.time.Duration;
import java.util.Set;

public class LinkedList1<E> {

	private class Node {
		public E e;
		public Node next;

		public Node(E e, Node next) {
			this.e = e;
			this.next = next;
		}

		public Node(E e) {
			this(e, null);
		}

		public Node() {
			this(null, null);
		}

		@Override
		public String toString() {
			return e.toString();
		}
	}

	private Node dummyNode;
	private int size;

	public LinkedList1() {
		dummyNode = new Node();
		size = 0;
	}

	// 获取个数
	public int getSize() {
		return size;
	}

	// 判断是否为空
	public boolean isEmpty() {
		return size == 0;
	}

	// 添加元素
	public void add(int index, E e) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Add failed");

		Node prev = dummyNode;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		prev.next = new Node(e, prev.next);
		size++;
	}

	public void addFirst(E e) {
		add(0, e);
	}

	public void addLast(E e) {
		add(size, e);
	}

	// 获得index位置的元素
	public E get(int index) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Get failed");

		Node cur = dummyNode.next;
		for (int i = 0; i < index; i++)
			cur = cur.next;
		return cur.e;
	}

	public E getLast() {
		return get(size - 1);
	}

	public E getFirst() {
		return get(0);
	}

	// 修改index出的元素
	public void set(int index, E e) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Set failed");
		Node cur = dummyNode.next;
		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}
		cur.e = e;
	}

	// 判断是否有元素e
	public boolean contains(E e) {
		Node cur = dummyNode.next;
		while (cur != null) {
			if (cur.e.equals(e)) {
				return true;
			}
			cur = cur.next;
		}
		return false;
	}

	// 删除index位置的元素
	public void remove(int index) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("remove failed");
		Node prev = dummyNode;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		Node delNode = prev.next;
		prev.next = delNode.next;
		delNode = null;
		size--;
	}

	public void removeFirst() {
		remove(0);
	}

	public void removeLast() {
		remove(size);
	}

	//删除元素e
	public void removeE(E e) {
		Node pre = dummyNode;
		while(pre.next != null) {
			if(pre.next.e.equals(e))
				break;
			pre = pre.next;
		}
		if(pre.next != null) {
			Node delNode = pre.next;
			pre.next = delNode.next;
			delNode = null;
			size--;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();

//        Node cur = dummyHead.next;
//        while(cur != null){
//            res.append(cur + "->");
//            cur = cur.next;
//        }
		for (Node cur = dummyNode.next; cur != null; cur = cur.next)
			res.append(cur + "->");
		res.append("NULL");

		return res.toString();
	}

}