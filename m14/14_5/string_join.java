import java.util.Scanner;

class stirng_join{
    public static void main(String[] args) {
     //------------------[ "Shuit-JIS"をつけることで文字化けを防ぐ ]----------------
     Scanner stdIn = new Scanner(System.in,"Shift-JIS");
     //-----------[ stringbuiderでインスタンス化 ]------------------------------
        //--------------[ これにより文字列をいろいろできる ]--------------
        StringBuilder str =  new  StringBuilder(stdIn.next());
    }
}