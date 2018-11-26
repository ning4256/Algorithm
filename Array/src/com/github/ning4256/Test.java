package com.github.ning4256;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array<Integer> arr = new Array<Integer>(20);
		System.out.println(arr);

		arr.insert(0, 1);
		arr.insert(1, 2);
		arr.insert(2, 4);
		arr.insert(3, 7);
		arr.insert(4, 5);
		arr.insert(5, 6);
		System.out.println(arr);
		
		arr.addFirst(2);
		System.out.println(arr);
		
		arr.remove(3);
		System.out.println(arr.remove(3));
		System.out.println(arr);
		
		arr.removeElement(2);
		System.out.println(arr);
		
	}

}
