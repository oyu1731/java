//----------------[ 実行用クラス ]---------------------------------------------------------
class Main {
    public static void main(String[] args) {
//----------------[ インスタンス化 ]--------------------------------------
        Teacher teacherinst = new Teacher("竹井一馬", "教師", "情報処理");
        teacherinst.introduce();

System.out.println("");
//----------------[ インスタンス化 ]--------------------------------------
        Cook cookinst = new Cook("大原太郎", "シェフ", "オムライス");
        cookinst.introduce();
    }
}