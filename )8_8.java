package kyoutu;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Q8_8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        System.out.println("整数値を３つ入力");
        for (int n = 1; n <= 3; n++) {
            System.out.print(n + "つ目の整数値：");
            int k = stdIn.nextInt();
            numbers.add(k);
            
        }
        System.out.println("最大値" + numbers.stream().mapToInt(Integer::intValue).max());
        System.out.println("最小値" + numbers.stream().mapToInt(Integer::intValue).min());

    }
}