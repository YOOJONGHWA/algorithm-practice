

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = 0;
        String book = "";

        for (String key : map.keySet()) {
            int count = map.get(key);

            if (count > max || (count == max && key.compareTo(book) < 0)) {
                max = count;
                book = key;
            }
        }

        System.out.println(book);
    }
}
