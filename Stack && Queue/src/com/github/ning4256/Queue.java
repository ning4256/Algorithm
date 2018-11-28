package com.github.ning4256;

public interface Queue<E> {
	void enqueue(E e);

	E dequeue();

	E getFront();

	int getSize();

	boolean isEmpty();
}
