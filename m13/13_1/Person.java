//抽象クラス
//実際の処理は書かずに器（プロパティ、メソッド名）を記載するだけ
//コンストラクタの記載はOK
//メソッドの処理の内容は継承先にオーバーライドしそこに処理を記載する

//-----------[ parsonクラス ]--------------------

abstract class Person {
    //----------[ プロパティ ]------------------------
    // 名前
    protected String name = ""; 
    // 職業
    protected String job = "";
//-----------------------------------------------

//---------[ コンストラクタ ]-----------------
//初期化　（生成と同時に作成）
// クラス名 (引数) {
//    処理
//} 
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
//-------------------------------------------
    }

//----------------[ 抽象メソッド ]---------------------------
    abstract public void introduce() ;
//-------------------------------------------------------
}

//----------------[ 教師クラス ]--------------
class Teacher extends Person {
    // 担当科目
    private String subject = "";
//-------------------------------------------
    
//----------[ コンストラクタ ]-------------------------
//親クラスのコンストラクタを呼び出し
    public Teacher(String name, String job, String subject) {
        //継承元のコンストラクタを読み込む
        super(name, job);
        this.subject = subject;
//-----------------------------------------------------
    }

//--------------[ メソッド ]-----------------------
//オーバーライド(継承元で名前を表示するメソッドがある)
    public void introduce() {
        //親のメソッドを実行v
        super.introduce();
        System.out.println("名前：" + name);
        System.out.println("担当科目:" + subject + );
//----------------------------------------------------
    }
}

//-----------[ 料理人クラス ]----------------
class Cook extends Person {
    // 得意料理
    private String specialities = "";

//---------------[ コンストラクタ ]------------------------
//親クラスのコンストラクタを呼び出し
    public Cook(String name, String job, String specialities) {
        super(name, job);
        this.specialities = specialities;
//---------------------------------------------------------
    }

//--------------[ メソッド ]-------------------------------------
    public void introduce() {
        super.introduce();
        System.out.println("得意料理は" + specialities + "です。");
//---------------------------------------------------------------
    }
}

//---------------------[ メイン処理クラス ]------------------------------------------------
public class Q12_2 {
    public static void main(String[] args) {
        // 教師クラス作成
        Teacher teacher = new Teacher("近藤勇", "教員", "Go言語");
        // 料理人クラス作成
        Cook cook = new Cook("沖田総司", "シェフ", "オムライス");

        // 自身の情報を表示
        teacher.introduce();
        System.out.println("");
        cook.introduce();
    }
}
 