package kyoutu.m12;

//-----------[ parsonクラス ]--------------------
//----------[ プロパティ ]------------------------
class Person {
    // 名前
    private String name = ""; 
    // 職業
    private String job = "";
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

//----------------[ メソッド ]---------------------------
    public void introduce() {
        System.out.println("私の名前は" + name + "で、職業は" + job + "です。");
//-------------------------------------------------------
    }
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
//オーバーライド(継承元で名前は表示されるメソッドがある)
    public void introduce() {
        //親のメソッドを実行v
        super.introduce();
        System.out.println("担当科目は" + subject + "です。");
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
