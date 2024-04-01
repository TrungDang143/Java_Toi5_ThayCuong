/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_hinhtron;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class HinhTron {
    private double r;
    public HinhTron()
    {
        r=0;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r = ");
        r = sc.nextDouble();
    }
     public double chuvi(){
         return Math.PI*2*r;
     }
     public double dientich(){
         return Math.PI*r*r;
     }
     public void xuat(){
         System.out.printf("\n%-10.2f %-10.2f %-10.2f", r, chuvi(), dientich());
     }
}
