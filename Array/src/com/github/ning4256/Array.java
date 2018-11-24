package com.github.ning4256;

public class Array {
	private int[] data; // 定义了一个名叫data的数组
	private int size; // size用于记录数组里面的个数

	// 有参的构造函数
	public Array(int capacity) {
		data = new int[capacity]; // 给data数组一个length
		size = 0; // 0个元素
	}

	// 无参的构造函数
	public Array() {
		this(10);
	}

	// 获取内部元素的个数
	public int getSize() {
		return size;
	}

	// 获取数组的容量(长度)
	public int getCapacity() {
		return data.length;
	}

	// 判断这个数组是否为空
	public boolean isEmpty() {
		return size == 0;
	}

	// 向数组末尾添加元素
	public void addLast(int e) {
		insert(size, e);
	}

	// 向数组头部添加元素
	public void addFirst(int e) {
		insert(0, e);
	}

	// 向输入任意位置插入元素
	public void insert(int index, int e) {
		if (size == data.length) {
			throw new IllegalArgumentException("Add failed,Array is full!");
		}
		if (index < 0 || index > size) {
			throw new IllegalArgumentException("Add failed,index < 0 or index > data.length");
		}
		for (int i = size - 1; i >= index; i--) {
			data[i + 1] = data[i];
		}
		data[index] = e;
		size++;
	}

	// 获取索引为Index位置的元素
	public int getE(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("GetE failed,index is illegal");
		}
		return data[index];
	}

	// 修改索引为index的元素
	public void setE(int index, int e) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("GetE failed,index is illegal");
		}
		data[index] = e;
	}

	// 查找数组是否含有元素e
	public boolean contains(int e) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == e) {
				return true;
			}
		}
		return false;
	}

	// 查找数组中e的下标
	public int finds(int e) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == e) {
				return i;
			}
		}
		return -1;
	}

	// 从数组中删除索引为index的元素，并返回这个元素
	public int remove(int index) {
		if (index < 0 || index > size) {
			throw new IllegalArgumentException("remove failed,please input right index!");
		}
		int res = data[index];
		for (int i = index + 1; i < size; i++) {
			data[i - 1] = data[i];
		}
		size--;
		return res;
	}

	// 删除头部
	public int removeFirst() {
		return remove(0);
	}

	// 删除尾部
	public int removeLast() {
		return remove(size - 1);
	}

	// 删除某个元素
	public void removeElement(int e) {
		boolean flag = contains(e);
		if (!flag) {
			throw new IllegalArgumentException("removeElement failed,Array don't contain e!");
		}
		int index = finds(e);
		if (index != -1) {
			remove(index);
		}
	}

	//打印这个数组	
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
