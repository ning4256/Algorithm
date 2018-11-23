package com.github.ning4256;

public class B_array2 {
	private int[] data;
	private int size;


	 无参构造函数

	// 构造函数，传入数组的容量capacity构造
	public B_array2(int capacity) {
		data = new int[capacity];
		size = 0;
	}
	public B_array2() {
			this(10);
	}

	// 获取数组中的元素个数
	public int getSize() {
		return size;
	}

	// 获取数组的容量
	public int getCapacity() {
		return data.length;
	}

	// 判断数组是否为空
	public boolean isEmpty() {
		return size == 0;
	}

	// 向数组末尾添加元素
	public void addLast(int e) {
		if (size == data.length) {
			throw new IllegalArgumentException("AddLast failed,Array is full!");
		}
		// 向空白处添加元素
		data[size] = e;
		size++;
	}

	public void add(int index, int e) {

		if (size == data.length) {
			throw new IllegalArgumentException("Add failed,Array is full!");
		}

		if (index < 0 || index > size) {
			throw new IllegalArgumentException("Add failed,");
		}

		for (int i = size - 1; i >= index; i--) {
			data[i + 1] = data[i];
		}
		data[index] = e;
		size++;
	}

	// 查找元素
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
		res.append('[');
		for (int i = 0; i < size; i++) {
			res.append(data[i]);
			if (i != size - 1) {
				res.append(", ");
			}
		}
		res.append(']');
		return res.toString();

	}
}
