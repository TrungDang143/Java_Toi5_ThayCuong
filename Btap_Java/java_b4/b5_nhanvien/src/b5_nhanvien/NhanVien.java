/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b5_nhanvien;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class NhanVien {
    private String ho;
    private String ten;
    private Date ngaySinh;
    private Date ngayVao;
    
    public NhanVien(){
        ho = "";
        ten = "";
        ngaySinh = new Date();
        ngayVao = new Date();
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho: ");
        ho = sc.nextLine();
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
        ngaySinh.nhap();
        System.out.print("Nhap ngay vao lam (dd/mm/yyyy): ");
        ngayVao.nhap();
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10s %15s %15s", ho, ten, ngaySinh, ngayVao);
    }
    
}
