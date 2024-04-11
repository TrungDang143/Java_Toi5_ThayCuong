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
public class NhanVienVP extends NhanVien{
    private double mucLuong;
    private int ngayNghi;

    public NhanVienVP() {
        super();
    }

    public NhanVienVP(String hoTen, int nam, double mucLuong, int ngayNghi) {
        super(hoTen, nam);
        this.mucLuong = mucLuong;
        this.ngayNghi = ngayNghi;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Nhap muc luong: ");
        mucLuong = sc.nextDouble();
        
        System.out.print(" - Nhap so ngay nghi: ");
        ngayNghi = sc.nextInt();
    }

    @Override
    public double luong() {
        return mucLuong - ngayNghi*10000;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %5s %10.2f %10d" , "", mucLuong, ngayNghi);
    }
    
    
}
