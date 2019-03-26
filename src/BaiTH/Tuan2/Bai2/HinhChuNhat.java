package BaiTH.Tuan2.Bai2;

public class HinhChuNhat implements Hinh {
    private double dChieuDai;
    private double dChieuRong;
    private double dChieuCao;

    @Override
    public void Nhap() {
        System.out.println("Nhap chieu dai: ");
        dChieuDai=input.nextDouble();
        System.out.println("Nhap chieu rong: ");
        dChieuRong=input.nextDouble();
        System.out.println("Nhap chieu cao: ");
        dChieuCao=input.nextDouble();
    }

    @Override
    public void Xuat() {
        System.out.println("Chieu dai: "+dChieuDai);
        System.out.println("Chieu rong: "+dChieuRong);
        System.out.println("Chieu cao: "+dChieuCao);
    }

    @Override
    public double ChuVi() {
        return (dChieuDai+dChieuRong)*2;
    }

    @Override
    public double DienTich() {
        return dChieuDai*dChieuRong;
    }

    @Override
    public double TheTich() {
        return dChieuDai*dChieuRong*dChieuCao;
    }
}
