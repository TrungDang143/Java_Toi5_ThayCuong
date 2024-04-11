/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b11_hoadon;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ddtru
 */
public class KhachHang {
    private String hoTen;
    private String diaChi;

    public KhachHang() {
    }

    public KhachHang(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Nhap ho ten khach hang: ");
        hoTen = sc.nextLine();
        
        System.out.print(" - Nhap dia chi khach hang: ");
        diaChi = sc.nextLine();
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void input() {
        Random rand = new Random();
        hoTen = "dTrung " + String.valueOf(rand.nextInt(100));
        diaChi = "HoaBinh " + String.valueOf(rand.nextInt(100));
    }
    
    
}
