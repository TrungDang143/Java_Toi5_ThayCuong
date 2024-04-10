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
public class KhachHangNgoai extends KhachHang{
    private String quocTich;

    public KhachHangNgoai(String quocTich, String maKH, String hoTen, Date ngayDate, double soluong, double dongia) {
        super(maKH, hoTen, ngayDate, soluong, dongia);
        this.quocTich = quocTich;
        thanhtien = soluong*dongia;
    }
    public KhachHangNgoai(){
        super();
    }
    public void nhap(){
        super.nhap();
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Nhap quoc tich: ");
        quocTich = sc.nextLine();

        System.out.print(" - Nhap so luong (kW): ");
        soluong = sc.nextDouble();

        System.out.print(" - Nhap don gia: ");
        dongia = sc.nextDouble();

        tinhTien();
    }

    @Override
    public String toString() {
        return super.toString()+ String.format(" %15s %15s %10.2f %10.2f %10s %20.2f", quocTich, "", soluong, dongia, "", thanhtien);
    }

    private void tinhTien() {
        thanhtien = soluong * dongia;
    }
}
