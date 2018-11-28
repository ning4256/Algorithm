package com.github.ning4256;

public class TestQueue {
	public static void main(String[] args) {
		ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
		arrayQueue.enqueue(1);
		arrayQueue.enqueue(3);
		arrayQueue.enqueue(4);
		arrayQueue.enqueue(2);
		arrayQueue.enqueue(7);
		System.out.println(arrayQueue);
		arrayQueue.dequeue();
		System.out.println(arrayQueue);
		System.out.println("此时的头部为" + arrayQueue.getFront());
		System.out.println("此时队列是否为空?" + arrayQueue.isEmpty());
	}
}
