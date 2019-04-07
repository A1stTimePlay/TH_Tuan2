package BaiTH.Tuan2.Bai8;

import java.util.Scanner;

public class Main {
    static Scanner input= new Scanner(System.in);
    static public void main(String[] args){
        double[] arrMachNoiTiep= new double[1000];
        double TongTro=0;
        for (int i=0;i<1000;i++){
            System.out.println("Nhap dien tro thu "+(i+1)+" (neu dien tro la 1 mach song song thi nhap 0):");
            arrMachNoiTiep[i]=input.nextDouble();
            if (arrMachNoiTiep[i]==0) {
                MachSongSong temp= new MachSongSong();
                arrMachNoiTiep[i]=temp.getdTongTro();
            }
            TongTro+=arrMachNoiTiep[i];

            System.out.println("Ban muon them dien tro? (Nhap 0 de ngung them dien tro)");
            int Break=input.nextInt();
            if (Break==0) break;
        }
        System.out.println("Tong tro mach la: "+TongTro);
    }
}
