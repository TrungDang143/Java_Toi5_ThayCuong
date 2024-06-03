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
public class Tour implements Serializable{
    private String maTour;
    private String tenTour;
    private String thoiGian;
    private String diaDiem;
    private String maXe;
    private String maKS;

    public Tour() {
    }

    public Tour(String maTour, String tenTour, String thoiGian, String diaDiem, String maXe, String maKS) {
        this.maTour = maTour;
        this.tenTour = tenTour;
        this.thoiGian = thoiGian;
        this.diaDiem = diaDiem;
        this.maXe = maXe;
        this.maKS = maKS;
    }

    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }

    public String getTenTour() {
        return tenTour;
    }

    public void setTenTour(String tenTour) {
        this.tenTour = tenTour;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getMaKS() {
        return maKS;
    }

    public void setMaKS(String maKS) {
        this.maKS = maKS;
    }
    
    @Override
    public String toString() {
        return "Tour{" + "MaTour=" + maTour + ", TenTour=" + tenTour + ", ThoiGian=" + thoiGian + ", DiaDiem=" + diaDiem + ", MaXe=" + maXe + ", MaKS=" + maKS +'}';
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        ArrayList<Tour> a = DocFile.Doc_Tour_Tu_File();
        
//          //Tạo tour file
//          ArrayList<Tour> nv = new ArrayList<>();     
//          Tour nv1 = new Tour("T01","Du lịch SaPa","3 ngày 2 đêm","Hà Nội","X02","KS01");
//          Tour nv2 = new Tour("T02","Du lịch Phú Quốc","4 ngày","TP.Hồ Chí Minh","X01","KS03");
//          Tour nv3 = new Tour("T03","Du lịch Đà Nẵng","7 ngày","TP.Hồ Chí Minh","X04","KS02");
//          Tour nv4 = new Tour("T04","Du lịch Tam Đảo","5 ngày 4 đêm","Hải Phòng","X03","KS02");
//          nv.add(nv1);
//          nv.add(nv2);
//          nv.add(nv3);
//          nv.add(nv4);
//          GhiFile.ghi_Tour_Vao_File(nv);
    }
}
