package BaiTH.Tuan2.Bai7;

import java.util.Scanner;

public class Main {
    static public Scanner input = new Scanner(System.in);

    static public void main(String[] args) {
        double TongTienThueXe=0, TongGioThueXe=0, TongTienGoiDien=0, TongTienTangHoa=0;
        double max=0;

        System.out.println("Nhap so luong xe thue: ");
        int x = input.nextInt();
        ThueXe[] arrThueXe = new ThueXe[x];
        for (int i = 1; i < x; i++) {
            arrThueXe[i] = new ThueXe();
            arrThueXe[i].Nhap();
            TongTienThueXe+=arrThueXe[i].getiThanhTien();
            TongGioThueXe+=arrThueXe[i].getiGio();
        }
        if (TongGioThueXe>72) TongTienThueXe-=(TongGioThueXe*2/100);

        System.out.println("Nhap so cuoc goi: ");
        int y = input.nextInt();
        GoiDien[] arrGoiDien = new GoiDien[x];
        for (int i = 1; i < x; i++) {
            arrGoiDien[i] = new GoiDien();
            arrGoiDien[i].Nhap();
            TongTienGoiDien+=arrGoiDien[i].getiThanhTien();
        }
        if (TongTienGoiDien>300000) TongTienGoiDien=300000+ (TongTienGoiDien-300000)*80/100;

        System.out.println("Nhap so lan tang hoa: ");
        int z=input.nextInt();
        TangHoa[] arrTangHoa=new TangHoa[z];
        for (int i=0;i<z;i++){
            arrTangHoa[i]=new TangHoa();
            arrTangHoa[i].Nhap();
            TongTienTangHoa+=arrTangHoa[i].getiThanhTien();
        }

        if (TongTienGoiDien>max) max=TongTienGoiDien;
        if (TongTienTangHoa>max) max=TongTienTangHoa;
        if (TongTienThueXe>max) max=TongTienThueXe;
        System.out.println("Dich vu co tong tien su dung dich vu cao nhat la: "+max);

        Double TongTien=TongTienGoiDien+TongTienTangHoa+TongTienThueXe;
        System.out.println("Tong tien su dung cac dich vu: "+TongTien);
    }
}