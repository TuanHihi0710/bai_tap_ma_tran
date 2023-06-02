import java.util.Scanner;

public class MaTran {
    private int soDong;
    private int soCot;
    private int[][] maTran;

    public MaTran() {
        maTran = new int[soDong][soCot];
    }

    public MaTran(int inputSoDong, int inputSoCot) {
        soDong = inputSoDong;
        soCot = inputSoCot;
        maTran = new int[soDong][soCot];
    }

    public int getSoDong() {
        return soDong;
    }

    public int getSoCot() {
        return soCot;
    }

    public void setSoDong(int inputSoDong) {
        soDong = inputSoDong;
    }

    public void setSoCot(int inputSoCot) {
        soCot = inputSoCot;
    }
    public void NhapVaoSoDongSoCotMaTran(int inputCurrent, int inputColumn){
        setSoDong(inputCurrent);
        setSoCot(inputColumn);
        maTran = new int[getSoDong()][getSoCot()];
    }

    public void NhapMaTran(Scanner sc){
        for (int i = 0; i < getSoDong(); i++) {
            for (int j = 0; j < getSoCot(); j++) {
                System.out.println("Nhap vao phan tu ma tran thu ["+(i+1)+"]["+(j+1)+"] = ");
                maTran[i][j] = sc.nextInt();
            }
        }
    }
    public void HienThiMaTran(){
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(maTran[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
