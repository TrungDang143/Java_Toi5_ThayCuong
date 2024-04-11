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
public class NhanVienSX extends NhanVien{
    private int SP;

    public NhanVienSX() {
        super();
    }

    public NhanVienSX(String hoTen, int nam, int SP) {
        super(hoTen, nam);
        this.SP = SP;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Nhap so luong san pham: ");
        SP = sc.nextInt();
    }
    
    @Override
    public double luong() {
        return SP*10000;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %5d", SP);
    }
    
}
