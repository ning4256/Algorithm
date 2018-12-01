package com.github.ning4256;

public class TestLoopqueue {
	public static void main(String[] args) {
		LoopQueue<Integer> loopQueue = new LoopQueue<>();
		loopQueue.enqueue(1);
		loopQueue.enqueue(2);
		loopQueue.enqueue(5);
		loopQueue.enqueue(3);
		loopQueue.enqueue(4);
		System.out.println(loopQueue);
		loopQueue.dequeue();
		System.out.println(loopQueue);
		System.out.println(loopQueue.getFront());
		loopQueue.dequeue();
		loopQueue.dequeue();
		loopQueue.enqueue(1);
		loopQueue.enqueue(2);
		loopQueue.enqueue(5);
		loopQueue.enqueue(3);
		loopQueue.enqueue(4);
		loopQueue.enqueue(1);
		loopQueue.enqueue(2);
		loopQueue.enqueue(5);
		loopQueue.enqueue(3);
		loopQueue.enqueue(4);
		System.out.println(loopQueue);
		loopQueue.dequeue();
		loopQueue.dequeue();
		loopQueue.dequeue();
		loopQueue.dequeue();
		loopQueue.dequeue();
		loopQueue.dequeue();
		loopQueue.dequeue();
		loopQueue.dequeue();
		loopQueue.dequeue();
		System.out.println(loopQueue);

	}
}
