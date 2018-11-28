package com.github.ning4256;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack<Integer> arrayStack = new ArrayStack<>();
		arrayStack.push(1);
		arrayStack.push(2);
		arrayStack.push(4);
		arrayStack.push(11);
		System.out.println(arrayStack.toString());
		arrayStack.pop();
		System.out.println(arrayStack.toString());
		int pop = arrayStack.pop();
		System.out.println("取出来的栈顶为" + pop);
		int top = arrayStack.peek();
		System.out.println("此时栈顶为" + top);
	}

}
