package b8_hinhphang;

import java.util.Scanner;

public class HinhTron extends Hinh {
    private double r;
    public HinhTron()
    {
        r = 0;
    }
    public HinhTron(double r){
        this.r = r;
    }
    public void nhap(){
        System.out.print("Nhap ban kinh r = ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
    }
    public double tinhCV(){
        return Math.PI*2*r;
    }
    public double tinhDT(){
        return Math.PI*r*r;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Hinh tron co r = %.2f%s", r, super.toString());
    }
}
