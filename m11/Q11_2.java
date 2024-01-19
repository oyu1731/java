//クラス変数は基本的にクラス単体でしか使えないが、static int x = 1;,public static int x;
//こういうふうにすれば別のクラスでも使えるようになる
//逆にクラスが一つのときや、一つのクラスでしか変数を使わない場合はpublic int x = 1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Q11_2 {
    //別のクラスで変数を使う場合は下の２行が必要
    public static int x;
    public static int y;

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("開始値：");
        //int型xに入力
        int x = stdIn.nextInt();
        System.out.println("終了値：");
        //int型yに入力
        int y = stdIn.nextInt();

        //インスタンス化
        Keisan calculator = new Keisan();
        calculator.sum(x,y);
    }
}

class Keisan {
    List<Integer> list = new ArrayList<>();
    int x = Q11_2.x;
    int y = Q11_2.y;
    //関数名：keisan
    //引数：int型n1,int型n2
    //戻り地：voidのためなし
    //内容：n1からn2までをリストに格納し合計を出力
    void sum(int x,int y) {
        //iに開始の値を初期値とし、iがn2以下の間繰り返し、iを1ずつ増やす
        for (int i = x; i <= y; i++){
            //listにiを格納
            list.add(i);
        }
        //listの合計をsumに代入
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(x + "から" + y + "の合計値は" + sum);
    }
}
