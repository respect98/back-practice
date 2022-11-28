package day06;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBFS2 {
	
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
	
	public static void main(String[] args) {
		BinaryTreeBFS2 app = new BinaryTreeBFS2();
		Node root=app.makeTree();
		System.out.println(app.BFS(0, root)+"<<<<");
	}//-------------------------
	
	public int BFS(int level,Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root); //루트 노드 저장
		while(!q.isEmpty()) {
			int size=q.size();
			for(int i=0; i<size; i++) {
				Node cnode=q.poll();
				System.out.print(cnode.data+"->");
				if(cnode.left==null && cnode.right==null) {
					return level;//말단 노드라면 레벨값을 반환
				}
				if(cnode.left!=null) q.add(cnode.left);
				if(cnode.right!=null) q.add(cnode.right);
			}//for-------------------
			level++;
		}//while---------
		return 0;
	}//----------------------------------------
	
}
