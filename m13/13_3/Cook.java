//----------[ 料理人クラス ]-----------------------------------------------------
class Cook implements Person {
    private String name = "";
    private String job = "";
    private String specilius = "";

//---------[ コンストラクタ ]-------------------------------------
    public Cook(String name, String job, String specilius) {
        this.name = name;
        this.job = job;
        this.job = specilius;
//---------------------------------------------------------------
}
//--------[ メソッド ]-------------------------------------- 
//personクラスのインターフェースのintroduceをオーバーライドする
    @Override public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specilius);
//----------------------------------------------------------
}
//--------------------------------------------------------------------------------
}