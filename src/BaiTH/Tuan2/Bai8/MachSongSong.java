package BaiTH.Tuan2.Bai8;

public class MachSongSong {
    private double[] arrDienTro;
    private int iSoLuongDienTro;
    private double dTongTro=0;

    MachSongSong(){
        System.out.println("Nhap so luong dien tro: ");
        iSoLuongDienTro=Main.input.nextInt();
        arrDienTro =new double[iSoLuongDienTro];
        for (int i=0;i<iSoLuongDienTro;i++){
            System.out.println("Nhap dien tro "+i+" :");
            arrDienTro[i]=Main.input.nextDouble();
            dTongTro+=1/arrDienTro[i];
        }
        dTongTro=1/dTongTro;
    }

    public double getdTongTro(){
        return dTongTro;
    }
}
