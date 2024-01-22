

import java.util.Scanner;

class Q1_10 {
    public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in,"Shift-JIS");

    System.out.print("文字を入力");
    String str = stdIn.next();

    System.out.print("整数を入力");
    int x = stdIn.nextInt();

    System.out.print("小数を入力");
    float y = stdIn.nextFloat();

    System.out.println("入力された文字＝" + str);
    System.out.println("入力された整数＝" + x);
    System.out.println("入力された小数＝" + y);
    }
}