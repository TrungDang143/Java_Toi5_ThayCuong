/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10.nhan.vien;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public abstract class NhanVien {
    private String hoTen;
    private int nam;
    private double phuCap;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int nam) {
        this.hoTen = hoTen;
        this.nam = nam;
        this.phuCap = getPhuCap();
        this.luong = luong();
    }
       
    public double getPhuCap(){
        return (2024-nam)*20000;
    }
    public abstract double luong();
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Nhap ho ten: ");
        hoTen = sc.nextLine();
        
        System.out.print(" - Nhap nam vao lam: ");
        nam = sc.nextInt();
    }
    

    @Override
    public String toString() {
        return String.format("%15s %10d %15.2f %15.2f", hoTen, nam, getPhuCap(), luong());
    }
    
    
}
