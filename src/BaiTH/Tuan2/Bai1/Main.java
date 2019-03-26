package BaiTH.Tuan2.Bai1;

public class Main {
    static public void main(String[] args){
        Point a=new Point();
        System.out.println("Nhap diem a:");
        a.Nhap();
        Point b=new Point();
        System.out.println("Nhap diem b: ");
        b.Nhap();
        System.out.println("Khoang cach: "+a.KhoangCach(b));
    }
}
