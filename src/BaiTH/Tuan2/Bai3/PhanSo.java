package BaiTH.Tuan2.Bai3;

import java.util.Scanner;

public class PhanSo {
    static Scanner input= new Scanner(System.in);

    private int iTu;
    private int iMau;

    PhanSo(){
        iTu=0;
        iMau=1;
    }

    PhanSo(int Tu, int Mau){
        iTu=Tu;
        iMau=Mau;
    }

    PhanSo(PhanSo x){
        iTu=x.iTu;
        iMau=x.iMau;
    }

    public int getiTu(){
        return  iTu;
    }

    public int getiMau(){
        return iMau;
    }

    public int UCLN (int a, int b){
        if (a == 0 || b == 0){
            return a + b;
        }
        while (a != b){
            if (a > b){
                a -= b; // a = a - b
            }else{
                b -= a;
            }
        }
        return a;
    }

    public void RutGon(int UCLN){
        iTu/=UCLN;
        iMau/=UCLN;
    }

    public void Cong(PhanSo x){
        iTu=iTu*x.iMau+x.iTu*iMau;
        iMau=iMau*x.iMau;
    }

    public void Tru(PhanSo x){
        iTu=iTu*x.iMau-x.iTu*iMau;
        iMau=iMau*x.iMau;
    }

    public void Nhan(PhanSo x){
        iTu*=x.iTu;
        iMau*=x.iMau;
    }

    public void Chia(PhanSo x){
        iTu*=x.iMau;
        iMau*=x.iTu;
    }

    public void Nhap(){
        System.out.println("Nhap tu so: ");
        iTu=input.nextInt();
        System.out.println("Nhap mau so: ");
        iMau=input.nextInt();
    }

    public void Xuat(){
        System.out.println(iTu+"/"+iMau);
    }
}
