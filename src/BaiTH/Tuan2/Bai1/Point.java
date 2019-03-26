package BaiTH.Tuan2.Bai1;

import java.util.Scanner;

public class Point {
    static Scanner input=new Scanner(System.in);
    private int x;
    private int y;
    Point(){
        x=0;
        y=0;
    }

    Point(int Hoanh, int Tung){
        x=Hoanh;
        y=Tung;
    }

    public void Nhap(){
        System.out.println("Nhap hoanh do:");
        x=input.nextInt();
        System.out.println("Nhap tung do:");
        y=input.nextInt();
    }

    public void Xuat(){
        System.out.println("Hoanh do: "+x);
        System.out.println("Tung do: "+y);
    }

    public double KhoangCach(Point B){
        return Math.sqrt((x-B.x)*(x-B.x)+(y-B.y)*(y-B.y));
    }
}
