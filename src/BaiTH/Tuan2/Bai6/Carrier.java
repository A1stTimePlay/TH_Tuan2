package BaiTH.Tuan2.Bai6;

public class Carrier extends Robot {
    private int ENangLuong;
    Carrier(){
        Loai="Carrier";
        MTrongLuong=30;
        ENangLuong=(int) (Math.random()*50+50+1); //50<=P<=100. Math.random()*(upper-lower)+lower +1
        TieuThu=MTrongLuong*SQuangDuong+4*ENangLuong*SQuangDuong;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Khoi luong nang luong tiep te: "+ENangLuong);
    }
}
