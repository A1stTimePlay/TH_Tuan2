package BaiTH.Tuan2.Bai7;

public class ThueXe {
    private double iGia=50000;
    private double iGio;
    private double iThanhTien;

    public void Nhap(){
        System.out.println("Nhap so gio thue: ");
        iGio=Main.input.nextDouble();
        iThanhTien=iGio*iGia;
        if (iGio>6) iThanhTien-=(iThanhTien*6/100);
    }

    public double getiThanhTien(){
        return iThanhTien;
    }

    public double getiGio(){
        return iGio;
    }
}
