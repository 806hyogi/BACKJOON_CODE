
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class backjoon22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int jung = Integer.parseInt(sc.next()); // 정점
		int gan = Integer.parseInt(sc.next()); // 간선
		int start = Integer.parseInt(sc.next()); // 탐색시작 번호

		Map<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> queue = new LinkedList<>();

		boolean arr[] = new boolean[jung + 1];

		for (int i = 0; i < gan; i++) {

			int input1 = Integer.parseInt(sc.next()); // 1
			int input2 = Integer.parseInt(sc.next()); // 2

			map.putIfAbsent(input1, new LinkedList<>()); // 키가 없을대 linkedlist 생성
			map.putIfAbsent(input2, new LinkedList<>());

			map.get(input1).add(input2);
			map.get(input2).add(input1);
		}

		stack.push(start);

		while (!stack.isEmpty()) {
			int num = stack.pop();
			if (arr[num] == true) { // 방문했을때
				continue;
			}
			System.out.print(num + " ");

			arr[num] = true; // 방문처리
			if (map.containsKey(num) == false) { // 키 존재 여부를 확인
				continue;
			}

			Collections.sort(map.get(num), new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o2 - o1;
				}
			});

			for (int n : map.get(num)) {

				if (arr[n] == false) { // 방문 안했을때
					stack.push(n);

				}
			}
		}
		System.out.println("");
		// ==========================
		arr = new boolean[jung + 1];

		queue.offer(start);

		while (!queue.isEmpty()) {
			int num = queue.poll();
			if (arr[num] == true) { // 방문했을때
				continue;
			}
			System.out.print(num + " ");

			arr[num] = true; // 방문처리
			if (map.containsKey(num) == false) { // 키 존재 여부를 확인
				continue;
			}

			Collections.sort(map.get(num)); // 오름차순

			for (int n : map.get(num)) {

				if (arr[n] == false) { // 방문 안했을때
					queue.offer(n);

				}
			}
		}
	}
}
