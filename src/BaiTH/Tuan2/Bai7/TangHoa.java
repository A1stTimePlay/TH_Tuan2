package BaiTH.Tuan2.Bai7;

public class TangHoa {
    private double iGia=10000;
    private double iSoLuong;
    private double iThanhTien;

    public void Nhap(){
        System.out.println("Nhap so luong hoa: ");
        iSoLuong=Main.input.nextDouble();
        iThanhTien=iSoLuong*iGia;
    }

    public double getiThanhTien() {
        return iThanhTien;
    }
}
