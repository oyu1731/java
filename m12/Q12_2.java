package kyoutu.m12;

class Parson {
    private String name;
    private String job;

    //コンストラクタ
    Parson(String name, String job) {
        this.name = name;
        this.job = job;
    }
    void introduce() {
    System.out.println("氏名：" + name);
    System.out.println("職業：" + job);
    }
}

class Teacher extends Parson {
    //コンストラクタ
    public void Parson (String name, String job) {
    
        super()    
    }
}