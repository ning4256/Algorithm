package com.github.ning4256;

public class ArrayStack<E> implements Stack<E> {
	Array<E> array;

	public ArrayStack(int capacity) {
		array = new Array<>(capacity);
	}

	public ArrayStack() {
		array = new Array<>();
	}

	// 获得栈里面元素的个数
	@Override
	public int getSize() {
		return array.getSize();
	}

	// 判断栈是否为空
	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}

	// 获得栈的长度
	public int getCapacity() {
		return array.getCapacity();
	}

	// 向栈中添加元素
	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		array.addLast(e);
	}

	// 往栈中取出元素
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return array.removeLast();
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return array.getLast();
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Stack:[");
		for (int i = 0; i < array.getSize(); i++) {
			res.append(array.getE(i));
			if (i != array.getSize() - 1) {
				res.append(", ");
			}
		}
		res.append("] top");
		return res.toString();

	}

}
