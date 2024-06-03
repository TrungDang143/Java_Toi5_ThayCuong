/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Tools.*;
import java.awt.List;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class NhanVien implements Serializable{
    private String maNV;
    private String tenNV;
    private String diaChi;
    private String ngaySinh;
    private String soDT;
    private String gioiTinh;
    private String email;
    
    public NhanVien() {
        
    }

    public NhanVien(String maNV, String tenNV, String diaChi, String ngaySinh, String soDT, String gioiTinh, String email) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.soDT = soDT;
        this.gioiTinh = gioiTinh;
        this.email = email;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "NhanVien{" + "MaNV=" + maNV + ", TenNV=" + tenNV + ", DiaChi=" + diaChi + ", NgaySinh=" + ngaySinh + ", SoDT=" + soDT + ", GioiTinh=" + gioiTinh + ", Email=" + email +'}';
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
            ArrayList<NhanVien> a = DocFile.Doc_NhanVien_Tu_File();
            
          //Tạo nhân viên file
//          ArrayList<NhanVien> nv = new ArrayList<>();     
//          NhanVien nv1 = new NhanVien("NV01","Nguyễn Văn Tường","Bắc Ninh","03/01/2003","0339825335","Nam","nvt2003@gmail.com");
//          NhanVien nv2 = new NhanVien("NV02","Lê Thị Ngọc Ánh","Thái Bình","14/10/2003","0327465590","Nữ","ngocanh.lt@gmail.com");
//          NhanVien nv3 = new NhanVien("NV03","Trương Gia Bình","Hà Nội","31/12/2004","0976649041","Nam","tgbinh@gmail.com");
//          NhanVien nv4 = new NhanVien("NV04","Vũ Ngọc Anh","Thái Bình","06/01/2004","0588300386","Nữ","ngocanh@gmail.com");
//          NhanVien nv5 = new NhanVien("NV05","Đặng Đức Trung","Hoà Bình","14/03/2003","0961941358","Nam","dtrung@gmail.com");
//          nv.add(nv1);
//          nv.add(nv2);
//          nv.add(nv3);
//          nv.add(nv4);
//          nv.add(nv5);
//          GhiFile.ghi_NhanVien_Vao_File(nv);
    }
}
