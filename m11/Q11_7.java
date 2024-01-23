class Q11_7 {
    public static void main(String[] args) {
        
        //-------------[ インスタンス化 ]----------------------------------------------------
        Student A = new Student("A","001",89,65,88);
        System.out.println(A.no + "番   " + A.name + "さん" + "    平均点" +A.ave() + "点");

        Student B = new Student("B","002",80,95,64);
        System.out.println(B.no + "番   " + B.name + "さん" + "    平均点" +B.ave() + "点");

        Student C = new Student("C","003",70,80,98);
        System.out.println(C.no + "番   " + C.name + "さん" + "    平均点" +C.ave() + "点");
        //----------------------------------------------------------------------------------
    }
}

class Student {
    //----------[ プロパティ ]--------------
    String      name;           //名前
    String      no;             //学生番号
    Integer     japanese;       //国語の点数
    Integer     math;           //数学の点数
    Integer     english;        //英語の点数
    //-------------------------------------

    //--------[ コンストラクタ ]--------
    Student(String name, String no, Integer japanese, Integer math, Integer english) {
        this.name = name;
        this.no = no;
        this.japanese = japanese;
        this.math = math;
        this.english = english;
    //----------------------------------
    }

    //----------[ メソッド ]-------------
    Double ave() {
        //平均点を算出(点数は整数型で受け取っているため、平均を出した際に小数点を消してしまうので、平均を求める前に(double)をつける)
        Double ave_anser = (double)(japanese + math + english) / 3;
        //小数第三位を切り捨ての処理
        ave_anser = (double) (Math.floor(ave_anser * 100)) / 100;
        //計算結果を返す
        return ave_anser;
    }
    //---------------------------------
}

