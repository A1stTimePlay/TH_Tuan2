package BaiTH.Tuan2.Bai6;

public class Pedion extends Robot {
    int FLinhHoat;
    Pedion(){
        Loai="Pedion";
        MTrongLuong=20;
        FLinhHoat=(int)(Math.random()*4+1+1); //1<=P<=5. Math.random()*(upper-lower)+lower +1
        TieuThu=MTrongLuong*SQuangDuong+(FLinhHoat+1)*SQuangDuong/2;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Chi so linh hoat: "+FLinhHoat);
    }
}
