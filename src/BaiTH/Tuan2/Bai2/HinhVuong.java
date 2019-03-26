package BaiTH.Tuan2.Bai2;

public class HinhVuong implements Hinh {
    private double dCanh;
    private double dChieuCao;
    @Override
    public void Nhap() {
        System.out.println("Nhap chieu dai canh: ");
        dCanh=input.nextDouble();
        System.out.println("Nhap chieu cao: ");
        dChieuCao=input.nextDouble();
    }

    @Override
    public void Xuat() {
        System.out.println("Chieu dai canh: "+dCanh);
    }

    @Override
    public double ChuVi() {
        return dCanh*4;
    }

    @Override
    public double DienTich() {
        return dCanh*dCanh;
    }

    @Override
    public double TheTich() {
        return dCanh*dCanh*dChieuCao;
    }
}
