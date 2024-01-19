import java.util.Scanner;

//mainクラスを作成
class Q11_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("半径を入力");
        //int型に入力
        int n = stdIn.nextInt();

        //クラスkansuをインスタンス化
        //別のクラスのメソッドを用いるためにはインスタンス化が必要
        //クラス名 オブジェクト名 = new クラス名(コンストラクタ)
        //コンストラクタの特徴
            //クラスメイとメソッドの名前が一致
            //戻り地リターンがない
        Q11_1_kansu calculator = new Q11_1_kansu();
        calculator.get_circumference(n);
        calculator.get_area(n);
    }
}
//kansuクラスを作成
class Q11_1_kansu {
    double PI = 3.1415;
    //関数名：get_circumference
    //引数：int型n
    //戻り地：voidのためなし
    //内容：int型nを用いて円周を求め表示する
    void get_circumference(int n) {
        double ans = (n + n) * PI;
        System.out.println("円周の長さは " + ans);
    }

    //関数名：get_area
    //引数：int型n
    //戻り地：voidのためなし
    //内容：int型nを用いて円の面積を求め表示する
    void get_area(int n) {
        double ans = n * n * PI;
        //小数点第4位切り捨ての処理
        ans = ((double)Math.ceil(ans * 1000) / 1000);
        System.out.println("円の面積は " + ans);
    }
}