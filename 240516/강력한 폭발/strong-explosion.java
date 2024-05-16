import java.util.*;
import java.io.*;

public class Main {
	static int[][] graph;
	static int n;
	static int cnt;
	static ArrayList<Point> arr = new ArrayList<>();
	static int mostB;
	static int mostT;
	static int t;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		graph = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] tmp = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				graph[i][j] = Integer.parseInt(tmp[j]);
				if (graph[i][j] == 1) {
					arr.add(new Point(i, j));
				}
			}
		}
		bomb = new int[arr.size() + 1];

		// backTracking으로 폭탄 유형 만들기
		// 폭탄 유형에 맞게 터친 지도 만들기
		// 지도에 터진 구역 체크하기
		mostB = 0;
		mostT = 0;
//		for (int i = 0; i < n; i++) {
//			System.out.println(Arrays.toString(visited[i]));
//		}
		if(n==1) {
			System.out.println(1);
		}else{
			backTracking(1, arr.size());
			System.out.println(mostT);

		}

	}

	static int bomb[];

	static void backTracking(int x, int k) {
		if (x == k+1) {
			cnt = 1;
			t=0;
			visited = new boolean[n][n];
			bombing();
			cnt=0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (bombed[i][j]) {
						t++;
						bfs(new Point(i, j));
					}
				}
			}
			mostB = Math.max(cnt, mostB);
			mostT = Math.max(t, mostT);
//			System.out.println(mostB);
		} else {
			for (int i = 1; i <= 3; i++) {
				bomb[x] = i;
				backTracking(x + 1, k);
			}
		}
	}

	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static void bfs(Point p) {
		Queue<Point> que = new LinkedList<>();
		que.offer(p);
		visited[p.x][p.y] = true;
		while (!que.isEmpty()) {
			Point now = que.poll();
			for (int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] &&bombed[nx][ny]) {
					visited[nx][ny] = true;
					que.offer(new Point(nx, ny));
					cnt++;
				}
			}
		}
//		System.out.println("cnt "+cnt);
//		System.out.println("t "+t);
	}

	static class Point {
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static boolean[][] bombed;

	static void bombing() {
		bombed = new boolean[n][n];
		int[] bombx_1 = { -2, -1, 1, 2 };
		int[] bombx_3 = { -1, -1, 1, 1 };
		int[] bomby_3 = { -1, 1, -1, 1 };

		for (int i = 0; i < arr.size(); i++) {
			int num = bomb[i + 1];
			Point nowBomb = arr.get(i);
			bombed[nowBomb.x][nowBomb.y] = true;

			if (num == 1) {
				for (int j = 0; j < 4; j++) {
					int nx = nowBomb.x + bombx_1[j];
					if (nx >= 0 && nx < n && nowBomb.y >= 0 && nowBomb.y < n) {
						bombed[nx][nowBomb.y] = true;
					}
				}
			} else if (num == 2) {
				for (int j = 0; j < 4; j++) {
					int nx = nowBomb.x + dx[j];
					int ny = nowBomb.y + dy[j];
					if (nx >= 0 && nx < n && nowBomb.y >= 0 && nowBomb.y < n) {
						bombed[nx][ny] = true;
					}
				}
			} else {
				for (int j = 0; j < 4; j++) {
					int nx = nowBomb.x + bombx_3[j];
					int ny = nowBomb.y + bomby_3[j];
					if (nx >= 0 && nx < n && nowBomb.y >= 0 && nowBomb.y < n) {
						bombed[nx][ny] = true;
					}
				}
			}
//			System.out.println(Arrays.toString(bomb));
//			System.out.println("!"+nowBomb.x+" "+nowBomb.y);
		}
//		for (int i = 0; i < n; i++) {
//			System.out.println(Arrays.toString(bombed[i]));
//		}
//		System.out.println();
	}

}