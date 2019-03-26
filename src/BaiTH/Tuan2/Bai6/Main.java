package BaiTH.Tuan2.Bai6;

import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    static public void main(String[] args){
        int maxTieuThu=0;
        int pedionTongTieuThu=0;
        int zattacerTongTieuThu=0;
        int carrierTongTieuThu=0;
        String saveLoaiRobot="";

        //Nhap mang robot Pedion
        System.out.println("Nhap so luong Pedion: ");
        int a=input.nextInt();
        Pedion[] arrPedion=new Pedion[a];
        for (int i=0;i<a;i++) {
            arrPedion[i] = new Pedion();
            pedionTongTieuThu+=arrPedion[i].getTieuThu() ;
        }

        //Nhap mang robot Zattacker
        System.out.println("Nhap so luong Zattacker: ");
        int b=input.nextInt();
        Zattacker[] arrZattacker=new Zattacker[b];
        for (int i=0;i<b;i++) {
            arrZattacker[i] = new Zattacker();
            zattacerTongTieuThu+=arrZattacker[i].getTieuThu() ;
        }

        //Nhap mang robot Carrier
        System.out.println("Nhap so luong Pedion: ");
        int c=input.nextInt();
        Carrier[] arrCarrier=new Carrier[c];
        for (int i=0;i<c;i++) {
            arrCarrier[i] = new Carrier();
            carrierTongTieuThu+=arrCarrier[i].getTieuThu() ;
        }

        //Xuat mang robot Pedion
        for (int i=0;i<a;i++) {
            System.out.println("Robot Pedion thu "+(i+1));
            arrPedion[i].Xuat();
            System.out.println();
        }
        System.out.println("-----");
        //Xuat mang robot Zattacker
        for (int i=0;i<b;i++) {
            System.out.println("Robot Zattacker thu "+(i+1));
            arrZattacker[i].Xuat();
            System.out.println();
        }
        System.out.println("-----");
        //Xuat mang robot Carrier
        for (int i=0;i<c;i++) {
            System.out.println("Robot Carrier thu "+(i+1));
            arrCarrier[i].Xuat();
            System.out.println();
        }
        System.out.println("-----");

        //tim loai robot tieu thu nhieu dien nang nhat
        if (pedionTongTieuThu>maxTieuThu) {
            maxTieuThu=pedionTongTieuThu;
            saveLoaiRobot="Pedion";
        }

        if (zattacerTongTieuThu>maxTieuThu){
            maxTieuThu=zattacerTongTieuThu;
            saveLoaiRobot="Zattacker";
        }

        if (carrierTongTieuThu>maxTieuThu){
            maxTieuThu=carrierTongTieuThu;
            saveLoaiRobot="Carrier";
        }

        System.out.println("Loai robot tieu thu nhieu nang luong nhat: "+saveLoaiRobot);

        //Xuat tong nang luong tieu thu cua ca doan
        int TongNangLuongTieuThu=pedionTongTieuThu+zattacerTongTieuThu+carrierTongTieuThu;
        System.out.println("Tong nang luong tieu thu cua ca doan: "+TongNangLuongTieuThu);
    }
}
