

import java.io.*;
import java.util.*;

public class Main {

    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};  // 상, 하, 좌, 우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            char[] line = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                board[i][j] = line[j] - '0';
            }
        }

        System.out.println(BFS(0, 0, n, m));
    }

    private static int BFS(int startX, int startY, int n, int m) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.addLast(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.pollFirst();
            int x = current[0];
            int y = current[1];

            // 목표 지점 도착
            if (x == n - 1 && y == m - 1) {
                return board[x][y]; // 최단 거리 반환
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 1 && !visited[nx][ny]) {

                    visited[nx][ny] = true;
                    board[nx][ny] = board[x][y] + 1; // 최단 거리 갱신
                    queue.addLast(new int[]{nx, ny});
                }
            }
        }
        return -1; // 도달 불가능한 경우
    }
}
