
//文字の入力をするためにscannerをインポート
import java.util.Scanner;

//クラスを作成
class Q5_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        //入力を促す
        System.out.print("ランクを入力");
        //入力された文字をrankに入れる
        String rank = stdIn.nextLine();
    
        switch (rank) {
            case "A": System.out.println("ランク A は評価「優」です\r");
                break;
            case "B": System.out.println("ランク B は評価「良」です\r");
                break;
            case "C": System.out.println("ランク C は評価「可」です\r");
                break;
            case "D": System.out.println("ランク D は評価「不可」です\r");
                break;
            default:
                break;
        }
        
    }
}
