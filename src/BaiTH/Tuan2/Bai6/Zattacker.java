package BaiTH.Tuan2.Bai6;

public class Zattacker extends Robot {
    private int PSucManh;
    Zattacker(){
        Loai="Zattacker";
        MTrongLuong=50;
        PSucManh=(int)(Math.random()*10+20+1); //20<=P<=30. Math.random()*(upper-lower)+lower +1
        TieuThu=MTrongLuong+SQuangDuong+PSucManh*PSucManh*SQuangDuong;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Chi so suc manh: "+PSucManh);
    }
}
