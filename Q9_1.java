import java.util.Scanner;

class Q9_1 {
    // 新しいメソッド inputAndPrintInfo を定義
    static void inputAndPrintInfo() {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("学校名：");
        String str = stdIn.next();
        System.out.print("名前：");
        String name = stdIn.next();

        System.out.println("学校名：" + str);
        System.out.println("名前：" + name);
    }

    public static void main(String[] args) {
        // メソッド呼び出し
        inputAndPrintInfo();
    }
}
