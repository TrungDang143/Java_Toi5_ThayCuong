/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10.nhan.vien;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class DSNV {
    public int n;
    public NhanVien[] ds;

    public DSNV() {
    }
    
    
    public void nhapSL(){
        System.out.print(" - Nhap so luong nhan vien: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        ds = new NhanVien[n];
    }
    public void nhap(){
        nhapSL();
        for(int i = 0; i<n; i++)
        {
            System.out.println(" --> Nhap thong tin nhan vien thu "+(i+1));
            byte lc;
            while (true) {                
                System.out.print("\tKhach hang:\n\t1. NV san xuat\n\t2. NV van phong\n\t--> Nhap lua chon: ");            
                try{
                    Scanner sc = new Scanner(System.in);
                    lc = sc.nextByte();
                    break;
                }
                catch(Exception e){
                    System.out.println("--> Nhap lua chon 1 hoac 2");
                }
            }
            
            if(lc==1)
            {
                ds[i] = new NhanVienSX();
            }
            else{
                ds[i] = new NhanVienVP();
            }
            ds[i].nhap();
        }
    }
    public void input(){
        Random rand = new Random();
        n = (rand.nextInt(10)+1)*10;
        ds = new NhanVien[n];
        
        for(int i = 0; i<n; i++)
        {
            int loai = rand.nextInt(2);
            
            String hoten = "trung" + String.valueOf(i);
            int nam = rand.nextInt(25) + 2000;
            
            if(loai == 0)
            {
                int sp = (rand.nextInt(10)+1)*100;
                
                ds[i] = new NhanVienSX(hoten, nam, sp);
            }
            else{
                double muc = (rand.nextDouble()+1)*100000;
                int nghi = rand.nextInt(10)+1;
                
                ds[i] = new NhanVienVP(hoten, nam, muc, nghi);
            }
        }
    }
    public void xuat(){
        //%20s %10d %10.2f %10.2f
        double tong = 0;
        System.out.printf("\n\t\t%s\n%15s %10s %15s %15s %5s %10s %10s\n", "BANG LUONG NHAN VIEN", "Ho ten", "Nam", "PhuCap", "Luong", "SP", "MucLuong", "NgayNghi");
        for (int i = 0; i<n; i++)
        {
            System.out.println(ds[i].toString());
            tong += ds[i].getPhuCap()+ds[i].luong();
        }
        System.out.printf("\n --> Cong ty phai tra: %.2f", tong);
    }
     
}


