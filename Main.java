import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaTran maTran = new MaTran();
        int nhap=0;
        do {
            try {
                System.out.println("=======MENU===========");
                System.out.println("Nhập vào một số từ 1 đến 2 để chọn Menu:");
                System.out.println("1: Nhập ma tran");
                System.out.println("2: Nhập gia tri ma tran");
                System.out.println("3: Xuat ma tran");
                System.out.println("4: Chia so phuc");
                Scanner sc = new Scanner(System.in);
                nhap = sc.nextInt();
                if (nhap < 1 || nhap > 5) {
                    System.out.println("Nhap sai gia tri vui long nhap lai");
                } else if (nhap==1) {
                    System.out.println("Nhap ma tran");
                    System.out.println("Nhap vao so dong");
                    Scanner scSoDong = new Scanner(System.in);
                    int inputSoDong = scSoDong.nextInt();
                    System.out.println("Nhap vao so cot");
                    Scanner scSoCot = new Scanner(System.in);
                    int inputSoCot = scSoCot.nextInt();
                    maTran.NhapVaoSoDongSoCotMaTran(inputSoDong,inputSoCot);
                } else if (nhap==2) {
                    System.out.println("Nhap vao thong tin ma tran");
                    Scanner scGiaTri = new Scanner(System.in);
                    maTran.NhapMaTran(scGiaTri);
                } else if (nhap==3) {
                    System.out.println("Hien thi ma tran");
                    maTran.HienThiMaTran();
                }
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Số lượng phần tử đang lớn hơn số phần tử trong mảng");
            } catch (NullPointerException ex) {
                System.out.println("Lỗi tham chiếu null");
            } catch (InputMismatchException ex) {
                System.out.println("Loi sai dau vao");
            } catch (Exception ex) {
                System.out.println("Lỗi ngoại lệ trong");
            }
        } while (nhap != 5);
    }
}