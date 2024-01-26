import java.util.Scanner;
//-----------[ メインクラス ]-------------------
class main2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字列を入力：");
        //-----------文字列を入力
        String str = stdIn.next();
        //lengthで文字列の文字数を数える
        int len = str.length();
        //-----------入力された文字列を表示
        System.out.println(len);
    }
}