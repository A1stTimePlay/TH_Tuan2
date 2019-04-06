package BaiTH.Tuan2.Bai3;


public class Main {

    public static void main(String[] args){
        PhanSo A=new PhanSo(), B=new PhanSo(), tempA, tempB;
        A.Nhap();
        B.Nhap();
        int UCLN=0;

        //Cong
        tempA=new PhanSo(A);
        tempB=new PhanSo(B);
        System.out.println("A+B: ");
        tempA.Cong(tempB);
        UCLN=tempA.UCLN(tempA.getiTu(),tempA.getiMau());
        tempA.RutGon(UCLN);
        tempA.Xuat();

        //Tru
        tempA=new PhanSo(A);
        tempB=new PhanSo(B);
        System.out.println("A-B: ");
        tempA.Tru(tempB);
        UCLN=tempA.UCLN(tempA.getiTu(),tempA.getiMau());
        tempA.RutGon(UCLN);
        tempA.Xuat();

        //Nhan
        tempA=new PhanSo(A);
        tempB=new PhanSo(B);
        System.out.println("A+B: ");
        tempA.Nhan(tempB);
        UCLN=tempA.UCLN(tempA.getiTu(),tempA.getiMau());
        tempA.RutGon(UCLN);
        tempA.Xuat();

        //Chia
        tempA=new PhanSo(A);
        tempB=new PhanSo(B);
        System.out.println("A+B: ");
        tempA.Chia(tempB);
        UCLN=tempA.UCLN(tempA.getiTu(),tempA.getiMau());
        tempA.RutGon(UCLN);
        tempA.Xuat();
    }
}
