package kyoutu.m13.Q13_1;

//-----------[ 抽象クラス Person ]--------------------
abstract class Person {
    // 名前
    private String name = "";
    // 職業
    private String job = "";

    //---------[ コンストラクタ ]-----------------
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    //-------------------------------------------

    //--------------[ 抽象メソッド ]-----------------------
    //抽象メソッドとは内容のない名前だけのメソッド
    public abstract void introduce();
    //-----------------------------------------------------
    }
}

//----------------[ 教師クラス ]--------------
class Teacher extends Person {
    // 担当科目
    private String subject = "";

    //----------[ コンストラクタ ]-------------------------
    // 親クラスのコンストラクタを呼び出し
    public Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    //-----------------------------------------------------

    //--------------[ メソッド ]-----------------------
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("担当科目は" + subject + "です。");
    //----------------------------------------------------
    }
}}

//-----------[ 料理人クラス ]----------------
class Cook extends Person {
    // 得意料理
    private String specialities = "";

    //---------------[ コンストラクタ ]------------------------
    // 親クラスのコンストラクタを呼び出し
    public Cook(String name, String job, String specialities) {
        super(name, job);
        this.specialities = specialities;
    //---------------------------------------------------------

    //--------------[ メソッド ]-------------------------------------
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("得意料理は" + specialities + "です。");
    //---------------------------------------------------------------
    }}
}

//---------------------[ メイン処理クラス ]------------------------------------------------
public class Q13_1 {
    public static void main(String[] args) {
        // 教師クラス作成
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");
        // 料理人クラス作成
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");

        // 自身の情報を表示
        teacher.introduce();
        System.out.println("");
        cook.introduce();
    }
}
