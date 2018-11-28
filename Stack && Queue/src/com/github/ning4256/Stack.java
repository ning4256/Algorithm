package com.github.ning4256;

public interface Stack<E> {
	// 获得栈的元素个数
	int getSize();

	// 判断栈是否为空
	boolean isEmpty();

	// 向栈中添加元素
	void push(E e);

	// 从栈顶取出元素
	E pop();

	// 查看当前栈顶的元素
	E peek();
}
