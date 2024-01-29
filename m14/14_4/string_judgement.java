import java.util.Scanner;
//--------------[ クラス ]--------------
class string_jdegement {
    public static void main(String[] args) {
    //------------------[ "Shuit-JIS"をつけることで文字化けを防ぐ ]----------------
    Scanner stdIn = new Scanner(System.in,"Shift-JIS");
    System.out.print("１つ目の文字列を入力：");
        //-----------[ 文字列を入力 ]------------------------------
        String str_1 = stdIn.next();
    System.out.print("２つ目の文字列を入力：");
        //-----------[ 文字列を入力 ]------------------------------
        String str_2 = stdIn.next();

        //--------------[ string同士の比較はequalsを使う ]--------------
        if (str_1.equals(str_2)){ 
            System.out.println("同じ内容です。");
    }
    }
}