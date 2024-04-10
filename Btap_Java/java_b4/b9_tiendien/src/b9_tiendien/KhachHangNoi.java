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
public class KhachHangNoi extends KhachHang {
    private byte doituong;
    private double dinhmuc;

    public KhachHangNoi(byte doituong, double dinhmuc, String maKH, String hoTen, Date ngayDate, double soluong, double dongia) {
        super(maKH, hoTen, ngayDate, soluong, dongia);
        this.doituong = doituong;
        this.dinhmuc = dinhmuc;   
        
        tinhTien();
    }
    public KhachHangNoi() {
        super();
    }
    
    private void tinhTien(){
        if (soluong <= dinhmuc){
            thanhtien = soluong*dongia;
        }
        else{
            thanhtien = dongia*dinhmuc + (soluong-dinhmuc)*dongia*2.5;
        }
    }
    
    public void nhap(){
        super.nhap();
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" - Nhap doi tuong khach hang: ");
        while (true) {                
            System.out.print("\t1. Sinh hoat:\n\t2. Kinh doanh\n\t3. San xuat\n\t--> Nhap lua chon: ");            
            try{
                doituong = sc.nextByte();
                break;
            }
            catch(Exception e){
                System.out.println("--> Nhap lua chon 1 or 2 or 3");
            }
        }

        System.out.print(" - Nhap so luong (kW): ");
        soluong = sc.nextDouble();

        System.out.print(" - Nhap don gia: ");
        dongia = sc.nextDouble();

        System.out.print(" - Nhap dinh muc: ");
        dinhmuc = sc.nextDouble();

        tinhTien();
    }

    public String getDoiTuong(byte a){
        return a==1?"Sinh hoat":(a==2?"Kinh doanh":"San xuat");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %15s %15s %10.2f %10.2f %10.2f %20.2f", "", getDoiTuong(doituong), soluong, dongia, dinhmuc, thanhtien);
    }
    
}
