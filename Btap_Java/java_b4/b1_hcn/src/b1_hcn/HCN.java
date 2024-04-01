/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1_hcn;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class HCN {
    private double d, r;

    public HCN() {
        this.d = 0;
        this.r = 0;
    }
     
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai d = ");
        d = sc.nextDouble();
        System.out.print("Nhap chieu rong r = ");
        r = sc.nextDouble();
    }
    public double chuvi(){
        return (d+r)*2;
    }
    public double dientich(){
        return d*r;
    }
    public void xuat(){
        System.out.printf("HCN co chieu dai = %.2f va chieu rong = %.2f\n=> S = %.2f va C = %.2f", d, r, dientich(), chuvi());
    }
}
