/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b7_sinhvien;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class SinhVien {
    private int maSV;
    private String hoTen;
    private double dlt;
    private double dth;
    private double dtb;
    
    
    public SinhVien(){
        maSV = 0;
        hoTen = "";
        dlt = 0;
        dth = 0;
        dtb = 0;
    }

    public SinhVien(int maSV, String hoTen, double dlt, double dth) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.dlt = dlt;
        this.dth = dth;
        this.dtb = (dth+dlt)/2.0;
    }
    
    public String getName()
    {
        return hoTen;
    }
    public double getDlt()
    {
        return dlt;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        while (!check) {            
            System.out.println("Nhap ma sinh vien: ");
            try{
                maSV = sc.nextInt();
                check = true;
            }catch(Exception e)
            {
                check = false;
            } 
            sc.nextLine();
        }
        
        System.out.println("Nhap ho ten sinh vien: ");
        hoTen = sc.nextLine();
        
        check = false;
        while (!check) {            
            System.out.println("Nhap diem ly thuyet: ");
            try{
                dlt = sc.nextDouble();
                check = true;
            }catch(Exception e)
            {
                check = false;
                sc.nextLine();
            } 
        }
        
        check = false;
        while (!check) {            
            System.out.println("Nhap diem thuc hanh: ");
            try{
                dth = sc.nextDouble();
                check = true;
            }catch(Exception e)
            {
                check = false;
                sc.nextLine();
            } 
        }

        dtb = (dlt+dth)/2.0;
    }

    @Override
    public String toString() {
        return String.format("%-7d %-20s %10.2f %10.2f %10.2f %10s", maSV, hoTen, dlt, dth, dtb, dtb>=5?"Dau":"Rot"); 
    }
     

    
    
}
