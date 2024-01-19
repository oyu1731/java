

class Q7_4 {
    public static void main(String[] args) {
        //合計の初期値を設定
        int i = 0;
        //足していく値の初期値を設定
        int n = 1;

        boolean flg = true;
        //iが正の数の間繰り返す（無限ループ）
        while(flg == true) {
            //nにiを足していく
            i = i + n;
            //合計値が100000を超えたらブレイクし、ループを終了
            if (i >= 100000) {
                break;
            }
            n += 1;
        }
        System.out.println("合計は100000を超えるnは" + n + "です");
    }
}
