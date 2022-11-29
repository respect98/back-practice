package day07;
//DFS: Stack, BFS:Queue
import java.util.*;
public class DFS_Stack {
	static boolean visited[]=new boolean[9];
						//  0   1        2       3      4     5     6    7     8
	static int [][] graph={{},{2,3,8},{1,6,8},{1,5}, {5,7},{3,4,7},{2},{4,5},{1,2}};
	//1->8->3->5->7->4->2->6
	static Stack<Integer> sk=new Stack<>();

	public static void main(String[] args) {
		sk.push(1);//시작 노드 저장
		visited[1]=true;//스택에 저장한 노드 방문 처리
		
		while(!sk.isEmpty()) {
			//스택에서 노드를 하나 꺼내자
			int i=sk.pop();//스택에서 삭제되면서 삭제된 노드를 반환함
			System.out.print(i+"->");
			//꺼낸 노드와 인접한 노드를 찾아 인접요소들이 방문하지 않은 노드라면 스택에 넣어준다(push)
			for(int node:graph[i]) {
				if(!visited[node]) {//방문하지 않은 노드라면
					sk.push(node);//스택에 저장한 뒤
					visited[node]=true;//방문 처리
				}//
			}			
		}//while--------

	}

}
