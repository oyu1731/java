
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Q8_8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int sum = 0;
        List<Integer> numbers = new ArrayList<Integer>();

        System.out.println("整数値を３つ入力");
        for (int n = 0; n < 3; n++) {
            System.out.print((n + 1) + "つ目の整数値：");
            int k = stdIn.nextInt();
            numbers.add(k);

        }
        System.out.println("最大値" + Collections.max(numbers));
        System.out.println("最小値" + Collections.min(numbers));
    }
}