package day06;

import java.util.*;

//너비우선탐색(Breath First Search) => 최단거리를 구할 때 많이 사용되는 알고리즘 => 레벨탐색이라고도 함
//DFS(재귀함수 또는 스택) / BFS(큐)
public class BinaryTreeBFS {

	Node root;
	
	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;

		}
	}///////////////////////////

	public Node makeTree() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);
		return root;
	}// ------------------------

	public void BFS(Node root) {
		Queue<Node> q = new LinkedList<>();
		// 삽입: add(), offer()
		// 삭제: remove(), poll()
		// 검사: peek()
		q.offer(root);
		int level = 0;
		while (!q.isEmpty()) {
			System.out.print("L" + level+": ");
			int size=q.size();
			for (int i=0;i<size; i++) {
				// 큐에서 노드를 꺼내 출력하자
				Node item = q.poll();
				System.out.print(item.data + "->");
				if (item.left != null) {
					q.offer(item.left); // 왼쪽 자식 노드를 큐에 추가
				}
				if (item.right != null) {
					q.offer(item.right); // 오른쪽 자식노드를 큐에 추가
				}
				//=>큐에 데이터가 증가됨
			}//for-----------------------
			level++;
			System.out.println();
		}//while------------------------------

	}//--------------------------------

	public static void main(String[] args) {
		BinaryTreeBFS app = new BinaryTreeBFS();
		Node root = app.makeTree();
		app.BFS(root);

	}

}
