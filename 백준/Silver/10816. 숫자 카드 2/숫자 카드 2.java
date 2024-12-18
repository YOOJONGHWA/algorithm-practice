

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        HashMap<Integer,Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        br.readLine();
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {

            int num = Integer.parseInt(st.nextToken());
            if (map.containsKey(num)) {
                sb.append(map.get(num)).append(" ");
            }
            else {
                sb.append("0").append(" ");
            }
        }
        System.out.println(sb);
    }

}
