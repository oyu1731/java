package kyoutu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Q8_5 {
        public static void main(String[] args) {
            //リストを作成  Arrays.asList(1,2,3,4,5)これで作成と一緒に初期値を入れれる
            List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
                // numbers.add(1);  
                // numbers.add(2);
                // numbers.add(3);
                // numbers.add(4);
                // numbers.add(5);
            //合計値の初期値
            int sum = 0;
            //リストnumbersの要素数をsに入れる
            int s = numbers.size();
            //リストの要素数回繰り返す
            for (int i = 0; i < numbers.size();i++)
                //sumにnumbersのi番目の値を足す
                sum += numbers.get(i);
            
                System.out.println("合計値は" + sum + "です");
                System.out.println("平均値は" + (sum / s) + "です");

        }
    }
