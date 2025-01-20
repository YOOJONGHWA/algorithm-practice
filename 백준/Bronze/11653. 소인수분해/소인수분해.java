

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        int num = 2;
        while (target > 1) {

            if (target % num == 0) {
                target /= num;
                list.add(num);
            } else {
                num++;
            }
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
