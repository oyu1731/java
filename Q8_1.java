package kyoutu;

class Q8_1 {
    public static void main(String[] args) {
        // int型の配列listを作成(要素は１０個)
        int[] list = new int[10];

        // iの初期値を０とし、1から10までの値を配列にセット
        for (int i = 0; i < list.length; i++)
            list[i] = i + 1;

        // 配列の各要素の値を表示
        for (int i = 0; i < list.length; i++)
            System.out.println("list[" + i + "] = " + list[i]);

    

    }
}
