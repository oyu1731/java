
public class CalcExcuter implements CalcAddSub {
    private int int_A;
    private int int_B;

    public void CalcAddSub(int int_A, int int_B){
        this.int_A = int_A;
        this.int_B = int_B;
    }
    
        @Override public void dispAdd(){
            int Add_anser = int_A + int_B;
            System.out.println("足し算の結果:" + Add_anser);
        }

        @Override public void dispsub(){
            int Add_anser = int_A + int_B;
            System.out.println("足し算の結果:" + Add_anser);
    }
