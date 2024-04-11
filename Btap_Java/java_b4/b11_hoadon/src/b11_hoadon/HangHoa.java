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
public class HangHoa {
    private String tenHang;
    private double donGia;
    public HangHoa() {
    }

    public HangHoa(String tenHang, double donGia) {
        this.tenHang = tenHang;
        this.donGia = donGia;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Nhap ten hang: ");
        tenHang = sc.nextLine();
        
        System.out.print(" - Nhap don gia: ");
        donGia = sc.nextDouble();
        
    }
    
    public void input(){
        Random rand = new Random();
        tenHang = "hanghoa" + String.valueOf(rand.nextInt(10));
        donGia = (rand.nextDouble(10)+1)*10;
        
    }
    
    public double getDonGia(){
        return donGia;
    }
    
    public String tenHang(){
        return this.tenHang;
    }
    
    @Override
    public String toString() {
        return String.format("%-15s %11.2f", tenHang, donGia);
    }
    
    
}
