package day03;

import common.*;

public class MyStack<T> {
	private Node<T> top = null;

	// inner class
	class Node<T> {
		private T data;
		private Node<T> next = null;

		public Node(T data) {
			this.data = data;
		}
	}/////////////////////////

	public void push(T item) {
		Node<T> newNode = new Node<>(item);
		newNode.next = top;// 맨 처음에 newNode.next에 null담긴다
		top = newNode;// top에 방금 push한 item노드를 전달한다
	}// ---------------------

	public T peek() {
		if (top == null) {
			throw new EmptyException();
		}
		return top.data;
	}// ------------------------------

	public T pop() {
		if (top == null) {
			throw new EmptyException();
		}
		T delData=top.data;
		top=top.next; //top.next는 이전에 push한 Node객체의 주소값을 가지고 있다. top의 위치를 한칸 내려준다
		return delData;
	}// ------------------------
	
	public boolean isEmpty() {
		return (top==null);
	}
	
	
	
	

}/////////////////////////////////////////////
