/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b9_tiendien;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class KhachHang {
    protected String maKH;
    protected String hoTen;
    protected Date ngayDate = new Date();
    protected double soluong;
    protected double dongia;
    protected double thanhtien;

    public KhachHang(String maKH, String hoTen, Date ngayDate, double soluong, double dongia) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngayDate = ngayDate;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public KhachHang() {
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Nhap ma khach hang: ");
        maKH = sc.nextLine();
        
        System.out.print(" - Nhap ten khach hang: ");
        hoTen = sc.nextLine();
        
        System.out.print(" - Nhap ngay (dd/mm/yyyy): ");
        ngayDate.nhap();
    }
    
    @Override
    public String toString() {
        return String.format("%-10s %-25s %-15s", maKH, hoTen, ngayDate.toString());
    }
    
    
}
