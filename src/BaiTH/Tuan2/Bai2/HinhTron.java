package BaiTH.Tuan2.Bai2;

public class HinhTron implements Hinh {
    private double dBanKinh;
    private double dChieuCao;
    @Override
    public double ChuVi() {
        return 2*dBanKinh*Math.PI;
    }

    @Override
    public double DienTich() {
        return dBanKinh*dBanKinh*Math.PI;
    }

    @Override
    public double TheTich() {
        return dBanKinh*dBanKinh*dChieuCao*Math.PI;
    }

    @Override
    public void Nhap() {
        System.out.println("Nhap ban kinh: ");
        dBanKinh=input.nextDouble();
        System.out.println("Nhap chieu cao: ");
        dChieuCao=input.nextDouble();
    }

    @Override
    public void Xuat() {
        System.out.println("Ban kinh: "+dBanKinh);
        System.out.println("Chieu cao: "+dChieuCao);
    }
}
