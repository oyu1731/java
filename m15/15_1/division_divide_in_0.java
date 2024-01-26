import java.util.Scanner;
//--------------[ メインクラス ]--------------
class division_divide_in_0 {
    public static void main(String[] args) {
    
    Scanner stdIn = new Scanner(System.in);
    try {
//--------------[ 入力 ]--------------
    System.out.print("整数１ = ");
    int int_A = stdIn.nextInt();
//--------------[ 入力 ]--------------
    System.out.print("整数２ = ");
    int int_B = stdIn.nextInt();
    
//--------------[ 画面に式と計算結果を表示 ]--------------
    System.out.println(int_A + " / " + int_B + " = " + (double)(int_A/int_B));

//--------------[ 0で割ったときに例外処理 ]--------------
    } catch(ArithmeticException e) {
        System.out.println("0による割り算です!!");
    }
}
}