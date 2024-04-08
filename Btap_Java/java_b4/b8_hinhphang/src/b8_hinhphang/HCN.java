package b8_hinhphang;

import java.util.Scanner;

public class HCN extends Hinh{
    private double a, b;
    public HCN()
    {
        a = 0;
        b = 0;
    }
    public HCN(double a, double b){
        this.a = a;
        this.b = b;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        a = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        b = sc.nextDouble();
    }
    public double tinhCV(){
        return (a+b)*2;
    }
    public double tinhDT(){
        return a*b;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Hinh chu nhat co chieu dai = %.2f va chieu rong = %.2f%s", a, b, super.toString());
    }
}
