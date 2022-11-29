package day07;

import static java.lang.System.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//Comparable, Comparator
class Player implements Comparable<Player>{
	int height;
	int weight;
	
	public Player(int h, int w) {
		this.height=h;
		this.weight=w;
	}
	@Override
	public int compareTo(Player p) {
		//키 내림차순
		return p.height-this.height;
	}
	
}/////////////////////////

public class Q24_PlayerSelect {
	public static List<Player> choice(List<Player> arr, int n) {
		int cnt=0;//선발 인원수
		//Arrays.sort(배열), Collections.sort(ArrayList)
		Collections.sort(arr);//키 내림차순으로 먼저 정렬
		int max=0;
		List<Player> choiceArr=new ArrayList<>();
		for(Player p:arr) {
			if(p.weight>max) {
				max=p.weight;
				choiceArr.add(p);//선발선수
				cnt++;
			}
		}		
		return choiceArr;
	}//-----------------------------------

	public static void main(String[] args) {
		Scanner sc=new Scanner(in);
		System.out.println("씨름선수 후보 인원수: ");
		int n=sc.nextInt();
		System.out.println("키와 몸무게 순서로 입력하세요: ");
		//ArrayList활용해보기
		List<Player> arr=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int h=sc.nextInt();
			int w=sc.nextInt();
			//Player객체 생성
			Player p=new Player(h, w);
			arr.add(p);
		}//for-----
		List<Player> clist=choice(arr, n);
		System.out.println("선발 가능 선수: "+clist.size()+"명");
		for(Player p:clist) {
			System.out.println(p.height+": "+p.weight);
		}
	}

}
