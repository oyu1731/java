import java.util.Scanner;

class stirng_join{
    public static void main(String[] args) {
     //------------------[ "Shuit-JIS"をつけることで文字化けを防ぐ ]----------------
     Scanner stdIn = new Scanner(System.in,"Shift-JIS");

     System.out.print("１つ目のの文字列：");
     //-----------[ stringbuiderでインスタンス化 ]------------------------------
        //--------------[ これにより文字列をいろいろできる ]--------------
        StringBuilder str_1 =  new  StringBuilder(stdIn.next());
        System.out.print("２つ目の文字列：");
        //--------------[ str_1 >> 先頭 str_2 >> 末尾に結合 ]--------------
        str_1.append(stdIn.next());  

        System.out.println(str_1);
    }
}