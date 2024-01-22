

import java.util.Scanner;

class Q1_9 {
    public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in,"Shift-JIS");

    System.out.print("お名前を入力してください");
    String name = stdIn.next();

    System.out.println("こんにちは" + name + "さん！");
    }
}