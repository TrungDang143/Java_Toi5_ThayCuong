/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b5_nhanvien;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class B5_nhanvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        
        NhanVien[] ds = new NhanVien[n];
        
        for(int i = 0; i<n; i++)
        {
            System.out.println(" - Nhap thong tin nhan vien " + (i+1));
            ds[i] = new NhanVien();
            ds[i].nhap();
        }
        
        System.out.printf("%s\n%-15s %-10s %15s %15s\n", "\t\tDANH SACH NHAN VIEN", "Ho dem", "Ten", "Ngay sinh", "Ngay vao lam");
        for(int i = 0; i<n; i++)
        {
            System.out.println(ds[i]);
            
        }
    }
    
}
