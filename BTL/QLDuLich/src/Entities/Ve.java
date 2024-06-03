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
public class Ve implements Serializable {

    private String maVe;  
    private String tenUser;
    private String maTour;
    private String maNV;  
    private String thoiGian;
    private double giaVe;

    public Ve() {
    }

    public Ve(String maVe, String tenUser, String maTour, String maNV, String thoiGian, double giaVe) {
        this.maVe = maVe;
        this.thoiGian = thoiGian;
        this.giaVe = giaVe;
        this.tenUser = tenUser;
        this.maTour = maTour;
        this.maNV = maNV;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenUser() {
        return tenUser;
    }

    public void setTenUser(String tenUser) {
        this.tenUser = tenUser;
    }

    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }

    @Override
    public String toString() {
        return "Ve{" + "MaVe=" + maVe + ", TenUser=" + tenUser + ", MaTour=" + maTour + ", MaNV=" + maNV + ", ThoiGian=" + thoiGian + ", GiaVe=" + giaVe + '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Ve> a = DocFile.Doc_Ve_Tu_File();

//          //Tạo vé file
//          ArrayList<Ve> nv = new ArrayList<>();     
//          Ve nv1 = new Ve("V01","user1","T01","NV01","10/01/2020",30000);
//          Ve nv2 = new Ve("V02","user2","T02","NV02","2/06/2021",40000);
//          Ve nv3 = new Ve("V03","user3","T03","NV03","8/10/2022",50000);
//          Ve nv4 = new Ve("V04","user4","T04","NV04","4/11/2020",60000);
//          nv.add(nv1);
//          nv.add(nv2);
//          nv.add(nv3);
//          nv.add(nv4);
//          GhiFile.ghi_Ve_Vao_File(nv);
    }
}
