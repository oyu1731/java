package kyoutu;

import java.util.Scanner;

class Q_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x;
        do {
            System.out.print("整数");
            x = stdIn.nextInt();
            System.out.print(x % 10);
            x /= 10;
        } while (x > 0);
    }
}
