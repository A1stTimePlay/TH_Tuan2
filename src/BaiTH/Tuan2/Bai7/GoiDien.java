package BaiTH.Tuan2.Bai7;

public class GoiDien {
    private double iGia=2000;
    private double iPhut;
    private double iThanhTien;

    public void Nhap(){
        System.out.println("Nhap so phut goi: ");
        iPhut=Main.input.nextDouble();
        iThanhTien=iPhut*iGia;
    }

    public double getiThanhTien(){
        return iThanhTien;
    }

}
