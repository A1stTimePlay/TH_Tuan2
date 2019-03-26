package BaiTH.Tuan2.Bai6;

public class Robot {
    int MTrongLuong;
    int SQuangDuong=10;
    int TieuThu;
    String Loai;
    public void Xuat(){
        System.out.println("Loai robot: "+Loai);
        System.out.println("Trong luong: "+MTrongLuong);
        System.out.println("Nang luong tieu thu: "+TieuThu);
        System.out.println("Quang duong di: "+SQuangDuong);
    }
    public int getTieuThu(){
        return TieuThu;
    }
}
