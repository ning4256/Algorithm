package com.github.ning4256;

import java.util.Arrays;

public class LoopQueue<E> implements Queue<E> {
	private E[] data;
	private int front, tail;
	private int size;

	@SuppressWarnings("unchecked")
	public LoopQueue(int capacity) {
		data = (E[]) new Object[capacity + 1];
		front = 0;
		tail = 0;
		size = 0;
	}

	public LoopQueue() {
		this(10);
	}

	// 判断是否为空
	public boolean isEmpty() {
		return front == tail;
	}

	// 获得其容量
	public int getCapacity() {
		return data.length - 1;
	}

	// 获得内部元素的个数
	public int getSize() {
		return size;
	}

	// 向里面添加元素
	public void enqueue(E e) {
		if ((tail + 1) % data.length == front) {
			resize(getCapacity() * 2);
		}
		data[tail] = e;
		tail = (tail + 1) % data.length;
		size++;
	}

	// 删除元素
	public E dequeue() {
		if (isEmpty()) {
			throw new IllegalArgumentException("cannot dequeue from an empty array!");
		}
		E req = data[front];
		data[front] = null;
		front = (front + 1) % data.length;
		size--;
		if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
			resize(getCapacity() / 2);
		}
		return req;
	}
	//更改容量
	private void resize(int newCapacity) {
		@SuppressWarnings("unchecked")
		E[] newData = (E[]) new Object[newCapacity + 1];
		for (int i = 0; i < size; i++) {
			newData[i] = data[(i + front) % data.length];
		}
		data = newData;
		front = 0;
		tail = size;

	}
	//获得元素
	@Override
	public E getFront() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new IllegalArgumentException("Queue is empey.");
		}
		return data[front];
	}

	@Override
	public String toString() {
		return "LoopQueue [data=" + Arrays.toString(data) + ", front=" + front + ", tail=" + tail + ", size=" + size
				+ "]";
	}
	

}
