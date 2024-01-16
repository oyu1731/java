package kyoutu;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Q3_9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("半径を入力");
        
        // 半径をdouble型で受け取る
        double n = stdIn.nextDouble();

        // 円の面積を計算
        double area = 3.14 * n * n;

        // BigDecimalに変換
        BigDecimal areaBigDecimal = BigDecimal.valueOf(area);

        // 小数点以下2桁に丸め
        areaBigDecimal = areaBigDecimal.setScale(2, RoundingMode.UP);

        // 結果を表示
        System.out.println(areaBigDecimal);
    }
}
