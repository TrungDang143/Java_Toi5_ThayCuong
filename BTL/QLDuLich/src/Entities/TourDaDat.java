/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Tools.DocFile;
import Tools.GhiFile;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class TourDaDat implements Serializable{
    private String maTaiKhoan;
    private String tenDK;
    private Tour tourDaChon;
    
    public TourDaDat() {
        maTaiKhoan = "";
        tenDK = "";
        tourDaChon = new Tour();
    }

    public TourDaDat(String maTaiKhoan, String tenDK, Tour tourDaChon) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenDK = tenDK;
        this.tourDaChon = tourDaChon;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenDK() {
        return tenDK;
    }

    public void setTenDK(String tenDK) {
        this.tenDK = tenDK;
    }

    public Tour getTourDaChon() {
        return tourDaChon;
    }

    public void setTourDaChon(Tour tourDaChon) {
        this.tourDaChon = tourDaChon;
    }
    
    @Override
    public String toString() {
        return "TourDaDat{" + "MaTaiKhoan=" + maTaiKhoan + ", TenDK=" + tenDK + ", TourDaChon=" + tourDaChon + '}';
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<TourDaDat> a = DocFile.Doc_TourDaDat_Tu_File();
        for (TourDaDat i : a) {
            System.out.println(i);
        }
//          //Tạo tour đã đặt file
//          ArrayList<TourDaDat> nv = new ArrayList<>(); 
//          Tour a = new Tour("T01","Du lịch SaPa","3 ngày 2 đêm","Hà Nội","X02","KS01");
//          TourDaDat nv1 = new TourDaDat("user1","Trần Văn Vui",a);
//          nv.add(nv1);
//          GhiFile.ghi_TourDaDat_Vao_File(nv);
    }
}
