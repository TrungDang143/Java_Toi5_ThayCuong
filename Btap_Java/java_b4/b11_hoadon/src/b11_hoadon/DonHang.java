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
public class DonHang {
    private HangHoa hang;
    private int sl;

    public DonHang() {
    }

    public DonHang(HangHoa hang, int sl) {
        this.hang = hang;
        this.sl = sl;
    }
    
    public void nhap(){
        hang = new HangHoa();
        hang.nhap();
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Nhap so luong mua: ");
        sl = sc.nextInt();
    }
    
    public void input(){
        hang = new HangHoa();
        hang.input();
        Random rand = new Random();
        sl = rand.nextInt(200)+1;
    }
    
    public int getSL(){
        return sl;
    }
    public double tong(){
        return sl*hang.getDonGia();
    }
    public String getTenHang(){
        return hang.tenHang();
    }

    @Override
    public String toString() {
        return hang.toString() + String.format(" %11d %15.2f", sl, tong());
    }
    
}
