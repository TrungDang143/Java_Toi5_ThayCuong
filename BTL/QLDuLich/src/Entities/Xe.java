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
public class Xe implements Serializable{
    private String maXe;
    private String bienSo;
    private String loaiXe;

    public Xe() {
    }

    public Xe(String maXe, String bienSo, String loaiXe) {
        this.maXe = maXe;
        this.bienSo = bienSo;
        this.loaiXe = loaiXe;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
    @Override
    public String toString() {
        return "Xe{" + "MaXe=" + maXe + ", BienSo=" + bienSo + ", LoaiXe=" + loaiXe + '}';
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
            ArrayList<Xe> a = DocFile.Doc_Xe_Tu_File();
        
//          //Tạo file Xe
//          ArrayList<Xe> s = new ArrayList<>();     
//          Xe n1 = new Xe("X01","20B124","8 chỗ");
//          Xe n2 = new Xe("X02","80A213","45 chỗ");
//          Xe n3 = new Xe("X03","20D154","12 chỗ");
//          Xe n4 = new Xe("X04","20C156","60 chỗ");
//          s.add(n1);
//          s.add(n2);
//          s.add(n3);
//          s.add(n4);
//          GhiFile.ghi_Xe_Vao_File(s);
    }
}
