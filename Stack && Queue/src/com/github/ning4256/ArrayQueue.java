package com.github.ning4256;

public class ArrayQueue<E> implements Queue<E> {
	Array<E> array = new Array<>();

	public ArrayQueue(int capacity) {
		array = new Array<>(capacity);
	}

	public ArrayQueue() {
		array = new Array<>();
	}

	@Override
	public void enqueue(E e) {
		array.addLast(e);
	}

	@Override
	public E dequeue() {
		return array.removeFirst();
	}

	@Override
	public E getFront() {
		return array.getFirst();
	}

	@Override
	public int getSize() {
		return array.getSize();
	}

	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("队列：top [");
		for (int i = 0; i < array.getSize(); i++) {
			res.append(array.getE(i));
			if (i != array.getSize() - 1) {
				res.append(", ");
			}
		}
		res.append("] last");
		return res.toString();
	}
}
