import java.util.InputMismatchException;
import java.util.Scanner;
//--------------[ メインクラス ]--------------
class judgement_of_odd_number_and_even_number {
    public static void main(String[] args) {
    
    Scanner stdIn = new Scanner(System.in);
    try {
//--------------[ 入力 ]--------------
    System.out.print("整数 = ");
    int int_A = stdIn.nextInt();
//--------------[ 偶数か判断 ]--------------(２で割ったときのあまりが０か)    
    if (int_A % 2 == 0){
        System.out.println(int_A + " は偶数");
    } else {
        System.out.println(int_A + " は奇数");
    }
//--------------[ 例外処理 (入力がint型かどうか確認) ]--------------
} catch(InputMismatchException e){
    System.out.println("整数を認識できません！！");
}
}
}