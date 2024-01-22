package kyoutu.m12;

import java.util.Scanner;

class Q12_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数を入力してください：");
        //int型xに入力
        int x = stdIn.nextInt();
        System.out.print("整数を入力してください：");
        //int型yに入力
        int y = stdIn.nextInt();

        Calculator calc = new MoreCalc();

        //Aに合計を入れる
        int A = calc.calcSum(x, y);
        System.out.println("Sum " + x + " and " + y + " = " + A);
        //Bに平均を入れる
        int B = calc.calcAve(x, y);
        System.out.println(" Average " + x + " and " + y + " = " + B);
        //Cに累乗を入れる
        int C = ((MoreCalc) calc).calcPow(x, y);
        System.out.println(" Power " + x + " of " + y + " = " + C);
    }
}

//合計と平均を計算するメソッドをもつCalculatorを作る
class Calculator {
    int calcSum(int x, int y){
        int sum_a = x + y;
        return sum_a;
    }
    int calcAve(int x, int y){
        int ave_a = (x + y) / 2;
        return ave_a;
    }
}

//Calculatorを継承したMoreCalcを作成
//できること
//calcSum(Calculatorを継承したため)
//calcAve(Calculatorを継承したため)
//calcPow(MoreCalcが所持しているメソッド)
class MoreCalc extends Calculator {
    int calcPow(int x, int y){
        int pow_a = (int) Math.pow(x, y);
        return pow_a;
    }
}
