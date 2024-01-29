import java.util.Scanner;
//--------------[ クラス ]--------------
class string_creation {
    public static void main(String[] args) {
    //------------------[ "Shuit-JIS"をつけることで文字化けを防ぐ ]----------------
    Scanner stdIn = new Scanner(System.in,"Shift-JIS");
    System.out.print("文字列を入力：");
        //-----------[ 文字列を入力 ]------------------------------
        String str = stdIn.next();
        //-----------[ lengthで文字列の文字数を数える ]-------------
        int len = str.length();
        //--------------[ 判定 ]--------------
        if (len >= 11){
            ////--------------[ 開始位置のindex番号は０からで終了は１から数える ]--------------
            System.out.println(str.substring(0, 10)); 
        }  
        else{
            System.out.println(str);
        }    
    }
}