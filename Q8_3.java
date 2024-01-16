package kyoutu;
import java.util.Scanner;

class Q8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int型の配列listを作成(要素は１０個)
        int[] list = new int[11];

        // iの初期値を０とし、1から10までユーザーの入力
        for (int i = 1; i < list.length; i++) {
            System.out.print(i + "件目:整数を入力 = ");
            list[i] = scanner.nextInt();
        }

        // 配列の各要素の値を表示
        for (int i = 0; i < list.length; i++) {
            System.out.println("list[" + i + "] = " + list[i]);
        }
    }
}
