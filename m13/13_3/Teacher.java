//----------[ 教師クラス ]-----------------------------------------------------
class Teacher implements Person {
    private String name = "";
    private String job = "";
    private String subject = "";

//---------[ コンストラクタ ]-------------------------------------
    public Teacher(String name, String job, String subject) {
        this.name = name;
        this.job = job;
        this.subject = subject;
//---------------------------------------------------------------
}
//--------[ メソッド ]-------------------------------------- 
//personクラスのインターフェースのintroduceをオーバーライドする
    @Override public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("科目：" + subject);
//----------------------------------------------------------
    }
//--------------------------------------------------------------------------------
}