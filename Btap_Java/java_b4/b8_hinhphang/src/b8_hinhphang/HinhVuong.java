package b8_hinhphang;

import java.util.Scanner;

public class HinhVuong extends Hinh{
    private double a;
    public HinhVuong()
    {
        a = 0;
    }
    public HinhVuong(double a){
        this.a = a;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai canh: ");
        a = sc.nextDouble();
    }
    public double tinhCV(){
        return a*4;
    }
    public double tinhDT(){
        return Math.pow(a, 2);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Hinh vuong co canh = %.2f%s", a, super.toString());
    }
}
